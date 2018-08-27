package facade;

import facade.core.DvDPlayer;
import facade.core.PopcornProper;
import facade.core.Screen;

public class FacadeClient {
    public static void main(String[] args) {
        Screen screen = new Screen();
        DvDPlayer player = new DvDPlayer();
        PopcornProper popcornProper = new PopcornProper();

        HomeCinemaFacade homeCinemaFacade = new HomeCinemaFacade(screen, player, popcornProper);

        homeCinemaFacade.watchMovie();
        homeCinemaFacade.endMovie();
    }
}
