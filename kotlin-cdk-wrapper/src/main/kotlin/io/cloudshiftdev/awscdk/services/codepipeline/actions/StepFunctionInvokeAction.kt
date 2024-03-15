@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class StepFunctionInvokeAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction,
) : Action(cdkObject) {
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
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction.Builder.create()

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
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionInvokeAction {
      val builderImpl = BuilderImpl()
      return StepFunctionInvokeAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction):
        StepFunctionInvokeAction = StepFunctionInvokeAction(cdkObject)

    internal fun unwrap(wrapped: StepFunctionInvokeAction):
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction =
        wrapped.cdkObject
  }
}
