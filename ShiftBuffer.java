// ShiftBuffer.java
// Raja Sooriamurthi
import java.io.*;
import java.util.*;

// a shift buffer is implemented simply as an object with
// a string member variable given the 

public class ShiftBuffer 
{
   private String[] array;
   private int length;
   private int counter;
   private int counterTwo;

  public ShiftBuffer (int size) 
  {
    length = size;
    int counter = 0;
    int counterTwo = 0;
    array = new String[size];
    for(int i = 0; i < array.length; i++)
    {
      array[i]=("*");
    }
  }
  
  public String shift (String x) 
  { 
   if(counter < length)
   {
      array[counter] = x;
      counter++;
   }
   //if(array[length-1] == "t" || array[length-1] == "h")
   else
   {
      for(int i = 0; i < length-1; i++)
      {
         array[i]= array[i+1]; 
      }
      array[length-1] = x;
   }
  /*
   if(list.isEmpty == true)
   {
      list.add(list.size-1,x)
   }
   else if(list.get(0) == null)
   {
      for(int i = 0; i < length; i++)  
      list.set(0,list.get(1)
   }
   */
   return "";
  }

  public String toString() 
  {
    return array + "";
  }
  
  // *************************
  //   main used to test your ShiftBuffer 
  //   constructor and methods. 
  // *************************

  public static void main (String[] args) 
  {
   ShiftBuffer b = new ShiftBuffer(4);
   Scanner im = new Scanner(System.in);
   for(int i = 0;i < 100; i++)
   {
   String s = im.next();
   b.shift(s);
   }
  }
}

