
import java.sql.Connection;
import java.sql.PreparedStatement;

public class educador {
    
    static String todos = "SELECT * FROM educadoras ORDER BY nombree";
    static String curps = "SELECT curpe FROM educadoras ORDER BY curpe";
    
    String curpe,nombree,sexoe,telefonoe,direccione,estadoe;

    public educador() {
    }

    public educador(String curpe, String nombree, String sexoe, String telefonoe, String direccione, String estadoe) {
        this.curpe = curpe;
        this.nombree = nombree;
        this.sexoe = sexoe;
        this.telefonoe = telefonoe;
        this.direccione = direccione;
        this.estadoe = estadoe;
    }

    

    public int insertar(Connection con){
        int resultado=0;
        try {
            String sql = "INSERT INTO educadoras VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curpe);
            ps.setString(2, nombree);
            ps.setString(3, sexoe);
            ps.setString(4, telefonoe);
            ps.setString(5, direccione);
            ps.setString(6, estadoe);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
            return resultado;
        }
    }
    
    public int borrar(Connection con){
        int resultado =0;
        try {
            String sql = "DELETE FROM educadoras WHERE curpe = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, curpe);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            return resultado;
        }
    }
    
    public int actualizar(Connection con){
        int resultado =0;
        try {
              String sql = "UPDATE educadoras SET nombree = ?, sexoe = ?, telefonoe = ?, direccione = ?, estadoe = ? WHERE curpe = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombree);
            ps.setString(2, sexoe);
            ps.setString(3, telefonoe);
            ps.setString(4, direccione);
            ps.setString(5, estadoe);
            ps.setString(6, curpe);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            return resultado;
        }
    }
}
