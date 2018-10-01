import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PrinterDeClassificacao {

  public PrinterDeClassificacao(HashMap<Participantes, Integer> classificacao) {
    this.classificacao = classificacao;
  }

  public void print() {
    List<Participante> participantes = calcularPontuacao();

    List<Participante> participantesOrdenados = ordenarClassificao(participantes);

    printarClassificacao(participantesOrdenados);
  }

  private List<Participante> calcularPontuacao() {
    List<Participante> participantes = new ArrayList();

    for (Participantes participante : Participantes.values()) {
      participantes.add(new Participante(participante.name(), classificacao.get(participante)));
    }

    return participantes;
  }

  private int getPosicao(int x) {
    return x + 1;
  }

  private List<Participante> ordenarClassificao(List<Participante> participantes) {
    return participantes.stream()
        .sorted((o1, o2) -> o2.getPontuacao().compareTo(o1.getPontuacao()))
        .collect(Collectors.toList());
  }

  private void printInformacao(List<Participante> participantesOrdenados, int x) {
    StringBuilder sb = new StringBuilder();

    sb.append(getPosicao(x));
    sb.append(" - ");
    sb.append(participantesOrdenados.get(x).getNome());
    sb.append(": ");
    sb.append(participantesOrdenados.get(x).getPontuacao());

    System.out.println(sb.toString());
  }

  private void printarClassificacao(List<Participante> participantesOrdenados) {
    System.out.println(_EMPTY_LINE);
    System.out.println(CLASSIFICAÇÃO_BOLÃO_BR_2018);
    System.out.println(_EMPTY_LINE);

    for (int x = 0; x < participantesOrdenados.size(); x++) {
      printInformacao(participantesOrdenados, x);
    }
  }

  private static final String CLASSIFICAÇÃO_BOLÃO_BR_2018 = "################### CLASSIFICAÇÃO BOLÃO BR 2018 ####################";

  private static final String _EMPTY_LINE = "";

  private HashMap<Participantes, Integer> classificacao;

}
