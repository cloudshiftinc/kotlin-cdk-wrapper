@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface StepFunctionsInvokeActionProps : CommonAwsActionProps {
  public fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

  public fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

  public fun stateMachine(): IStateMachine

  public fun stateMachineInput(): StateMachineInput? =
      unwrap(this).getStateMachineInput()?.let(StateMachineInput::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun executionNamePrefix(executionNamePrefix: String)

    public fun output(output: Artifact)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun stateMachine(stateMachine: IStateMachine)

    public fun stateMachineInput(stateMachineInput: StateMachineInput)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun executionNamePrefix(executionNamePrefix: String) {
      cdkBuilder.executionNamePrefix(executionNamePrefix)
    }

    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
    }

    override fun stateMachineInput(stateMachineInput: StateMachineInput) {
      cdkBuilder.stateMachineInput(stateMachineInput.let(StateMachineInput::unwrap))
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps,
  ) : CdkObject(cdkObject), StepFunctionsInvokeActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

    override fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun stateMachine(): IStateMachine =
        unwrap(this).getStateMachine().let(IStateMachine::wrap)

    override fun stateMachineInput(): StateMachineInput? =
        unwrap(this).getStateMachineInput()?.let(StateMachineInput::wrap)

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsInvokeActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps):
        StepFunctionsInvokeActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsInvokeActionProps):
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps
  }
}
