package br.com.senac.amigosecreto;

import java.util.List;
import junit.framework.TestCase;
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
    }
    /**
     * Testa se o amigo secreto de um participante nao e ele mesmo.
     */
    public void testParticipanteNaoSeuProprioAmigoSecreto() {
        String[] participantes = new String[] { "Tony Stark", "Thor Odinson", "Clinton Barton", "Bruce Banner", "Steve Rogers", "Natalia Romanova", "Nicholas Fury",  "Loki" };
        JogoAmigoSecreto jogo = new JogoAmigoSecreto();
        List<Participante> sorteio = jogo.sortear( participantes );
        fail( "Nao Implementado." );
    }
}