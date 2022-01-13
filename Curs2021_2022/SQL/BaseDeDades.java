import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BaseDeDades {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:basededades.sqlite");
        Statement smt = conn.createStatement();
        //smt.executeUpdate("INSERT INTO productes (nom, preu) VALUES ('producte 3',13.20);");
        //smt.executeUpdate("DELETE FROM productes WHERE ID in (4,5);");
        //smt.executeUpdate("UPDATE productes SET nom='producte editat' WHERE ID= 6;");
        //String q = "SELECT * FROM productes";
        //String q = "SELECT * FROM vendes";
        //String q = "SELECT * FROM vendes,clients, productes WHERE client=DNI and producte=ID ";
        //String q = "SELECT productes.nom, clients.nom FROM vendes,clients,productes WHERE client=DNI  and producte=productes.ID";
        String q = "SELECT productes.nom as nom_prod, clients.nom as nom_client FROM vendes,clients,productes WHERE client=DNI  and producte=productes.ID"; //renombrar
        ResultSet rs= smt.executeQuery(q);
        //ResultSet rs= smt.executeQuery("SELECT nom, preu FROM productes");
        while(rs.next()){
            //System.out.println(rs.getString(1)); //num de columna   
            //System.out.println(rs.getString("nom" ));
            //System.out.println( rs.getInt("ID")+ " " +rs.getString("nom" )+" :"+ rs.getDouble("preu"));
            // System.out.println( rs.getString("client")+" "+rs.getInt("producte" ) ); //volem que surti el nom del client en comptes del dni
            System.out.print( rs.getString("nom_client") + ": ");
             System.out.println(rs.getString("nom_prod" ) ); //volem que surti el nom del client en comptes del dni
            // System.out.print( rs.getString(1) + ": ");
             //System.out.println(rs.getString(2 ) ); //volem que surti el nom del client en comptes del dni
        }
        
        
        
    }
}