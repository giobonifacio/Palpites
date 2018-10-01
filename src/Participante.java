public class Participante {


  public Participante(String nome, Integer pontuacao) {
    this.nome = nome;
    this.pontuacao = pontuacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(Integer pontuacao) {
    this.pontuacao = pontuacao;
  }

  private String nome;

  private Integer pontuacao;
}
