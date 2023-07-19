package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass2
import com.squareup.kotlinpoet.TypeName
import org.objectweb.asm.tree.AnnotationNode

@Suppress("LocalVariableName")
internal class AsmParameterAdapter(
    private val visibleAnnotations: List<AnnotationNode>,
    private val invisibleAnnotations: List<AnnotationNode>,
    _type: TypeName,
    _parameterName: String,
) : CdkClass2.Method.Parameter {
    override val name: String = _parameterName
    override val type: TypeName = _type
}
