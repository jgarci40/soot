package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class ctxt extends Attribute {
    public Numberer numberer() { return Scene.v().getContextNumberer(); }
    
    public static Attribute v() { return ctxt.instance; }
    
    private static Attribute instance = new ctxt();
    
    public ctxt() { super(); }
}
