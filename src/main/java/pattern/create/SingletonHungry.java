package pattern.create;

/**
 * @author zhujg
 * @Description:
 * @date 2023/4/28 17:47
 * @Version 1.0
 *
 * 饿汉式：
 * 在类加载的时候就创建唯一的实例对象，并且在静态代码块中进行初始化。这种方式虽然简单，但是会浪费一定的内存空间。
 */
public class SingletonHungry {

    private static final SingletonHungry instance = new SingletonHungry();

    public SingletonHungry() {
    }

    public static SingletonHungry getInstance(){
        return instance;
    }


}
