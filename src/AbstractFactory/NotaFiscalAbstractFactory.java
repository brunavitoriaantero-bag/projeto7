package factory.abstractFactory;

import model.nota.NotaFiscal;

public interface NotaFiscalAbstractFactory {
    NotaFiscal createComputerNotaFiscal();
    NotaFiscal createNotebookNotaFiscal();
    NotaFiscal createPlaystationNotaFiscal();
    NotaFiscal createPlaystationPortableNotaFiscal();
}
