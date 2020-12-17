package Std;

import java.io.IOException;

public interface StdInOut {
    String get();

    void put(String string) throws IOException;

    void close() throws IOException;
}
