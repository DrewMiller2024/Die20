import java.util.Scanner;
public class DieN
{
  /**
   * Contains the current value of the die
   */
  private int value;
  private int n;
  public DieN() {
    this.roll();
  }
  public int getValue() {
    return value;
  }
  public void roll() {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      this.value = (int)(Math.random() * n) + 1;
  }
}