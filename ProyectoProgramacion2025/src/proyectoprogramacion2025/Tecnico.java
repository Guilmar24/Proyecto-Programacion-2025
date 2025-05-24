/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion2025;

/**
 *
 * @author kinch
 */
public abstract class Tecnico extends Persona {
    private String nombre;
    private String id;

    public Tecnico(String nombre, String id) {
        super(nombre, id);
        this.nombre = nombre;
        this.id = id;
    }
    
    
}
