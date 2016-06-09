import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Андрей on 09.06.2016.
 */
public class ResponseRedirectionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String url = req.getParameter("searchSys");
//        if (url != null) {
//            resp.sendRedirect(url);
//        }

        try {
            PrintWriter printWriter;
            ServletContext servletContext = req.getServletContext();
            List<String> checkedLabels = (List<String>) servletContext.getAttribute("checkedLabels");
//            List<String> checkedLabels = ((List<String>) req.getAttribute("checkedLabels"));
            resp.setContentType("text/html");
            printWriter = resp.getWriter();
            printWriter.println("<p>");
            printWriter.println("The next items were selected: ");
            printWriter.println("<br/>");
            if (checkedLabels != null) {
                for (String checkedLabel : checkedLabels) {
                    printWriter.println(checkedLabel);
                    printWriter.println("<br/>");
                }
            } else {
                printWriter.println("No item was selected");
            }
            printWriter.println("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
