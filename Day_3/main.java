/*
 12) accept 2 numbers and display whether
	a) first number is greater
	b) second number is greater
	c) both are equal
 */

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b) {
			System.out.println("Both the numbers are equal.");
		}else if (a > b) {
			System.out.println("The greater number between "+a+" & "+b+" is "+a);
		}else{
			System.out.println("The greater number between "+a+" & "+b+" is "+b);

		}
	}
}










/*
 7) accept a number and display whether it is even , odd or zero.
 */

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
// 		System.out.println("Enter your number:");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
// 		if (num == 0) {
// 			System.out.println("The number you enter is 0.");
// 		}else if (num % 2 == 0) {
// 			System.out.println("The number you enter is is divisible by 2.");
// 		}else{
// 			System.out.println("The number you enter is odd number.");
// 		}
//     }
//  }









/*
 6) accept numbers and display as long as user does not enter 0.
 */

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         while (true) {
//             System.out.println("\nEnter your number:");
//             num = sc.nextInt();
//             if (num != 0) {
//                 System.out.println("Your number is "+num);
//             }else{
//                 System.out.println("You have exited!!!!!");
//                 System.exit(0);
//             }
//         }
//     }
//  }








/*
 5) accept a number and display its table using 
	while
	do... while
	for
 */

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         System.out.println("Enter your number: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println("\n\nThe table for "+num+" is:");
//         int numb = 1;
//         do{
//             System.out.println(num+" x "+numb+" = "+(num*numb));
//             numb++;
//         }while (numb < 11);

//         /*while (numb < 11) {
//             System.out.println(num+" x "+numb+" = "+(num*numb));
//             numb++;
//         }*/
//         /*for (int numb = 1; numb < 11; numb++) {
//             System.out.println(num+" x "+numb+" = "+(num*numb));
//         }*/
//     }
// }





/*
 4) accept 2 numbers and a character as operator ( + , - ,* , / , % ). Perform arithmetic according to the character entered.
 */

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args) {
//         System.out.println("Enter the two numbers a & b:");
//         int a, b;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         b =sc.nextInt();
//         System.out.println("Enter your operator: ");
//         char c = sc.next().charAt(0);
//         switch (c) {
//             case '+':
//                 System.out.println("Addition is: "+(a+b));
//                 break;
//             case '-':
//                 System.out.println("Subtract is: "+(a-b));
//                 break;

//             case '*':
//                 System.out.println("Multiplication is: "+(a*b));
//                 break;

//             case '/':
//                 System.out.println("Division is: "+(a/b));
//                 break;

//             case '%':
//                 System.out.println("Modulus is: "+(a%b));
//                 break;

//             default:
//                 System.out.println("Error!!! Put the right operator.");
//         }

//     }
//  }






/*
 3) accept a character and display (using if.. else ) whether it is vowel or not.
 */

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args) {
//         System.out.println("Enter your character and I will tell if it is a vowel or not: ");
//         Scanner sc = new Scanner(System.in);
//         char c = sc.next().charAt(0);
//         if (c == 'a'|| c=='e'||c=='i'||c=='o'||c=='u') {
//             System.out.println("The character you input is a vowel.");
//         }else if (c == 'A'|| c=='E'||c=='I'||c=='O'||c=='U') {
//             System.out.println("The character you input is a vowel.");
//         }
//         else{
//             System.out.println("The character you input is not a vowel");
//         }

//     }
//  }








/*
 2) accept a number and display whether it is divisible by 7 or not.
 */

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args) {
//         System.out.println("Enter your number to see if it is divisible by 7 or not:");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if (number % 7 == 0) {
//             System.out.println("The number you input is perfectly divisible by 7.");
//         }else{
//             System.out.println("The number you input is not divisible by 7");
//         }
//     }
// }


/*
 1) accept marks from user. if marks are
	> 75  display "Distinction"
	> =60 and < =75 display "first class"
	> =45 and < 60 display "second class"
	>=35 and < 45 display "pass class"
	<35 display "fail"
 */

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args) {
//         System.out.println("Enter the marks scored by the Student: ");
//         Scanner sc= new Scanner(System.in);
//         int marks = sc.nextInt();
//         if (marks > 75) {
//             System.out.print("You got Distinction.");
//         }else if (marks >= 60 && marks <= 75) {
//             System.out.println("You got First Class");
//         }else if (marks >= 45 && marks < 60) {
//             System.out.println("You got Second Class");
//         }else if (marks >= 35 && marks < 45) {
//             System.out.println("You got Pass Class");
//         }else if (marks < 35) {
//             System.out.println("Fail");
//         }else{
//             System.out.println("Enter correct marks");
//         }
//     }
// }