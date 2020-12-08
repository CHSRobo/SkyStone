package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.HardwareByrd.UNARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNPUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNGRAB;
import static org.firstinspires.ftc.teamcode.HardwareByrd.ARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.PUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.GRAB;


@Autonomous(name="RedCloseAutoByrd")

public class RedCloseAutoByrd extends AutoByrd {
    HardwareByrd robot = new HardwareByrd();
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            //hook(UNHOOK);
            moveForward (50,.3);
            sleep(1000);
            sleep(1000);
            /*moveForward(300,.5);
            sleep(1000);
            moveBackward(300,.5);
            sleep(1000);*/
            moveLeft(2000,.5);
            stopMoving();
        }
    }
}
