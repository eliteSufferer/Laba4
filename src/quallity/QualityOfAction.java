package quallity;

public enum QualityOfAction {
    QUICKLY(" быстро"),
    HAPPILY(" радостно"),
    RELIEF(" вздох облегчения"),
    FURIOUS(" бешено"),
    OVERSTAIN(" надрывается");

    private String qa;
    QualityOfAction(String qa){
        this.qa = qa;
    }
    public String getQa(){
        return this.qa;
    }
}
