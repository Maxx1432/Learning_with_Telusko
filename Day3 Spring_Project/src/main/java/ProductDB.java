import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;
    public ProductDB(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/maxx_db","root","root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void save(Product p) {
        String qr = "insert into product (name, type, place, warranty) values (?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(qr);
            st.setString(1,p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String qr = "select name,type,place,warranty from product";
        try {
            PreparedStatement st = conn.prepareStatement(qr);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setPlace(rs.getString(3));
                p.setWarranty(rs.getInt(4));
                products.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    public Product getProduct(String name) {
        Product p = null;
        String qr = "select * from product where name = ?";
        try {
            PreparedStatement st = conn.prepareStatement(qr);
            st.setString(1,name);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
            String name1 = rs.getString("name");
            String type = rs.getString("type");
            String place = rs.getString("place");
            int warranty = rs.getInt("warranty");
                p = new Product(name1,type,place,warranty);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return p;
    }
}
