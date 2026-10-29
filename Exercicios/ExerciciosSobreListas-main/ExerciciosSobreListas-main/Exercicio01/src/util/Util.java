package util;

import java.util.List;

import entities.Funcionario;

public class Util {

     public static Funcionario buscarId (List<Funcionario> lista, int id ) {
        for (Funcionario x : lista) {
            if (x.getCodigo().equals(id)) {
                return x;
            }
        }
        return null;
    }

    public static void percorrerLista(List<Funcionario> lista) {
         for (Funcionario x : lista) {
            System.out.println(x);
        }
    }
}
