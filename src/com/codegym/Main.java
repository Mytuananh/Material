package material;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Material material = new CrispyFlour("12", "A", 12, 10);
    Material material1 = new CrispyFlour("34", "B", 13, 15);
    Material material2 = new CrispyFlour("56", "C", 14, 20);
    Material material3 = new CrispyFlour("78", "D", 15, 25);
    Material material4 = new CrispyFlour("910", "E", 16, 30);
    Material material5 = new Meat("1112", "F", 20, 1);
    Material material6 = new Meat("1314", "G", 21, 2);
    Material material7 = new Meat("1516", "H", 22, 3);
    Material material8 = new Meat("1718", "I", 23, 4);
    Material material9 = new Meat("1920", "K", 24, 5);
        List<Material> materialList = new ArrayList<>();
        MaterialManager materialManager = new MaterialManager();
        materialManager.setMaterialList(materialList);
        materialList.add(material);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material1);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material2);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material3);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material4);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material5);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material6);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material7);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material8);
        System.out.println(materialManager.getRealMoney());

        materialList.add(material9);
        System.out.println(materialManager.getRealMoney());

    }
}
