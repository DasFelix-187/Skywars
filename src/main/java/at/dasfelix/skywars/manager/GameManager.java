package at.dasfelix.skywars.manager;

public class GameManager {

    private static GameState gameState;



    public static void setGameState(GameState gameState) {
        GameManager.gameState = gameState;
    }

    public static GameState getGameState() {
        return gameState;
    }
}
