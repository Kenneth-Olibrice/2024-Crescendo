package frc.robot;

public class Constants {
    public static class GamepadConstants {
        public static final int DriverPort = 0;
        public static final int OperatorPort = 1;
    }

    public static class SwerveConstants {
        public static final double MaxTranslationalSpeedMps = 8; // Look at last year's code to determine this
        public static final double MaxRotationalSpeedRps = 2 * Math.PI; // This yields a linear velocity at the outermost edge of the robot of 2pi rad * 1 ft (assumed robot radius) ~= 6 feet per second which still seems kind of fast to me.
    }
}
