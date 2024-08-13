package Apresentacao;

import Apresentacao.Iphone.Iphone;

public class SteveJobs {
	public static void main(String[] args) {
		Iphone iphone1 = new Iphone();
		
		iphone1.selecionarMusica("Beatles");
		iphone1.pausar();
		iphone1.tocar();
		
		System.out.println("\n");
		
		iphone1.adicionarNovaAba();
		iphone1.exibirPagina("www.google.com");
		iphone1.atualizarPagina();
		
		System.out.println("\n");
		
		iphone1.ligar("4002 - 8922");
		iphone1.atender();
		iphone1.iniciarCorreioVoz();
	}
}
