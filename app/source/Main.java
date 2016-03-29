package source;

/**
 * Created by andrew on 3/27/16.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        DBConnect connect = new DBConnect();

        final String fName = "Garry";
        final String lName = "Jones";
        final String pswd = "123";
        final String email = "L@gmail.com";
        final String scrnName = "LBJ";

        //connect.getConnection();

        connect.post(fName, lName, pswd, email);
        connect.get();
    }
}

