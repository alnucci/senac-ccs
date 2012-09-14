package br.com.senac.ccs.thinkfast;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import javax.servlet.AsyncContext;

@WebServlet( urlPatterns = { "/thinkfast"}, asyncSupported = true, loadOnStartup=1)
public class ThinkFastController extends HttpServlet {

    private ThinkFastGame game;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        super.init(sc);
        game = new ThinkFastGame();
        game.init();
    }


    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter( "action" );
        String id = request.getSession().getId();

        if  ( "play".equals( action ) ) {
                String name = request.getParameter( "name" );
                AsyncContext async = request.startAsync();
                game.play(id, name, async);
        }
        else if ( "answers".equals( action ) ) {
                String answer = request.getParameter( "answer" );
                game.answer(id, answer );
        }
        else if ("bind".equals( action ) ) {
            String name = request.getParameter( "bind" );
                AsyncContext async = request.startAsync();
                game.bind(id, async);

        }
//        Question question = new Question( "Qual a capital dos EUA?", Arrays.asList( new String[]{ "Washington DC", "California", "Nevada" }) , "Washington DC"  );
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString( question );
//        response.setContentType( "aplication/json" );
//        response.getWriter().write( json );
//        response.flushBuffer();
    }


}
