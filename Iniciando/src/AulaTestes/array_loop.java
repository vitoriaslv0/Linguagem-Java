package AulaTestes;

import java.util.ArrayList;

public class array_loop {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("monitor"); // ".add" - Sintaxe/Métod
        lista.add("mouse");
        lista.add("teclado");
        lista.add("fone");

        System.out.println(lista.get(2)); // -> variável.métod.posição
        lista.remove(2); // fone passar a ficar na posição 2
        System.out.println(lista.get(2));
        // da para ser removido tanto a posição/indice quanto o objeto("teclado")
        System.out.println("_________");

        for (int perifericos = 0; perifericos < lista.size(); perifericos++) {
            System.out.println(lista.get(perifericos));
        }
        int contador = 0;
        while(contador < 10){
            System.out.println("Contando...");
            contador++;

        }
    }
}
