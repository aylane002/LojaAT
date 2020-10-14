import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListaProdutos", urlPatterns = {"/listaProdutos"})
public class ListaProdutos extends HttpServlet {

    List<Produtos> listaProdutos;

    public ListaProdutos (){
        listaProdutos = new ArrayList<>();
        var p1 = new Produtos("mesa", 01, "grande", 50);
        var p2 = new Produtos("cadeira", 02, "Preta", 20);
        var p3 = new Produtos("cama", 03, "solteiro", 60);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Tabela
        var out = response.getWriter();

       response.setContentType("text.html");
        out.println( " <html> " );
        out.println( " <body> " );
        out.println( " <table> " );
        out.println( " <tr> " );
        out.println( " <th> nome </th> " );
        out.println( " </th> id </th> " );
        out.println( " </th> descricao </th> " );
        out.println( " </th> preco </th> " );
        out.println( " </tr> " );
        for ( var i: listaProdutos ) {
            out.println( " <tr> " );
            out.println( " <td> "  + i.getNome() +  " </td> " );
            out.println( " <td> "  + i.getId() +  " </td> " );
            out.println( " <td> "  + i.getDescricao +  " </td> " );
            out.println( " <td> "  + i.getValor +  " </td> " );

    }
}
}
