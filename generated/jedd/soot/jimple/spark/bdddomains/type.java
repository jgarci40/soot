package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class type extends Attribute {
    public Numberer numberer() { return Scene.v().getTypeNumberer(); }
    
    public static Attribute v() { return type.instance; }
    
    private static Attribute instance = new type();
    
    public type() { super(); }
}
