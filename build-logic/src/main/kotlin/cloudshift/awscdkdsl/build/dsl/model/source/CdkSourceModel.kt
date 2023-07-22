package cloudshift.awscdkdsl.build.dsl.model.source

import com.squareup.kotlinpoet.ClassName

internal data class CdkSourceModel(val classes: List<CdkSourceClass>, val builderMap: Map<ClassName, CdkSourceClass>)
