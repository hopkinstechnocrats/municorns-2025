package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommands extends Command {
    
    public static Command intake(IntakeSubsystem wheel) {
        return Commands.run(
            () -> {
                wheel.intake(Constants.intakeSpeed);
            },
        wheel);
    }

    public static Command eject(IntakeSubsystem wheel) {
        return Commands.run(
          () -> {
            wheel.intake(Constants.ejectSpeed);
          },
          wheel);
    }
}