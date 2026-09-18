class IT26101501LAB8Q2{
public static void main(String args[]){
	int A[]= {10,20,30,40,50};
	int B[]={34,67,12,89,12};
	int C[]=new int[5];
	for (int count=0;count<5;count++){
		C[count]=A[count]+B[count];
	}
	
	System.out.println("A Array Content:");
	
	for (int I=0;I<5;I++){
	System.out.print(A[I]+" ");}
	System.out.println(" ");
	
	System.out.println("B Array Content:");
	
	for (int I=0;I<5;I++){
	System.out.print(B[I]+" ");}
		System.out.println(" ");
	
	System.out.println("C Array Content:");

for (int I=0;I<5;I++){
	System.out.print(C[I]+" ");
	}
}

}
	
	