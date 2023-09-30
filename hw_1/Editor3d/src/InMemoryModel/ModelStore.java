package InMemoryModel;
// см схему диаграмма_классов

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

// хранилище модели

public class ModelStore implements iModelChanger {
    // добавляем переменные
    public List<PoligonalModel> models; // паблик класс_из_пакета_ModelElements название_переменной 
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangedObserver[] changeObservers;

    // конструктор - принимаются только классы, вступающие в отношения агрегации (незакрашенный ромбик)
    public ModelStore(iModelChangedObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        // остальные инициализируем
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        // конструктор пока еше не закончен - надо подобавлять по 1 эл-ту этих полей. Сначала надо сделать конструкторы этих классов
        // по мнению перподавателя, текстуры должны приниматься снаружи и пoпадать в ModelStore из какого-нибудь TextureStore-хранилища текстур и мы должны передавать ссылку на это хранилище, а оно уже должно содержаться в виде поля в ModelStore. Или хотя бы получать ссылку на него в момент создания конструктора
        List<Texture> textures = new ArrayList<>();
        models.add(new PoligonalModel(textures));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    // методы
    public Scene getScena(int id) 
    {
        for(int i = 0; i < scenes.size(); i++)
        {
            if(scenes.get(i).id == id)
            {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(iModelChanger sender) {    }

}
