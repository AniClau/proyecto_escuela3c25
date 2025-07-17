package models;

import java.sql.Connection;
//Carrera DAO contiene todos los métodos para interactuar con la tabla Carreras
//de la base de datos.
//Insert,Select,Update y Delete,
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CarreraDAO {
    private Connection conn;

    public CarreraDAO(Connection conn){
        this.conn = conn;

    }
    
    public int InsertarCarrera(Carrera carrera){
        String sql = "INSERT INTO Carreras (idcarrera,nombre,monto) VALUES (?, ?, ?)";
        int rows = 0;
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, carrera.getIdCarrera());
            stmt.setString(2, carrera.getNombre());
            stmt.setDouble(3, carrera.getMonto());
            rows = stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

        return rows;
    }
}
