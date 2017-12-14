import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        Map<String,Object> cache=new HashMap<>();
        int count = 0;
        int indexEnd = -1;
        int flag=0;
        int i;
        for ( i = 0; i < s.length(); i++) {
            if(i==s.length()-1&&s.charAt(i)==s.charAt(i-1)){
                count++;
            }else if (i==s.length()-1&&s.charAt(i)!=s.charAt(i-1)){
            }
            else if  (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (count >= 4) {
                    count = 0;
                    if (flag == -1) {
                        if(cache.get(s.substring(indexEnd - 4, indexEnd + 6))==null){
                            list.add(s.substring(indexEnd - 4, indexEnd + 6)); 
                            cache.put(s.substring(indexEnd - 4, indexEnd + 6),1);
                        }
                        i = indexEnd;
                        indexEnd = -1;
                        flag=0;
                    } else {
                        indexEnd = i;
                        flag=-1;
                    }
                } else {
                    count = 0;
                    indexEnd=i;
                    flag=0;
                    
                }
            }
        }
        if(count>=4&&count<10){
            indexEnd=count/2-1;
            if(cache.get(s.substring(indexEnd - 4, indexEnd + 6))==null){
                list.add(s.substring(indexEnd - 4, indexEnd + 6));
                cache.put(s.substring(indexEnd - 4, indexEnd + 6),1);
            }
        }

        return list;
    }
}