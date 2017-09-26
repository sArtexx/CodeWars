//You will be given a number and you will need to return it as a string in Expanded Form

public class ExpandedForm {

	public static String expandedForm(int num) {
		String strNum = String.valueOf(num);
		int length = strNum.length();
		String result = "";
		int digit;
		for (char ch : strNum.toCharArray()) {
			digit = Character.digit(ch, 10);
			if (digit != 0) {
				result += ((int) (digit * Math.pow(10, length - 1)) + " + ");
			}
			--length;
		}
		return result.substring(0, result.length() - 2);
	}

	public static void main(String[] args) {
		System.out.println(expandedForm(70304));
	}
}
