package org.firstinspires.ftc.teamcodeBellatorum;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

class BellatorumHardware19 {
    //drive motors
    DcMotor  frontRight = null;
    DcMotor  frontLeft = null;
    DcMotor  backRight = null;
    DcMotor  backLeft = null;

    //arm servos
    CRServo armLeft;
    CRServo armRight;

    Servo clawLeft;
    Servo clawRight;

    public BellatorumHardware19(){

    }


    void init(HardwareMap ahwMap) {
        // Save reference to Hardware map

        HardwareMap hwMap;

        hwMap = ahwMap;

        // Define and Initialize Motors
        frontRight = hwMap.get(DcMotor.class, "fr");
        frontLeft = hwMap.get(DcMotor.class, "fl");
        backRight = hwMap.get(DcMotor.class, "br");
        backLeft = hwMap.get(DcMotor.class, "bl");

        frontRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.FORWARD);

        //Define and initialise arm servos
        armLeft = hwMap.get(CRServo.class, "al");
        armRight = hwMap.get(CRServo.class, "ar");
        clawLeft = hwMap.get(Servo.class, "cl");
        clawRight = hwMap.get(Servo.class, "cr");





        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        // Set all motors to zero power
        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);


    }
}