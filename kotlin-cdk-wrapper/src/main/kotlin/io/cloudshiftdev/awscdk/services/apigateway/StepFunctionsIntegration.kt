@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options to integrate with various StepFunction API.
 *
 * Example:
 *
 * ```
 * StateMachine stateMachine = StateMachine.Builder.create(this, "MyStateMachine")
 * .stateMachineType(StateMachineType.EXPRESS)
 * .definition(Chain.start(new Pass(this, "Pass")))
 * .build();
 * RestApi api = RestApi.Builder.create(this, "Api")
 * .restApiName("MyApi")
 * .build();
 * api.root.addMethod("GET", StepFunctionsIntegration.startExecution(stateMachine));
 * ```
 */
public open class StepFunctionsIntegration(
  cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsIntegration,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.apigateway.StepFunctionsIntegration()
  )

  public companion object {
    public fun startExecution(stateMachine: IStateMachine): AwsIntegration =
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration.startExecution(stateMachine.let(IStateMachine.Companion::unwrap)).let(AwsIntegration::wrap)

    public fun startExecution(stateMachine: IStateMachine,
        options: StepFunctionsExecutionIntegrationOptions): AwsIntegration =
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration.startExecution(stateMachine.let(IStateMachine.Companion::unwrap),
        options.let(StepFunctionsExecutionIntegrationOptions.Companion::unwrap)).let(AwsIntegration::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8234533a69d62a7e6f3fbe81c0b3b7374f656d9c04aa73705f1abdd0e151b63b")
    public fun startExecution(stateMachine: IStateMachine,
        options: StepFunctionsExecutionIntegrationOptions.Builder.() -> Unit): AwsIntegration =
        startExecution(stateMachine, StepFunctionsExecutionIntegrationOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsIntegration):
        StepFunctionsIntegration = StepFunctionsIntegration(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsIntegration):
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.StepFunctionsIntegration
  }
}
