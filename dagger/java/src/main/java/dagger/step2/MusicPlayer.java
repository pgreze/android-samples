package dagger.step2;

import javax.inject.Inject;

class MusicPlayer {

    @Inject
    public MusicPlayer() {}

    public void play(Object track) {
        System.out.println("Play " + track);
    }
}
