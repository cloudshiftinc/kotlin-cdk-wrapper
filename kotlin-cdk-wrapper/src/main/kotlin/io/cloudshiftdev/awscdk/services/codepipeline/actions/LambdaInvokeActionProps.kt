@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LambdaInvokeActionProps : CommonAwsActionProps {
  public fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?: emptyList()

  public fun lambda(): IFunction

  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  public fun userParameters(): Map<String, Any> = unwrap(this).getUserParameters() ?: emptyMap()

  public fun userParametersString(): String? = unwrap(this).getUserParametersString()

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
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps,
  ) : CdkObject(cdkObject), LambdaInvokeActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun userParameters(): Map<String, Any> = unwrap(this).getUserParameters() ?: emptyMap()

    override fun userParametersString(): String? = unwrap(this).getUserParametersString()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaInvokeActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps):
        LambdaInvokeActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaInvokeActionProps):
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
  }
}
