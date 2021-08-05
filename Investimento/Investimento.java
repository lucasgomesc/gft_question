package GFT.Investimento;

public class Investimento implements funcoes {
    private double valorInicial;
    private double jurosMensais;
    private int meses;

    public Investimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }

    @Override
    public void calcularLucro(int meses) {
        double v = (valorInicial * (1 + jurosMensais) * meses) - valorInicial;
    }
}
