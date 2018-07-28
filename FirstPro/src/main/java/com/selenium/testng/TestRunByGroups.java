package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunByGroups {
  @Test(groups="car")
  public void car1() {
	  System.out.println("buick");
  }
  @Test(groups="color")
  public void color1() {
	  System.out.println("red");
  }
  @Test(groups="car")
  public void car2() {
	  System.out.println("audi");
  }
  @Test(groups="color")
  public void color2() {
	  System.out.println("green");
  }
  @Test(groups={"color","car"})
  public void color_car() {
	  System.out.println("white lexus");
  }
}
