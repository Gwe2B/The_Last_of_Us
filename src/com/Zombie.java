package com;

/**
 * @author Gwenael
 * @version 1.0
 */
public class Zombie extends Personnage{
    /**
     * @see The Personnage constructor
     */
    public Zombie(String nom, int pV, int pA, String description) {
        super(nom, pV, 0, pA, description);// 0 remplace pr
    }
}
