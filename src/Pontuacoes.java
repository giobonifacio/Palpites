public enum Pontuacoes {
    ACERTAR_CAMPEAO(10),
    ACERTAR_G4_OU_Z4(5),
    ACERTAR_POSICAO_EXATA(8),
    ERRAR_POSICAO_POR_UM(6),
    ERRAR_POSICAO_POR_DOIS(3),
    ERRAR_POSICAO_ENTRE_CINCO_E_NOVE(-5),
    ERRAR_POSICAO_ENTRE_DEZ_E_QUATORZE(-10),
    ERRAR_POSICAO_DE_QUINZE_OU_MAIS(-50);

    private int _pontos;

    Pontuacoes(int pontos) {

        _pontos = pontos;
    }

    public int getPontos() {
        return _pontos;
    }
}

