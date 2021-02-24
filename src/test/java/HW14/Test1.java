package HW14;

import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)
public class Test1 {
        private Work t;

        private int[] arr;
        private int[] res;

        @Parameterized.Parameters
        public static Collection params() {
            return Arrays.asList(
                    new Object[][]{
                            {new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[] {1, 7}}
                    }
            );
        }

        public Test1(int[] arr, int[] res) {
            this.arr = arr;
            this.res = res;
        }

        @Before
        public void init() {
            t = new Work();
        }

        @After
        public void tearDown() throws Exception { t = null; }

        @Test
        public void testGetPartOfArrayWithParams() { Assert.assertArrayEquals(res, t.getPartOfArray(arr)); }
}


