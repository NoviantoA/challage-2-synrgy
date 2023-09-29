import lombok.Getter;

@Getter
public class MenuItem {
    private String nama;
    private double harga;
    private int jumlah;

    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = 0;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotalHarga() {
        return (int) (harga * jumlah);
    }
}
