import java.util.*;
class Sub
{
    public static boolean norepeat(String d)
    {
        String n = "";
        for(int i=0;i<d.length();i++)
        {
            String y = Character.toString(d.charAt(i));
            if(!n.contains(y))
            {
                n+=y;
            }
        }
        if(n.length()==d.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        ArrayList<String> l = new ArrayList<String>();
        for(int i=0;i<a.length();i++)
        {
            for(int j=i;j<a.length();j++)
            {
                l.add(a.substring(i,j));
            }
        }
        ArrayList<String> ni = new ArrayList<String>();
        for(String p:l)
        {
            if(norepeat(p))
            {
                ni.add(p);
            }
        }
        String[] arr = new String[ni.size()];
        int i=0;
        for(String w:ni)
        {
            arr[i]=w;
            i++;
        }
        int max=arr[0].length();
        String q;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j].length()>max)
            {
                max=arr[j].length();
                q=arr[j];
            }
        }
        System.out.print(max);
    
    }
}
