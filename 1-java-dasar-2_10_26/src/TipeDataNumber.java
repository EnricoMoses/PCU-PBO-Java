public class TipeDataNumber {
  public static void main(String[] args) {
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 10000000;
    long iniLong = 1000000000;
    long iniLong2 = 100000000L;

    float iniFLoat = 10.12F;
    double iniDouble = 12.2424;

    int decimalInt = 25;
    int hexInt = 0xA132B;
    int binInt = 0b10101101;

    long balance = 1_000_000_000_000L;
    int sum = 60_000_000;

//    konversi tipe data number
//    widening casting (otomatis) : byte->int->long->float->double
//    narrowing casting (manual) : double->long->int->char->short->byte

    byte byte2 = 10;
    short short2 = byte2;
    int int2 = short2;
    long long2 = int2;
    float float2 = long2;
    double double2 = float2;

    float float3 = (float) double2;
    long long3 = (long) float3;
    int int3 = (int) long3;
    short short3 = (short) int3;


  }
}
