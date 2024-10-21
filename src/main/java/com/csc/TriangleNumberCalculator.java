package com.csc;

public class TriangleNumberCalculator {
  private int[] triangle_cache;
  
  public TriangleNumberCalculator() {
    triangle_cache = new int[1000];
    for(int i = 0; i < 1000; i++) {
      triangle_cache[i] = 0;
    }
  }
  
  public static void main(String[] args) {
    TriangleNumberCalculator t = new TriangleNumberCalculator();
    
    for(int i = 1000; i < 33000; i++) {

      System.out.print(i);
      System.out.print(" ");
      
      t.subtract(i, 1);
    }
  }
  
  private boolean has_value_cached(int n) {
    return triangle_cache[n - 1] > 0;
  }
  
  public int value(int n) {
    if (n <= 1) return 1;
    
    if (n <= 1000) {
      if (has_value_cached(n)) {
        return triangle_cache[n - 1];
      } else {
        int actual_num = n + this.value(n - 1);
        triangle_cache[n - 1] = actual_num;
        return actual_num;
      }
      
    } else {
      return n + this.value(n - 1);
    }
  }
  
  public int add(int n, int m) {
    return this.value(n) + this.value(m);
  }
  
  public int subtract(int n, int m) {
    return this.value(n) - this.value(m);
  }
}
