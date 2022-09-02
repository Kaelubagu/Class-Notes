    /*
    def countPairs(projectCosts: Array[Int], target: Int): Int = {
    // Write your code here
        //[recommend variable because value will change]
        var countfinal = 0
        for(x <- 0 until projectCosts.sorted.length) {
            for(y <- 0 until projectCosts.sorted.length) {
                if (projectCosts(x) - projectCosts(y) == target) {
                    countfinal += 1
                }
            }
        }
     return countfinal
    }

    def countPairs2(projectCosts: Array[Int], target: Int): Int = {
        var proSort = projectCosts.sorted.distinct
        var countFinal = 0
        var a:Int = 0
        var b:Int = 0
            
            while(b < proSort.length){
                if(proSort(b) - proSort(a) == target) {
                    countFinal += 1
                    a += 1
                    b += 1
                }
                
                else if(proSort(b) - proSort(a) > target) {
                    a += 1
                }
                else {
                    b += 1
                }
                
            }
        return countFinal
    }
*/



    def getTime(s: String): Long = {
        
        var l = s.length
        var time = 0
        var toLow = s.toLowerCase
        var currentElem = 0

        for (i <- 0 to l-1) {
            var askin = toLow.charAt(i) - 97
            var a = math.abs(currentElem - askin)
            var b = 26 - a
            currentElem = toLow.charAt(i) - 97 
            time = time + math.min(a , b)    
         }
        return time
    }