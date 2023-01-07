package tirta.latihan.soalno3;

public class Hotel {

    private final int STANDAR_ROOM = 400_000;
    private final int SUPERIOR_ROOM = 500_000;
    private final int DELUXE_ROOM = 650_000;
    private final int SUITE_ROOM = 750_000;

    public double hitungBiayaNginap(int room,int lamaMenginap){
        switch (room){
            case 1 : return lamaMenginap*STANDAR_ROOM;
            case 2 : return lamaMenginap*SUPERIOR_ROOM;
            case 3 : return lamaMenginap*DELUXE_ROOM;
            case 4 : return lamaMenginap*SUITE_ROOM;
            default: return 0;
        }
    }

    public int getSTANDAR_ROOM() {
        return STANDAR_ROOM;
    }

    public int getSUPERIOR_ROOM() {
        return SUPERIOR_ROOM;
    }

    public int getDELUXE_ROOM() {
        return DELUXE_ROOM;
    }

    public int getSUITE_ROOM() {
        return SUITE_ROOM;
    }
}
