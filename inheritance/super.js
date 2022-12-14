class A {
    constructor() {
        console.log("A - const - special J")
    }
}
class B extends A {
    constructor() {
        super()//while using constructors super must be derived in class B
        console.log("B - const - special J")
    }
}
let a1=new B()