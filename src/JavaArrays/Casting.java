package JavaArrays;

public class Casting {
    public void differentTypes(){
        Object objectInstanceOne = new Object();
        Object stringInstance = "string";
        System.out.println(stringInstance);

        String realString = (String) stringInstance;
        System.out.println(realString.length());
    }

    public void someDifferentTypes(){
        Object[] someObjects = new Object[] {"1234", new Object()};
        String casterdString = (String) someObjects[0];
        String classCastException = (String) someObjects[1];

        System.out.println(casterdString);
        System.out.println(classCastException);
    }

}
