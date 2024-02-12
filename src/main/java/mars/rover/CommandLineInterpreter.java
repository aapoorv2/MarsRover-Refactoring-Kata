package mars.rover;

import mars.rover.exceptions.InvalidInstructionException;

import java.util.ArrayList;
import java.util.List;

public class CommandLineInterpreter {
    public static List<Instruction> convertToList(String instructions) {
        List<Instruction> instructionsList = new ArrayList<>();
        for (int i = 0 ; i < instructions.length() ; i++) {
            char instruction = instructions.charAt(i);
            if (instruction == 'L') {
                instructionsList.add(Instruction.LEFT);
            } else if (instruction == 'R') {
                instructionsList.add(Instruction.RIGHT);
            } else if (instruction == 'M') {
                instructionsList.add(Instruction.MOVE);
            } else {
                throw new InvalidInstructionException();
            }
        }
        return instructionsList;
    }
}
