package factoryPattern;/*
* 변수와 method는 똑같은데 해당 method의 logic이 조금씩 다른 것들의 생산이 필요할 때
*/

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product A = creator.createProduct();
    }
}