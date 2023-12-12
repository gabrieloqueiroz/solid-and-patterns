package br.com.goqueiroz;

public class Main {

    public static Transport transport;
    public static void main(String[] args) {
        configure(args[0]);

        if(transport != null){
            startEngine();
        }
    }

    private static void startEngine() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber" -> transport = new CarTransport();
            case "log" -> transport = new MotorcycleTransport();
            case "ifood" -> transport = new BikeTransport();
            default -> System.out.println("Selecione uma opção.");
        }
    }
}
