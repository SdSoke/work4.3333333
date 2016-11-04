/**
 * Created by admin on 2016/11/4.
 */
public class BagText {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.add("TsMing");
        bag.add("TingNan");
        bag.add("overwatch");
        bag.add("meet");
        bag.add("friend");
        System.out.println("开始" + bag);
        bag.remove("friend");
        System.out.println("删除后" + bag);

        if (bag != null && !bag.isEmpty()) {
            System.out.println(bag);

        } else {
            System.out.println("empty");
        }


    }
}
