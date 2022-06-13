package com.fizzbuzz;

public class FizzBuzz {

  String[] numbers = new String[101];

  public void getAllNumbers() {

    for (int index = 0; index <= 100; index++) {
      if (index % 15 == 0) {
        System.out.println("FizzBuzz");
        numbers[index] = "FizzBuzz";
      } else if (index % 3 == 0) {
        System.out.println("Fizz");
        numbers[index] = "Fizz";
      } else if (index % 5 == 0) {
        System.out.println("Buzz");
        numbers[index] = "Buzz";
      } else {
        System.out.println(index);
        numbers[index] = "" + index;
      }

    }
  }
}

