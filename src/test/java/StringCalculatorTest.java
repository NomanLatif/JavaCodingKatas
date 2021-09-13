import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
  @Test
  public void testEmptyStringReturnsZero() {
    verify("", 0);
  }

  @Test
  public void testOneReturns() {
    verify("1", 1);
  }

  @Test
  public void testTwoInputs() {
    verify("1,2", 3);
  }

  @Test
  public void testThreeInputs() {
    verify("1,2,3", 6);
  }

  private void verify(String input, int result) {
    StringCalculator calculator = new StringCalculator();

    int total = calculator.add(input);

    Assertions.assertEquals(result, total);
  }
}
