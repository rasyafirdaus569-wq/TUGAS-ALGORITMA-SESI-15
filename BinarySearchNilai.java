public class BinarySearchNilai {

    public static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        int langkah = 0;

        while (low <= high) {
            langkah++;
            int mid = (low + high) / 2;

            if (data[mid] == key) {
                System.out.println("Jumlah langkah pencarian: " + langkah);
                return mid;
            } else if (key < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Jumlah langkah pencarian: " + langkah);
        return -1;
    }

    public static void main(String[] args) {

        // a. Array nilai terurut
        int[] nilai = {60, 65, 70, 75, 80, 85, 90};
        int cari = 80;

        // b. Proses pencarian dengan Binary Search
        int hasil = binarySearch(nilai, cari);

        // c. Menampilkan hasil
        if (hasil != -1) {
            System.out.println("Nilai ditemukan pada indeks ke- " + hasil);
            System.out.println("Status: Ditemukan");
        } else {
            System.out.println("Nilai tidak ditemukan");
            System.out.println("Status: Tidak ditemukan");
        }
    }
}
