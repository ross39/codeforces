import java.util.*;
import java.io.*;
public class PerfectSquares
{  
    public static void main(String[] args) 
    {  
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] z = new int[x];
        for(int i = 0; i < x; i++)
            z[i] = in.nextInt();
        Arrays.sort(z);
        for(int i = x - 1; i>= 0; i--)
        {
            if(Math.pow((int)Math.sqrt(z[i]), 2)!=z[i])
            {
                System.out.println(z[i]);
                return;   
            }
        }
    }
}