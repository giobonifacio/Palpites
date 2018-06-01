import java.util.HashMap;

public class PrinterDeClassificacao {

	public static void exibeClassificao(HashMap<Participantes, Integer> classificacao) {
		
		for (Participantes participante : Participantes.values()) {
			Integer pontuacao = classificacao.get(participante);
			System.out.println(participante.toString() + ": "+ pontuacao);
		}
		
	}

}
