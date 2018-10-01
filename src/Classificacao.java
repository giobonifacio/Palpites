import java.util.HashMap;

public class Classificacao {

	public static HashMap<Time, Integer> getClassificao() {

		HashMap<Time, Integer> classificacao = new HashMap<>();

		classificacao.put(Time.PALMEIRAS,              1);       
		classificacao.put(Time.INTERNACIONAL,          2);       
		classificacao.put(Time.SAOPAULO,               3);       
		classificacao.put(Time.GREMIO,                 4);       
		classificacao.put(Time.FLAMENGO,               5);       
		classificacao.put(Time.GALO,                   6);       
		classificacao.put(Time.CRUZEIRO,               7);       
		classificacao.put(Time.SANTOS,                 8);       
		classificacao.put(Time.CORINTHIANS,            9);       
		classificacao.put(Time.FLUMINENSE,             10);      
		classificacao.put(Time.CAP,                    11);      
		classificacao.put(Time.BOTAFOGO,               12);      
		classificacao.put(Time.AMERICA,                13);      
		classificacao.put(Time.BAHIA,                  14);      
		classificacao.put(Time.CEARA,                  15);      
		classificacao.put(Time.VITORIA,                16);      
		classificacao.put(Time.VASCO,                  17);      
		classificacao.put(Time.CHAPECOENSE,            18);      
		classificacao.put(Time.SPORT,                  19);      
		classificacao.put(Time.PARANA,   	             20);      

		return classificacao;
	}
}
