package facade;

import facade.core.DvDPlayer;
import facade.core.PopcornProper;
import facade.core.Screen;

public class HomeCinemaFacade {
    private Screen screen;
    private DvDPlayer player;
    private PopcornProper popcornProper;

    public HomeCinemaFacade(Screen screen, DvDPlayer player, PopcornProper popcornProper) {
        this.screen = screen;
        this.player = player;
        this.popcornProper = popcornProper;
    }

    public void watchMovie() {
        System.out.println("Watching movie....");
        screen.down();
        popcornProper.prepare();
        player.on();
        popcornProper.pop();
        player.play();
    }

    public void endMovie() {
        System.out.println("\nFinished with movie....");
        player.stop();
        player.off();
        screen.up();
    }
}
