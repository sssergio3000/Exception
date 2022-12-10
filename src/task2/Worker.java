package task2;

public class Worker {
    String name;
    String position;
    int year;

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{"+"name: "+name+", position: "+position+", year: "+year+" }";
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
}
