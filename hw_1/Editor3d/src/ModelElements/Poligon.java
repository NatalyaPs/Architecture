package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class Poligon {
    public List<Point3D> pounts = new ArrayList<>();

    // вопрос с конструктором не определен. Надо ли принимать один эл-т или нет? 
    // в данном примере добавляем. Это на усмотрение команды

    // конструктор
    public Poligon(Point3D point) {
        pounts.add(point);
        //  и добавляем в PoligonalModel: this.poligons.add(new Poligon(new Point3D()));
    }
}
