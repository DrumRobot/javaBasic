package mypack;

public class EgovFormatCheckUtil {
	/**
	 * <p>
	 * �̸����� ��, �� ���ڿ� 2�� �Է� �޾� ������ �̸����������� �˻�.
	 * </p>
	 * 
	 * 
	 * @param �̸��� ���ڿ� (2��)
	 * @return ��ȿ�� �̸��� �������� ���� (True/False)
	 */
	public static boolean checkFormatMail(String mail1, String mail2) {

		int count = 0;

		for (int i = 0; i < mail1.length(); i++) {
			if (mail1.charAt(i) <= 'z' && mail1.charAt(i) >= 'a')
				continue;
			if (mail1.charAt(i) <= 'Z' && mail1.charAt(i) >= 'A')
				continue;
			if (mail1.charAt(i) <= '9' && mail1.charAt(i) >= '0')
				continue;
			if (mail1.charAt(i) == '-' || mail1.charAt(i) == '_')
				continue;
			return false;
		} // ��ȿ�� ����, �������� üũ

		for (int i = 0; i < mail2.length(); i++) {
			if (mail2.charAt(i) <= 'z' && mail2.charAt(i) >= 'a')
				continue;
			if (mail2.charAt(i) == '.') {
				count++;
				continue;
			}
			return false;
		} // ���� �ּ��� ���� üũ(XXX.XXX ����)

		if (count == 1)
			return true;
		return false;
	}

	/**
	 * <p>
	 * �̸����� ��ü���ڿ� 1�� �Է� �޾� ������ �̸����������� �˻�.
	 * </p>
	 * 
	 * 
	 * @param �̸��� ���ڿ� (1��)
	 * @return ��ȿ�� �̸��� �������� ���� (True/False)
	 */
	public static boolean checkFormatMail(String mail) {
		String[] temp = mail.split("@"); // '@' �� �������� ��, �� ���ڿ� ����

		if (temp.length == 2)
			return checkFormatMail(temp[0], temp[1]);
		return false;
	}
}
