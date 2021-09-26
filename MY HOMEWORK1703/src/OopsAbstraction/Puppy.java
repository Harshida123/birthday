package OopsAbstraction;  // create package//

public abstract class Puppy {   //create abstract class//
    abstract void colour();   //create abstract method without method body//
    public void dog(){       // create use defined method with body//
        System.out.println("the dog.....is clever"); //print out//
    }
}

//IMP : IN ABSTRACT CLASS YOU CAN HAVE ABSTRACT METHOD AND ALSO USER DEFINED METHOD//
//IMP: HOW TO CREAT A ABSTRACT CLASS IN INTELJI : JUST TYPE AB BETWEEN PUBLIC AND VOID//
// IMP: IN ABSTRACT CLASS CAN NOT CRAETE A OBJECT//
// IMP:  CHILD CLASS CREATE A OBJECT AND IT WILL REFER TO ABSTRACT VARIABLE//
//IMP: ABSTRACT CLASS COMPARE WITH CHILD CLASS BY USING THE KEY WORD "EXTENDS"//
//IMP: WHEN YOU EXTENDS CHILD CLASS WITH ABSTRACT CLASS ITS SHOWS ERROR, TO RESOLVE THE ERROR
//, TO RESOVE THE ERROR RIGHT LICK IN METHOD BODY AND GO TO GENERATED AND THEN SELECT IMPLEMENT
 //ABSTRACT METHOD//