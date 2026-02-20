class Solution:
    def rearrangeBarcodes(self, barcodes: List[int]) -> List[int]:
        count = Counter(barcodes)
        
        sorted_nums = sorted(count.keys(), key=lambda x: -count[x])
        
        res = [0] * len(barcodes)
        index = 0
        
        for num in sorted_nums:
            for _ in range(count[num]):
                if index >= len(barcodes):
                    index = 1 
                res[index] = num
                index += 2
        
        return res