package InMemoryModel;

// интерфейс смены модели
public interface iModelChanger {
    public void NotifyChange(iModelChanger sender);
}
