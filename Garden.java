import java.util.*;
import java.io.*;
public class Garden
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int bucket = in.nextInt();
        int length = in.nextInt();
        int y =0, t = Integer.MIN_VALUE;
        for(int i = 0; i < bucket; i++)
        {
            int x= in.nextInt();
            if(length % x == 0 &&  x > t)
                {
                    t = x;
                    y = length / t;
                }
        }
        System.out.println(y);

    }

}