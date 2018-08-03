package CLISum;

//Input 3 numbers as Command line input and display its sum  
public class CLISum {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);//Command Line Input 1
		int b=Integer.parseInt(args[1]);//Command Line Input 2
		int c=Integer.parseInt(args[2]);//Command Line Input 3
		System.out.println(""+a+b+c+"="+(a+b+c));//Sum output
	}

}
