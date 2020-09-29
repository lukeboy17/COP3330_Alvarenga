public class BodyMassIndex{

    double height = UserHeight;
    double weight = UserWeight;
    double bmi;


    {System.out.println( "Enter your Height in Inches:" , height.getUser );{


    System.out.println( "Enter your Weight in Pounds:" );


    bmi = (703 * weight) / (height * height);

    if( bmi < 18.5 ){
            System.out.println( "Underweight" );
    } else if ( bmi < 24.9 ){
        System.out.println( "Normal Weight");
    } else if ( bmi < 29.9 ){
        System.out.println( " Overweight ");
    } else if ( bmi > 30 ){
        System.out.println( "Overweight");
    }

}





    }
}




