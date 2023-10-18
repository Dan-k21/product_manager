package manager;

import dao.ReadAndWriteProductList;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManger implements IManager<Product> {
    List<Product> productList;
    ReadAndWriteProductList readAndWriteProductList = new ReadAndWriteProductList();

    public ProductManger() {
        this.productList = readAndWriteProductList.readFile();
    }

    @Override
    public boolean add(Product product) {
        this.productList.add(product);
        readAndWriteProductList.writeFile(this.productList);
        return true;
    }

    @Override
    public boolean edit(int id, Product newProduct) {
        int index = findById(id);
        if (index == -1) {
            return false;
        }
        this.productList.set(index, newProduct);
        readAndWriteProductList.writeFile(this.productList);
        return true;
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        if (index == -1) {
            return false;
        }
        this.productList.remove(index);
        readAndWriteProductList.writeFile(this.productList);
        return true;
    }

    @Override
    public List<Product> showAll() {
        return this.productList;
    }

    public int findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
