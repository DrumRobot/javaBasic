package mypack;

public class Break {
	public static void main(String[] args) {
		TAG:
	    for (int i = 1; i < 10; i++) {
	        for (int j = 1; j < 10; j++) {
	            int multi = i * j;
	            if (multi == 36) { // i x j가 36이 되면
		            if (i == j) {
		            	continue TAG; // 6 x 6 처럼 같은 숫자의 곱은 건너뛰기
		            }
	                System.out.printf("%d x %d = %d\n", i, j, 36);
	                /* 처음 하나만 출력하고 종료하려면 break */
	                // break TAG;
	            }
	        }
	    }
		/* break 대신 return을 쓰면 도달하지 못함 */
        System.out.println("Main 종료");
	}
}
