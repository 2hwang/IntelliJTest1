import java.time.LocalDate;
import java.time.LocalDateTime;

public class IntelliJTest {
    public static void main(String[] args) {

        String name = "aaaadsffffffff";
        System.out.println(name);
        String org1 = "arb" + name;

    }

    public void test() {
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("-----------");
        System.out.println(localDate);

        LocalDate message = LocalDate.of(2203, 03, 05);
        System.out.println(message);
        System.out.println(LocalDate.of(2203, 03, 05));
        System.out.println(LocalDate.of(2203, 03, 05));
        System.out.println(LocalDate.of(2203, 03, 05));


        Integer s = extractParameter();
    }

    public Integer extractParameter() {
        return 1;
    }

}
