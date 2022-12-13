package cn.yuanyuan.bowling.game;

/**
 * @author wuyitao
 * @date 2022/4/30 1:18 PM
 */
public class Scorer {
    private int ball;

    private int[] _throws = new int[21];

    private int currentThrow;

    public void addThrow(int pins) {
        _throws[currentThrow++] = pins;
    }

    public int getScoreForFrame(int theFrame) {
        ball = 0;
        int score = 0;
        for (int currentFrame = 0; currentFrame < theFrame; currentFrame++) {
            if (strike()) {
                score += 10 + nextTwoBallsForStrike();
                ball++;
            }
            else if (spare()) {
                score += 10 + nextBallForSpare();
                ball += 2;
            }
            else {
                score += twoBallsInFrame();
                ball += 2;
            }
        }
        return score;
    }

    private int nextTwoBallsForStrike() {
        return _throws[ball + 1] + _throws[ball + 2];
    }

    private int nextBallForSpare() {
        return _throws[ball + 2];
    }
    private boolean strike() {
        return _throws[ball] == 10;
    }

    private boolean spare() {
        return _throws[ball] + _throws[ball + 1] == 10;
    }
    private int twoBallsInFrame() {
        return _throws[ball] + _throws[ball + 1];
    }
}
