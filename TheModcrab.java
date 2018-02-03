import java.util.*;
import java.io.*;
public class TheModcrab
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int vova[] = in.nextInt();
        int monster[] = in.nextInt();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(monster[0] > 0)
        {
            if(vova[0] <monster[1] + 1 && monster[0] > vova[1])
            {
                sb.append("HEAL\n");
                vova[0]+= vova[2] - monster[1];
            }
            else
            {
                sb.append("STRIKE\n");
                vova[0]-= monster[1];
                monster[0]-= vova[1];
            }
            count++;
        }
        System.out.println(count);
        System.out.println(sb.toString());
    }
}
/*
import java.util.Scanner;
public class Modcrab {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h1=sc.nextInt();
        int a1=sc.nextInt();
        int c1=sc.nextInt();
        int h2=sc.nextInt();
        int a2=sc.nextInt();
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(h2>0){
            if(h1<a2+1 && h2>a1){
                 sb.append("HEAL\n");
                h1+=c1-a2;
            }
             else
             {
           sb.append("STRIKE\n");
           h1-=a2;
           h2-=a1;
            }
            count++;
        }
        System.out.println(count);
        System.out.println(sb.toString());
    }
    
}*/