package br.com.senac.amigosecreto;

import java.util.List;

public class JogoAmigoSecreto {

    List<Participante> sortear( String[] participantes ) {
        List<Participante> sorteio = new ArrayList<Participante>();
		for ( String nome:participantes){
			Participante p= new Participante();
			p.nome=nome;
			sorteio.add(p);
		}
		
    }
}
