package br.com.goqueiroz.bridge.transmissions;

import br.com.goqueiroz.bridge.config.SelfConfiguration;
import br.com.goqueiroz.bridge.platforms.IPlatforms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryLive {

    private SelfConfiguration selfConfiguration;

    @Autowired
    public FactoryLive(SelfConfiguration selfConfiguration){
        this.selfConfiguration = selfConfiguration;
    }


    public Live getLiveType(IPlatforms platforms){
        if (selfConfiguration.advancedLiveEnabled(platforms.getStreaming()))
            return new AdvancedLive(platforms);

        return new Live(platforms);
    }
}