package Apresentacao.Iphone;

import Apresentacao.Iphone.Softwares.AparelhoTelefonico;
import Apresentacao.Iphone.Softwares.NavegadorInternet;
import Apresentacao.Iphone.Softwares.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	
	public void exibirPagina(String url) {
		System.out.println("Acessando a página: " + url);
	}

	
	public void adicionarNovaAba() {
		System.out.println("Acrescentando nova Aba!");
	}

	
	public void atualizarPagina() {
		System.out.println("Atualizando a página!");
	}

	
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	}

	
	public void atender() {
		System.out.println("Atendendo a ligação");
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando gravação do correio de voz");		
	}

	
	public void tocar() {
		System.out.println("Tocando musica!");		
	}

	
	public void pausar() {
		System.out.println("Musica pausada!");
	}

	
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
	}
}


