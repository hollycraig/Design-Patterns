package lazyload.valueholder;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SupplierMapper {

    protected Supplier doLoad(Long id, ResultSet rs) throws SQLException {
        String nameArg = rs.getString(2);
        Supplier result = new Supplier();
        result.setProducts(new ValueHolder(new ProductLoader(id)));
        return result;
    }

    public static class ProductLoader implements ValueLoader{
        private Long id;
        public ProductLoader(Long id){
            this.id = id;
        }

        @Override
        public Object load() {
            return new ArrayList<>();
        }
    }
}
