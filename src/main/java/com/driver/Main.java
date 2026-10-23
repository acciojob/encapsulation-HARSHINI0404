package com.driver;

public class Main {
  RWOnly obj = new RWOnly();
  // obj.name="Angel";
  // System.out.println(obj.name);
  // Error: name has private access in RWOnly class
  obj.setName("Angel");
  System.out.println(obj.getName());
}
