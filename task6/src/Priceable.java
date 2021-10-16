public interface Priceable {
    int getPrice();
}
class Milk implements Priceable{

    int cost;

    public Milk(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice(){
        return this.cost;
    }
}

class Juice implements Priceable{

    int cost;

    public Juice(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice(){
        return this.cost;
    }
}
