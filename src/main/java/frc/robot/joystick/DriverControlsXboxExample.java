package frc.robot.joystick;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;
import frc.taurus.joystick.Controller;
import frc.taurus.joystick.DriverControlsBase;
import frc.taurus.joystick.XboxController;
import frc.taurus.messages.MessageQueue;

/**
 * This file defines the user controls / button mappings
 */

public class DriverControlsXboxExample extends DriverControlsBase {

    // define the physical controllers that will be used
    private final XboxController driverController;

    public DriverControlsXboxExample(MessageQueue<ByteBuffer> statusQueue, MessageQueue<ByteBuffer> goalQueue) {
        // use Controller.addController() to add controllers to this control method
        Joystick joystick = new Joystick(Constants.ControllerConstants.ControllerConfig1.kDriveControllerPort);  
        driverController = new XboxController(joystick, Constants.ControllerConstants.kDriveDeadband, statusQueue, goalQueue);      
    }

    public double getThrottle() { return driverController.getAxis(XboxController.Axis.L_STICK_Y_AXIS); };
    public double getSteering() { return driverController.getAxis(XboxController.Axis.L_STICK_X_AXIS); };
    public boolean getQuickTurn() { return false; };
    public boolean getLowGear() { return false; };

    public ArrayList<Controller> getControllersList() {
      ArrayList<Controller> controllersList = new ArrayList<Controller>();
      controllersList.add(driverController);
      return controllersList;
    }
}