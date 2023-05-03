package Section2.Practice;

public class checkNumberpositiveNegetive {
public static void main(String[] args) {
	int num = -10;
	String output = num>0 ? "is positive":"is negetive";//check number is +ve or-ve
	System.out.println("The number"+ output);
	int op = num>0 ? (~num)+1 :(~num)+1;//check no. is +ve or-ve and print its  positive and negive number
	System.out.println(op);
}
}
