public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checking obj=new checking();
         int arr[]=new int[5];
       for(int i=0;i<5;i++)
       {
           arr[i]=sc.nextInt();
       }
        try
        {
            obj.check(arr);
        }
        catch(ValidGrade e)
        {
            System.out.println("Exception occured"+" "+e.getMessage());
        }
        
    }
}


