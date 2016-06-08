import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dmitriy on 08.06.16.
 */
public class MultipleValueFieldHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] selectedOptions = req.getParameterValues("options");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<p>");
        pw.println("Next options were selected: ");
        pw.println("<br/>");
        if (selectedOptions != null) {
            for (String selectedOption : selectedOptions) {
                pw.println(selectedOption);
                pw.println("<br/>");
            }
        } else {
            pw.println("No options were selected");
        }
        pw.println("</p>");
    }
}
