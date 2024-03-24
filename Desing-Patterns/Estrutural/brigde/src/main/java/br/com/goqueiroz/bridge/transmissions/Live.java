package br.com.goqueiroz.bridge.transmissions;

import br.com.goqueiroz.bridge.platforms.IPlatforms;

public class Live implements ITransmissions{
    protected IPlatforms platforms;

    public Live() {
    }

    public Live(IPlatforms platforms) {
        this.platforms = platforms;
    }

    @Override
    public void getBroadcast() {
        System.out.println("Starting transmission!");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
