import java.util.*;
import java.io.*;
public class Rounding
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x == 5)
            System.out.println("10");
        else
        {
            System.out.println((int)(Math.rint((double) x / 10) * 10));

        }
    }
}