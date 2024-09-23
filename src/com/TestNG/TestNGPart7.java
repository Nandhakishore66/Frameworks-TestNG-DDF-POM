package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPart7 {
    /*
    Grouping concept
    Scenario : A big basket having a different kind of mobiles let us say there are apple phones, Moto, Vivo
    and lenovo. I want to run tests only for vivo and moto phones. write a program
     */
    /*
     1. For running only apple and moto I should not do a silly thing like using enabled = false for vivo
        and lenovo.
     2. I should be it in a proper manner becoz if it is a large case it would be difficult right. so i
        have to use a parameter named group.
     3. control + shift + Forward slash to comment the line in the xml
     4. In that xml we can use both include and exclude why exclude ? Consider we have 100 test out of that
        we have to run 99 instead of giving 99 include we can add 1 exclude. below test we have add to groups tag
     */
    @Test(groups = {"Apple"})
    public void apple1() {
        System.out.println("Apple testing");
    }
    @Test(groups = {"Apple"})
    public void apple2() {
        System.out.println("Apple testing");
    }
    @Test(groups = {"Vivo"})
    public void viv1() {
        System.out.println("vivo testing");
    }
    @Test(groups = {"Vivo"})
    public void viv2() {
        System.out.println("vivo testing");
    }
    @Test(groups = {"Moto"})
    public void moto1() {
        System.out.println("Moto testing");
    }
    @Test(groups = {"Moto"})
    public void moto2() {
        System.out.println("Moto testing");
    }
    @Test(groups = {"lenovo"})
    public void lenovo1() {
        System.out.println("lenovo testing");
    }
    @Test(groups = {"lenovo"})
    public void lenovo2() {
        System.out.println("Lenovo testing");
    }

}
