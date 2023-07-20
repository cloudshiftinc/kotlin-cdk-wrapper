package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.asTypeName

internal object Annotations {
    val Deprecated =
        AnnotationSpec.builder(Deprecated::class.asTypeName()).addMember("message = %S", "deprecated in CDK").build()
}

internal fun dslFunctionSpec(prop: BuilderProperty, block: FunSpec.Builder.() -> Unit): FunSpec {
    val builder = FunSpec.builder(prop.name)
    builder.apply(block)
    if (prop.deprecated) builder.addAnnotation(Annotations.Deprecated)
    return builder.build()
}
