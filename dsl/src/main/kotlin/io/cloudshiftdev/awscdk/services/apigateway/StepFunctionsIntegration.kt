package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class StepFunctionsIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigateway.StepFunctionsIntegration,
) : CdkObject(cdkObject) {
  public companion object {
    public fun startExecution(stateMachine: IStateMachine): AwsIntegration =
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration.startExecution(stateMachine.let(IStateMachine::unwrap)).let(AwsIntegration::wrap)

    public fun startExecution(stateMachine: IStateMachine,
        options: StepFunctionsExecutionIntegrationOptions): AwsIntegration =
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration.startExecution(stateMachine.let(IStateMachine::unwrap),
        options.let(StepFunctionsExecutionIntegrationOptions::unwrap)).let(AwsIntegration::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8234533a69d62a7e6f3fbe81c0b3b7374f656d9c04aa73705f1abdd0e151b63b")
    public fun startExecution(stateMachine: IStateMachine,
        options: StepFunctionsExecutionIntegrationOptions.Builder.() -> Unit): AwsIntegration =
        startExecution(stateMachine, StepFunctionsExecutionIntegrationOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsIntegration):
        StepFunctionsIntegration = StepFunctionsIntegration(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsIntegration):
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration = wrapped.cdkObject
  }
}
