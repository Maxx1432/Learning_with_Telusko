import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class ProductService {

    List<Product> products = new ArrayList<>();
    ProductDB db = new ProductDB();
    public void addProduct(Product p){

        //products.add(p);
        db.save(p);
    }

    public List<Product> getAllProducts(){
        return db.getAll();
    }

    public Product getProduct(String name) {
        Product p = db.getProduct(name);
        return p;
    }

//    public List<Product> getProductWithText(String text) {
//        String str = text.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//
//        for(Product p : products){
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//            if(name.contains(str) || type.contains(str) || place.contains(str))
//                prods.add(p);
//        }
//        return prods;
//
//    }
//    public List<Product> getProductWithTextInStream(String text){
//        String str = text.toLowerCase();
//
//        Stream <Product> stream = products.stream();
//        List<Product> prods = stream.filter(product -> product.getName().toLowerCase()
//                .contains(str) || product.getType().toLowerCase()
//                .contains(str) || product.getPlace().toLowerCase()
//                .contains(str)).collect(Collectors.toList());
//
//        return prods;
//    }
//
//    public List<Product> getProductWithTextWithStream(String text){
//        String str = text.toLowerCase();
//
//        Stream <Product> stream = products.stream();
//        List<Product> prods = stream.filter(product -> product.getPlace().toLowerCase()
//                .contains(str)).collect(Collectors.toList());
//
//        return prods;
//    }
//
//    public List<Product> getProductWarranty(int i) {
//        Stream <Product> stream = products.stream();
//        List<Product> prods = stream.filter(product -> product.getWarranty()<2023)
//                .collect(Collectors.toList());
//
//        return prods;
//    }
}
