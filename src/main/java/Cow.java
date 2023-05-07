public class Cow extends Animal {
    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }
    public String getSay() {
String say = super.getSay();
return say + " new! ";
    }

void muuu () {
    System.out.println(getSay() + " to all " + getTeeth() + " teeth");
}
}
