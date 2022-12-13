package cn.yuanyuan.bowling.game;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author wuyitao
 * @date 2022/4/29 10:36 AM
 */
public class FrameTest {

    @Test
    public void testScoreNoThrows() {
        Frame frame = new Frame();
        assertThat(frame.getScore()).isEqualTo(0);
    }

    @Test
    public void testAddOneThrow() {
        Frame frame = new Frame();
        frame.add(5);
        assertThat(frame.getScore()).isEqualTo(5);
    }

}
