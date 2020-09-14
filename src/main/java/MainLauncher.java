import io.vertx.core.Launcher;
import learn.MainVerticle;

public class MainLauncher extends Launcher {

    public static void main(String[] args) {
        new MainLauncher().dispatch(new String[] {"run", MainVerticle.class.getName()});
    }
}
