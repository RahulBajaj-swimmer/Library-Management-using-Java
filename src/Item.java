
public class Item {
       private String text;
   private int code;
   
   public Item(String t, int c)
   {
       text = t;
       code = c;
   }
   public int getCode()
   {
       return code;
   }
 public String toString()
 {
     return text + "   " + code;
 }
  public static void main(String args[])    
  {
      Item obj = new Item("Java", 11);
      Item obj2 = new Item("Dotnet", 12);
      Item obj3 = new Item("Physics", 13);
      System.out.println(obj);
      System.out.println(obj2);  
      System.out.println(obj3); 
      
      
  } 
    
}
