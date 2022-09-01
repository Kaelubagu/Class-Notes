--Pattern matching
import GHC.Integer.GMP.Internals (isZeroBigNat)
isEmpty :: [a] -> Bool
isEmpty [] = True
isEmpty _ = False --underscore means you dont want to put a variable name there, an absence of data.

isZero x = False
isZero 0 = True
isZero :: Int -> Bool


lucky 3 = "lucky"
lucky 7 = "so very lucky"
lucky 21 = "the luckiest"
lucky _ = "Unluckiest"

addvectors :: (Double, Double) -> (Double, Double) -> (Double, Double)
addvectors vectA vectB = (fst vectA + fst vectB, snd vectA + snd vectB)

sumVectors :: (Double, Double) -> (Double, Double) -> (Double, Double)
sumVectors (x1,x2) (y1,y2) = (x1+x2, y1+y2)

--Pattern matching should be: can i see this as x...
-- you can also do pattern matching elseware

addPairs :: [(Int, Int)] -> [Int]
addPairs lst = [a+b | (a,b) <- lst]

