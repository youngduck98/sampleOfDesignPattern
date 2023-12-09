package factoryPattern;

public abstract class Creator {
    public Product createProduct(){
        Product product = FactoryMethod();
        product.method1();
        product.method2();
        return product;
    }
    public abstract Product FactoryMethod();
}
