/**
 * Created by Uranus on 2016/11/5.
 * 我写的关于逆转数字的代码
 */
public class ReverseInteger_My {
    public int reverse(int x) {
        long result = x;
        if (result >= 0) {
            String strx = Long.toString(result);
            char[] target = new char[strx.length()];
            for (int i = strx.length() - 1, j = 0; i >= 0; i--, j++) {
                target[j] = strx.charAt(i);
            }
            result = Long.parseLong(String.valueOf(target));
            return (result > Integer.MAX_VALUE) ? 0 : (int)result;
        } else {
            String strx = Long.toString(result);
            char[] target = new char[strx.length()];
            target[0] = '-';
            for (int i = strx.length() - 1, j = 1; i > 0; i--, j++) {
                target[j] = strx.charAt(i);
            }
            result = Long.parseLong(String.valueOf(target));
            return (Math.abs(result) > Integer.MAX_VALUE) ? 0 : (int)result;
        }
    }
}
