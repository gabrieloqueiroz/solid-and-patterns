package br.com.goqueiroz.bridge.config;

import br.com.goqueiroz.bridge.domain.enums.Streaming;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SelfConfiguration {

    @Value("#{${bridge.enable.advanced-live}}")
    public Map<Streaming, Boolean> enableAdvancedLive = new HashMap<>();

    public boolean advancedLiveEnabled(Streaming streaming){
        return this.enableAdvancedLive.getOrDefault(streaming, null);
    }
}
