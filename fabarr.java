import java.io.*;
class fabarr
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [] a=new int[9];
		int b=1,c,i;
		System.out.println("Enter Any Element");
		b=Integer.parseInt(br.readLine());
		for(i=0;i<8;i++)
		{
			for(i=0;i<8;i++)
			{
				while(b<=100)
				{
					c=a[i]+b;
					System.out.print("\t"+c);
					a[i]=b;
					b=c;
				}
			}
		}
	}
}
