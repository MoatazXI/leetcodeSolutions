# using binary search , we can use it to find square root of number

def mySqrt(self, x: int) -> int:
    
    if num < 2: return num
    start = 2 
    end = num // 2

    while(start <= end):
        pivot = start + (end - start) / 2
        squaredNumber = pivot * pivot
        if squaredNumber < num:
            start = pivot + 1
        elif squaredNumber > num:
            end =  pivot - 1
        else:
            return pivot
        

    return end # if square root not found , return nearest smallest number




