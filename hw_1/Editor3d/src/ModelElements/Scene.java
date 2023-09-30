package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras; // в схеме забыли указать, а отношения есть
    
    // здесь все агрегация => все прилетает снаружи => в конструкторе всё
    // в конструкторе проверки, что в PoligonalModel и Camera должен быть хотя бы 1 эл-т
    // проверка на наличие хотя бы 1 эл-та зависит от выбранного стиля в команде. Н-р, если выбрано контрактное программирование, то проверкой занимается модуль, к-й вызывает до этого. Если не придержив.контрактн.пр., то мы проверяем
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;

        if(models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть хотя бы одна модель");
        }
        
        this.flashes = flashes;

        if(cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть хотя бы одна камера");
        }
    }

    // методы - можно по-разному: Type - это дженерики или класс type,н-р в списке имен классов. Это уточняется в команде
    // расматриваем как дженерики (обобщения)
    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T model, E flash) {
        return model;
    }

    // // пример классического метода, когда мы создаем типы (+ еще создать доп.классы):
    // // заглушка
    // public Type1 method1(Type1 t) {
    //     return t;
    // }

    // // заглушка
    // public Type1 method1(Type1 t1, Type2 t2) {
    //     return t1;
    // }
}
