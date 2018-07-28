package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestAddDataProvider {
  @DataProvider(name="shareData")
  public Object[][] data() {
    return new Object[][] {
      new Object[] { 1, 2,3 },
      new Object[] { 0,-1,-1},
      new Object[] { -10,-9,-19},
    };
  }
}
