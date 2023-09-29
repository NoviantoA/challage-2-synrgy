import java.util.ArrayList;
import java.util.List;

public class Pesan {
    private List<MenuItem> items = new ArrayList<>();

    public void tambahItem(MenuItem item){
        items.add(item);
    }

    public void hapusItem(MenuItem item){
        items.remove(item);
    }

    public List<MenuItem> getItems(){
        return items;
    }

    public int hitungTotalHarga(){
        int totalHarga = 0;
        for (MenuItem item : items){
            totalHarga = totalHarga + item.getTotalHarga();
        }
        return totalHarga;
    }
}
