package daina;

import dao.TuNombreDaoImpl;

public class Daina {
	private static TuNombreDaoImpl persona1;
	static {
		persona1= new TuNombreDaoImpl();
	}
	
	public static void main(String[] args) {
	System.out.println(persona1.mellamo("Daina", "Díaz"));	

	}

}
