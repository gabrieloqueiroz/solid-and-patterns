package br.com.goqueiroz.bridge;

import br.com.goqueiroz.bridge.platforms.*;
import br.com.goqueiroz.bridge.transmissions.AdvancedLive;
import br.com.goqueiroz.bridge.transmissions.FactoryLive;
import br.com.goqueiroz.bridge.transmissions.Live;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static FactoryLive factoryLive;

    @Autowired
    private FactoryLive injectedFactoryLive;

    @PostConstruct
    private void init() {
        factoryLive = injectedFactoryLive;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        startLive(new Youtube());
        startLive(new Facebook());
        startLive(new DisneyPlus());
        startLive(new TwitchTv());
    }

    public static void startLive(IPlatforms platforms) {


        System.out.println("... Please wait!");
        Live live = factoryLive.getLiveType(platforms);
        live.getBroadcast();
        live.result();

        if (live instanceof AdvancedLive advancedLive) {
            advancedLive.enableComments();
            advancedLive.enableSubtitles();
            advancedLive.recordLive();
        }
        System.out.println();
    }
}
