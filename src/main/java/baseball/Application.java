package baseball;

import baseball.game.GameControl;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameControl gamecontoller = new GameControl();
        gamecontoller.gameStart();
    }
}