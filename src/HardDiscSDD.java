public class HardDiscSDD {
    private  int volumeOfMemory;
    private int discsAreDivided;

    public HardDiscSDD(int volumeOfMemory, int discsAreDivided) {
        this.volumeOfMemory = volumeOfMemory;
        this.discsAreDivided = discsAreDivided;
    }

    public int getVolumeOfMemory() {
        return volumeOfMemory;
    }

    public void setVolumeOfMemory(int volumeOfMemory) {
        this.volumeOfMemory = volumeOfMemory;
    }

    public int getDiscsAreDivided() {
        return discsAreDivided;
    }

    public void setDiscsAreDivided(int discsAreDivided) {
        this.discsAreDivided = discsAreDivided;
    }
}
