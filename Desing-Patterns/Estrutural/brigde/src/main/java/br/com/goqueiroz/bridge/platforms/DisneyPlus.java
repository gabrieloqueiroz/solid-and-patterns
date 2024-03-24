package br.com.goqueiroz.bridge.platforms;

import br.com.goqueiroz.bridge.domain.enums.Streaming;

public class DisneyPlus implements IPlatforms{

    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: Transmission starting!");
    }

    @Override
    public Streaming getStreaming() {
        return Streaming.DISNEYPLUS;
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: configuring RMTP!");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Validated user.");
    }
}
