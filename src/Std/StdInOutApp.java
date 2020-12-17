package Std;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class StdInOutApp implements StdInOut {
    private final Scanner scanner;
    private final OutputStream outputStream;

    public StdInOutApp(Process process) {
        this.scanner = new Scanner(process.getInputStream());
        this.outputStream = process.getOutputStream();
    }

    @Override
    public String get() {
        return scanner.next();
    }

    @Override
    public void put(String string) throws IOException {
        outputStream.write(string.getBytes());
        outputStream.flush();
    }

    @Override
    public void close() throws IOException {
        scanner.close();
        outputStream.close();
    }
}
