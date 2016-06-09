import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dmitriy on 09.06.16.
 */
@WebServlet(urlPatterns = {"/annotation", "*.fg"})
public class AnnotatedServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");
            PrintWriter pw = resp.getWriter();
            pw.println("<h2>");
            pw.println("If you read this everything is fine");
            pw.println("</h2>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
