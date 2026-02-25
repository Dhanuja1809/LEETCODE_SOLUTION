class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (a, b) -> 
            (Integer.bitCount(a) * 10000 + a) -
            (Integer.bitCount(b) * 10000 + b)
        );
        return Arrays.stream(temp).mapToInt(i -> i).toArray();
    }
}