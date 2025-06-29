class Main{
    public static void main(String[] args) {
        Order[] order = {
            new Order(101, "John", 5000),
            new Order(102, "Mike", 3003),
            new Order(103, "Alex", 7500),
            new Order(104, "Mary", 2500),
            new Order(105, "Rose", 6300)
        };

        // Implementation of Bubble Sort by total price
        System.out.println("Sorting using Bubble Sort");
        Order[] res = bubbleSort(order);
        for(Order o: res){
            System.out.println(o);
        }
        System.out.println();
        System.out.println("Sorting using Quick Sort");
        //Implementation of Quick Sort by total price
        res = quickSort(order);
        for(Order o: res){
            System.out.println(o);
        }
    }

    public static Order[] bubbleSort(Order[] order) {
        Order[] arr = order.clone(); 
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].totalPrice > arr[j + 1].totalPrice) {
                    // swap
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static Order[] quickSort(Order[] order) {
        Order[] arr = order.clone(); 
        quickSortMain(arr, 0, arr.length - 1);
        return arr;
    }

    public static void quickSortMain(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortMain(arr, low, pi - 1);
            quickSortMain(arr, pi + 1, high);
        }
    }

    public static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice < pivot) {
                i++;
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}