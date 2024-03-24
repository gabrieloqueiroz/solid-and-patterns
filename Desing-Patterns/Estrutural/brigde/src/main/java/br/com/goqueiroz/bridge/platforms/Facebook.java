package br.com.goqueiroz.bridge.platforms;

import br.com.goqueiroz.bridge.domain.enums.Streaming;

public class Facebook implements IPlatforms{
    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: Transmissão iniciada.");
    }

    @Override
    public Streaming getStreaming() {
        return Streaming.FACEBOOK;
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Configurando RMTP!");
    }

    @Override
    public void authToken() {
        System.out.println( "Facebook: Validando o usuário.");
    }
}
