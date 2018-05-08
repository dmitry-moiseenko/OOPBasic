package LAB28_32;

/*
addShipToEndQueue() - метод, который добавляет корабль в конец очереди.
Если очередь полная необходимо вернуть -1.
Если корабль успешно добавлен в очередь, необходимо вернуть его индекс в массиве очереди.

removeShipFromBeginQueue() - метод, который удаляет корабль из начала очереди. Если очередь пуста необходимо вернуть -1.
Если корабль успешно удален вернуть 1. При удалении корабля обеспечить продвижение кораблей в начало очереди.
(Подсказка: очередь - массив, поэтому можно использовать методы из стандартных пакетов для работы с массивами)

printQueueShip() - метод, который печатает информацию про корабли в очереди.
Если в очереди нет кораблей вернуть строку "QueueEmpty",
иначе на выходе ожидается строка в виде конкатенации печати информации о корабле.
Выходная строка имеет следующий вид: {Name=<>Length=<>Width=<>Displacement=<>};{Name=<>Length=<>Width=<>Displacement=<>};
 */

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort == 2){
            return -1;
        }
        indexShipInPort++;
        for (int indexInArrayShip = indexShipInPort; indexInArrayShip < LENGTH_QUEUE_SHIP; indexInArrayShip++) {
            arrayShip[indexInArrayShip] = ship;
            return indexInArrayShip;
        }
        return -1;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (arrayShip[0] == null){
            return -1;
        }
        AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];
        for (int i = 0; i < LENGTH_QUEUE_SHIP-1; i++) {
            arrayShip[i] = this.arrayShip[i+1];
        }
        this.arrayShip = arrayShip;
        return 1;
    }

    @Override
    public String printQueueShip() {
        if (arrayShip[0] == null){
            return "QueueEmpty";
        }
        String result = "";
        for (int i = 0; i < LENGTH_QUEUE_SHIP; i++) {
            if(arrayShip[i] == null){
                break;
            }
            result += "{" + arrayShip[i].toPrint() + "};";
        }
        return result;
    }
}
