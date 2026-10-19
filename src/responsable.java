public class responsable {
    
    static String todos = "SELECT * FROM responsables ORDER BY nombrer";
    static String curps = "SELECT curpr FROM iresponsables ORDER BY curpr";
    
    String curpr,nombrer,sexor,telefono,parentesco,estador;

    public responsable() {
    }

    public responsable(String curpr, String nombrer, String sexor, String telefono, String parentesco, String estador) {
        this.curpr = curpr;
        this.nombrer = nombrer;
        this.sexor = sexor;
        this.telefono = telefono;
        this.parentesco = parentesco;
        this.estador = estador;
    }
    
    
    
}
