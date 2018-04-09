package com.testapp.krish.week1day3;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Objects;

/**
 * Created by Krishna on 4/9/2018.
 */
public class Product {
        String Title;
        double price;
        String color;
        String image;
        String itemid;
        String desc;  // Description of the product

        public Product(String title, double price, String color, String image, String itemid, String desc) {
            Title = title;
            this.price = price;
            this.color = color;
            this.image = image;
            this.itemid = itemid;
            this.desc = desc;
        }

        public String getTitle() {
            return Title;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public String getImage() {
            return image;
        }

        public String getItemid() {
            return itemid;
        }

        public String getDesc() {
            return desc;
        }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(Title, product.Title) &&
                Objects.equals(color, product.color) &&
                Objects.equals(image, product.image) &&
                Objects.equals(itemid, product.itemid) &&
                Objects.equals(desc, product.desc);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {

        return Objects.hash(Title, price, color, image, itemid, desc);
    }
}
