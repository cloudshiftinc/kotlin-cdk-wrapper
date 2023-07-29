package cloudshift.awscdkdsl.build.dsl.model

import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceClass
import com.squareup.kotlinpoet.ClassName
import java.io.File

internal interface CdkClassLoader {
    fun loadClasses(
        classpath: Set<File>,
        sourceClasses: Map<ClassName, CdkSourceClass>
    ): List<CdkClass>
}
