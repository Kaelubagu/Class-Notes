import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._






    /*
     * Complete the 'closedPaths' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    def closedPaths(number: Int): Int = {

        var nums = number.toString
        var sum:Int = 0

        for(i <- nums) {
            if(i == '0' || i == '4' || i == '6' || i == '9' ) {
                sum += 1
            }
            else if (i == '8') {
                sum += 2
            }
            else {
                sum += 0
            }
        }
            sum
        
    }
    
    
