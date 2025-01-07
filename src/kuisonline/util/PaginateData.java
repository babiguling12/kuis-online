/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisonline.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUF GAMING
 */
public class PaginateData {

    public static <T> List<T> paginateList(List<T> data, int pageNumber, int pageSize) {
        int fromIndex = (pageNumber - 1) * pageSize;
        int toIndex = Math.min(fromIndex + pageSize, data.size());

        if (fromIndex >= data.size() || fromIndex < 0) {
            return new ArrayList<>(); // Mengembalikan list kosong jika nomor halaman tidak valid
        }

        return data.subList(fromIndex, toIndex);
    }
    
    public static int getTotalPages(int totalData, int pageSize) {
        return (int) Math.ceil((double) totalData / pageSize);
    }
}
