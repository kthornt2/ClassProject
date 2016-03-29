package source;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 * Created by andrew on 3/27/16.
 */
public class DBConnect {

   // private Connection con;
   // private Statement st;
    //private ResultSet rs;


    public static Connection getConnection() throws Exception {

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/FANTASY";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");

            return conn;


        }catch (Exception ex){
            System.out.println("Error: "+ex);
        }

        return null;
    }

    /*
    public void getData(){
        try{

            String query = "select * from USER";
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while(rs.next()){
                String fname = rs.getString("USER_FNAME");
                String lname = rs.getString("USER_LNAME");
                String password = rs.getString("USER_PASSWORD");
                String screename = rs.getString("USER_SCREENNAME");

                System.out.println("fname: " + fname + "password: " + password);
            }

        }catch (Exception ex){
            System.out.println("Error: "+ex);
        }

    }
    */

  /*  public static void createTable() throws Exception{

        try {

            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NO EXISTS");
        }

        }catch (Exception e){System.out.println(e);

    }
    */

    public static void post(String firstName, String lastName, String password, String e_mail, String screenName) throws Exception{
        final String fName = firstName;
        final String lName = lastName;
        final String pswd = password;
        final String email = e_mail;
        final String scrnName = screenName;


        try{
            Connection con = getConnection();
            PreparedStatement posted = con.prepareStatement("INSERT INTO USER (USER_ID, USER_FNAME, USER_LNAME, USER_PASSWORD, USER_EMAIL, USER_SCREENNAME ) VALUES (NULL , '"+fName+"', '"+lName+"', '"+pswd+"', '"+email+"','"+scrnName+"'  )");

            posted.executeUpdate();
        }catch (Exception e){System.out.println(e);}

        finally {
            System.out.println("Insert Completed.");
        }


    }

    public static void post(String firstName, String lastName, String password, String e_mail) throws Exception{
        final String fName = firstName;
        final String lName = lastName;
        final String pswd = password;
        final String email = e_mail;


        try{
            Connection con = getConnection();
            PreparedStatement posted = con.prepareStatement("INSERT INTO USER (USER_ID, USER_FNAME, USER_LNAME, USER_PASSWORD, USER_EMAIL) VALUES (NULL , '"+fName+"', '"+lName+"', '"+pswd+"', '"+email+"'  )");

            posted.executeUpdate();
        }catch (Exception e){System.out.println(e);}

        finally {
            System.out.println("Insert Completed.");
        }


    }

    public static ArrayList<String> get() throws Exception{
        try{
            Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM USER");

            ResultSet result = statement.executeQuery();

            ArrayList<String> array = new ArrayList<String>();

            while (result.next()){


                array.add(result.getString("USER_SCREENNAME"));

            }

            System.out.println("All records have been selected!");
            return array;
        }catch (Exception e){System.out.println(e);}

        return null;
    }
}
