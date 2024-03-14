package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal interface CdkClass {
    val interfaces: List<ClassName>
    val superClass: ClassName
    val className: ClassName
    val publicMemberFunctions: List<Method>
    val publicStaticFunctions: List<Method>
    val publicStaticFields: List<StaticField>
    val deprecated: Boolean
    val comment: String?
    val concreteClass: Boolean
    val isAbstract : Boolean
    val isFinal : Boolean
    val isInterface : Boolean
    val isEnum : Boolean
    val enumFields : List<EnumField>
    val isOuterClass : Boolean

    fun implementsInterface(name: ClassName): Boolean

    fun canInstantiate(): Boolean

    fun isBuilder() = implementsInterface(BuilderInterface)

    interface Method {
        val name: String
        val signature: String
        val parameters: List<Parameter>
        val deprecated: Boolean
        val returnType: TypeName
        val isStatic: Boolean
        val isFinal: Boolean
        val isAbstract : Boolean
        val comment: String?

        interface Parameter {
            val name: String
            val type: TypeName
            val nullable: Boolean

            fun typeName(): TypeName =
                when (nullable) {
                    true -> type.copy(nullable = true)
                    else -> type
                }
        }
    }

    interface EnumField {
        val name: String
    }

    interface StaticField {
        val name : String
        val type: TypeName
    }
}

private val BuilderInterface = ClassName("software.amazon.jsii", listOf("Builder"))
