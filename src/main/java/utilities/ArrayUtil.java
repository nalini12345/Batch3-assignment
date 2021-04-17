package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtil {

	public static List<String> arrayToList(String[] arr) {
		List<String> lst = new ArrayList<String>();
		lst=Arrays.asList(arr);
		return lst;
	}

}
