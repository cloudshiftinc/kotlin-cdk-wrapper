package cloudshift.awscdkdsl.build.dsl

import com.squareup.kotlinpoet.FunSpec

internal data class ExtensionFunctionSpec(
    val funSpec: FunSpec,
    val builderClass: CdkClass?
) : Comparable<ExtensionFunctionSpec> {

    fun qualifiedName(): String {
        return "${funSpec.receiverType}.${funSpec.name}"
    }

    override fun compareTo(other: ExtensionFunctionSpec): Int {
        return qualifiedName().compareTo(other.qualifiedName())
    }
}
