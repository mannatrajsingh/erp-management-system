
package Test;
import authen.PasswordUtils;

public class HashTest {
    public static void main(String[] args) {
        String hash = PasswordUtils.hashPassword("rahul123");
        System.out.println(hash);
    }
}
