import java.util.*;
public class Even
{
    public static void main (String [] args)
    {
        Scanner s=new Scanner (System.in);
        String  a=s.nextLine();
        String[] p = a.split(" ");
        for(int i=0;i<p.length;i++)
        {
            if(p[i].length()%2==0)
            {
                System.out.print(p[i]+" ");
            }
        }


    }
}
