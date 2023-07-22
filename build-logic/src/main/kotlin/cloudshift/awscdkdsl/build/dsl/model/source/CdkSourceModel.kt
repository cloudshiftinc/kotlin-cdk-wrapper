package cloudshift.awscdkdsl.build.dsl.model.source

import com.squareup.kotlinpoet.ClassName

internal data class CdkSourceModel(val classes: List<CdkSourceClass>, val classMap: Map<ClassName, CdkSourceClass>)
