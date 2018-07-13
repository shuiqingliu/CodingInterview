# didi java intern interview
主要问了 JAVA 的基础 ，Spring AOP  IOC ,Spring 框架的源码和 MySQL 的事务以及事务隔离级别。在此做个记录防止遗忘。

### 1. String,StringBuffer 和 StringBuilder 区别
* a) String 是不可变的`对象`，他一旦被创建就不能改变。已经创建的String 对象保存在`静态String池(Constant String Pool)`当中,JAVA 中每一个不可变的对象都是线程安全的，String 不能同时应用于两个线程。
* b)StringBuffer  是可以改变对象值的所以他是可变的，通过 StringBuffer 创建对象后存储在堆，StringBuffer 和 StringBuilder 有同样的方法但是 StringBuffer 中的每一个方法都是 synchronized 所以 StringBuffer 是线程安全的。由于 synchronized 锁的机制每个方法一次只能被一个线程访问。但是线程安全也有缺点，这就影响了 StringBuffer 的性能，所以当调用同一个方法是 StringBuilder 要快与 StringBuffer
* c)StringBuilder 跟StringBuffer 类似，他也将对象存储在堆并且可以被修改，最大的区别就是 StrinbBuilder 不是线程安全的。

### 2. JVM 的 内存模型
* a)

