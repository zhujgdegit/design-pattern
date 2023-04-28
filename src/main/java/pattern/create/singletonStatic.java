package pattern.create;

/**
 * @author zhujg
 * @Description:
 * @date 2023/4/28 20:58
 * @Version 1.0
 * 静态内部类式：
 * 通过静态内部类来实现单例模式，保证只有在需要使用时才会进行实例化，同时不会浪费内存空间，也能够保证线程安全。
 */
public class singletonStatic {

    private static class singletonStaticHolder {
        private static final singletonStatic INSTANCE = new singletonStatic();
    }

    public singletonStatic() {
    }

    public static singletonStatic getInstance() {
        return singletonStaticHolder.INSTANCE;
    }
}
