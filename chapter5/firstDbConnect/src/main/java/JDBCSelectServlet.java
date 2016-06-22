import entity.UsStateBean;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author D. Albot
 * @date 22.06.2016
 */
@WebServlet(urlPatterns = {"/"})
public class JDBCSelectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql = "select us_state_nm, us_state_cd " +
                "from us_states order by us_state_nm;";
        ArrayList<UsStateBean> statelist = new ArrayList<>();
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource = (DataSource) initialContext.lookup("java:/PostgresDS");
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                statelist.add(new UsStateBean(rs.getString("us_state_nm"),
                        rs.getString("us_state_cd")));
            }
            rs.close();
            ps.close();
            connection.close();
            req.setAttribute("statelist", statelist);
            req.getRequestDispatcher("us_states.jsp").forward(req, resp);
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
    }
}
