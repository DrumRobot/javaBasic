package mypack;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class Array {
    private final static boolean is64bit = true;
    
    private static Unsafe unsafe = null;

    public static void main(String[] args) {
    	int i = 100;
        int[] arr = new int[i];

        System.out.printf("arr.length: %s\n", arr.length);
        printAddresses("arr", arr);
        printAddresses("arr[0]", arr[0]);
        printAddresses("arr[99]", arr[99]);

        arr = null;
        printAddresses("arr", arr);

        System.out.printf("arr[0]: %s\n", arr[0]);
    }

    public static void printAddresses(String label, Object... objects) {
        if (unsafe == null) {
            Field f;
            try {
                f = Unsafe.class.getDeclaredField("theUnsafe");
                f.setAccessible(true);
                unsafe = (Unsafe) f.get(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.print(label + ": 0x");
        long last = 0;
        int offset = unsafe.arrayBaseOffset(objects.getClass());
        int scale = unsafe.arrayIndexScale(objects.getClass());
        switch (scale) {
        case 4:
            long factor = is64bit ? 8 : 1;
            final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
            System.out.print(Long.toHexString(i1));
            last = i1;
            for (int i = 1; i < objects.length; i++) {
                final long i2 = (unsafe.getInt(objects, offset + i * 4) & 0xFFFFFFFFL) * factor;
                if (i2 > last)
                    System.out.print(", +" + Long.toHexString(i2 - last));
                else
                    System.out.print(", -" + Long.toHexString( last - i2));
                last = i2;
            }
            break;
        case 8:
            throw new AssertionError("Not supported");
        }
        System.out.println();
    }
}