//Build tool. "Simple" Build Tool - SBT
//requests a specific file structure that you cannot mess with.
//put work into src -> main -> scala (Organize your files into subfolders)
//package PACKAGE.NESTED.NAMES - correspond to folder structure (PACKAGE.CSII.UTIL)


object Wow {

}
//companion objects

//special methods -apply() and update()
//added material & notes 
object Angle {
    def apply():Angle = new Angle(0)
    def apply(amt:Double):Angle = { //companion object
        val tmp - new Angle(amt)
        tmp
    }

    val PI = Angle(math.Pi)

    def main(args:Array[String]):Unit = {
        println("hello world!")
        val a = new Angle(math.pi) 
        val b = Angle()
        val c = Angle(3*math.pi/4)
        println(b) 
        println(math.Pi)
    }
}

//UML for angle class