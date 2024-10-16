/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask10arrays;

/**
 *
 * @author RC_Student_lab
 */

/*
Create an array with the following elements {200, 350, 700, 400} 
create another array with the following elements prices 
{"Shirt", "Pants", "Sneakers", "Jacket"}. Calculate the sum of all the elements
in price also calculate the average of the elements. Get the minimum price and
the maximum price. Get the item with the highest price.
*/
public class IceTask10Arrays {

    public static void main(String[] args) {
        //Initialize variables for price and items array and their lengths
        int[] price = {200, 350, 700, 400};
        int priceLength = price.length;
        String[] items = {"Shirt", "Pants", "Sneakers", "Jacket"};
        int itemsLength = items.length;
        
        //Initialize 
        int priceSum = 0;
        float average = 0;
        int min = price[0];
        int max = priceLength - 1;
        for(int i = 0; i < priceLength; i++){
        
            priceSum = priceSum + price[i];
            average = priceSum / priceLength;
            if (min > price[i]){
                min = price[i];
            } else if (max < price[i]){
                max = price[i];
                System.out.println("The item with the highest price is " + items[i] + " which costs R" + max);  
            }
            
        }
        System.out.println("Sum of prices: R" + priceSum);
        System.out.println("Average of prices: R" + average);
        System.out.println("Lowest price is: R" + min);
        System.out.println("Highest price is: R " + max);
        
    }
}
