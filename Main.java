// Main.java
// Raja Sooriamurthi
import java.io.*;
import java.util.*;

public class Main 
{
      public static void main(String[]args)
      {
         int cs = 0;
      int ps = 0;
      MindReader mr = new MindReader();
      while(cs<25 && ps<25)
      {  
         String m = mr.getPrediction();
         int r = mr.getScore();
         Scanner sc = new Scanner(System.in);
         String s = "";
         boolean b = true;
         while(b)
         {
            System.out.println("Please choose heads or tails (h/t)");
            System.out.println("This round is worth " + r + " points");
            String sr = sc.next();
            if(sr.equals("t") || sr.equals("h"))
            {
               b = false;
               s = sr;
               break;
            }
            System.out.println("Take another guess");
         }
         if(m.equals(s))
         {
            System.out.println("Computer gets the point");
            cs+=r;
         }
         else
         {
            System.out.println("Player gets the point");
            ps+=r;
         }
         
         mr.storePlayerGuess(s);
         System.out.println("Player score = " + ps);
         System.out.println("Computer score = " +cs);
         System.out.println();     
      }
      
      if(cs>ps)
         System.out.println("Computer wins!");
      else
         System.out.println("You win!");
   } 
      
      /*
            int cscore = 0;
      int hscore = 0;
      MindReader m = new MindReader();
      Scanner imput = new Scanner(System.in);
      while(cscore < 25)
      {
      while(hscore < 25)
      {
      System.out.println("Heads or Tails?");
      System.out.println("H/T");
      String s = imput.next();
      m.storePlayerGuess(s);
      String mind = m.getPrediction();
      if(s.compareTo(mind) == 0)
         cscore++;
      else 
         hscore++;
      System.out.println("The score is " + cscore + " me and " + hscore + " you");
      if(cscore == 25)
      System.out.println("I win you lose");
   }
   if(hscore == 25)
      System.out.println("I win you lose");
   }

      String s = imput.next();
      m.storePlayerGuess(s);
   }
   //mindelss mind reader
   /*
  public static void main(String[]args)
   {
   int cscore = 0;
   int hscore = 0;
   MindReader m = new MindReader();
   Scanner imput = new Scanner(System.in);
   while(cscore < 25)
   {
   while(hscore < 25)
   {
      System.out.println("Heads or Tails?");
      System.out.println("H/T");
      String s = imput.next();
      String mind = m.getPrediction();
      if(s.compareTo(mind) == 0)
         cscore++;
      else 
         hscore++;
      System.out.println("The score is " + cscore + " me and " + hscore + " you");
      if(cscore == 25)
      System.out.println("I win you lose");
   }
   if(hscore == 25)
      System.out.println("I win you lose");
   }
   }
*/

   }    
   
   