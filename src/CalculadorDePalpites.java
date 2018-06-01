import java.util.Arrays;
import java.util.HashMap;

public class CalculadorDePalpites {

	public HashMap<Participantes, Integer> calculaPalpitesEGeraClassificacao(HashMap<Participantes, HashMap<Time, Integer>> allPalpites) {
		HashMap<Participantes, Integer> pontuacoesDosParticipantes = new HashMap<>();
		
		for (Participantes participante : Participantes.values()) {
			Integer pontos = 0;
			
			System.out.println("##################################################################");
			System.out.println(" ");
			System.out.println(participante.toString());

			for (Time time : Time.values()) {
				Integer palpiteColocacao = allPalpites.get(participante).get(time);

				pontos += pontosPraPalpite(time, palpiteColocacao);

			}

			System.out.println(" ");
			System.out.println("TOTAL DE PONTOS:" + pontos);
			System.out.println(" ");
			System.out.println("##################################################################");
			System.out.println(" ");

			pontuacoesDosParticipantes.put(participante, pontos);
		}
		
		return pontuacoesDosParticipantes;
	}

	public Integer pontosPraPalpite(final Time time, final int colocacaoPalpite) {
		int colocacaoAtual = Classificacao.getClassificao().get(time);

		int pontuacaoProPalpite = 0;

		System.out.println("--------------------------");
		System.out.println("Time:" + time.toString() );
		System.out.println(" ");

		if (_acertouCampeao(colocacaoPalpite, colocacaoAtual)) {

			pontuacaoProPalpite += Pontuacoes.ACERTAR_CAMPEAO.getPontos();
			System.out.println("Acertou o campeão: " + Pontuacoes.ACERTAR_CAMPEAO.getPontos());
		}

		if (_acertouG4(colocacaoPalpite, colocacaoAtual)) {

			pontuacaoProPalpite += Pontuacoes.ACERTAR_G4_OU_Z4.getPontos();
			System.out.println("Acertou G4: " + Pontuacoes.ACERTAR_G4_OU_Z4.getPontos());
		}

		if (_acertouZ4(colocacaoPalpite, colocacaoAtual)) {

			pontuacaoProPalpite += Pontuacoes.ACERTAR_G4_OU_Z4.getPontos();
			System.out.println("Acertou Z4: " + Pontuacoes.ACERTAR_G4_OU_Z4.getPontos());
		}

		if (_acertouPosicaoExata(colocacaoAtual,colocacaoPalpite)) {

			pontuacaoProPalpite += Pontuacoes.ACERTAR_POSICAO_EXATA.getPontos();
			System.out.println("Acertou posicao exata: " + Pontuacoes.ACERTAR_POSICAO_EXATA.getPontos());
		}

		if  (_errouPosicaoPor(colocacaoPalpite, colocacaoAtual, 1)) {

			pontuacaoProPalpite += Pontuacoes.ERRAR_POSICAO_POR_UM.getPontos();
			System.out.println("Errou posição por um: " + Pontuacoes.ERRAR_POSICAO_POR_UM.getPontos());
		}

		if  (_errouPosicaoPor(colocacaoPalpite, colocacaoAtual, 2)) {

			pontuacaoProPalpite += Pontuacoes.ERRAR_POSICAO_POR_DOIS.getPontos();
			System.out.println("Errou posição por dois: " + Pontuacoes.ERRAR_POSICAO_POR_DOIS.getPontos());
		}

		if (_errouPosicaoEntre(colocacaoPalpite, colocacaoAtual, 5,9)) {

			pontuacaoProPalpite += Pontuacoes.ERRAR_POSICAO_ENTRE_CINCO_E_NOVE.getPontos();
			System.out.println("Errou posição entre 5-9: " + Pontuacoes.ERRAR_POSICAO_ENTRE_CINCO_E_NOVE.getPontos());
		}

		if (_errouPosicaoEntre(colocacaoPalpite, colocacaoAtual, 10,14)) {

			pontuacaoProPalpite += Pontuacoes.ERRAR_POSICAO_ENTRE_DEZ_E_QUATORZE.getPontos();
			System.out.println("Errou posição entre 10-14: " + Pontuacoes.ERRAR_POSICAO_ENTRE_DEZ_E_QUATORZE.getPontos());
		}

		if (_errouPosicaoEntre(colocacaoPalpite, colocacaoAtual, 15,20)) {

			pontuacaoProPalpite += Pontuacoes.ERRAR_POSICAO_DE_QUINZE_OU_MAIS.getPontos();
			System.out.println("Errou posição 15+: " + Pontuacoes.ERRAR_POSICAO_DE_QUINZE_OU_MAIS.getPontos());
		}


		System.out.println(" ");
		System.out.println("Total para o time:" + pontuacaoProPalpite);
		System.out.println(" ");
		System.out.println("--------------------------");

		return pontuacaoProPalpite;
	}

	private boolean _acertouCampeao(int colocacaoPalpite, int colocacaoAtual) {

		return (colocacaoAtual == colocacaoPalpite) && (colocacaoPalpite == 1);
	}

	private boolean _acertouG4(int colocacaoPalpite, int colocacaoAtual) {

		return (colocacaoAtual < 5) && (colocacaoPalpite < 5);
	}

	private boolean _acertouZ4(int colocacaoPalpite, int colocacaoAtual) {

		return (colocacaoAtual > 16) && (colocacaoPalpite > 16);
	}

	private boolean _acertouPosicaoExata(int colocacaoPalpite, int colocacaoAtual) {

		return colocacaoAtual == colocacaoPalpite;
	}

	private boolean _errouPosicaoPor(int colocacaoPalpite, int colocacaoAtual, int errouPor) {

		return (colocacaoAtual == (colocacaoPalpite + errouPor)) || (colocacaoAtual == (colocacaoPalpite - errouPor));
	}

	private boolean _errouPosicaoEntre(int colocacaoPalpite, int colocacaoAtual, int entreInicio, int entreFim) {

		if (colocacaoPalpite > colocacaoAtual) {

			return diferencaEstaNoIntervalo(colocacaoPalpite, colocacaoAtual, entreInicio, entreFim);
		}

		if (colocacaoAtual < colocacaoPalpite) {
			return diferencaEstaNoIntervalo(colocacaoAtual, colocacaoPalpite, entreInicio, entreFim);
		}

		return false;
	}

	private boolean diferencaEstaNoIntervalo(int maior, int menor, int inicio, int fim) {

		int diferenca = maior - menor;

		return (diferenca >= inicio) && (diferenca <= fim);
	}
}
