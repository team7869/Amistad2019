/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.RunElevator;

/**
 * Add your docs here.
 */
public class CargoElevator extends Subsystem {

  VictorSP elevatorMotor = new VictorSP(0);



  public void SetMotorSpeed(){
    elevatorMotor.set(.5);
  }

  public void TurnOffMotor(){
    elevatorMotor.set(0);
  }

  
  public void SetVariableSpeed(double speed){
    elevatorMotor.set(speed);

  }

  

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new RunElevator());
  }
}
