package GFT.Investimento;

public class InvestimentosTeste {
    public static void main(String[] args) {
        InvestimentoComIR [] investimentoComIRS = new InvestimentoComIR[0];
        InvestimentoSemIR [] investimentoSemIRS = new InvestimentoSemIR[0];

        investimentoComIRS[0].calcularLucro(2);
        investimentoSemIRS[0].calcularLucro(2);

    }
}
