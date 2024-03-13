package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.TypeGeneratorContext
import cloudshift.awscdkdsl.build.dsl.model.CdkClass

internal class DelegateMethodFactory(
    private val context: TypeGeneratorContext,
    cdkObjectName: String,
    private val isStatic: Boolean = false,
    private val forceOverride: Boolean = false,
) : MethodSpecFactory {

    private val callGenerator = DelegateCallGenerator(context, false, cdkObjectName)

    override fun create(enclosingClass : CdkClass, method: CdkClass.Method): List<MethodSpec> {
        val spec = MethodSpec.fromCdkMethod(method, enclosingClass, context.model)
            .copy(isStatic = isStatic)

        val theSpec = spec.copy(isOverride = forceOverride || spec.isOverride)

        val body = callGenerator.delegateMethodCall(theSpec)

        return listOf(theSpec.copy(body = body))
    }
}
