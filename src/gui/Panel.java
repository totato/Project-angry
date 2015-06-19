/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;

/**
 *
 * @author Toast
 */
public interface Panel {
    public void disableButtons();
    public void switchTo() throws Exception;
    public void switchFrom() throws Exception;
}
