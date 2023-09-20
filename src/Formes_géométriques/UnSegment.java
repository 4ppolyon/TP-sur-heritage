package Formes_géométriques;

class UnSegment
{
    public static void main(String [] args) {
        MachineTrace m = new MachineTrace(400,400);
        m.placer(0, 0);
        m.baisser();
        m.placer(100,100);
        m.lever();
    }
}