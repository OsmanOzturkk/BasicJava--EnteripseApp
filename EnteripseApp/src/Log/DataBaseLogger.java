package Log;

public class DataBaseLogger implements Logger
{
    @Override
    public void log(String data) {
        System.out.println("Veri Tabanına loglandı --> " + data);
    }
}
