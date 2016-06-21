import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("List of env variables");

        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }

}
