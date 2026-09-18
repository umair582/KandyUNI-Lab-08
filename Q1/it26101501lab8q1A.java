import java.util.Scanner;

class it26101501lab8q1A {
    public static void main(String[] args) {
        int myArray[] = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("enter number" + (i + 1)+":");
            myArray[i] = input.nextInt();
        }
       System.out.println("Array in reverse oder:");
        for (int count = 4; count >= 0; count--) {
			
            System.out.print(myArray[count]+" ");
        }
    }
}
