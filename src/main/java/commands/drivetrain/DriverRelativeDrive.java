package commands.drivetrain;

import com.chaos131.gamepads.Gamepad;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.SwerveConstants;
import frc.robot.subsystems.drivetrain.SwerveDrive;

public class DriverRelativeDrive extends Command {
    private SwerveDrive m_swerveDrive;
    private double m_xVelMps = 0;
    private double m_yVelMps = 0;
    private double m_omegaVelRps = 0;

    
    public DriverRelativeDrive(SwerveDrive swerveDrive, Gamepad driver) {
        m_swerveDrive = swerveDrive;

        // In FTCLib, this block would cause problems that appeared to be issues of asynchronous access to gamepad values. I don't know if it'll work here
        m_xVelMps = driver.getLeftX() * SwerveConstants.MaxTranslationalSpeedMps;
        m_yVelMps = driver.getLeftY() * SwerveConstants.MaxTranslationalSpeedMps;
        m_omegaVelRps = driver.getRightX() * SwerveConstants.MaxRotationalSpeedRps;

        addRequirements(m_swerveDrive);
    }

    @Override
    public void execute() {
        // In field coordinates, positive x is away from the alliance and positive y is to the left. This is a 90 degree counter-clockwise rotation from how a controller works,
        // where +y is away from us and +x is to the right. A 90 degree counter-clockwise rotation on a 2d vector (x,y) produces the vector (y, -x) so we get the line below
        m_swerveDrive.moveFieldRelative(m_yVelMps, -m_xVelMps, m_omegaVelRps);
    }
}
