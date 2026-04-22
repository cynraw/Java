package CoreJava;

enum Status{
    STARTING, RUNNING, ERROR, STOPPED;
}

public class Enums {
    public static void main(String[] args){
        Status[] statuses = Status.values();

        for(Status status : statuses){
            System.out.println(status);
        }

    }
}
