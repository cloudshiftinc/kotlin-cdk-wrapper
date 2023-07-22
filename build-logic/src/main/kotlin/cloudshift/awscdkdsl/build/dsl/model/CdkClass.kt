package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal interface CdkClass {
    val className: ClassName
    val publicMemberFunctions: List<Method>
    val publicStaticFunctions: List<Method>
    val deprecated: Boolean

    fun implementsInterface(name: ClassName): Boolean

    fun canInstantiate(): Boolean

    fun isBuilder() = implementsInterface(BuilderInterface)

    interface Method {
        val name: String
        val signature: String
        val parameters: List<Parameter>
        val deprecated: Boolean
        val returnType: TypeName
        val comment: String?

        interface Parameter {
            val name: String
            val type: TypeName
            val nullable: Boolean

            fun typeName(): TypeName = when (nullable) {
                true -> type.copy(nullable = true)
                else -> type
            }
        }
    }
}

private val BuilderInterface =
    ClassName("software.amazon.jsii", listOf("Builder"))
