package wrappers;

public class WrapperTest {

    public static void main(String[] args) {

        Character char1 = 'a';
        Character char2 = Character.valueOf('c');
        Character char3 = new Character('c');

        Byte byte1 = 5;
        Byte byte2 = Byte.valueOf((byte) 5);
        Byte byte3 = new Byte((byte) 5);
        Byte byte4 = Byte.parseByte("5");

        Short short1 = 200;
        Short short2 = Short.valueOf((short) 200);
        Short short3 = new Short((short) 200);
        Short short4 = Short.parseShort("200");

        Integer integer1 = 35_000;
        Integer integer2 = Integer.valueOf(35_000);
        Integer integer3 = new Integer(35_000);
        Integer integer4 = Integer.parseInt("35000");

        Long long1 = 5_147_483_700L;
        Long long2 = Long.valueOf(5_147_483_700L);
        Long long3 = new Long(5_147_483_700L);
        Long long4 = Long.parseLong("5147483700");

        Float float1 = 15.5f;
        Float float2 = Float.valueOf(15.5f);
        Float float3 = new Float(15.5f);
        Float float4 = Float.parseFloat("15.5f");

        Double double1 = 133_000.555_666;
        Double double2 = Double.valueOf(133_000.555_666);
        Double double3 = new Double(133_000.555_666);
        Double double4 = Double.parseDouble("133000.555666");

        Boolean boolean1 = true;
        Boolean boolean2 = Boolean.valueOf(true);
        Boolean boolean3 = new Boolean(true);
        Boolean boolean4 = Boolean.parseBoolean("false");

        Double myDouble = 123.123;
        byte myByte = myDouble.byteValue();
        short myShort = myDouble.shortValue();
        int myInt = myDouble.intValue();
        float myFloat = myDouble.floatValue();
        long myLong = myDouble.longValue();

        Double double5 = 0.0;
        Double double6 = 5.0;
        Double nanValue = double5 / double5;
        Double infinityValue = double6 / double5;

        System.out.println("NaN: " + nanValue);
        System.out.println("Infinity: " + infinityValue);

        System.out.println("_______________________________");

        if (nanValue.isNaN()) {
            System.out.println("Value of nanValue: " + "NaN");
        }

        if (infinityValue.isInfinite()) {
            System.out.println("Value of infinityValue: " + "Infinity");
        }

        Long myLong1 = 120L;
        Long myLong2 = 120L;
        System.out.println(myLong1 == myLong2);
        myLong1 = 1200L;
        myLong2 = 1200l;
        System.out.println(myLong1 == myLong2);
    }
}
