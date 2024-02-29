package pista;
import  fila.Fila;

import listaligada.ListaLigada;

import javax.management.ObjectName;

public class Pista {
    private Fila filaDeAterrisagem0 = new Fila();
    private Fila filaDeAterrissagem1 = new Fila();
    private Fila filaDecolagem = new Fila();

    public void adicionarNaPrateleira(Object aviao){

        if(filaDeAterrissagem1.pegarTamanho()>filaDeAterrisagem0.pegarTamanho()){
            filaDeAterrisagem0.adicionar(aviao);
        }
        else{
            filaDeAterrissagem1.adicionar(aviao);
        }
    }
}
