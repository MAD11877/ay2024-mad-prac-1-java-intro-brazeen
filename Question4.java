import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    for (int i = 0; i < base; i++){
      for (int j = base; j > i; j--){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
