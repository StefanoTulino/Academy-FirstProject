package com.corso.git0;

public class Alianti extends AereoMobile {

    private int efficienza;

    public Alianti(String sigla, int efficienza) {
        super(sigla);
        this.efficienza = efficienza;
    }

    public int getEfficienza() {
        return efficienza;
    }

    public void setEfficienza(int efficienza) {
        this.efficienza = efficienza;
    }


    @Override
    public int compareToAir(AereoMobile o) {
        Alianti alianti= (Alianti) o;
        if(!(o instanceof Alianti)) {
            return -2;
        }

        if(this.efficienza> ((Alianti) o).getEfficienza())
            return 1;
            else if(this.efficienza < ((Alianti) o).getEfficienza())
                return -1;

            else return 0;
    }

    //fare override
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //fare override
    @Override
    public String toString() {
        return super.toString();
    }
}
