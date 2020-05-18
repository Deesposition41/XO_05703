package model;

public class Game {
    private Field field;
    private Player player1;
    private Player player2;
    private GameStatus gameStatus;

    public Game(Player player1, Player player2, int width, int height) {
        this.field = new Field(width, height);
        this.player1 = player1;
        this.player2 = player2;
        this.gameStatus = GameStatus.INGAME;
    }

    public Field getField() {
        return field;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void toEndGamestatus() {
        this.gameStatus = GameStatus.END;
    }
}
