import com.sdabyd2.programowanie.PTestImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;

public class PTests {

    @Test
    public void shouldFindLastElementFromList() throws Exception {
        assertThat(PTestImpl.last(asList("a", "b", "c", "d")),
                is(equalTo("d")));
    }

    @Test
    public void shouldReturnSizeOfTheList() throws Exception {
        assertThat(PTestImpl.size(asList("1", "2", "3", "4")),
                is(equalTo(4)));
    }

    @Test
    public void shouldReverseAsList() throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(PTestImpl.reverse(
                list), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    @Test
    public void shouldReturnTrueWhenListIsPalindrome() throws Exception {
        assertTrue(PTestImpl.palindrom(Arrays.asList("x", "a", "m", "a", "x")));
    }
    @Test
    public void shouldRemoveKthElementFromList() throws Exception{
        Object[] result = PTestImpl.removeAt(Arrays.asList("a","b","c","d"),2);

        assertThat(result[0], equalTo(Arrays.asList("a", "c", "d")));
        assertThat(result[1], equalTo("b"));

    }

}
