package ctrl;

import ihm.Ihm;
import wrk.Wrk;

public class Ctrl {

    public Ctrl() {
        refWrk = null;
        refIhm = null;
    }

    public void start() {
        refIhm.start();
    }

    public void additionne( int a, int b ) {
        int result = refWrk.additionne( a, b );
        if ( result % 2 == 0 ) {
            refIhm.afficheVert( a + " + " + b + " = " + result );
        } else {
            refIhm.afficheBleu( a + " + " + b + " = " + result );
        }
    }

    public void setRefWrk( Wrk refWrk ) {
        this.refWrk = refWrk;
    }

    public void setRefIhm( Ihm refIhm ) {
        this.refIhm = refIhm;
    }

    public Ihm getRefIhm() {
        return refIhm;
    }

    public Wrk getRefWrk() {
        return refWrk;
    }

    private Wrk refWrk;
    private Ihm refIhm;
}
