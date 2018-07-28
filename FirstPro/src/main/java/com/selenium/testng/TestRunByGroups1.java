package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunByGroups1 {
  @Test(groups="car")
  public void car1() {
	  System.out.println("my car");
  }
  @Test(groups="color")
  public void color1() {
	  System.out.println("yellow");
  }
  @Test(groups="car")
  public void car2() {
	  System.out.println("your car");
  }
  @Test(groups="color")
  public void color2() {
	  System.out.println("blue");
  }
  @Test(groups={"color","car"})
  public void color_car() {
	  System.out.println("their cars");
  }
}
