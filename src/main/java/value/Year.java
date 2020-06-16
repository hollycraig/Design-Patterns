package value;

public class Year implements Comparable<Year>{
    public final int value;

    public Year(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }

    public Year incrementByOne(){
        return new Year(value + 1);
    }

    public Year decrementByOne(){
        return new Year(value - 1);
    }

    public Year diff(int compare) {
        return new Year(value + compare);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Year year = (Year) o;
        return (this.value == Integer.parseInt(year.toString()));
    }


    @Override
    public int compareTo(Year year) {
        if (year == null){
            throw new NullPointerException();
        }
        if (this.value < Integer.parseInt(year.toString())){
            return 1;

        }
        else if (this.value == Integer.parseInt(year.toString())){
            return 0;
        }

        else {
            return -1;
        }
    }

    @Override
    public int hashCode(){
        return value;
    }
}
