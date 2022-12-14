package task;

import java.io.Serializable;

public final class Drink extends MenuItem implements AlcoholAble, Serializable {
    double alcoholVol;
    DrinkTypeEnum type;

    public DrinkTypeEnum getType() {
        return type;
    }
    @Override
    public boolean isAlcoholDrink() {
        if (type.equals(DrinkTypeEnum.Brandy) || type.equals(DrinkTypeEnum.Beer) || type.equals(DrinkTypeEnum.Champagne) || type.equals(DrinkTypeEnum.Jagermeister) || type.equals(DrinkTypeEnum.Liquor) || type.equals(DrinkTypeEnum.Rum) || type.equals(DrinkTypeEnum.Tequila) || type.equals(DrinkTypeEnum.Vermuth) ||  type.equals(DrinkTypeEnum.Wine) || type.equals(DrinkTypeEnum.Whiskey) || type.equals(DrinkTypeEnum.Vodka))
            return true;
        return false;
    }
    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
    public Drink(DrinkTypeEnum typeEnum, double alcoholVol, int cost, String name, String description)
    {
        this.alcoholVol = alcoholVol;
        this.cost = cost;
        this.type = typeEnum;
        this.name = name;
        this.description = description;
    }
}
