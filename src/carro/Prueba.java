/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

public class Prueba {

    public static void main(String[] args) {

        Carro carro1 = new Carro(2, tipoChasis.Monocasco, "Rojo", tipoCarroceria.Tubular,
                tipoAsientos.Tela," No","Si"," Electricos "," No "," Si ", "GodYear", 18, 20, 160);
        carro1.imprimir();
        
        Carro carro2 = new Carro(8, tipoChasis.Monocasco, "Azul", tipoCarroceria.Independiente,
                tipoAsientos.Alcantara,"Si","Si"," Electricos ","si","Si", "Pirelli", 21, 15, 255);
        carro2.imprimir();

    }
}
