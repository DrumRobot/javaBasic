package mypack;

public class Break {
	public static void main(String[] args) {
		TAG:
	    for (int i = 1; i < 10; i++) {
	        for (int j = 1; j < 10; j++) {
	            int multi = i * j;
	            if (multi == 36) { // i x j�� 36�� �Ǹ�
		            if (i == j) {
		            	continue TAG; // 6 x 6 ó�� ���� ������ ���� �ǳʶٱ�
		            }
	                System.out.printf("%d x %d = %d\n", i, j, 36);
	                /* ó�� �ϳ��� ����ϰ� �����Ϸ��� break */
	                // break TAG;
	            }
	        }
	    }
		/* break ��� return�� ���� �������� ���� */
        System.out.println("Main ����");
	}
}
