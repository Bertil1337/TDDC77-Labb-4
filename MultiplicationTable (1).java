package Arv;

public class MultiplicationTable extends ArithmeticTable {

	

	public MultiplicationTable(int tabellHöjd, int tabellBredd, char op) {
		super(tabellHöjd, tabellBredd, '*');
		// TODO Auto-generated constructor stub
	}

	

	public double evaluate(double tal1, double tal2) {

		return tal1 * tal2;

	}

	@Override
	int width(int bredd, int hojd) {
		// TODO Auto-generated method stub
		return String.valueOf(hojd + bredd).length() + 2;
	}
}