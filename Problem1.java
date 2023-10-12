import java.util.*;
class Problem1
{
    public static void main(String[] args) 
    {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> l1 = Arrays.asList(arr);

		Collections.shuffle(l1);

		l1.toArray(arr);

		System.out.println(Arrays.toString(arr));
    }
}