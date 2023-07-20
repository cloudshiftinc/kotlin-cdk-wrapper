package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import com.squareup.kotlinpoet.TypeName

@Suppress("LocalVariableName")
internal class AsmParameterAdapter(
    _type: TypeName,
    _parameterName: String,
) : CdkClass.Method.Parameter {
    override val name: String = _parameterName
    override val type: TypeName = _type
}
