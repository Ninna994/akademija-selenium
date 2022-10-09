package fundamentals_java.interfaces;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{
    public static void main(String[] args) {
        CentralTraffic traffic = new AustralianTraffic();
        traffic.greenGo();
        traffic.redStop();
        traffic.yellowFlash();

        ContinentalTraffic contTraffic = new AustralianTraffic();
        contTraffic.trainSymbol();

        AustralianTraffic at = new AustralianTraffic();
        at.walkSymbol();
    }

    @Override
    public void trainSymbol() {
        System.out.println("This is train symbol from continental traffic rules");
    }

    @Override
    public void greenGo() {
        System.out.println("Green go Australia implementation and number from interface is: " + A);
    }

    @Override
    public void redStop() {
        System.out.println("Red Stop Australia implementation");
    }

    @Override
    public void yellowFlash() {
        System.out.println("Yellow Flash Australia implementation");
    }

    public void walkSymbol() {
        System.out.println("Australia only walking symbol");
    }
}
