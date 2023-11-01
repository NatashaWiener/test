package classwork;

import java.util.Scanner;

public class Hello {
  //metod kotorii budet chto to delat

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int count = 0;


    while (true) {
      double number = scanner.nextDouble();
      if (number == 0) {
        break;
      }
      sum += number;
      count++;
    }
    int arr = {4, 9, 5, 1, 6}    
      if (count > 0) {
      double average = sum / count;
      System.out.println(average);
    }

  }
}

