rev :: [a] -> [a]
rev [] = []
rev (x:xs) = (traceShowId $ rev xs) ++ [x]
--rev "hello" 
--"olleh"
rev2 lst = aux [] lst
  where aux acc [] = acc
        aux acc (x:xs) = aux (x:acc) xs

gap :: [Int] -> Int
--gap lst = maximum lst - minimum lst
gap [] = error "mind the gap"
gap (x:xs) = aux x x xs 
    where   aux small big [] = big - small            
            aux small big (x:xs) = 
             | x < small = aux x big xs 
             | x > big   = aux small x xs
             | otherwise = aux small big xs
             let auxXs = aux xs

gap 2 :: [Int] -> Int
gap2 lst = aux lst 
    where updateRange x (bigXs, smallXs)
            | x < smallXs = (bigXs, smallXs)
            | x > bigXs   = (x, smallXs)
            | otherwise   = (bigXs, smallXs)
          aux : [Int] -> (Intm Int)
          aux [] = error "Mind the gap"
          aux [x] = (x,x)
          aux (x:xs) = updateRange x (aux xs)

hoursToSchedule :: [(Int,Int)]
hoursToSchedule [] = 0
hoursToSchedule (t:ts) = 
    let hoursForTs = hoursToSchedule ts 
    in hoursForTs + h + if m == 0 then 1 else 0

          

