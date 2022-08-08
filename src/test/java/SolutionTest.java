import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private final Solution sol = new Solution();

  @Test
  void reverseBitsExample1() {
    assertEquals(
        0b00111001011110000010100101000000,
        sol.reverseBits(0b00000010100101000001111010011100)
    );
  }

  @Test
  void reverseBitsExample2() {
    assertEquals(
        0b10111111111111111111111111111111,
        sol.reverseBits(0b11111111111111111111111111111101)
    );
  }
}