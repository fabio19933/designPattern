package behavior.iterator;

public class Main {
    public static void main(String[] args) {
        MyList<User> userMyList = new MyList<>();
        userMyList.add(new User("Paperino"));
        userMyList.add(new User("Pino"));
        userMyList.add(new User("Lino"));
        while (userMyList.hasNext()){
            System.out.println(userMyList.next().getName());
        }
    }
}
