//classes, operators & standalone objects.
/*
//Array.fill(5)(3) //take 2 arguments, the first gives you the number of slots you want to create. The second is the input. 
//(array)(fill) <- function that returns the function (function currying, creates a new function everytime you call it)
Array.tabulate(4)(sq) // = (0,1,4,9)  //first part is the index number, and the second part is a function
Array.tabulate(4)(x => x*x)  // (0,1,4,9)      => (Rocket) function that takes in x and returns x*x
Array.tabulate(4)(_+1) // (1,2,3,4)        _ takes in any argument and adds 1 to that. if you have x in place of _, you need to rocket it, so x => x+1
//tabulate only takes an Int as an input


//learning VI/VIM - clean text editor that does not have a graphical interface.
    //viewing mode: Default at start, keys do editing operations
    //insert mode: Keys type into document; start by pressing 'i' or 'a'
//i - insert, start editing at current character
//a - appened, start editing after current character


// start it like this: vi testfile.scala / .txt / or anything

*/



//making an angle class (going clockwise)
class Angle(private var rad:Double) {//0 & 2pi all the time; nobody can change it

    recenter() // inside constructor area

    private def recenter():Unit = {  
        rad = rad % (2*math.Pi)
        while(rad < 0) rad = rad + 2*math.Pi
        println("One Time!") 
    }
    
    def radians:Double = { rad }        //% reminder of division
    def degrees:Double = { rad / math.Pi * 180} //getter func similar to the one above.

    //lets try a setter
    def radians_=(amt:Double): Unit = {
        rad = amt
        recenter()
    }

    def degrees_=(amt:Double): Unit = {
        rad = amt / 180 * math.Pi  //make sure that 180 works, because amt could have been an integer
        recenter()
    }

    def + (other:Angle):Angle = {
        new Angle(this.rad + other.rad) //this is the calling object. so x.+y , "this"" represents x and "other" is y.
    }

    def += (other:Angle): unit = {
        this.rad + others.rad
    }
}

// x.+y is a method for adding doubles. scala allows you to omit the period (dont omit it for gods sake)
// x += y actually modifies x 

//this = the object that called this method--Can call a method within a method.