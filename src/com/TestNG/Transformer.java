package com.TestNG;

import org.testng.IAnnotationTransformer;

public class Transformer implements IAnnotationTransformer {
    /*3. IAnnotationTransformer(I)
    one small disadvantage in IRetryAnalyzer(I) is we have to add the
    attribute(retryAnalyzer= rerunfailedtestcases.class) for all the methods, suppose
        if we are having 1000 methods, it is very hard to do for all Right, so we have to
    use Transformer concept.

        1. we have to add the unimplemented method named(Transformer)
        2. IAnnotationTransformer(I) works along with the IRetryAnalyzer(I).
        3. If we are using Transformer, inside the testNG.xml we have to add the listner
    under the suite tag
        4. Oru oru @Test Annotation uhm nadakum podhu indha(Transformer method)
         automatic ah call aagirum.

    */


}
