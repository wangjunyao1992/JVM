- 加了volatile的double和long类型赋值是原子性的，没有加volatile的是非原子的，因为double和long都是64bit，分两次赋值，没有加的话，每次赋值32bit


### 类加载过程
自底向上检查该类是否已经加载<br/>
Customer ClassLoader --> App --> Extension --> Bootstrap 
自顶向下进行实际查找和加载child方向<br/>
Customer ClassLoader <-- App <-- Extension <-- Bootstrap

#### 每个类加载器的用途
- Bootstrap：加载lib/rt.jar  charset.jar等核心类，C++实现
- Extension：加载扩展jar包jre/lib/ext/*.jar，或者由-Djava.ext.dirs指定
- App：加载classpath指定内容
- Customer ClassLoader：自定义ClassLoader

<font color="red">父加载器不是“类加载器的加载器”，也不是“类加载器的父类加载器”</font>

#### 双亲委派：
双亲委派是一个孩子向父亲方向，然后父亲向孩子方向的双亲委派过程<br/>
为什么要双亲委派？<br/>
- 主要出于安全
    - 反例：java.lang.String类由自定义类加载器加载行不行???
- 已经加载过的类不需要加载两次

打破双亲委派：重写ClassLoader的loadClass()方法
- 什么时候需要打破双亲委派呢？？？
    - 
    
    
    




