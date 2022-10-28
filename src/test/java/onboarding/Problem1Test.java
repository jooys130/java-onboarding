package onboarding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Test {
    Problem1 problem = new Problem1();
    @Test
    @DisplayName("List Size Test")
    void listSize() {
        List<Integer> list = List.of(197, 198, 199);
        boolean result = true;
        assertThat(problem.listSizeException(list)).isEqualTo(result);
    }

    @Test
    @DisplayName("Page Index Test")
    void pageIndex() {
        List<Integer> list1 = List.of(1, 3);
        List<Integer> list2 = List.of(197, 198);
        boolean result1 = true; // Page Index Error가 발생함 -> true
        boolean result2 = false;
        assertThat(problem.pageIndexException(list1)).isEqualTo(result1);
        assertThat(problem.pageIndexException(list2)).isEqualTo(result2);
    }
}
