package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import static org.firstinspires.ftc.teamcode.HardwareByrd.LIFT_DOWN;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNHOOK;

@Autonomous(name="BlueFarAutoByrd")

public class BlueFarAutoByrd extends AutoByrd {
    private HardwareByrd robot = new HardwareByrd();
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            /*armLeft(LIFT_DOWN);*/
            /*armRight(LIFT_DOWN);*/
           /* hook(UNHOOK);
            sleep(1000);*/
            moveForward (50,.3);
            sleep(1000);
            moveIntake(0200,-.3);
            stopIntakeMoving();
            sleep(1000);
            /*moveForward(300,.5);
            sleep(1000);
            moveBackward(300,.5);
            sleep(1000);
            moveLeft(2000,.5);
            sleep( 1000);
            moveForward(3000, .5);
            sleep( 1000);*/
            moveLeft(3000,.5);
            sleep(1000);
            //moveBackward(3000,.5);
            stopMoving();
        }
    }
}
