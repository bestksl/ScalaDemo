class Cat {
  //定义/声明三个属性
  //说明
  //1. 当我们声明了 var name :String 时, 在底层对应 private name
  //2. 同时会生成 两个 public 方法 name() <=类似=> getter public name_$eq() => setter
  var name: String = "" //给初始值
  var age: Int = _ // _ 表示给age 一个默认的值 ，如果Int 默认就是0
  var aa=null
  cat.name_$eq("小白")


  var color: String = _ // _ 给 color 默认值，如果 String ,默认是就是""
}