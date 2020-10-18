import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ProdutosServlet")
public class ProdutosServlet extends HttpServlet {
    //protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String id = request.getParameter("id");
        String descricao = request.getParameter("descricao");
        String valor = request.getParameter("valor");

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Servlet ProdutosServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th> Nome </th>");
            out.println("<th> Id </th>");
            out.println("<th> Descrição </th>");
            out.println("<th> Valor </th>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<th>" + nome + "</th>");
            out.println("<th>" + id + "</th>");
            out.println("<th>" + descricao + "</th>");
            out.println("<th>" + valor + "</th>");
            out.println("<th> <a href= '/TrabalhoLoja_war/AddCarrinhoServlet? id=" +id+ "'> add </th>");
            out.println("</tr>");

            out.println("</table>");



          //  out.println("<h3> Nome do Produto " + nome + "Id " + id + "Descrição " + descricao + "Valor " + valor + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
