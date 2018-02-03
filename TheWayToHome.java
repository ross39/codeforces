import java.util.*;
import java.io.*;
public class TheWayToHome
{   private static final int v = Integer.MAX_VALUE / 3;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        String q = in.next();
        TheWayToHome i = new TheWayToHome();
        System.out.println(i.Method(x, y, q));        
    }

    public int Method(int x, int y, String q)
    {
        int[] z = new int[x];
        Arrays.fill(z,v);
        z[0] = 0;
        for(int i = 0; i < x; i++)
        {
            if(q.charAt(i) == '0')
                continue;
            for(int j = i - 1; j >= Math.max(0, i - y); --j)
            {
                z[i] = Math.min(z[i],z[j] + 1);

            }
        }
        return z[x - 1] == v ? -1 : z[x -1];
    }
}