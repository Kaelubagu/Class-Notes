hoursToSchedule :: [(Int,Int)]
hoursToSchedule tasks = fst $ aux tasks
where aux :: [(Int,Int)] -> (Int,Int) -- hours required, and minutes of slack $ parenthesis to the end of the expression
      aux  [] = (0,0)
      aux ((h,m):ts) = 
        let (hoursForTs, minutesLeft) = aux ts 
            newHours = hoursForTs + h + if m > minutesLeft then 1 else 0
            newMinutesLeft = if m < minutesLeft then minutesLeft - m else minutesLeft - m + 60
        in(newHours, newMinutesLeft)


--Project 2
