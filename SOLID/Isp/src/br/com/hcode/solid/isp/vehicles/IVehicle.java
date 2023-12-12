package br.com.hcode.solid.isp.vehicles;

public interface IVehicle {
    public void startVehicle();

    /***
     *
     * Nesse caso tinhamos uma interface que obrigada a classe de carros implementar método para moto e vice-versa
     * Quebramos isso em 3 interfaces onde aqui temos o método em comum, e cada um implementa esta interface
     * mais a interface que atende os requisitos especificos para o tipo de veiculo.
     *
     * public void configureCar(String color, String year, double engine, int seats);
     * public void configureMotorcycle(String color, String year, double engine);
     */

}


