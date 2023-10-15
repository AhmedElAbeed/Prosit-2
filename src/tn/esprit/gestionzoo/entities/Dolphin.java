package tn.esprit.gestionzoo.entities;

class Dolphin extends Aquatic {
        float swimmingSpeed;

public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
        }

@Override
public void swim() {
        System.out.println("This dolphin is swimming.");
        }

@Override
public String toString() {
        return "Dolphin [" + super.toString() + ", Swimming Speed: " + swimmingSpeed + "]";
        }
        }

