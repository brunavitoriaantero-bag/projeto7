package AbstractFactory;

import Nota.*;

public class LojaEletronicosConcreteFactory implements NotaFiscalAbstractFactory {

    @Override
    public NotaFiscal createComputerNotaFiscal() {
        return new ComputerNotaFiscal();
    }

    @Override
    public NotaFiscal createNotebookNotaFiscal() {
        return new NotebookNotaFiscal();
    }

    @Override
    public NotaFiscal createPlaystationNotaFiscal() {
        return new PlaystationNotaFiscal();
    }

    @Override
    public NotaFiscal createPlaystationPortableNotaFiscal() {
        return new PlaystationPortableNotaFiscal();
    }
}
