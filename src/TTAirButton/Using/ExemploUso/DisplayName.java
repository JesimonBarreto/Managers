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
 * @author JB
 */
public class DisplayName extends VirtualAction {

    @Override
    public void run(MyscreenPanel sp, ManagerGA gerente) {
        System.out.println("Selected");
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException ex) {
        }
        r.keyPress(KeyEvent.VK_KP_RIGHT);
        r.keyRelease(KeyEvent.VK_KP_RIGHT);
    }
}
