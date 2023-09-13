public class LinFun {
    private double getB;
    private double getM;

    public LinFun()
    {
        getB = 0.0;
        getM = 0.0;
    }

    public LinFun(double m, double b)
    {
        getM = m;
        getB = b;
    }

    public void setM(double m)
    {
        getM = m;
    }

    public double getM()
    {
        return getM;
    }

    public void setB(double b)
    {
        getB = b;
    }

    public double getB()
    {
        return getB;
    }

    public double calcY(double x)
    {
        return (getM()*x)+getB();
    }


    // The last step/instruction is unclear
    // Do you want me to output the y=mx+b as the value?
    @Override
    public String toString() {
        return "LinFun{" +
                "getB=" + getB +
                ", getM=" + getM +
                '}';
    }
}
