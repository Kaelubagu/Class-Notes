


class Account(val num:Int, var name:String, initBal:Int = 0) { //not a field, so you cannot talk about any of these outside of this function

    var bal:Int = 0 //any account you make is going to have an initial value of 0
        if(initBal > 0) {
            bal = initBal
        }

  def deposit(amt:Int):Unit = { //depositing cash
    if(amt > 0) {
      bal += amt
    }
  }

  def withdraw(amt:Int):Unit = { //withdrawing cash
    if(amt <= bal && amt > 0) {
      bal -= amt
    }
  }

  }

  //The issue is privacy 

  //visibility and privacy
  //make fields only accessible within the code block of the class with Private fields (default is public)
*/

class Account(val num:Int, var name:String, initBal:Int = 0) { //not a field, so you cannot talk about any of these outside of this function

    private var bal:Int = 0 //added private, but you want to be able to see your number... (get, set)
        if(initBal > 0) {
            bal = initBal
        }

  def balance:Int = {bal} //returns value of balance //getter function

  def balance_=(amt:Int):Unit = { //allows you to modify the balance after the protection filter. //setter function
    if(amt > 0) {
      bal = amt
    }
    
  }

  override def toString():String = {  //overrides the main account string you recieve when making an account with val b = new Account (x,x,x,)
    name + "(" + num + "): " + "$" + bal
  }

  def deposit(amt:Int):Unit = { //depositing cash
    if(amt > 0) {
      bal += amt
    }
  }

  def withdraw(amt:Int):Unit = { //withdrawing cash
    if(amt <= bal && amt > 0) {
      bal -= amt
    }
  }

  }

  //setter syntax
  // class SampleSet (private)
  //def field1_=(f:Int) ={whatever work} 

  //what if we want to know more about our customer? How about a customer class? More accounts than 1? How can a customer get info about their accounts?

  class Angle //stores angles in radians (not degrees), we'll restrict valid angles to be between 0 and 2pi. //angles go clockwise here (no negative angles).