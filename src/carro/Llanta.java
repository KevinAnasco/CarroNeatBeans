/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

public class Llanta {

    String Marca;
    int DiametroRin;
    int Altura;
    int Anchura;

    public Llanta(String Marca, int DiametroRin, int Altura, int Anchura) {
        this.Marca = Marca;
        this.DiametroRin = DiametroRin;
        this.Altura = Altura;
        this.Anchura = Anchura;
    }

    void imprimir() {

        System.out.println("\nMarca " + Marca);
        System.out.println("Diametro del rin " + DiametroRin);
        System.out.println("Altura " + Altura);
        System.out.println("Anchura " + Anchura);

    }

}
