package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.CdkClass2
import java.io.File

internal interface CdkClassLoader {
    fun loadClasses(classpath : Set<File>) : List<CdkClass2>

}

