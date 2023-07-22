package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import com.squareup.kotlinpoet.TypeName

internal class AsmParameterAdapter(
    override val name: String,
    override val type: TypeName
) : CdkClass.Method.Parameter
