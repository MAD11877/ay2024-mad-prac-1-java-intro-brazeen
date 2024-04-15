import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int iterations = in.nextInt();
    int number;
    ArrayList<Integer> intlist = new ArrayList<Integer>();
    for (int i = iterations; i > 0; i--){
      number = in.nextInt();
      intlist.add(number);
    }
    int mode;
    ArrayList<Integer> occurlist = new ArrayList<Integer>();
    for (int i : intlist){
        int count = 0;
        for (int j = 0; j < intlist.size(); j++){
            if (i == intlist.get(j)){
                count += 1;
            }
        }
        occurlist.add(count);
    }
    
    //now find highest count
    int index = 0;
    int highest = 0;
    for (int i = 0; i < occurlist.size(); i++){
        if (occurlist.get(i) > highest){
            highest = occurlist.get(i);
            index = i;
        }
    }
    
    System.out.println(intlist.get(index));
  }
}
