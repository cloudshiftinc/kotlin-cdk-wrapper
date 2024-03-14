package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.TypeGeneratorContext
import cloudshift.awscdkdsl.build.dsl.model.CdkClass

internal class BuilderMethodFactory(private val context: TypeGeneratorContext, ) : MethodSpecFactory {

    private val callGenerator = DelegateCallGenerator(context, true, "cdkBuilder")

    override fun create(enclosingClass : CdkClass, method: CdkClass.Method): List<MethodSpec> {
        val spec = MethodSpec.fromCdkMethod(method, enclosingClass, context.model)
            .copy(omitReturnType = true)

        val body = callGenerator.delegateMethodCall(spec)

        return listOf(spec.copy(body = body))
    }
}
