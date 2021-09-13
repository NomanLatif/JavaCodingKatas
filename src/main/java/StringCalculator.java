public class StringCalculator {

  public int add(String input) {
    int result = 0;
    if (input.isEmpty()) {
      return result;
    }

    String[] splitInput = input.split(",");
    for(int i = 0; i < splitInput.length; i++) {
      result += Integer.parseInt(splitInput[i]);
    }
    return result;
  }
}
