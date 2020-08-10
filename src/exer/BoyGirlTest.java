package exer;

/**
 * @author: sqm
 * @date: 2020/8/10 16:16
 * @description:
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout() ;

        Girl girl = new Girl("朱丽叶",18);
        girl.marry(boy);

        Girl girl2 = new Girl("祝英台",19);
        int compare =girl.compare(girl2);
        System.out.println("compare = " + compare);
    }
}
