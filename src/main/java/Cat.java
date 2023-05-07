public class Cat extends Animal {
    public Cat (String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }
    public String getSay() {
        String say = super.getSay();
        return say + " new! ";
    }
    void mjau () {
        System.out.println(getSay()+ getTeeth());
    }
}
