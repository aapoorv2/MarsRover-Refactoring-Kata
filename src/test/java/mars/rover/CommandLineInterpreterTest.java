package mars.rover;

import mars.rover.exceptions.InvalidInstructionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineInterpreterTest {
//    @Test
//    void testNotThrowingAnExceptionWhenPassingAValidException() {
//        assertDoesNotThrow(() -> {
//           CommandLineInterpreter.convertToList("LMR");
//        });
//    }
    @Test
    void testThrowingAnExceptionWhenPassingAnInvalidException() {
        assertThrows(InvalidInstructionException.class, () -> {
            CommandLineInterpreter.convertToList("LMRX");
        });
    }

}