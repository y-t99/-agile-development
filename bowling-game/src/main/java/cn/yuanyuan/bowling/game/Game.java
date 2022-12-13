package cn.yuanyuan.bowling.game;

/**
 * @author wuyitao
 * @date 2022/4/29 2:43 PM
 */
public class Game {

    private int currentFrame = 1;

    private boolean isFirstThrow = true;

    private Scorer scorer = new Scorer();

    public int getScore() {
        return getScoreForFrame(getCurrentFrame());
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void add(int pins) {
        scorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (lashBallInFrame(pins)) {
            isFirstThrow = true;
            advanceFrame();
        }
        else {
            isFirstThrow = false;
        }
    }

    private boolean lashBallInFrame(int pins) {
        return strike(pins) || (!isFirstThrow);
    }

    private boolean strike(int pins) {
        return isFirstThrow && pins == 10;
    }

    private void advanceFrame() {
        currentFrame++;
        if (currentFrame > 10) {
            currentFrame = 10;
        }
    }

    public int getScoreForFrame(int theFrame) {
        return scorer.getScoreForFrame(theFrame);
    }
}
