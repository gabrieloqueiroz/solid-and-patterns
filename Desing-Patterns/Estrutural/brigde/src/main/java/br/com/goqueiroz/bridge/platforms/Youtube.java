package br.com.goqueiroz.bridge.platforms;

import br.com.goqueiroz.bridge.domain.enums.Streaming;

public class Youtube implements IPlatforms{
    public Youtube() {
        configureRMTP();
        System.out.println("Youtube: Transmissão iniciada.");
    }

    @Override
    public Streaming getStreaming() {
        return Streaming.YOUTUBE;
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Configurando RMTP!");
    }

    @Override
    public void authToken() {
        System.out.println( "Youtube: Validando o canal.");
    }
}
