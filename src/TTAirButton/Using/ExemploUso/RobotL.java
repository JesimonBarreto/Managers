/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TTAirButton.Using.ExemploUso;

import Manager.Action.VirtualAction;
import Manager.Gesture.Man.ManagerGA;
import Manager.Panel.MyscreenPanel;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Geral
 */
public class RobotL extends VirtualAction {

    @Override
    public void run(MyscreenPanel sp, ManagerGA gerente) {
        Robot r;
        try {
            r = new Robot();
            r.keyPress(KeyEvent.VK_LEFT);
            r.keyRelease(KeyEvent.VK_LEFT);
        } catch (AWTException ex) {
            System.out.println("erro");
        }
    }
}
