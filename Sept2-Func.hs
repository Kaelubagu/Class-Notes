--Check if a function is even or not
    myEven :: Integer -> Bool
    myEven x | (x `mod` 2 == 0) = True --these are called guards
             | otherwise False
 --   myEven x | (x `mod` 2 == 0) then True --similar to this
  --           else False

mileage :: Double -> String
mileage mpg 
    | mpg <= 10.0 = "Get a new car."
    | mpg <= 20.0 = "Meh"
    | mpg <= 30.0 = "Good"
    | otherwise   = "awesome"