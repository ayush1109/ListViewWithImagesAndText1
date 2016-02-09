package in.wptrafficanalyzer.listviewwithimagesandtext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	
	
    String[] countries = new String[] {
            "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "North Korea",
            "South Korea",
            "Japan"
    };
    
    
    int[] flags = new int[]{
    		R.drawable.india,
    		R.drawable.pakistan,
    		R.drawable.srilanka,
    		R.drawable.china,
    		R.drawable.bangladesh,
    		R.drawable.nepal,
    		R.drawable.afghanistan,
    		R.drawable.nkorea,
    		R.drawable.skorea,
    		R.drawable.japan
    };
	
    
    String[] currency = new String[]{
    	"Indian Rupee",
    	"Pakistani Rupee",
    	"Sri Lankan Rupee",
    	"Renminbi",
    	"Bangladeshi Taka",
    	"Nepalese Rupee",
    	"Afghani",
    	"North Korean Won",
    	"South Korean Won",
    	"Japanese Yen"
    };
    
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
      
        
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        
        
        for(int i=0;i<10;i++){
        	HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "Country : " + countries[i]);
            hm.put("cur","Currency : " + currency[i]);
            hm.put("flag", Integer.toString(flags[i]) );            
            aList.add(hm);        
        }
        
        
        String[] from = { "flag","txt","cur" };
        
        
        int[] to = { R.id.flag,R.id.txt,R.id.cur};        
        
        
        
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout, from, to);
        
        
        ListView listView = ( ListView ) findViewById(R.id.listview);
        
        
        listView.setAdapter(adapter);                                
    }
}