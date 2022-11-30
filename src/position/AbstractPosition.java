package position;

import characters.AbstractCharacter;

public abstract class AbstractPosition {
    private String posotion;

    public AbstractPosition(String name){
        this.posotion = name;
    }

    public String getPosition(){
        return this.posotion;
    }

    @Override
    public int hashCode(){
        return(posotion != null ? posotion.hashCode() : 0);
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if(o == null || getClass() != o.getClass()) return false;
        AbstractPosition pos = (AbstractPosition) o;
        return (posotion == pos.posotion);
    }

}
