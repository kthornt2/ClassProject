package controllers;
import play.api.libs.ws.ssl.SystemConfiguration;
import play.data.DynamicForm;
import source.DBConnect;

import models.User;
import play.data.Form;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class RegisterController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result register() { return ok(register.render("Register"));}


    //---------------> Stuck here in addUser method

    public Result addUser(){



        //User user = Form.form(User.class)


        DynamicForm requestData = Form.form().bindFromRequest();

        String fname = requestData.get("fname");
        String lname = requestData.get("lname");
        String username = requestData.get("username");
        String pswd = requestData.get("pswd");
        String email = requestData.get("email");

        User user = new User(fname, lname, pswd, email, username);
        user.saveToDB(user);

        return redirect(routes.LoginController.login());


    }

}