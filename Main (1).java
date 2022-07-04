package Arv;


public class Main {
	public static void main(String[]args) {
		ArithmeticTable table = new AdditionTable(13,13,'+');
		//ArithmeticTable table = new SubtractionTable(13,13,'-');
		//ArithmeticTable table = new DivisionTable(13,13,'/');
		//ArithmeticTable table = new MultiplicationTable(13,13,'*');
		   table.print();
		   System.out.println();
		   
		  
		   }
	}
