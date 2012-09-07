package br.com.senac.amigosecreto;

import java.util.List;
import junit.framework.TestCase;
<<<<<<< HEAD
import static junit.framework.Assert.*;
/**
 * Unit test for simple App.
 */
public class JogoAmigoSecretoTest  extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JogoAmigoSecretoTest( String testName ) {
        super( testName );
    }

    /**
     * Testa se sorteio esta randomico.
     */
    public void testSorteioRandomico() {
        String[] participantes = new String[] { "Tony Stark", "Thor Odinson", "Clinton Barton", "Bruce Banner", "Steve Rogers", "Natalia Romanova", "Nicholas Fury",  "Loki" };
        JogoAmigoSecreto jogo = new JogoAmigoSecreto();
        List<Participante> primeiroSorteio = jogo.sortear( participantes );
        List<Participante> segundoSorteio = jogo.sortear( participantes );

        assertNotNull( primeiroSorteio );
        assertFalse( primeiroSorteio.isEmpty() );
        assertNotNull( segundoSorteio );
        assertFalse( segundoSorteio.isEmpty() );
        assertFalse( primeiroSorteio.equals( segundoSorteio ) );
=======
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Testes unitarios para aplicacao AmigoSecreto.
 */
public class JogoAmigoSecretoTest  extends TestCase {
    /**
     * @param nomeTeste nome do teste unitario
     */
    public JogoAmigoSecretoTest( String nomeTeste ) {
        super( nomeTeste );
    }

    /**
     * Testa se todos os participantes possuem amigo secreto.
     */
    @Test()
    public void testSeTodosParticipantesPossuemAmigoSecreto() {
        String[] participantes = new String[] { "Tony Stark", "Thor Odinson", "Clinton Barton", "Bruce Banner", "Steve Rogers", "Natalia Romanova", "Nicholas Fury",  "Loki" };
        JogoAmigoSecreto jogo = new JogoAmigoSecreto();
        List<Participante> sorteio = jogo.sortear( participantes );
        System.out.println( sorteio );
        assertNotNull( sorteio );
        assertFalse( sorteio.isEmpty() );
        assertThat( sorteio, allOf( is( notNullValue() ) ) );
        fail( "TBD" );
>>>>>>> 0d334609af22c2414f874875f8ac68f5b474a068
    }
    /**
     * Testa se o amigo secreto de um participante nao e ele mesmo.
     */
    public void testParticipanteNaoSeuProprioAmigoSecreto() {
        String[] participantes = new String[] { "Tony Stark", "Thor Odinson", "Clinton Barton", "Bruce Banner", "Steve Rogers", "Natalia Romanova", "Nicholas Fury",  "Loki" };
        JogoAmigoSecreto jogo = new JogoAmigoSecreto();
        List<Participante> sorteio = jogo.sortear( participantes );
<<<<<<< HEAD
        fail( "Nao Implementado." );
    }
}
=======
        System.out.println( sorteio );
        fail( "TBD" );
    }
}
>>>>>>> 0d334609af22c2414f874875f8ac68f5b474a068
