import java.util.HashMap;

public class LeitorDePalpites {

	public static HashMap<Participantes ,HashMap<Time, Integer>> allPalpites() {
		HashMap<Participantes, HashMap<Time, Integer>> palpites = new HashMap<>();
		
		palpites.put(Participantes.PC, Palpites.getPalpitesPC());
		palpites.put(Participantes.GIO, Palpites.getPalpitesGio());
		palpites.put(Participantes.LUISAO,Palpites.getPalpitesLuis());
		palpites.put(Participantes.PERSHOW,Palpites.getPalpitesPersio());
		palpites.put(Participantes.TAM,Palpites.getPalpitesTam());
		palpites.put(Participantes.GOMEZ, Palpites.getPalpitesMario());
		palpites.put(Participantes.GIAN,Palpites.getPalpitesGian());
		palpites.put(Participantes.CRUZ,Palpites.getPalpitesCruz());
		palpites.put(Participantes.VINI,Palpites.getPalpitesVini());
		palpites.put(Participantes.HTR,Palpites.getPalpitesHTR());
		palpites.put(Participantes.MUTILADO,Palpites.getPalpitesMurilo());
		palpites.put(Participantes.PH, Palpites.getPalpitesPH());
		palpites.put(Participantes.CHELSER, Palpites.getPalpitesChelser());
		palpites.put(Participantes.RENATAO,Palpites.getPalpitesRenatao());
		palpites.put(Participantes.SALPHA,Palpites.getPalpitesSalpha());

		return palpites;
	}

}
