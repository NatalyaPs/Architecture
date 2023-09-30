package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

// источник света
public class Flash {
    public Point3D location; // как в камере
    public Angle3D angle;  // как в камере
    public java.awt.Color color; // встроенный
    public float power;
    // входящх зависимостей нет

    // поворот источника света на угол - метод как в камере
    public void Rotate(Angle3D angleAction) {}

    // перемещение к точке - метод как в камере
    public void Move(Point3D pointAction) {} 
}
