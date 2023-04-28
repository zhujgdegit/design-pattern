package pattern.create;

/**
 * @author zhujg
 * @Description:
 * @date 2023/4/28 17:59
 * @Version 1.0
 * 懒汉式：
 * 在需要使用实例对象时才进行创建，可以节约内存空间。但是在多线程环境下可能会存在线程安全问题，需要进行同步处理。
 */
public class Singletonlazy {
    private static SingletonHungry instance;

    public Singletonlazy() {
    }

    public static SingletonHungry getInstance() {
        if (instance == null) {
            //保障线程同步安全
            synchronized (SingletonHungry.class) {
                if (instance == null) {
                    instance = new SingletonHungry();
                }
            }
        }
        return instance;
    }
}
