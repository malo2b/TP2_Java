package com.ex1;

public class Generique<E> {

    private E element1;
    private E element2;

    /**
     * Constructeur
     * Deux éléments doivent être de type différents
     * @param element1 Premier élément du tuple
     * @param element2 Deuxieme élément du tuple
     * @throws NotHeterogeneousTypeException Exception si tentative d'ajout de deux éléments de meme type
     */
    public Generique(E element1, E element2) throws NotHeterogeneousTypeException {
        if (element1.getClass() != element2.getClass()) {
            this.element1 = element1;
            this.element2 = element2;
        } else {
            throw new NotHeterogeneousTypeException("Les deux éléments doivent être de type différents");
        }
    }

    /**
     * Constructeur
     * Pour un seul élément
     * @param element1 Premier élément du tuple
     */
    public Generique(E element1) {
        this.element1 = element1;
        this.element2 = null;
    }

    /**
     * Constructeur
     * Sans saisie de valeur a la construction
     */
    public Generique() {
        element1 = null;
        element2 = null;
    }

    /**
     * Ajout d'un élément dans le tuple
     * @param element Element a ajouter
     * @throws NotHeterogeneousTypeException Exception si tentative deux éléments de meme type dans le tuple
     */
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

    public E getElement1() { return element1; }

    public E getElement2() {
        return element2;
    }

    /**
     * Mutateur élément 1
     * @param element Nouvelle valeur de l'élément
     * @throws NotHeterogeneousTypeException Exception si nouvelle valeur possède un type identique a celui de l'aitre élément du tuple
     */
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

    /**
     * Mutateur élément 2
     * @param element Nouvelle valeur de l'élément
     * @throws NotHeterogeneousTypeException Exception si nouvelle valeur possède un type identique a celui de l'aitre élément du tuple
     */
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
