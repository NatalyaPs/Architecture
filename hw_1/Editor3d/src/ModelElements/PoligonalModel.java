package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

// модель полигона
public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    // в конструкторе текстуры получаем снаружи, т.к. отношение агрегации, а полигон создаем внутри, т.к. отнош.компонентности
    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = textures;

        // отношение компонентности(внутри в конструкторе) 1..* => добавляем один. И new Point3D(), т.к. в конструкторе Poligon добавляли элемент 
        this.poligons.add(new Poligon(new Point3D()));
    }


}
