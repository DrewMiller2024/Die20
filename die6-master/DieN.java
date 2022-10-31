public class DieN
{
  private int value;
  public DieN(int sides) {
    this.roll(sides);
  }
  public int getValue() {
    return value;
  }
  public void roll(int sides) {
      this.value = (int)(Math.random() * sides) + 1;
  }
  public int rollAndGetValue(int sides) {
      this.roll(sides);
      return value;
  }
}
