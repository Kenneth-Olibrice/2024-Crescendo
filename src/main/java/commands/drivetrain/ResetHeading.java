package commands.drivetrain;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivetrain.SwerveDrive;

public class ResetHeading extends Command {
    private SwerveDrive m_swerveDrive;

    public ResetHeading(SwerveDrive swerveDrive) {
        m_swerveDrive = swerveDrive;

        addRequirements(m_swerveDrive);
    }

    @Override
    public void execute() {
        m_swerveDrive.resetHeading(Rotation2d.fromDegrees(0));
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
