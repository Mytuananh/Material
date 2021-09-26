package material;

import material.CrispyFlour;
import material.Discount;
import material.Material;

import java.time.LocalDate;
import java.util.List;

public  class MaterialManager implements Discount {
    private List<Material> materialList;

    public MaterialManager() {
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
    public void addMaterial(Material material) {
        materialList.add(material);
    }

    public void deleteMaterial() {
        for (Material material : materialList ) {
            materialList.remove(material);
        }
    }

    public void fixMaterial(Material newMaterial) {
        for (Material material : materialList) {
            material = newMaterial;
        }
    }

    @Override
    public double getRealMoney() {
        double money = 0;
        for (Material material : materialList) {
            if (material instanceof Meat) {
                if((material.getExpiryDate()).isAfter(LocalDate.now().plusDays(5))) {
                    money = (material.getAmount()) -(((material.getAmount() * 10)/100) + ((material.getAmount() * 30)/100));
                }
                else if ((material.getExpiryDate()).isAfter(LocalDate.now().plusDays(3))) {
                   money = (material.getAmount()) -(((material.getAmount() * 10)/100) + ((material.getAmount() * 50)/100));
                }
            }
            if (material instanceof CrispyFlour) {
                if ((material.getExpiryDate()).isAfter(LocalDate.now().plusMonths(4))) {
                    money = (material.getAmount()) -(((material.getAmount() * 5)/100) + ((material.getAmount() * 20)/100));
                }
                else if ((material.getExpiryDate()).isAfter(LocalDate.now().plusMonths(2))) {
                    money = (material.getAmount()) -(((material.getAmount() * 5)/100) + ((material.getAmount() * 40)/100));
                }
            }
        }
        return money;
    }
}
