package frc.robot;

public class Constants {
    public static class GamepadConstants {
        public static final int DriverPort = 0;
        public static final int OperatorPort = 1;
    }

    public static class SwerveConstants {
        public static final double MaxTranslationalSpeedMps = 3.8; // Absolute max linear velocity of the robot
        public static final double MaxRotationalSpeedRps = 2 * Math.PI; // This yields a linear velocity at the outermost edge of the robot of 2pi rad * 1 ft (assumed robot radius) ~= 6 feet per second which still seems kind of fast to me.
        
        // CAN IDs for the various motor controllers and absolute encoders
        public static final int FrontRightAngle = 4;
        public static final int FrontRightVelocity = 8;
        public static int FrontRightAbsolute = 21;

        public static final int FrontLeftAngle = 5;
        public static final int FrontLeftVelocity = 6;
        public static int FrontLeftAbsolute = 22;

        public static final int BackRightAngle = 1;
        public static final int BackRightVelocity = 2;
        public static int BackRightAbsolute = 20;

        public static final int BackLeftAngle = 7;
        public static final int BackLeftVelocity = 3;
        public static int BackLeftAbsolute = 23;

        // Drivetrain Properties stolen from 2022 Github
        public final static double DriveWheelWidthMeters = 0.092; // 0.1016 meters = 4 inches, 1 rev of motor = 2048 tics
        public final static double DriveWheelCircumferenceMeters = DriveWheelWidthMeters * Math.PI;
        public final static double SwerveModuleVelocityGearRatio = 7.80; // Assuming the Standard Gear Ratio; Same link as
                                                                     // below
        public final static double SwerveModuleAngleGearRatio = 144.0 / 14.0; // 12:24 then 14:72 = 14:144
        public final static double TalonCountsPerRevolution = 2048;
    }
}
