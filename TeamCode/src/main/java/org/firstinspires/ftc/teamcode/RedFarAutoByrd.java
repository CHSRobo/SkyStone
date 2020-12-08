package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import static org.firstinspires.ftc.teamcode.HardwareByrd.UNARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNPUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.UNGRAB;
import static org.firstinspires.ftc.teamcode.HardwareByrd.ARM;
import static org.firstinspires.ftc.teamcode.HardwareByrd.PUSH;
import static org.firstinspires.ftc.teamcode.HardwareByrd.GRAB;

@Autonomous(name="RedFarAutoByrd")

public class RedFarAutoByrd extends AutoByrd{
    private HardwareByrd robot = new HardwareByrd();
    @Override
    public void runOpMode() {

        autonomousInit();
        waitForStart();
        autonomousStart();
        if (!isStopRequested()) {
            /*armLeft(LIFT_DOWN);
            armRight(LIFT_DOWN);
            hook(UNHOOK);
            sleep(1000);*/
            moveForward (50,.3);
            sleep(1000);
            sleep(1000);
            /*moveForward(300,.5);
            sleep(1000);
            moveBackward(300,.5);
            sleep(1000);
            moveRight(2000,.5);
            sleep( 1000);
            moveForward(3000, .5);
            sleep( 1000);*/
            moveRight(3000,.5);
            sleep(1000);
            //moveBackward(3000,.5);
            stopMoving();
       }
    }
}
