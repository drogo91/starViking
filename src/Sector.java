import java.awt.*;
import java.util.*;

public class Sector {
    private char wealth;
    private String type;
    private String mod_type;        //inutile car le nom du secteur le précise déjà
    private int mod_nbr;
    private boolean capital;
    private int x;
    private int y;
    private int largeur;
    private Color couleur;
    private int trait;
    private int angleDebut;
    private int angleFin;
    private ArrayList<Link> theLinks;
    private Panel panel;
    private Unit unite;

    public Sector (char wealth, String type, /*String mod_type,*/ int mod_nbr,boolean capital, int _x, int _y, int _larg, Color _couleur, int _trait, int _angleDebut, int _angleFin){
        this.wealth = wealth;
        this.type = type;
        //this.mod_type = mod_type;
        this.mod_nbr = mod_nbr;
        this.capital = capital;
        this.x = _x;
        this.y = _y;
        theLinks = new ArrayList<Link>();
        this.largeur = _larg;
        this.couleur = _couleur;
        this.trait = _trait;
        this.angleDebut = _angleDebut;
        this.angleFin = _angleFin;
    }

    public Sector(){}

    public char getWealth() {
        return wealth;
    }

    public void setWealth(char wealth) {
        this.wealth = wealth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMod_type() {
        return mod_type;
    }

    public void setMod_type(String mod_type) {
        this.mod_type = mod_type;
    }

    public int getMod_nbr() {
        return mod_nbr;
    }

    public void setMod_nbr(int mod_nbr) {
        this.mod_nbr = mod_nbr;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Link> getTheLinks() {
        return theLinks;
    }

    public void setTheLinks(ArrayList<Link> theLinks) {
        this.theLinks = theLinks;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int _largeur) {
        this.largeur = _largeur;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color _couleur) {
        this.couleur = _couleur;
    }

    public int getTrait() {
        return trait;
    }

    public void setTrait(int _trait) {
        this.trait = _trait;
    }
    public int getAngleDebut() {
        return angleDebut;
    }

    public void setAngleDebut(int _angleDebut) {
        this.angleDebut = _angleDebut;
    }
    public int getAngleFin() {
        return angleFin;
    }

    public void setAngleFin(int _angleFin) {
        this.angleFin = _angleFin;
    }

    /*public Button getBouton() {
        return bouton;
    }

    public void setBouton(Button _bouton) {
        this.bouton = _bouton;
    }*/

    public Unit getUnite() {
        return unite;
    }

    public void setUnite(Unit unite) {
        this.unite = unite;
    }

    // methodes

    public void addLink(Link aLink){
        theLinks.add(aLink);
    }

    public Link getALink(Link lien)
    {
        //(this.theLinks.contains(lien))
        return theLinks.get(theLinks.indexOf(lien));
    }
}
