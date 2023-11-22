/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author nenod
 */
public class Circulo extends FiguraGrafica {
 
    protected int x;
    protected int y;
    protected int diametro;

    public Circulo (int x, int y, int diametro) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
    }
    @Override
    public void dibujar(Graphics g) {
    g.drawOval(x, y, diametro, diametro);
    }

    @Override
    public void encojer(Graphics g) {
        diametro -= 5;
        if (diametro < 5) diametro = 5;
        this.dibujar(g);        
    }
    
    @Override
    public void agrandar(Graphics g) {
        diametro += 5;
        if (diametro > 200) diametro = 200;
        this.dibujar(g);
    }
    
    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }
    
    @Override
    public void mover(Graphics g, String direccion){
        switch(direccion){
            case "arriba"    : y-=5; break;
            case "abajo"     : y+=5; break;
            case "izquierda" : x-=5; break;
            case "derecha"   : x+=5; break;
        }
        this.dibujar(g);
    }    
}
