import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author alex
 * @Title: ListTest
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/1/6  21:38
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("alex");
        list1.add("san");

        for (String s:list1
             ) {
            System.out.println(s);
            list1 = Arrays.asList("zhAng","lei","hei");
            System.out.println(list1);
        }
    }
}
