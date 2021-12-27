package com.ex1;

public class Generique<E> {

    private E element1;
    private E element2;

    public Generique(E element1, E element2) throws NotHeterogeneousTypeException {
        if (element1.getClass() != element2.getClass()) {
            this.element1 = element1;
            this.element2 = element2;
        } else {
            throw new NotHeterogeneousTypeException("Les deux éléments doivent être de type différents");
        }
    }

    public Generique(E element1) {
        this.element1 = element1;
        this.element2 = null;
    }

    public Generique() {
        element1 = null;
        element2 = null;
    }

    public void setAnElementValue(E element) throws NotHeterogeneousTypeException {
        if (element1 == null) {
            element1 = element;
        } else if (element2 == null) {
            if (element.getClass() != element1.getClass()) {
                element2 = element;
            } else {
                throw new NotHeterogeneousTypeException("Les deux éléments de l'objet doivent être de type différents");
            }
        } else {
            throw new UnsupportedOperationException("Les valeurs des deux éléments de l'objet ont déjà été attribuées");
        }
    }

    public E getElement1() {
        return element1;
    }

    public E getElement2() {
        return element2;
    }

    public void setElement1(E element) throws NotHeterogeneousTypeException {
        if (element2 != null) {
            if (element2.getClass() != element.getClass()) {
                this.element1 = element;
            } else {
                throw new NotHeterogeneousTypeException("Les deux éléments de l'objet doivent être de type différents");
            }
        } else {
            this.element1 = element;
        }
    }

    public void setElement2(E element) throws NotHeterogeneousTypeException {
        if (element1 != null) {
            if (element1.getClass() != element.getClass()) {
                this.element2 = element;
            } else {
                throw new NotHeterogeneousTypeException("Les deux éléments de l'objet doivent être de type différents");
            }
        } else {
            this.element2 = element;
        }
    }

    @Override
    public String toString() {
        String toStringText = "Generique { ";
        if (element1 != null) {
            toStringText += "element1(" + element1.getClass() + ") = " + element1 + "  ";
        } else {
            toStringText += "element1 = null  ";
        }
        if (element2 != null) {
            toStringText += "element2(" + element2.getClass() + ") = " + element2;
        } else {
            toStringText += "element2 = null";
        }
        toStringText += " }";

        return toStringText;
    }
}
