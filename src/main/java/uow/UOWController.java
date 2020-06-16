package uow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UOWController extends SlowDatabase{
    private Map<Integer, String> documentContents;
    private SlowDatabase backingDatabase;
    
    public UOWController(SlowDatabase backingDatabase){
        this.documentContents = new HashMap<>();
        this.backingDatabase = backingDatabase; 
    }
    
    @Override
    public void saveDocumentContents(int key, String documentContents){
        this.documentContents.put(key, documentContents);
    }
    
    @Override 
    public String getDocumentContents(int key){
        return this.documentContents.get(key);
    }

    @Override
    public List<Integer> getDocumentKeys() {
        return new ArrayList<>(documentContents.keySet());
    }


    public void commit() {
        for (Integer key: getDocumentKeys()){
            backingDatabase.saveDocumentContents(key, documentContents.get(key));
        }
        documentContents.clear();
    }
}
