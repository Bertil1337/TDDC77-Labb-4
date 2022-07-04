package Arv;

public class AdditionTable extends ArithmeticTable {
	
	public AdditionTable(int tabellHöjd, int tabellBredd, char op) {
		super(tabellHöjd, tabellBredd, '+');
		// TODO Auto-generated constructor stub
	}

	double evaluate(double tal1, double tal2) {

		return tal1 + tal2;
	}

	

	@Override
	int width(int bredd, int hojd) {
		
		
		 return String.valueOf(hojd + bredd).length() + 2;
	}

}
