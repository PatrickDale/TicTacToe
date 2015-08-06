import org.junit.Test;

import java.io.BufferedReader;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by pdale on 8/6/15.
 */
public class PlayerTest {
    @Test
    public void shouldGet1FromUserWhenUserEnters1() throws Exception {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Player player = new Player(bufferedReader);

        String choice = "1";
        when(bufferedReader.readLine()).thenReturn(choice);
        String playerChoice = player.nextMoveLocation();

        assertThat(playerChoice, is(choice));
    }


}
