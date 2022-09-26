package mypack;

public class ForEachString {
	
	public static void main(String[] args) {
		String text = "Hello, World!";
    	
		for (int i = 0; i < text.length(); i++) {
    		System.out.print(text.charAt(i) + " ");
    	}
    	
		System.out.println();

    	for (char c: text.toCharArray()) {
    		System.out.print(c + " ");
    	}
	}
}
