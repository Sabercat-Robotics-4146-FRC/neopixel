// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

 
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
  }

 
  @Override
  public void robotPeriodic() {}

 
  @Override
  public void autonomousInit() {
   
  }

  @Override
  public void autonomousPeriodic() {
  
  }
 
  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    NeoPixel.led_stuff();
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    NeoPixel.remove_buffer();
  }

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
