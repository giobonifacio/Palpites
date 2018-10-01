import java.util.HashMap;

public class Run {

	public static void main(String[] args) {
			
		HashMap<Participantes, HashMap<Time, Integer>> allPalpites = LeitorDePalpites.allPalpites();

		HashMap<Participantes, Integer> classificacao =
			new CalculadorDePalpites().calculaPalpitesEGeraClassificacao(allPalpites);

		new PrinterDeClassificacao(classificacao).print();
		
	}
	
}



