package poker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    Player player;

    @Before
    public void init() {
        player = new Player();
    }

    @Test
    public void testIsOnePairTrue() {
        assertTrue(player.isOnePair());
    }
}
