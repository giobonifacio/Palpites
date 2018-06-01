import java.util.HashMap;

public class Classificacao {

	public static HashMap<Time, Integer> getClassificao() {

		HashMap<Time, Integer> classificacao = new HashMap<>();

		classificacao.put(Time.FLAMENGO,       1);
		classificacao.put(Time.SAOPAULO,       2);
		classificacao.put(Time.CORINTHIANS,    3);
		classificacao.put(Time.FLUMINENSE,     4);
		classificacao.put(Time.INTERNACIONAL,  5);
		classificacao.put(Time.SPORT,          6);
		classificacao.put(Time.CRUZEIRO,       7);
		classificacao.put(Time.GALO,           8);
		classificacao.put(Time.GREMIO,         9);
		classificacao.put(Time.PALMEIRAS,      10);
		classificacao.put(Time.VASCO,          11);
		classificacao.put(Time.AMERICA,        12);
		classificacao.put(Time.CAP,            13);
		classificacao.put(Time.BOTAFOGO,       14);
		classificacao.put(Time.CHAPECOENSE,    15);
		classificacao.put(Time.VITORIA,        16);
		classificacao.put(Time.BAHIA,          17);
		classificacao.put(Time.SANTOS,         18);
		classificacao.put(Time.CEARA,          19);
		classificacao.put(Time.PARANA,   	     20);

		return classificacao;
	}
}
