package Week1.DataStructureAndAlgorithm.Excercise3;

import java.util.Arrays;
import java.util.Comparator;

public class SearchService {
    // O(n) time complexity
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetId)) {
                return product;
            }
        }
        return null;
    }

    // O(log n) time complexity
    public static Product binarySearch(Product[] sortedProducts, String targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedProducts[mid].getProductId().compareTo(targetId);

            if (comparison == 0) {
                return sortedProducts[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId));
    }
}