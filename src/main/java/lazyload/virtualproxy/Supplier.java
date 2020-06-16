package lazyload.virtualproxy;

import java.util.List;

public class Supplier {

    private List products;
    private Long id;
    private String name;

    public Supplier(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public void setProducts(VirtualList list){
        this.products = list;
    }
}
