/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gui.MainGUI;
import gui.WindowProperties;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Toast
 */
public class StoryHandler {
    
    private int aktStory;
    private int maxStorypart;
    private int aktStorypart;
    
    public void setStory(int storynr) throws IOException{
        
        aktStory = storynr;
        aktStorypart = 0;
        maxStorypart = Game.getMaxStoryPart(storynr);
        MainGUI.getAktMainGUI().getStoryPanel1().setChapterNumber(storynr);
    }
    
    public boolean nextPart() throws IOException{
        if(aktStorypart < maxStorypart){
            aktStorypart++;
            MainGUI.getAktMainGUI().getStoryPanel1().setScene(aktStory, aktStorypart);
        }
        return false;
    }
    
}