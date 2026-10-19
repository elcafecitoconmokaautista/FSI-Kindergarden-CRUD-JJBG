import java.sql.*;

public class bitacora {

    public bitacora() {
    }
    
    
   
    static String todos = "SELECT *  FROM bitacora ORDER BY tiempo DESC";
   
    String falta, tiempo, tipo, observaciones, infantes_curp, responsables_curpr, educadores_curpe;

    // Constructor con los 7 campos
    public bitacora(String falta, String tiempo, String tipo, String observaciones, String infantes_curp, String responsables_curpr, String educadores_curpe) {
        this.falta = falta;
        this.tiempo = tiempo;
        this.tipo = tipo;
        this.observaciones = observaciones;
        this.infantes_curp = infantes_curp;
        this.responsables_curpr = responsables_curpr;
        this.educadores_curpe = educadores_curpe;
    }

    // Método INSERTAR
    public int insertar(Connection con) {
        int resultado = 0;
        String sql = "INSERT INTO bitacora (falta, tiempo, tipo, observaciones, infantes_curp, responsables_curpr, educadores_curpe) VALUES (?,?,?,?,?,?,?)";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, falta);
            ps.setString(2, tiempo);
            ps.setString(3, tipo);
            ps.setString(4, observaciones);
            ps.setString(5, infantes_curp);
            ps.setString(6, responsables_curpr);
            ps.setString(7, educadores_curpe);
           
            resultado = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
       
        return resultado;
    }

    // Método BORRAR (utilizando el CURP del infante y la fecha/falta como identificadores)
    public int borrar(Connection con) {
        int resultado = 0;
        String sql = "DELETE FROM bitacora WHERE infantes_curp = ? AND falta = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, infantes_curp);
            ps.setString(2, falta);
           
            resultado = ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
       
        return resultado;
    }

    // Método ACTUALIZAR
    public int actualizar(Connection con) {
        int resultado = 0;
        String sql = "UPDATE bitacora SET tiempo = ?, tipo = ?, observaciones = ?, responsables_curpr = ?, educadores_curpe = ? WHERE infantes_curp = ? AND falta = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tiempo);
            ps.setString(2, tipo);
            ps.setString(3, observaciones);
            ps.setString(4, responsables_curpr);
            ps.setString(5, educadores_curpe);
            ps.setString(6, infantes_curp);
            ps.setString(7, falta);
           
            resultado = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
       
        return resultado;
    }
}
