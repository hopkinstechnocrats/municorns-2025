package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase{
    WPI_TalonSRX armMotor;
    public ArmSubsystem(){
        armMotor = new WPI_TalonSRX(0); // get CANID
        armMotor.configFactoryDefault();
        armMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void raiseArm(){
        armMotor.set(Constants.armSpeed);
    
    }
    public void lowerArm(){
        armMotor.set(-Constants.armSpeed);
    }
}
