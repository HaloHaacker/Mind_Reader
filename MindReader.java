// MindReader.java
// Raja Sooriamurthi
import java.io.*;
import java.util.*;
import java.lang.*;


//This class is used to implement the AI
//for the MindReader program
public class MindReader 
{
 private ShiftBuffer s;
 private Map<String, HTcounter> map;
 //private ArrayList<String> list;
 private int score;
 
  public MindReader() 
  {
   s = new ShiftBuffer(5);
   map = new TreeMap<>();
   //score = 0;
   /*
   int random = (int)(Math.random()*2+1);
   if(random == 1)
      System.out.println("h");
   else
      System.out.println("t");
      */
  }
  public int getScore() 
  {
   return score;
  }
 
  public String getPrediction() 
  {
   String sr = s + "";
      if(map.containsKey(sr))
      {
         for(String key: map.keySet())
         {
            if(key.equals(sr))
            {
               HTcounter h = map.get(key);
               score = Math.abs(h.getHeads()-h.getTails());
               if(h.getHeads()>h.getTails())
                  return "h";
               else if(h.getTails()>h.getHeads())
                  return "t";
            }
         }
      }
      return "h";
  /*
       //return "h";
      if(list.size() <= 3)
      {
         return "h";
      }
      else
      {
      if(list.get(list.size()-3).equals(list.get(list.size()-2)) && list.get(list.size()-2).equals(list.get(list.size()-1)))
         return list.get(list.size()-2);
      else if(list.get(list.size()-3).equals(list.get(list.size()-2)) && list.get(list.size()-2) != list.get(list.size()-1))
         return list.get(list.size()-2);
      else if(list.get(list.size()-3) != list.get(list.size()-2) && list.get(list.size()-2).equals(list.get(list.size()-1)))
         return list.get(list.size()-1);
      }
      return "h";      
  /*
    int count = 0;
    while (count <= 3)
    { 
    int random = (int)(Math.random()*2+1);
    if(random == 1)
    {
      count++;
      return "h";
    }
     else
     {
        count++;
        return "t";  
      }
        }
   if(list.get(list.size()-3) == "h")
   {
      return "h";
   }
   */
   //else return "t";
  }

  
  public void storePlayerGuess (String guess) 
  {
      String str = s + "";
      if(str.substring(0,1).equals("*"))
      {
         s.shift(guess);
      }
      if(map.containsKey(str))
      {
         for(String x: map.keySet())
         {
            if(x.equals(str))
            {
               HTcounter h = map.get(str);
               if(guess.equals("h"))
                  h.addHeads();
               else
                  h.addTails();
               
               map.put(str,h);
            }
         }
      }
      else
      {
         HTcounter h = new HTcounter();
         if(guess.equals("h"))
            h.addHeads();
         else
            h.addTails();
               
         map.put(str,h);      
      }
      
      s.shift(guess);

   //list = new ArrayList<String>();
   //list.add(guess);
  //3
  /*
   ArrayList<String> list = new ArrayList<String>();
   while(list.size()+1 <= 4)
   {
      list.add(list.size()+1,guess);
   }
   if(list.size() == 3)
   {
      map.put("H/T value",list);
      list.set(0,list.get(1));
      list.set(1,list.get(2));
      list.add(2,guess);
   }
   */
  }

}
    
