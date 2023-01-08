// HTcounter.java
// Raja Sooriamurthi


//Simple class the stores the number of heads and tails
//that have been counted.  
//class should have methods to increment the count of 
//heads and tails as well as return individual counts.

public  class HTcounter 
{
   private int heads;
   private int tails;
   
   public HTcounter()
   {
      heads = 0;
      tails = 0;
   }
   
   public int getHeads()
   {
      return heads;
   }
   
   public int getTails()
   {
      return tails;
   }
   
   public void addHeads()
   {
      heads++;
   }
   
   public void addTails()
   {
      tails++;
   }
   
   public String toString()
   {
     return heads + "-" + tails;      
   }
}
