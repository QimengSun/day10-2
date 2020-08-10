package exer;

/**
 * @author: sqm
 * @date: 2020/8/10 15:58
 * @description:
 */
public class Girl {
    private String name;
    private int age;


    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    //比较对象的大小

    public int compare(Girl girl){
        if(this.age > girl.age){//原本对象 大于 形参对象
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else{
            return 0;
        }
  }
}
