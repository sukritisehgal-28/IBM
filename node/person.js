class person{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
    getName(){
        return this.name;
    }
    getAge = () =>this.age;

    print = function(){
        console.log("Name: " +this.name+"\tage:"+this.age);
    }
}

let p1 = new person("popo",21);
p1.print();

