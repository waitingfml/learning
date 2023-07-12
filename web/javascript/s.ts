class S {
    public show() {
        console.log('父类shou方法')
    }
}

class B extends S {
    constructor() {
        super();
    }

    public show() {
        // super.show()
        console.log('子类shou方法')
    }

    public test() {
        super.show()
    }
}

const b = new B()
b.show()
