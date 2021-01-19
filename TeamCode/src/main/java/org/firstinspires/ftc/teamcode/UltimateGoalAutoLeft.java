package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.HardwareByrd.UNARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNPUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNGRAB;
import static org.firstinspires.ftc.teamcode.HardwareByrd.ARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.PUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.GRAB;


@Autonomous(name="UltimateGoalAutoLeft")

public class UltimateGoalAutoLeft extends AutoByrd {
    @Override
    public void runOpMode() {
        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            /* lift(LIFT_DOWN);*/
            //hook(UNHOOK);
            //*this is where all of your commands and functions go in order*/

            moveForward(3500,0.5);
            sleep(0500);
            moveRight(3000,0.5);
            sleep(0500);
            push(PUSH);
            sleep(0500);
            //moveAxle(0500,2);
            moveOuttake(3000,2);
            sleep(0500);
            moveForward(1000,0.5);
            sleep(0500);
            stopMoving();
        }
    }
}
