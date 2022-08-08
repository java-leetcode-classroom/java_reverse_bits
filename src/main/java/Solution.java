public class Solution {
  public int reverseBits(int n) {
    int ans = 0;
    for (int pos = 0; pos < 32; pos++) {
      ans = ans << 1;
      if ((n & 1) != 0) {
        ans += 1;
      }
      n = n >>> 1;
    }
    return ans;
  }
}
