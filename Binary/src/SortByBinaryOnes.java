
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortByBinaryOnes {
    public static void main(String[] args) {
		List<String> binaryNumbers = new ArrayList<String>();
		binaryNumbers.add("11");
		binaryNumbers.add("101");
		binaryNumbers.add("11111");
		binaryNumbers.add("1110");
		binaryNumbers.add("111101");
		
		
		System.out.println(sort(binaryNumbers));
	}

	public static List<String> sort(List<String> list) {

		
		Collections.sort(list, (String o1, String o2) -> {
                    if ((frequencyOfOne(o2) - frequencyOfOne(o1)) == 0) {
                        if ((o1.length() - o2.length()) == 0) {
                            return (Integer.parseInt(o1, 2) - Integer.parseInt(o2, 2));
                        } else
                            return (o1.length() - o2.length());
                    } else
                        return (frequencyOfOne(o2) - frequencyOfOne(o1));
                });
		

		return list;
	}

	public static int frequencyOfOne(String s) {
		List<String> temp = Arrays.asList(s.split(""));
		return Collections.frequency(temp, "1");
	}
}


//
//		Collections.sort(list, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				if ((frequencyOfOne(o2) - frequencyOfOne(o1)) == 0) {
//					if ((o1.length() - o2.length()) == 0) {
//						return (Integer.parseInt(o1, 2) - Integer.parseInt(o2, 2));
//					} else
//						return (o1.length() - o2.length());
//				} else
//					return (frequencyOfOne(o2) - frequencyOfOne(o1));
//			}
//		});
//		
//
//		return list;
//	}
//
//	public static int frequencyOfOne(String s) {
//		List<String> temp = Arrays.asList(s.split(""));
//		return Collections.frequency(temp, "1");


