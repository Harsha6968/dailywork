class A{
  get_data(){
    console.log("good morning")
  }
}
class B{
get_data(){
    console.log("good afternoon")
}
}
let a1=new A()//object creation
let a2=new B()//object creation
console.log(a1)//displaying the object
console.log(a2)//displaying the object
a1.get_data()//printing the inside data of the method
a2.get_data()//printing the inside data of the method