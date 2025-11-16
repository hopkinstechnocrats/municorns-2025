package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
    WPI_TalonSRX intakeMotor;
    public IntakeSubsystem(){
        intakeMotor = new WPI_TalonSRX(0); //TODO: get CANID pt 2
        intakeMotor.configFactoryDefault();
        intakeMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void intake(double intakeSpeed){
        intakeMotor.set(intakeSpeed);
    }
}