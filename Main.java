import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> theArrayList = new ArrayList<String>();
    System.out.println("Type a word, type STOP to stop.");

    while (!input.equals("STOP"))
    {
      System.out.println("Inside loop. Enter a word");
      input = sc.nextLine();
      theArrayList.add(input);
      System.out.println("Add the word. ArrayList is now " + theArrayList);
    }


    theArrayList.remove(theArrayList.size()-1);
    System.out.println("Exited loop. ArrayList is now " +" \n" + theArrayList.size() + "\n" + theArrayList);
    theArrayList.set(theArrayList.size()-1, theArrayList.get(0));
    if (theArrayList.size() > 2)
    {
    theArrayList.remove(0);
    }
    System.out.println(theArrayList);
  }
  }
