package Tests;

import Std.StdInOut;

import java.io.IOException;

public interface Test extends StdInOut {
    // Номер задачи
    Integer getId();

    // Возвращает результат
    Boolean getResult() throws IOException;
}
