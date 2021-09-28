package interviewPrep.sample_coding_test.intermediate;
// Input                      => Ouput
// abcdVariableName => abcd_variable_name
// abcd_variable_name => abcdVariableName
public class Rename_Variables {
	public static String renameVariables(String input) {
		String output;
		if(input.contains("_")) {
			output = remove_(input);
		}else {
			output = add_(input);
		}
		return output;
	}

	private static String add_(String input) {
		char[] inputArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < inputArray.length; i++) {
			if(Character.isUpperCase(inputArray[i])) {
				sb.append("_");
				sb.append(Character.toLowerCase(inputArray[i]));
			}else {
				sb.append(inputArray[i]);
			}
		}
		return sb.toString();
	}

	private static String remove_(String input) {
		char[] inputArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i]=='_') {
				sb.append(Character.toUpperCase(inputArray[i+1]));
				i++;
			}else {
				sb.append(inputArray[i]);
			}
		}
		return sb.toString();
	}
}