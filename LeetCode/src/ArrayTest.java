import org.junit.Test;

public class ArrayTest {


    public String[][] taskArray(String[][] abc) {
        String[][] task = job(abc);
        String[] result = task[0];
        System.out.println("共有：" + result.length + "种组合！");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return task;
    }

    public static String[][] job(String[][] arrays) {
        int len = arrays.length;
        if (len >= 2) {
            int firstLength = arrays[0].length;
            int secondLength= arrays[1].length;
            int newlen = firstLength * secondLength;
            String [] temp = new String[newlen];
            int index = 0;
            for (int i = 0; i < firstLength; i++) {
                for (int j = 0; j < secondLength; j++) {
                   temp[index]=arrays[0][i]+","+arrays[1][j];
                    index++;
                }
            }
            String[][] newArray = new String[len - 1][];
            for (int i = 2; i < len; i++) {
                newArray[i - 1] = arrays[i];
            }
            newArray[0] = temp;
            return job(newArray);
        } else {
            return arrays;
        }
    }
    @Test
    public void testppp() {
        String[][] x = {{"1", "2"}, {"1", "2", "3"}, {"2", "3"}};

        ArrayTest a = new ArrayTest();
        System.out.println(a.taskArray(x));

    }

}



