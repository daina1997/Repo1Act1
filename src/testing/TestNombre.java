package testing;

import dao.TuNombreDaoImpl;

public class TestNombre {

	private static TuNombreDaoImpl testNombre;
	static {
		testNombre= new TuNombreDaoImpl();
	}
	public static void main(String[] args) {
		
		mellamo();
	}
	public static void mellamo() {
		System.out.println(testNombre.mellamo("Maria", "Barceló"));
	}
}