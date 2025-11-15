package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants;
import frc.robot.subsystems.ArmSubsystem;

public class ArmCommands extends Command {

    public static Command armUp(ArmSubsystem arm) {
        return Commands.run(
          () -> {
            arm.moveArm(Constants.armUpSpeed);
            
          },
          arm);
    }

    public static Command armDown(ArmSubsystem arm) {
        return Commands.run(
          () -> {
            arm.moveArm(Constants.armDownSpeed);
          },
          arm);
    }

    public static Command armBrakeC(ArmSubsystem arm){
      return Commands.run(
        () -> {
            arm.armBrake();
          },
          arm);
    }

    public static Command armBrakeM(ArmSubsystem arm){
        return Commands.run(
            () -> {
                arm.moveArm(Constants.armBrakeSpeed);
            },
            arm);
    }

}