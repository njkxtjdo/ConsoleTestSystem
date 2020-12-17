package Tests;

import Programs.Program;
import Std.StdInOut;

import java.io.IOException;

public class TestForConsole implements Test {
    private final StdInOut stdInOut;
    private final Integer id;
    private static int count = 0;

    public TestForConsole(Program program) {
        this.stdInOut = program.getStdInOutApp();
        this.id = count;
        count++;
    }

    @Override
    public Boolean getResult() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String get() {
        return stdInOut.get();
    }

    @Override
    public void put(String string) throws IOException {
        stdInOut.put(string);
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void close() throws IOException {
        stdInOut.close();
    }
}
