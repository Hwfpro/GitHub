import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Uranus on 2016/10/23.
 * 字符串匹配拓展，bacba  bc  bc, cb都算匹配成功
 * 问题的关键在于如果匹配成功，则map中元素应为0，如果有大于零的元素则证明没有匹配上
 * 参考了其他人代码
 */
public class Contest10_23 {
    public List<Integer> findAnagrams(String s, String t){
        List<Integer> res = new ArrayList<>();
        if(t.length() > s.length() || t.length() < 1)
            return res;
        int[] map = new int[26];
        char[] sStr = s.toCharArray();
        char[] tStr = t.toCharArray();
        for(char ch:tStr)
            map[ch - 'a']++;
        int i;
        for(i = 0; i < t.length() -1; i++)
            map[sStr[i] - 'a']--;
        for(int j = 0; i < s.length(); i++, j++ ){
            map[sStr[i] - 'a']--;
            if(TestMatching(map))
                res.add(j);
            map[sStr[j] - 'a']++;
        }
        return res;
    }

    public boolean TestMatching(int[] a){
        for(int x:a){
            if(x > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Contest10_23 mySolution = new Contest10_23();
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        System.out.println(mySolution.findAnagrams(s1, s2));
    }
}
