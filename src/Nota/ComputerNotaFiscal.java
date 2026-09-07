package model.nota;

public class ComputerNotaFiscal implements NotaFiscal {
    @Override
    public String applyNotaFiscal() {
        return "Computador - R$ 3500.00 (Garantia de 2 anos)";
    }
}