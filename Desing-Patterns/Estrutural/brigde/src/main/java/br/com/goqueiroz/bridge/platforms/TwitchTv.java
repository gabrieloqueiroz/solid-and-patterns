package br.com.goqueiroz.bridge.platforms;

import br.com.goqueiroz.bridge.domain.enums.Streaming;

public class TwitchTv implements IPlatforms{

    public TwitchTv() {
        configureRMTP();
        System.out.println("TwitchTv: Transmissão iniciada.");
    }

    @Override
    public Streaming getStreaming() {
        return Streaming.TWITCHTV;
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTv: Configurando RMTP!");
    }

    @Override
    public void authToken() {
        System.out.println( "TwitchTv: Validando o canal.");
    }
}
