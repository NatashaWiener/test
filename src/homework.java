import java.util.Scanner;

public class homework {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    for (int i = 0; i < 5; i = i + 1) {
      arr[i] = scanner.nextInt();
    }
    for (int i = 0; i < 5; i = i + 1) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
      }
    }
  }

}
