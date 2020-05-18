package controller;

import model.Field;
import model.Figure;
import model.Game;
import model.Player;

import java.util.Random;

public class PlayerController {
    public void steps(int stepx, int stepy, Game game) {
//        Random random = new Random();
//        Player player1 = game.getPlayer1();
//        Player player2 = game.getPlayer2();
//        Figure figure1 = player1.getFigure();
//        Figure figure2 = player2.getFigure();
//        int[][] ourfield = game.getField().getField();
//
//        if (WinnerController.countfigure(figure1, stepx, stepy, 1, 0, game.getField()) == 2) {
//            if (ourfield[stepx + 2][stepy] == 0 || ourfield[stepx - 2][stepy] == 0) {
//                if (stepx + 2 < game.getField().getWidth()) {
//                    ourfield[stepx + 2][stepy] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx - 2][stepy] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 1, 0, game.getField()) == 2) {
//            if (ourfield[stepx + 2][stepy] == 0 || ourfield[stepx - 2][stepy] == 0) {
//                if (stepx - 2 > 0) {
//                    ourfield[stepx - 2][stepy] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx + 2][stepy] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 0, 1, game.getField()) == 2) {
//            if (ourfield[stepx][stepy + 2] == 0 || ourfield[stepx][stepy - 2] == 0) {
//                if (stepy + 2 < game.getField().getHeight()) {
//                    ourfield[stepx][stepy + 2] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx][stepy - 2] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 0, 1, game.getField()) == 2) {
//            if (ourfield[stepx][stepy + 2] == 0 || ourfield[stepx][stepy - 2] == 0) {
//                if (stepy - 2 > 0) {
//                    ourfield[stepx][stepy - 2] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx][stepy + 2] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 1, 1, game.getField()) == 2) {
//            if (ourfield[stepx + 2][stepy + 2] == 0 || ourfield[stepx - 2][stepy - 2] == 0) {
//                if (stepy - 2 > 0 && stepx - 2 > 0) {
//                    ourfield[stepx - 2][stepy - 2] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx + 2][stepy + 2] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 1, 1, game.getField()) == 2) {
//            if (ourfield[stepx + 2][stepy + 2] == 0 || ourfield[stepx - 2][stepy - 2] == 0) {
//                if (stepy + 2 < game.getField().getHeight() && stepx + 2 < game.getField().getWidth()) {
//                    ourfield[stepx + 2][stepy + 2] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx - 2][stepy - 2] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 1, -1, game.getField()) == 2) {
//            if (ourfield[stepx - 2][stepy + 2] == 0 || ourfield[stepx + 2][stepy - 2] == 0) {
//                if (stepy - 2 < game.getField().getHeight() && stepx - 2 > 0) {
//                    ourfield[stepx - 2][stepy + 2] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx + 2][stepy - 2] = Player.returnnumberfigure(figure2);
//            }
//        }
//        if (WinnerController.countfigure(figure1, stepx, stepy, 1, -1, game.getField()) == 2) {
//            if (ourfield[stepx - 2][stepy + 2] == 0 || ourfield[stepx + 2][stepy - 2] == 0) {
//                if (stepy - 2 > 0 && stepx - 2 < game.getField().getWidth()) {
//                    ourfield[stepx + 2][stepy - 2] = Player.returnnumberfigure(figure2);
//                } else ourfield[stepx - 2][stepy + 2] = Player.returnnumberfigure(figure2);
//            }
//        }

    }

}


