
/*
differences between a case class and classes:
    - a class can extend another class, whereas a case class cannot
    - case classes put multiple values into a single value, basically like assigning characteristics.
    - a case class is basically an instance of a field (data holder)for cases... hopefully by now it should make sense.
        - data stored can either be val or var

Classes:
    Instead of refering to case-classes, ill refer to instances from here on out. - they're both the same.

    Methods are functions that operate on / make use of those fields.
    - not excecuted until called on using "Dot Notation" -- ex : pw.println (that little dot in there
    - dot notation: NAME.FIELD = VALUE or NAME.METHOD

    writing a class (and fields)
*/
class Overdrive(val field1:Int, val field2:int) { //val | var are the field, but you can have them
    def getsum(): Int = field1 + field 2          //in different places, as demonstrated below.
}

class Overdrive2(field1:Int, field2:Int) {
    var f1 = field1
    var f2 = field2
    def getsum():Int = f1 + f2
}

class Overdrive3(val field1:Int, val field2:Int){
    val sum = field1 + field2
    def getsum(): Int = sum

}

//visibility and privacy -- can restrict access to data members and fields

//private: only accessed within a class

class Overdrive4(private var f1:Int, private var f2:Int) { //(get function) -- you're getting the private field
    def field1 = f1
    def field2 = f2 //this is how you can access it. (only within the class) -- but not change it.
}

class Overdrive5(private var field1:int, priavtee var field2:Int) { //(set function) -- you can set the private field //can keep the o.g name
    def field1_=(f:Int) = { //set: _=
        if (f < 0) field1 = 0 else field1 = f //caps so numbers can't dip below 0.
    }

    def field2_=(f2:Int){
        if (f2 < ) field2 = 0 else field2 = f2
    }
}

//special method - to string

override def toString():String = {...} // doing this allows you to override regular scala methods

