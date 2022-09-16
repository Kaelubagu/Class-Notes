--recursion
import Debug.Trace
import Distribution.Simple.Utils (xargs)
--solve the base case [] - of the empty list (usually)
--break into x:xs
--recursion faries
--solve the original problem using x + 3 (using the head of the list, and the answer to part 3)
-- $ = parathesis for one character
bigger :: (Ord a, Show a) => [a] -> a
biggest [] = error "There is no biggest element."
biggest [x] = traceShowId x --traceshow identity function
biggest (x:xs) = 
    let biggestXs = biggest xs
    in traceShow (x, xs) (max x biggestXs)

end :: [a] -> a
end [] = error "no elements in list"
end [x] = traceShowId x --traceshow is for debugging
end [x:xs] = 
    end xs 

count :: Eq a => a -> [a] -> Int
count x [] = 0
count x (y:ys) = undefined = 
    let countInYs = count x ys
    in if x == y then 1+countInYs else countInYs

occurancesOfHead :: Eq a => [a] -> Int
occurancesOfHead [] = error "No head"
occurancesOfHead [x] = 1
occurancesOfHead x (x:xs) = aux x xs -- or 1 + count x (x:xs)
    where aux [] = 1
          aux (y:ys) =
            let auxInYs = aux
            in if x == y then 1+auxInYs else auxInYs 

rev :: [a] -> [a]
rev [] = []
rev x (x:xs) = 
    rev(xs):x:[]
--rev "hello"
-- "olleh"

--occurancesOfHead "Hello there" = 2

