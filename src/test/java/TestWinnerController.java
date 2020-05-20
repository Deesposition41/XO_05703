import controller.WinnerController;
import model.Figure;
import model.Game;
import model.GameStatus;
import model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWinnerController {

    @Test
    public void testWinnerController() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {1, 1, 1, 1, 1},
                {0, -1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0},
                {0, 0, 0, 0, -1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }

    @Test
    public void testWinnerControllerr() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {-1, -1, -1, -1, -1},
                {0, -1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0},
                {0, 0, 0, 0, -1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }

    @Test
    public void testWinnerController1() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {1, 0, 0, 0, 0},
                {1, -1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, -1, 0},
                {1, 0, 0, 0, -1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }
    @Test
    public void testWinnerControllerr1() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {-1, 0, 0, 0, 0},
                {-1, -1, 0, 0, 0},
                {-1, 0, 0, 0, 0},
                {-1, 0, 0, -1, 0},
                {-1, 0, 0, 0, -1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }


    @Test
    public void testWinnerController2() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }
    @Test
    public void testWinnerControllerr2() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {-1, 0, 0, 0, 0},
                {0, -1, 0, 0, 0},
                {0, 0, -1, 0, 0},
                {0, 0, 0, -1, 0},
                {0, 0, 0, 0, -1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }
    @Test
    public void testWinnerController3() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {0, 0, 0, 0, -1},
                {0, 1, 0, -1, 0},
                {0, 0, -1, 0, 0},
                {0, -1, 0, 1, 0},
                {-1, 0, 0, 0, 1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }
    @Test
    public void testWinnerControllerr3() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 5, 5);
       /* int[][] field = new int[][]{
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0}
        };*/
        int[][] field = new int[][]{
                {0, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}
        };
        game.getField().setField(field);
        Assertions.assertEquals(GameStatus.END, WinnerController.winnerController(game));
    }
}
