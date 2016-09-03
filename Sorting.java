public class Sorting implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return (s2+s1).compareTo(s1+s2);
    }

    public static void main(String[] args) {
        Sort ls = new Sort();
        Integer[] nums = {11,13,14,22};
        Arrays.sort(nums, ls);
        System.out.println(Arrays.toString(nums));
    }
}
