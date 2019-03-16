/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.RunDrivetrain;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {

  VictorSPX rightMotor1 = new VictorSPX(1);
  VictorSPX rightMotor2 = new VictorSPX(16);
  VictorSPX leftMotor1 = new VictorSPX(12);
  VictorSPX leftMotor2 = new VictorSPX(15);


  public void driveRobot(double leftSpeed, double rightSpeed){
    rightMotor1.set(ControlMode.PercentOutput, rightSpeed);
    rightMotor2.set(ControlMode.PercentOutput, rightSpeed);
    leftMotor1.set(ControlMode.PercentOutput, leftSpeed);
    leftMotor2.set(ControlMode.PercentOutput, leftSpeed);


  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new RunDrivetrain());
  }
}
