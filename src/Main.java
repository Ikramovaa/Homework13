public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer("Windows HD color",
                "HP","silver","HHD",
                "Operating Memory", "discrete","USB port","qwerty");
        Display display=new Display(15.6,"Hewlett-Packard Company","Compaq BrightView");
        HardDiscSDD hardDiscSDD=new HardDiscSDD(64,2);
        OperatingMemory operatingMemory = new OperatingMemory(8,"Hewlett-Packard Company");
        UsbPort usbPort=new UsbPort("VGA and USB port","ss");

        System.out.println("Марка ноутбука:"+computer.getBrand()+"\nДисплей:"+computer.getDisplay()+"\n    Диагонал дисплея:"+display.getDiagonal()+"   \n    Производитель:"+display.getManufacturer()+"   \n    Вид Матрикса:"+display.getMatrixType()+  "\nЦвет ноутбука:"+computer.getColour()+"\nЖесткий диск:"+computer.getHardDisc()+"\n    Объем жесткого диска:"+hardDiscSDD.getVolumeOfMemory()+"GB"+"\n    Жесткий диск разделен на:"+hardDiscSDD.getDiscsAreDivided()+computer.getVideoCard()+
                "\nОперационная память:"+computer.getOperatingMemory()+"\n    Память оперционной системы:"+operatingMemory.getMemory()+"\n    Производитель:"+operatingMemory.getManufacturer()+"\n"+computer.getUsbPort()+"\n    Вид USB порта:"+usbPort.getTypeOfPort()+"\n    ID USB порта:"+usbPort.getIdOfPort()+"\nВидео карта:"+computer.getVideoCard());
        Keyboard keyboard=new Keyboard("Подсветка","дополнительные кнопки");
        System.out.println("Для удобства есть "+keyboard.getBacklight()+" на клавиатуре.");
        System.out.println("Нет "+keyboard.getAdditionalButton()+" в правой стороне клавиатуры.");


    }
}