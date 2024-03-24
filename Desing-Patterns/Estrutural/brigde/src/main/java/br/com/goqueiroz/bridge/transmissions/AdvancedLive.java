package br.com.goqueiroz.bridge.transmissions;

import br.com.goqueiroz.bridge.platforms.IPlatforms;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatforms platforms){
        super.platforms = platforms;
    }

    public void enableSubtitles(){
        System.out.println("subtitles activated with success!");
    }

    public void enableComments(){
        System.out.println("comments activated with success!");
    }

    public void recordLive(){
        System.out.println("-- Live recorded with success!");
    }

}
