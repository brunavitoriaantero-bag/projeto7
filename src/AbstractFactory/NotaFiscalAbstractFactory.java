package AbstractFactory;

import Nota.NotaFiscal;

public interface NotaFiscalAbstractFactory {
    NotaFiscal createComputerNotaFiscal();
    NotaFiscal createNotebookNotaFiscal();
    NotaFiscal createPlaystationNotaFiscal();
    NotaFiscal createPlaystationPortableNotaFiscal();
}
