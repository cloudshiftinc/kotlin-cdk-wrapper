@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class LambdaInvokeAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction,
) : Action(cdkObject) {
  public open fun variable(variableName: String): String = unwrap(this).variable(variableName)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun inputs(inputs: List<Artifact>)

    public fun inputs(vararg inputs: Artifact)

    public fun lambda(lambda: IFunction)

    public fun outputs(outputs: List<Artifact>)

    public fun outputs(vararg outputs: Artifact)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun userParameters(userParameters: Map<String, Any>)

    public fun userParametersString(userParametersString: String)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    override fun lambda(lambda: IFunction) {
      cdkBuilder.lambda(lambda.let(IFunction::unwrap))
    }

    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun userParameters(userParameters: Map<String, Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    override fun userParametersString(userParametersString: String) {
      cdkBuilder.userParametersString(userParametersString)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaInvokeAction {
      val builderImpl = BuilderImpl()
      return LambdaInvokeAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction):
        LambdaInvokeAction = LambdaInvokeAction(cdkObject)

    internal fun unwrap(wrapped: LambdaInvokeAction):
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction = wrapped.cdkObject
  }
}
