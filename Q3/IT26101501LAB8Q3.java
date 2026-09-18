import java.util.Scanner;
class IT26101501LAB8Q3{
public static void main (String args[]){
	
	int num;
	int postiveNO[]=new int[6];
	int max=postiveNO[0];
	Scanner input=new Scanner(System.in);
	for(int count=0;count<6;count++){
		System.out.print("enter the postive number"+"("+(count+1)+"/6)"+":");
		postiveNO[count]=input.nextInt();

if(postiveNO[count]<=0)
{System.out.println("Error: Please Enter ONLY Postive Numbers");
  count-- ;  }
	}

System.out.println("Array Content:");
for(int i=0;i<6;i++)
{ num=max-postiveNO[i];
if(num<0)
{max=postiveNO[i];}	
	System.out.print( postiveNO[i]+" ");}
	System.out.println(" ");
	System.out.print("the maximum number entered:"+max);
}
}