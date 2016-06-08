import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Dmitriy Albot
 */
public class FormHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enteredValue;
        enteredValue = req.getParameter("enteredValue");
        resp.setContentType("text/html");
        PrintWriter printWriter;
        try {
            printWriter = resp.getWriter();
            printWriter.println("<p>");
            printWriter.println("You entered: ");
            printWriter.println(enteredValue);
            printWriter.println("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
