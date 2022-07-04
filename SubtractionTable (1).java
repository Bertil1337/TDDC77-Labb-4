package Arv;

public class SubtractionTable extends ArithmeticTable {

	

	public SubtractionTable(int tabellHöjd, int tabellBredd, char op) {
		super(tabellHöjd, tabellBredd, '-');
		
	}

	double evaluate(double tal1, double tal2) {

		return tal2 - tal1;
	}

	

	@Override
	int width(int bredd, int hojd) {
		// TODO Auto-generated method stub
		return String.valueOf(hojd + bredd).length() + 2;
	}

}