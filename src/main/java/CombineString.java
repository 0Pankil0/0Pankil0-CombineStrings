import java.util.Scanner;

public class CombineString {
      public static void main(String[] args) {
    // Taking name from user...
      System.out.println("What is your first name ?");
      Scanner input1 = new Scanner(System.in);
      String n1 = input1.nextLine();
    // Taking last name from user...
      System.out.println("What is your last name ?");
      Scanner input2 = new Scanner(System.in);
      String n2 = input2.nextLine();
    // Combaining string...
      String n3 = n1.concat( n2);
      System.out.println("Means your full name is " + n3);
    // Uper case...
      System.out.println(n3.toUpperCase());
    // Lower case...
      System.out.println(n3.toLowerCase());
    // String character count...
      System.out.println("Your full name has "+n3.length()+" character."); 
    // Telling first letter of first name...
      System.out.println("Your first name's first letter is "+n1.charAt(0));
    // Relacing character a,e,i,o,u to Z in your first name...
      String n4 = n1.replace('a','Z');
      String n5 = n4.replace('e','Z');
      String n6 = n5.replace('i','Z');
      String n7 = n6.replace('o','Z');
      String n8 = n7.replace('u','Z');
      System.out.println("Your first name by replacing vowel to Z is "+n8+ " :)");
      System.out.println("This is a end of program...");
    // Closing all input...
      input1.close();
      input2.close();
  }
}

