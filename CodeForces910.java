import java.util.Scanner;

public class CodeForces910 {

	public static void main(String[] args) {
		Scanner system = new Scanner(System.in);
		int q = system.nextInt();
		int t[] = new int[10];
		int m[] = new int[10];
		
		for(int i = 0; i < q; i++)
		{
			String s = system.next();
			int v = s.length();
			int z = 1;
			while(v-->0)
			{
				t[s.charAt(1)-'a']+=z;
				z*=10;
			}
			m[s.charAt(0) - 'a'] = 1;
		}
		
		int sum = 0;
		for(int i = 0; i < 10; i++)
		{
			int z =-1;
			for(int j = 0; j < 10; j++)
			{
				if(i==0 && m[j] ==1)
					continue;
				if(z==-1 || t[z]<t[j])
					z = j;
			}
			sum+= i * t[z];
			t[z]=-1;
		}
		
		System.out.println(sum);
		system.close();
	}

}
