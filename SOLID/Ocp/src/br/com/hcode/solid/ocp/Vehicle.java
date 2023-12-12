package br.com.hcode.solid.ocp;

/***
 * Aqui temos um exemplo onde infringe o principio Open-Closed principalmente
 * Mas tambem infringe o principio de Single-Responsability
 *
 * A classe não tem uma unica responsabilidade pois cuida dos comportamentos de carros e motos
 * Podemos reparar que moto não precisa de uma atribuição para assentos, diferente de quando é carros
 * Caso precisamos fazer alguma modificação especifica para carro iriamos quebrar rotinas relacionados a motos.
 * Desse modo essa classe deveria ser abstrata e conter dados em comuns apenas, e na classe que lhe herdar
 * Teriam os atributos especificos, e os métodos aqui definidos seriam sobrescritos conforme a necessidade
 * ("Aberto para extensão e fechado para modificação")
 *
 */
public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car(){
        System.out.println("Criando um carro: "+ color + " " + year+ " "+ engine + " com " + seats + " assentos");
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando uma moto: "+ year + " "+ engine + " cilindradas");
    }

    void startVehicle(){
        System.out.println("Ligando os motores");
    }
}
