import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSorting implements Comparator  {
    @Override
    public int compare(Object first, Object second) {
        if(first.toString().length() > second.toString().length()){
            return 1;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {


        List<String> nameList = new ArrayList<String>();
        nameList.add("Sujith");
        nameList.add("Kris");
        nameList.add("Indhu");
        System.out.println("Name List is"+nameList);
        CustomSorting sort = new CustomSorting();
        Collections.sort(nameList,sort);
        System.out.println("After Sort Name List is"+nameList);
        System.out.println("Diffent User");
    }
}
