package ru.mirea.task5;

import java.util.Scanner;

public class FurnitureShop
{
    public static void main(String args[])
    {
        int typeOfFurniture;
        int ans, ansProduct, countOfProduct, i = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String t1="",c1="",t2="",c2="",t3="",c3="";
        int cao1=0,cao2=0,cao3=0;
        System.out.println("Press 0 if u dont want to make some purchases otherwise press 1");
        ans = sc.nextInt();
        if(ans == 1)
        {
            System.out.println("And now you must to choose what products you want to buy\n1)Chair\n2)Chest\n3)Table\n0)Exit");
            typeOfFurniture = sc.nextInt();
            while(typeOfFurniture != 0)
            {
                if(i>0)
                {
                    System.out.println("If you want to continue shopping, then select the product category, otherwise enter 0");
                    typeOfFurniture = sc1.nextInt();
                }
                i++;
                switch (typeOfFurniture)
                {
                    case 1:
                        System.out.println("Choose the title, color and number of chairs that you want to purchase");
                        System.out.print("title-");
                        t1 = sc1.nextLine();
                        System.out.print("color-");
                        c1 = sc1.nextLine();
                        System.out.print("count of chairs-");
                        cao1 = sc1.nextInt();
                        break;
                    case 2:
                        System.out.println("Choose the title, color and number of chests that you want to purchase");
                        System.out.print("title-");
                        t2 = sc2.nextLine();
                        System.out.print("color-");
                        c2 = sc2.nextLine();
                        System.out.print("count of chests-");
                        cao2 = sc2.nextInt();
                        break;
                    case 3:
                        System.out.println("Choose the title, color and number of tables that you want to purchase");
                        System.out.print("title-");
                        t3 = sc3.nextLine();
                        System.out.print("color-");
                        c3 = sc3.nextLine();
                        System.out.print("count of tables-");
                        cao3 = sc3.nextInt();
                        break;
                    case 0:
                        System.out.println("Purchases are over");
                        break;
                }
            }
            System.out.println("Your shopping cart:");

            Chair chair = new Chair(t1,c1,cao1);
            Chest chest = new Chest(t2,c2,cao2);
            Table table = new Table(t3,c3,cao3);
            if(cao1!=0){chair.showInfo();}
            if(cao2!=0){chest.showInfo();}
            if(cao3!=0){table.showInfo();}
        }
    }
}
