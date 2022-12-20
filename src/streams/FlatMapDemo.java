package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
public static void main(String[] args) {
	List<String> awsCerts=Arrays.asList("AWS DEVELOPER","AWS CCP","AWS ARCHITECH","AWS DEVOPS");
	List<String> msCerts=Arrays.asList("MS DEVELOPER","MS CCP","MS ARCHITECH","MS DEVOPS");
	
	List<List<String>> listOfCerts=Arrays.asList(awsCerts,msCerts);
	
	List<String> collect = listOfCerts.stream().flatMap(fm->fm.stream()).map(m->m.toLowerCase()).filter(f->f.startsWith("ms")).collect(Collectors.toList());
	System.out.println(collect);
	
	
	
}
}
