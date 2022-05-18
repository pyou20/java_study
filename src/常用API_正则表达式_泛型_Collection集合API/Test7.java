package 常用API_正则表达式_泛型_Collection集合API;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int choice;
        Guest guest=new Guest();
        ArrayList<Goods> goods=new ArrayList<>();
        goods.add(new Goods("001","少林核桃",15.5,"斤"));
        goods.add(new Goods("002","尚康饼干",14.5,"包"));
        goods.add(new Goods("003","移动硬盘",345.0,"个"));
        goods.add(new Goods("004","高清无码",199.0,"G"));

        System.out.println("\t\t欢迎使用超时购物系统");

        Scanner scanner=new Scanner(System.in);

        while(true){
            Menu.displayAction();
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    Goods.displayGoods(goods);
                    Menu.displayTip();
                    guest.buy(goods);
                    continue;

                case 2:
                    Guest.settlement(guest.buyGoods);
                    continue;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("输入有误请重新输入");
                    continue;
            }
        }

    }
}

class Goods {
    private String id,name,unit;
    private double price;
    private double money;
    int num;

    public Goods(String id, String name, String unit, double price, double money, int num) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.money = money;
        this.num = num;
    }

    public Goods(String id, String name, double price, String unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
    }
    public Goods(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getNum() {
        return num;
    }

    public String getUnit() {
        return unit;
    }

    public double getPrice() {
        return price;
    }

    public static void displayGoods(ArrayList<Goods> list){
        System.out.println("------------------------------------------");
        System.out.println("商品id\t商品名称\t商品单价\t计价单位");
        for (Goods goods:list
        ) {
            System.out.println(goods.getId()+"\t\t"
                    +goods.getName()+"\t"
                    +goods.getPrice()+"\t"
                    +goods.getUnit());
        }
        System.out.println("------------------------------------------");
    }
}


class Menu{
    public static void displayAction(){
        System.out.println("请输入你要执行的操作：");
        System.out.println("1、购买商品\t2、结算并打印小票\t3、退出系统");
    }

    public static void displayTip(){
        System.out.println("请输入要购买的商品项（输入格式：商品id-购买数量），输入end表示结束");
    }

    public static void displayErr(){
        System.out.println("你输入的购买格式不对，请换个姿势再来一次（输入格式：商品id-购买数量），输入end表示结束");
    }
}

class Guest{
    public int number;
    public ArrayList<Goods> buyGoods=new ArrayList<>();
    public void buy(ArrayList<Goods> goods){
        Scanner scanner=new Scanner(System.in);
        String[] strs ;
        String value0;
        String id;
        int flag0=0,flag1=0;
        while(true){
            value0=scanner.nextLine();

            if("end".equals(value0)){
                break;
            }else{
                strs=value0.split("-");
                if(strs.length != 2) {
                    System.out.println("你输入的购买姿势不对,请换个姿势再来一次(格式:商品id-购买数量)");
                    continue;
                }
                // 获得商品id
                id = strs[0];

//                System.out.println(i);

                // 获得商品数量
                number = Integer.parseInt(strs[1]);

                flag0=flag1;
                for(int i= goods.size()-1;i>=0;i-- ){
                    if(goods.get(i).getId().equals(id)){
                        flag1++;
                        buyGoods.add(new Goods(goods.get(i).getId(),
                                goods.get(i).getName(),
                                goods.get(i).getUnit(),
                                goods.get(i).getPrice(),
                                number*goods.get(i).getPrice(),
                                number));
                        System.out.println(goods.get(i).getName()+"x"+number+"      已添加");
                    }
                }

                if(flag0==flag1){
                    System.out.println("你的输入不正确或该商品不存在，请重新输入");
                }
            }
        }
    }

    public static void settlement(ArrayList<Goods> list) {
        System.out.println("------------------------------------------");
        if(list.isEmpty()) System.out.println("购物车为空，请添加商品！");
        System.out.println("商品id\t商品名称\t商品单价\t计价单位\t数量\t金额");
        for (Goods goods:list
        ) {
            System.out.println(goods.getId()+"\t\t"
                    +goods.getName()+"\t"
                    +goods.getPrice()+"\t"
                    +goods.getUnit()+"\t\t"
                    +goods.getNum()+"\t"
                    +goods.getPrice()*goods.getNum());
        }
        System.out.println("------------------------------------------");
    }
}
