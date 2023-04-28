package pattern.create;

/**
 * @Description:
 * @author zhujg
 * @date 2023/4/28 21:04
 * @Version 1.0
 * 单例模式——枚举式：
 * 使用枚举来实现单例模式，可以避免线程安全问题，同时也能够保证在任何情况下都只会创建一个实例对象。
 */
public enum SingletonEnum {
    INSTANCE;

    public void doSomething() {
        // do something...
    }

}
