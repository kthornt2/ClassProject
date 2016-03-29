package models;

import source.DBConnect;

/**
 * Created by andrew on 3/26/16.
 *
 */





public class User {



    public String fName;
    public String lName;
    public String email;
    public String screenName;
    public String pswd;




    public User(String firstName, String lastName, String pswd, String email,  String screenName)
    {

        this.fName = firstName;
        this.lName = lastName;
        this.email = email;
        this.pswd = pswd;
        this.screenName = screenName;

    }

    public User(String firstName, String lastName, String pswd, String email)
    {

        this.fName = firstName;
        this.lName = lastName;
        this.email = email;
        this.pswd = pswd;


    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public void saveToDB(User usr) throws Exception{
        DBConnect connect = new DBConnect();

        connect.post(usr.getfName(),usr.getlName(),usr.getPswd(), usr.getEmail(), usr.getScreenName());
    }

   public void saveToDB(String f_name, String l_name, String pswd, String email,String scrnName) throws Exception
    {
        DBConnect connect = new DBConnect();

        connect.post(f_name, l_name, pswd, email, scrnName);
    }



}
