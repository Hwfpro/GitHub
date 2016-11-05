/**
 * Created by Uranus on 2016/11/5.
 * 大神写的三行转换，感觉大神写的效率高很多。
 */
public class ReverseInteger_Dashen {
    public int reverse(int x) {
        long y = x%10;
        while((x/=10)!=0) y=y*10+x%10;
        return (Math.abs(y)>Integer.MAX_VALUE)?0:(int)y;
    }
}
