package lazyload.virtualproxy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SupplierMapper {


    protected Supplier doLoad(Long id, ResultSet rs) throws SQLException{
        String nameArg = rs.getString(2);
        Supplier result = new Supplier(id, nameArg);
        result.setProducts(new VirtualList(new ProductLoader(id)));
        return result;
    }

}
