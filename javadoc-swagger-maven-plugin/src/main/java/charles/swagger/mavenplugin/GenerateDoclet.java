package charles.swagger.mavenplugin;

import com.sun.javadoc.*;

/**
 * Created by Charles on 2016/10/27.
 */
public class GenerateDoclet {
    public static boolean start(RootDoc root) {
        ClassDoc[] classes = root.classes();
        for (ClassDoc classDoc : root.classes()) {
            System.out.println(classDoc);
            System.out.println(classDoc.getRawCommentText());

            for (MethodDoc method : classDoc.methods()) {
                System.out.println(method);
                System.out.println(method.getRawCommentText());

                for (ParamTag paramTag : method.typeParamTags()) {
                    System.out.println(paramTag);
                    System.out.println(paramTag.parameterComment());
                }
            }
        }
        return true;
    }
}
