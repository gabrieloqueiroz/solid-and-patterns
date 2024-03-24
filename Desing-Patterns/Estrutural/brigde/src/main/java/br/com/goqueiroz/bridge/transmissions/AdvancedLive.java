package br.com.goqueiroz.bridge.transmissions;

import br.com.goqueiroz.bridge.platforms.IPlatforms;

public class AdvancedPlatforms extends Live{

    public AdvancedPlatforms(IPlatforms platforms){
        super.platforms = platforms;
    }

    void enableSubtitles(){
        System.out.println("subtitles activated with success!");
    }

    void enableComments(){
        System.out.println("comments activated with success!");
    }
}
