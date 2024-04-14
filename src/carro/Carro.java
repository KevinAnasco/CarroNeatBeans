/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

public class Carro {

    Motor motor;
    Chasis chasis;
    Asientos asientos;
    Elementos elementos;
    Llanta[] llantas;
    Carroceria carroceria;

    public Carro(int volumen, tipoChasis claseChasis, String color, tipoCarroceria claseCarroceria,
            tipoAsientos claseAsientos, String funda, String frenosabs, String espejos, String sunroof, String airbags,
            String marca, int diametro, int altura, int anchura) {

        motor = new Motor(volumen);
        chasis = new Chasis(claseChasis);
        asientos = new Asientos(claseAsientos, funda);
        elementos = new Elementos(frenosabs, espejos, sunroof, airbags);
        llantas = new Llanta[4];

        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta(marca, diametro, altura, anchura);
        }
        carroceria = new Carroceria(claseCarroceria, color);
    }

    void imprimir() {

        System.out.println("\n*** D A T O S  D E L  C A R R O ***");
        System.out.println("Cilindros del Motor = " + motor.volumenLitros);
        System.out.println("Tipo de Chasis = " + chasis.tipo);
        System.out.println("Tipo de Carroceria = " + carroceria.tipo + " Color = " + carroceria.color);
        System.out.println("Tipo Asientos = " + asientos.Tipo + " Funda = " + asientos.Funda);
        System.out.println("Elementos = FrenosABS " + elementos.FrenosABS + " Espejos " + elementos.Espejos + " Sunroof " + elementos.Sunroof
                + " Airbags " + elementos.Airbags);
        System.out.println("Marca y Medida de Llantas = " + llantas.length);
        for (int i = 0; i < llantas.length; i++) {
            llantas[i].imprimir();

        }
    }
}
