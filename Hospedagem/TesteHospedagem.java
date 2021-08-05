package GFT.Hospedagem;

public class TesteHospedagem {
    public static void main(String[] args) {
        Hospedagem h = new Hospedagem(200);
        HospedagemVIP  hv = new HospedagemVIP(200);

        h.printValor();
        hv.printValor();
    }
}
