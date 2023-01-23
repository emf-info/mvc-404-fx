package wrk;

import ctrl.Ctrl;

public class Wrk {

    public Wrk() {
        refCtrl = null;
    }

    public int additionne( int a, int b ) {
        return a + b;
    }

    public void setRefCtrl( Ctrl refCtrl ) {
        this.refCtrl = refCtrl;
    }

    public Ctrl getRefCtrl() {
        return refCtrl;
    }

    private Ctrl refCtrl;
}
