package br.com.goqueiroz.bridge.platforms;

import br.com.goqueiroz.bridge.domain.enums.Streaming;

public interface IPlatforms {
    Streaming getStreaming();
    void configureRMTP();
    void authToken();
}