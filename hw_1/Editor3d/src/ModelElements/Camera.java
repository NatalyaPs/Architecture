package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {
    // поля в единичном экземпляре - как в источнике света (Flash)
    public Point3D location;
    public Angle3D angle;
    // конструктор не понадобился, т.к. нет никаких связей снаружи, значит инициализуруются внутри. Но при этом связи могут быть показаны на другой UML-диаграмме. Но можно и добавить конструктор

    // поворот камеры на угол - метод как в источнике света (Flash)
    public void Rotate(Angle3D angleAction) {}

    // перемещение камеры к точке - метод как в источнике света (Flash)
    public void Move(Point3D pointAction) {}
}
