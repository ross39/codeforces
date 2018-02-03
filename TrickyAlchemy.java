import java.util.*;
import java.io.*;
public class TrickyAlchemy
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long yellow,blue,green,yellowN,blueN,greenN,tot1,tot2,tot3= 0;
        yellow = in.nextLong();
        blue = in.nextLong();
        yellowN = in.nextLong();
        greenN = in.nextLong();
        blueN = in.nextLong();
        tot1 = 2 * yellowN + greenN;
        tot2 = 3 * blueN + greenN;
        if((tot1-yellow)> 0)
            tot3 = tot1 - yellow;
        if((tot2 - blue) > 0)
            tot3 = tot3 + tot2 - blue;
        System.out.println(tot3);




    }
}