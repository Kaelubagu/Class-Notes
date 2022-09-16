import Debug.Trace (traceShowId, traceShow)
--sorting algorithms
--quick sort is the one demonstrated by fogarty.
--[] is sorted 
--[x] is sorted 
--2. split i-10 x:xs 
--3. recursively sort xs

{- 1) if list was empty or had one student, it is sorted 
2) Take the head of the list of students (call them the pivot) 
3) Split the remaining students into younger and older than the pivot 
4) Recursively sort the younger and older sublists
5) Combine the younger, pivot, and older in that order 

structural: base case / near the base case of the data (condition) (hyperfixated on our data)
            RecurseOn: tail or equivalent
            solution: combining head and solution for tail

non-structural: analyze the simplest case of the problem.
            RecurseOn: logical sub-problem(5)
            solution: combine solution for sub-problem(5) and anything else.


--structured 

quickSort :: Ord a => [a] -> [a]
quickSort [] = []
quickSort lst = 
    let pivot = head lst
        younger = quickSort [ x | x <- lst, x < pivot] -- quickSort is the recursion.
        older   = quickSort [ x | x <- lst, x > pivot]
    in younger ++ [pivot] ++ older


--non-structure

quickSort :: (Show a, Ord a) => [a] -> [a]
quickSort [] = []
quickSort lst = 
    let pivot = head lst
        younger = quickSort $ traceShowId [ x | x <- tail lst, x < pivot] -- quickSort is the recursion.
        older   = quickSort $ traceShowId [ x | x <- lst, x > pivot]
    in younger ++ [pivot] ++ older

--greated common denominator 
egcd a b  
    | (a == b) = a
    |  a > b     = traceShow (a-b,b) $ egcd (a-b) b
    |  otherwise = traceShow (a,b-a) $ egcd a (b-a)
-}

hanoi 0 s m t = []
hanoi n s m t = 
    let beginningHalf = hanoi (n-1) s t m 
        middleStep = [(n, s, t)]
        backHalf = hanoi (n-1) m s t 
    in beginningHalf ++ middleStep ++ backHalf

