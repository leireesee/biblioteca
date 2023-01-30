package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBBDD extends Conector {
	
	public void insertarLibro(Libro libro) {
		String lineaInsertar = "INSERT INTO libros (titulo, autor, num_pag) VALUES (?, ?, ?)";
		try {
			PreparedStatement st = super.conexion.prepareStatement(lineaInsertar);
			st.setString(1, libro.getTitulo());
			st.setString(2, libro.getAutor());
			st.setInt(3, libro.getNumPag());
			
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void eliminarLibro(int id) {
		String lineaEliminar = "DELETE FROM libros WHEN id = ?";
		try {
			PreparedStatement st = super.conexion.prepareStatement(lineaEliminar);
			st.setInt(1, id);
			
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Libro getLibro(int id) {
		Libro libro = null;
		String getLibro = "SELECT FROM libros WHEN id = ?";
		
		try {
			PreparedStatement st = super.conexion.prepareStatement(getLibro);
			st.setInt(1, id);
								
			ResultSet rSet = st.executeQuery();
					
			libro = new Libro();
			
			libro.setId(rSet.getInt("id"));
			libro.setTitulo(rSet.getString("titulo"));
			libro.setAutor(rSet.getString("autor"));
			libro.setNumPag(rSet.getInt("num_pag"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libro;
	}
}
