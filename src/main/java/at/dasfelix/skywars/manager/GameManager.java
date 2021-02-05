package at.dasfelix.skywars.manager;

public class GameManager {

    private static GameState gameState = GameState.LOBBY;


    public void startCountDown() {
        setGameState(GameState.STARTING);
    }

    public void start() {
        setGameState(GameState.INGAME);
        //teleport Teams
        //start Protection
    }

    public static void setGameState(GameState gameState) {
        GameManager.gameState = gameState;
    }

    public static GameState getGameState() {
        return gameState;
    }
}
