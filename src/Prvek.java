public class Prvek {
    int hodnota;
    Prvek dalsiPrvek;

    public Prvek(int hodnota, Prvek dalsiPrvek) {
        this.hodnota = hodnota;
        this.dalsiPrvek = dalsiPrvek;
    }
}