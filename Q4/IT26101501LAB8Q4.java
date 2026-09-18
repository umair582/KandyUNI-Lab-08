import java.util.Scanner;
class IT26101501LAB8Q4{
public static void main (String args[]){
	
	int searched_id;
	int Student_id[]=new int[8];
	 searched_id=0;
	boolean search=false;
	Scanner input=new Scanner(System.in);
	for(int count=0;count<8;count++){
		System.out.print("enter the student_id for student"+(count+1)+":");
		Student_id[count]=input.nextInt();

if(Student_id[count]<=0)
{System.out.println("Error: Please Enter ONLY Postive Numbers");
  count-- ;  }
	}

System.out.println("enter the student id to search");
searched_id=input.nextInt();
for(int i=0;i<8;i++)
{ if(searched_id==Student_id[i])
	{search=true;}
}
if(search)
{System.out.println("student id is available");
}
else{System.out.println("student id id not available");}
}
}
