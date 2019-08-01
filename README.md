# SpringDemo
Spring个人练习

以获取对象的方式来进行比较

传统的方式：
通过new 关键字主动创建一个对象
IOC方式
对象的生命周期由Spring来管理，直接从Spring那里去获取一个对象。 IOC是反转控制 (Inversion Of Control)的缩写，就像控制权从本来在自己手里，交给了Spring。




applicationContext.xml是Spring的核心配置文件，通过关键字c即可获取Category对象，该对象获取的时候，即被注入了字符串"category 1“到name属性中 
