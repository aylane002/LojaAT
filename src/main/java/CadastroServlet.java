import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/CadastroServlet")
public class CadastroServlet extends HttpServlet {
   // protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Servlet CadastroServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3> Usuário Cadastrado " + nome +  "</h3>");
            out.println("</body>");
            out.println("</html>");
        }

}
}
