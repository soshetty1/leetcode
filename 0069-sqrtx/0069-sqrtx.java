class Solution {
    public int mySqrt(int x) {
   if (x < 2) return x;

    long num;
    int mid;
        int left = 2, right = x / 2;
    while (left <= right) {
      mid = left + (right - left) / 2;
      num = (long)mid * (long)mid;
      if (num > x) right = mid - 1;
      else if (num < x) left = mid + 1;
      else return mid;
    }

    return right;
  }
}