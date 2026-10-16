public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int limit) {
        this.limit = limit;
        value = 0;
    }

    public String getDisplatValue() {
        if (value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int replacementvalue){
        if (replacementvalue >= 0 && replacementvalue < limit){
            value = replacementvalue;
        }
        else{
            System.out.println("The replacement value is invalid");
        }
    }

    public void increment() {
            value = (value + 1) % limit;
        }


}