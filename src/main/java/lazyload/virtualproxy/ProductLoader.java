package lazyload.virtualproxy;

import java.util.ArrayList;
import java.util.List;


public class ProductLoader implements VirtualListLoader{

    private Long id;

    public ProductLoader(Long id){
        this.id = id;
    }

    @Override
    public List load() {
        //return loaded list from db
        return new ArrayList();
    }
}
