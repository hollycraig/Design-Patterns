package lazyload.valueholder;

import java.util.List;

public class Supplier {

    private ValueHolder products;

    public List getProducts(){
        return (List) products.getValue();
    }

    public void setProducts(ValueHolder holder){
        this.products = holder;
    }
}
