package com.open_bootcamp;

public class Parte2 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.NumeroPuertas();
        System.out.println(miCoche.puertas);
    }
}


class Coche {
    public int puertas = 4;

    public void NumeroPuertas() {
        this.puertas++;
    }
}





//crear una clase coche
//Dentro de la clase coche, una variable numerica que almacena el numero de puertas
//una funcion que incremente el numero de puertas que tiene el coche
//crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el numero de puertas que tiene el objeto.