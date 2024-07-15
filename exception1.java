import java.util.*;
class ValidGrade extends Exception
{
    public ValidGrade(String str)
    {
        super(str);
    }
}
class checking 
{
    public static void check(int []mark)throws ValidGrade
    {
        int total=0;
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]<0)
            {
              throw new ValidGrade("Enter positive number"); 
            }
            total=total+mark[i];
        }
        if(total>500)
        {
            throw new ValidGrade("Enter the mark below 500");
        }
        else
        {
            System.out.print("Total mark = "+" "+total);
        }
    }
}
