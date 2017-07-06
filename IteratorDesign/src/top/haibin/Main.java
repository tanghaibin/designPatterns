package top.haibin;

import top.haibin.domain.User;
import top.haibin.impl.ContainerImpl;
import top.haibin.iterface.Container;
import top.haibin.iterface.ContainerIterator;

/**
 * Created by haibin.tang on 2017/7/6 0006.
 */
public class Main {

    public static void main(String[] args) {
        Container<User> userList = new ContainerImpl<>();
        userList.add(new User("小明", 20));
        userList.add(new User("小红", 23));
        userList.add(new User("小刚", 12));
        userList.add(new User("小离", 24));

        ContainerIterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
