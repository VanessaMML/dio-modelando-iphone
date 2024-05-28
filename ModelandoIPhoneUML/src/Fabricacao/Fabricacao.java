package Fabricacao;

import AparelhoTelefonico.AparelhoTelefonico;
import AparelhoTelefonico.BlackBerry;
import NavegadorInternet.Gmail;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.IPod;
import ReprodutorMusical.ReprodutorMusical;

public class Fabricacao {

	public static void main(String[] args) {
		
		AparelhoTelefonico aparelho = new BlackBerry();
		ReprodutorMusical musica = new IPod();
		NavegadorInternet email = new Gmail();
		
		aparelho.realizarLiga��o();
		musica.selecionarMusica();
		email.caixaEntradaEmail();
		
	}

}
