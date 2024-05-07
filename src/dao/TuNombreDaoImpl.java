package dao;

public class TuNombreDaoImpl implements TuNombreDao {

	@Override
	public String mellamo(String Nombre, String Apellidos) {
		
		return "Me llamo: " + Nombre + " " + Apellidos;
	}
}