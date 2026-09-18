import java.util.Scanner;

class it26101501lab8q1B {
    public static void main(String[] args) {
        int myArray[] = new int[5];
        Scanner input = new Scanner(System.in);
		int evenArray[]=new int[5];
		int no;

        for (int i = 0; i < 5; i++) {
            System.out.print("enter number" + (i + 1)+":");
			no=input.nextInt();
            myArray[i] = 	no;
			if((no % 2)==0)
			{evenArray[i]=no;}
        }
       System.out.println("Array in reverse oder:");
        for (int count = 4; count >= 0; count--) {
			
            System.out.print(myArray[count]+" ");
        }
		System.out.println("  ");
System.out.println("evenArray content:");
for(int z=0;z<5;z++)
{System.out.print(evenArray[z]+" ");}
		
    }
}
