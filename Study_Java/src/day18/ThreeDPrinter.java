package day18;

public class ThreeDPrinter {
    private Powder material; //재료가 파우더(3D프린터를 사용할 때 사용하는 재료)인 경우
    private Plastic material2;

    public void setMaterial(Powder material){
        this.material = material;
    }

    public Powder getMaterial(){
        return material;
    }

    public void setMaterial(Plastic material2){
        this.material2 = material2;
    }

    public Plastic getMaterial2(){
        return material2;
    }
}

