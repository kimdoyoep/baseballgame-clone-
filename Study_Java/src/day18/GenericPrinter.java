package day18;

public class GenericPrinter<T extends Material>  { //제네릭 클래스. type의 약자 T를 사용.
    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing(){
        material.doPrinting();
    }

}
