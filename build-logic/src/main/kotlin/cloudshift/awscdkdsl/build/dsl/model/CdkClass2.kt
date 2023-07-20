package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal interface CdkClass2 {
    val className: ClassName
    val publicMemberFunctions: List<Method>
    val publicStaticFunctions: List<Method>
    val deprecated : Boolean

    fun implementsInterface(name: ClassName): Boolean
    fun canInstantiate() : Boolean

    interface Method {
        val name: String
        val signature: String
        val parameters: List<Parameter>
        val deprecated : Boolean
        val returnType: TypeName

        interface Parameter {
            val name: String
            val type: TypeName
        }
    }
}
