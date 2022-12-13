package cn.yuanyuan.bowling.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author wuyitao
 * @date 2022/4/29 2:39 PM
 */
public class GameTest {

    private Game game;

    @BeforeEach
    public void init() {
        game = new Game();
    }

    @Test
    public void testTowThrowsNoMark() {
        game.add(5);
        game.add(4);
        assertThat(game.getScore()).isEqualTo(9);
        assertThat(game.getCurrentFrame()).isEqualTo(2);
    }

    @Test
    public void testFourThrowsNoMark() {
        game.add(5);
        game.add(4);
        game.add(7);
        game.add(2);
        assertThat(game.getScore()).isEqualTo(18);
        assertThat(game.getScoreForFrame(1)).isEqualTo(9);
        assertThat(game.getScoreForFrame(2)).isEqualTo(18);
        assertThat(game.getCurrentFrame()).isEqualTo(3);
    }

    @Test
    public void testSimpleSpare() {
        game.add(3);
        game.add(7);
        game.add(3);
        assertThat(game.getScoreForFrame(1)).isEqualTo(13);
        assertThat(game.getCurrentFrame()).isEqualTo(2);
    }

    @Test
    public void testSimpleFrameAfterSpare() {
        game.add(3);
        game.add(7);
        game.add(3);
        game.add(2);
        assertThat(game.getScoreForFrame(1)).isEqualTo(13);
        assertThat(game.getScoreForFrame(2)).isEqualTo(18);
        assertThat(game.getScore()).isEqualTo(18);
        assertThat(game.getCurrentFrame()).isEqualTo(3);
    }

    @Test
    public void testSimpleStrike() {
        game.add(10);
        game.add(3);
        game.add(6);
        assertThat(game.getScoreForFrame(1)).isEqualTo(19);
        assertThat(game.getScore()).isEqualTo(28);
        assertThat(game.getCurrentFrame()).isEqualTo(3);
    }

    @Test
    public void testPerfectGame() {
        for(int i = 0; i < 12; i++) {
            game.add(10);
        }
        assertThat(game.getScore()).isEqualTo(300);
        assertThat(game.getCurrentFrame()).isEqualTo(10);
    }

    @Test
    public void testEndOfArray() {
        for (int i = 0; i < 9; i++) {
            game.add(0);
            game.add(0);
        }
        game.add(2);
        game.add(8);
        game.add(10);
        assertThat(game.getScore()).isEqualTo(20);
    }

    @Test
    public void testSampleGame() {
        game.add(1);
        game.add(4);
        game.add(4);
        game.add(5);
        game.add(6);
        game.add(4);
        game.add(5);
        game.add(5);
        game.add(10);
        game.add(0);
        game.add(1);
        game.add(7);
        game.add(3);
        game.add(6);
        game.add(4);
        game.add(10);
        game.add(2);
        game.add(8);
        game.add(6);
        assertThat(game.getScore()).isEqualTo(133);
    }

    @Test
    public void testHeartBreak() {
        for (int i = 0; i < 11; i++) {
            game.add(10);
        }
        game.add(9);
        assertThat(game.getScore()).isEqualTo(299);
    }

    @Test
    public void testTenthFrameSpare() {
        for (int i = 0; i < 9; i++) {
            game.add(10);
        }
        game.add(9);
        game.add(1);
        game.add(1);
        assertThat(game.getScore()).isEqualTo(270);
    }

}
