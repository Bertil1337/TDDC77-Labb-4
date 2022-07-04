package Arv;

public class DivisionTable extends ArithmeticTable {

	

	public DivisionTable(int tabellHöjd, int tabellBredd, char op) {
		super(tabellHöjd, tabellBredd, '/');
		
	}

	
	double evaluate(double tal1, double tal2) {
		if (tal2 != 0) {
			return (double) tal1 / tal2;
		}
		return 0;
	}

	@Override
	int width(int bredd, int hojd) {
		
		return String.valueOf(hojd + bredd).length() + 2;
	}

}