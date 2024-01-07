// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.chaos131.auto.AutoBuilder;
import com.chaos131.gamepads.Gamepad;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants.GamepadConstants;

public class RobotContainer {
  private Gamepad m_driver = new Gamepad(GamepadConstants.DriverPort);
  private Gamepad m_opeator = new Gamepad(GamepadConstants.OperatorPort);
  private final AutoBuilder AutoBuilder = new AutoBuilder();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    ConfigureDriverControls();
    ConfigureOperatorControls();
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  private void ConfigureDriverControls() {
    // Drive
    // Reset
  }

  private void ConfigureOperatorControls() {

  }
}
