package Programs;

import Std.StdInOutApp;

import java.io.IOException;

public class Program {
    private final StdInOutApp stdInOutApp;

    public Program(String startCommand) throws IOException {
        Process process = Runtime.getRuntime().exec(startCommand);
        this.stdInOutApp = new StdInOutApp(process);
    }

    public StdInOutApp getStdInOutApp() {
        return stdInOutApp;
    }

    public void close() throws IOException {
        stdInOutApp.close();
    }
}