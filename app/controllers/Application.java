package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contact;
import views.html.Faculty;
import views.html.Index;
import views.html.Student;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Play Responsive Castle High"));
  }


  /**
   * Returns the Student page.
   * @return The resulting page.
   */
  public static Result student() {
    return ok(Student.render("Play Responsive Castle High"));
  }

  /**
   * Returns the Faculty page.
   * @return The resulting page.
   */
  public static Result faculty() {
    return ok(Faculty.render("Play Responsive Castle High"));
  }


  /**
   * Returns the Alumni page.
   * @return The resulting page.
   */
  public static Result alumni() {
    return ok(Alumni.render("Play Responsive Castle High"));
  }


  /**
   * Returns the Contact page.
   * @return The resulting page.
   */
  public static Result contact() {
    return ok(Contact.render("Play Responsive Castle High"));
  }

}
