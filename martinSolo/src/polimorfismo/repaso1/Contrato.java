package polimorfismo.repaso1;

import polimorfismo.ej3.JugadorJugo;

public interface Contrato {
    void contratar(Futbolista futbolista) throws JugadorJugo;
    void renovar();
}
