import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by pdale on 8/6/15.
 */
public class PlayerTest {
    BufferedReader bufferedReader;
    Player player;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        player = new Player(bufferedReader);
    }

    @Test
    public void shouldGet1FromUserWhenUserEnters1() throws Exception {
        String choice = "1";
        when(bufferedReader.readLine()).thenReturn(choice);
        String playerChoice = player.nextMoveLocation();

        assertThat(playerChoice, is(choice));
    }


}
