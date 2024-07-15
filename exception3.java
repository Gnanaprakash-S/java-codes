class HelloWorld {
    
    public static void main(String[] args) {
        try 
        {
            String a="ngu";
            String b=null;
            char s=b.charAt(5);
        }   
      
        catch (NullPointerException e) 
        {
            System.out.println("Null pointer exception");
        }
        try 
        {
            String b="ngu5";
            int s=Integer.parseInt(b);
        }   
      
        catch (NumberFormatException e) 
        {
            System.out.println("NumberFormatException");
        }
        try
        {
            String c="yufihu";
            char d=c.charAt(78);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
