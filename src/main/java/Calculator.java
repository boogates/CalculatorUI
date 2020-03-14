
public class Calculator {

    String mainNumber= "0";
    String previousNumber;
    String symbol;
    String memory;

    public Calculator() {
        this("");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber = toAppend;
        return mainNumber;
    }

    public String appendToSymbol(String toAppend) {
        symbol = toAppend;
        return symbol;
    }

    public void resetMainNumber() {
        mainNumber = "0";
    }

    public void resetSymbol() {
        symbol = " ";
    }

    public void resetMemory(){
        memory = "0";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getMemory(){
        return memory;
    }


    public String add(String toAdd) {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toAdd);
        var result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String sub(String toSub) {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toSub);
        var result = mainNumberInteger - newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String mult(String toMult) {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toMult);
        var result = mainNumberInteger * newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String div(String toDiv) {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toDiv);
        var result = mainNumberInteger / newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String memoryAdd(String toAdd) {
        var mainNumberInteger = Integer.parseInt(memory);
        var newNumberInteger = Integer.parseInt(toAdd);
        var result = mainNumberInteger + newNumberInteger;
        memory = Integer.toString(result);
        return memory;
    }

    public String memorySub(String toSub) {
        var mainNumberInteger = Integer.parseInt(memory);
        var newNumberInteger = Integer.parseInt(toSub);
        var result = mainNumberInteger - newNumberInteger;
        memory = Integer.toString(result);
        return memory;
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }

    public void storeMemoryNumber(){
        memory = mainNumber;
        resetMainNumber();
    }
}
