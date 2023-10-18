package view;

import input.Input;
import manager.ProductManger;
import model.Product;

import java.security.Signature;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private ProductManger listProduct = new ProductManger();

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("----Quản lý sản phẩm----\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa sản phẩm\n" +
                    "3. Xoá sản phẩm\n" +
                    "4. Hiển thị các sản phẩm\n" +
                    "0. Thoát\n");
            System.out.print("Nhập lựa chọn: ");
            choice = Input.getInputInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showDeleteMenu();
                    break;
                case 4:
                    showProductList();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("----Thêm sản phẩm----");
        System.out.print("Nhập tên: ");
        String name = Input.getInputString();
        System.out.print("Nhập số lượng: ");
        int quantity = Input.getInputInt();
        System.out.print("Nhập giá: ");
        int price = Input.getInputInt();
        System.out.print("Nhập loại: ");
        String category = Input.getInputString();
        Product products = new Product(name, quantity, price, category);
        listProduct.add(products);
    }

    public void showProductList() {
        System.out.println("----Danh sách sản phẩm----");
        List<Product> list = listProduct.showAll();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void showMenuEdit() {
        System.out.println("----Sửa sản phẩm----");
        System.out.print("Nhập ID muốn sửa: ");
        int id = Input.getInputInt();
        System.out.print("Nhập tên: ");
        String name = Input.getInputString();
        System.out.print("Nhập số lượng: ");
        int quantity = Input.getInputInt();
        System.out.print("Nhập giá: ");
        int price = Input.getInputInt();
        System.out.print("Nhập loại: ");
        String category = Input.getInputString();
        Product product = new Product(id, name, quantity, price, category);
        listProduct.edit(id, product);
    }

    public void showDeleteMenu() {
        System.out.println("-----Xoá sản phẩm----");
        System.out.println("Nhập ID muốn xoá: ");
        int id = Input.getInputInt();
        listProduct.delete(id);
    }
}
