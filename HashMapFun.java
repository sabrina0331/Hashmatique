import java.util.HashMap;
public class HashMapFun{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Money like a shower, that's my rain dance","Taste");
        trackList.put("So it's gonna be forever Or it's gonna go down in flames","Blank Space");
        trackList.put("Lady, running down to the riptide Taken away to the dark side","Riptide");
        trackList.put("I buy you champagne but you love some Henny From the block like you Jenny","In my feelings");
        // String title = trackList.get("I buy you champagne but you love some Henny From the block like you Jenny");
        // System.out.println("the title is: "+ title);
        for(String key : trackList.keySet()) {
            System.out.println(trackList.get(key)+": "+ key);
        }
    }
}