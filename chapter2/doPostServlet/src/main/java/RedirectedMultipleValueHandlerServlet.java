

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 09.06.2016.
 */
public class RedirectedMultipleValueHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String[] selectedOptions = req.getParameterValues("options");
        List<String> selectedOptionLabels = null;
        if (selectedOptions != null) {
            selectedOptionLabels = new ArrayList<String>();
            for (String selectedOption : selectedOptions) {
                if (selectedOption.equals("option1")) {
                    selectedOptionLabels.add("Option 1");
                } else if (selectedOption.equals("option2")) {
                    selectedOptionLabels.add("Option 2");
                } else if (selectedOption.equals("option3")) {
                    selectedOptionLabels.add("Option 3");
                }
            }
        }
        req.setAttribute("checkedLabels", selectedOptionLabels);
        try {
            req.getRequestDispatcher("confServlet").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
