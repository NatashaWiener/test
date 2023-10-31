package classwork;

import java.util.Scanner;

public class homework22 {

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
    if (count > 0) {
      double average = sum / count;
      System.out.println(average);
    }

  }
}
  }

}
