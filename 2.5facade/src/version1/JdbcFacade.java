package version1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable(){
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE APP.Address1 (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable(){
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO APP.Address1 (ID, StreetName, City) "
                    + "values (1, '1234 Some street', 'Layton')");
            System.out.println(count + " record(s) created");
            sta.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM APP.Address1");

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

                Address address = new Address();
                address.setId(rs.getString(1));
                address.setStreetName(rs.getString(2));
                address.setCity(rs.getString(3));

                addresses.add(address);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return addresses;
    }
    
    public int dropTable(){
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("DROP TABLE APP.Address1");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}