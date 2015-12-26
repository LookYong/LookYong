public class SecondExercise {

	public static void main (String[] args) {

	// Data Type varible;

		int a;
		int b;
		
		

		a = 25;
		b = 35;
		

		System.out.println("Before swap a= " +a+ " b= " +b );



		int c;

		c=a;

		System.out.println("After c= "+c);
		System.out.println("After a= "+a);		
		System.out.println("After b= "+b);

		a=b;
		b=c;

		System.out.println("==========");
		System.out.println("After c= "+c);
		System.out.println("After a= "+a);		
		System.out.println("After b= "+b);
		System.out.println("After swap a= " +a+ " b= " +b );
}
}