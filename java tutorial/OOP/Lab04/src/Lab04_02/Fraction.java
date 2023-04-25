package Lab04_02;
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return String.valueOf(topN) + "/" + String.valueOf(btmN);
    }
    public String toFloat() {
        return String.valueOf((double)(topN) / (double)(btmN));
    }
    public void addFraction(Fraction f) {
        int topNf = f.topN;
        int btmNf = f.btmN;
        if (btmN == btmNf) {
            topN = topN + topNf;
        } else {
            topN = topN * btmNf + topNf * btmN;
            btmN = btmN * btmNf;
        }
    }
    public boolean myEquals(Fraction x) {
        int topNf = x.topN;
        int btmNf = x.btmN;
        if ((double)(topN) / (double)(btmN) == (double)(topNf) / (double)(btmNf)) {
        } else {
           return false;
        }
        return true;
    }
    public void LowestTermFrac() {
        if (btmN % topN == 0) {
            btmN = btmN / topN;
            topN = topN / topN;
        }
    }
}
