/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsa;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio /*extends Applet*/{
    
    public Audio(){
        /*AudioClip music=getAudioClip(getDocumentBase(), "audio.wma");

        music.play();

        music.stop();

        music.loop();*/
        try {
            // Usa URL (invece di File) per leggere dal disco.
            File fileSuono = new File("C:\\Documents and Settings\\studente.MAT15\\Documenti\\NetBeansProjects\\TPSIT_4\\corsa\\Corsa\\src\\corsa\\audio.wma");
            // Crea uno stream d'input audio dal file del suono.
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(fileSuono);
            // Ottieni il clip.
            Clip clip = AudioSystem.getClip();
            // Apri l'audio del clip.
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    
}
