package cn.yuanyuan.bowling.game;

/**
 * @author wuyitao
 * @date 2022/4/29 11:24 AM
 */
public class Frame {

    private int score;

    public int getScore() {
        return score;
    }

    public void add(int pins) {
        score += pins;
    }
}
