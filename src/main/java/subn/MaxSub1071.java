package subn;

/**
 * @author Johnson
 * @date 2020/3/12 19:53
 */
public class MaxSub1071 {
    public static void main(String[] args) {

        MaxSub1071 x = new MaxSub1071();
        String s = x.gcdOfStrings("ABCABCABC", "ABC");
        System.out.println(s+"--");

    }

    public String gcdOfStrings(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return "";
        }

        if (str1.equals(str2)) {
            return str1;
        }

        return getResult(str1, str2);

    }

    //辗转相除法获取最大公约数
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public String getResult(String s1, String s2) {
        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        } else {
            return s1.substring(0, gcd(s1.length(), s2.length()));
        }
    }

}
