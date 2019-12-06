package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.HardwareByrd.LIFT_DOWN;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNHOOK;


@Autonomous(name="BlueCloseAutoByrd")

public class BlueCloseAutoByrd extends AutoByrd {
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            /*armLeft(LIFT_DOWN);
            armRight(LIFT_DOWN);
            hook(UNHOOK);*/
            moveForward (50,.3);
            sleep(1000);
            moveIntake(0200,-.3);
            stopIntakeMoving();
            sleep(1000);
            /*moveForward(300,.5);
            sleep(1000);
            moveBackward(300,.5);
            sleep(1000);*/
            moveRight(2000,.5);
            stopMoving();
        }
    }
}
