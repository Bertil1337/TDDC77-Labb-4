package Arv;

public abstract class ArithmeticTable {

	private int kolumns;
	private int rader;
	private char op;

	public ArithmeticTable(int kolumns, int rader,char op) {

		this.rader = rader;
		this.kolumns = kolumns;
		this.op = op;
	}

	abstract int width(int rader, int kolumner);
	
	abstract double evaluate(double a, double b);

public void print() {
    	
    	System.out.print(String.format("%" + width(kolumns, rader) + "s", op + "|"));

        for(int i = 0; i < rader; i++) {
            System.out.print(String.format("%" + width(kolumns, rader) + "d", i));
        }
        System.out.println();

        System.out.print(String.format("%" + width(kolumns, rader) + "s", "---+"));
        for(int i = 0; i<(rader * width(kolumns, rader)); i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 0; i < kolumns; i++ ) {
        	
            System.out.print(String.format("%" + width(kolumns, rader) + "s", i + " |"));
            
            for (int k = 0; k < rader ; k++ ) {

                if((evaluate(k, i) %1) == 0) {
                    System.out.print(String.format("%" + width(kolumns, rader) + ".0f", (evaluate(k, i))));
                }
                else {
                	   System.out.print(String.format("%" + width(kolumns, rader) + ".1f", (evaluate(k, i))));
                }
            }
            System.out.println();
        }
    }

}