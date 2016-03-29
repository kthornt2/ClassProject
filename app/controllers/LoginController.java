package controllers;
import play.*;
import play.mvc.*;
import play.data.Form;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */


public class LoginController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result login() { return ok(login.render("Login"));}



}