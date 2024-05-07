package micaela;

import dao.TuNombreDaoImpl;

public class Micaela {
private static TuNombreDaoImpl personal;
	
	static {
		personal = new TuNombreDaoImpl();
	}
	
	public static void main(String[] args) {
		System.out.println(personal.mellamo("Micaela", "Palomero"));
	}
}
