package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzShould {
  @Test
  void should_print_all_numbers_from_1_to_100(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.getAllNumbers();
    assertEquals(101,fizzBuzz.numbers.length);
  }

  @Test
  void should_print_Fizz_for_numbers_multiples_of_3(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.getAllNumbers();
    assertEquals("Fizz",fizzBuzz.numbers[3]);
  }

  @Test
  void should_print_Buzz_for_numbers_multiples_of_5(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.getAllNumbers();
    assertEquals("Buzz",fizzBuzz.numbers[5]);
  }

  @Test
  void print_FizzBuzz_for_numbers_multiples_of_3_and_5(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.getAllNumbers();
    assertEquals("FizzBuzz",fizzBuzz.numbers[15]);
  }

//  @ParameterizedTest
//  @CsvSource({"3,Fizz","5,Buzz","15,FizzBuzz"})
//  void print_Fizz_Buzz_for_particular_numbers(int index,String value){
//    FizzBuzz fizzBuzz = new FizzBuzz();
//    fizzBuzz.getAllNumbers();
//    assertEquals(value,fizzBuzz.numbers[index]);
//  }

}
