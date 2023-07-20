@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.StateMachineInput
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.IStateMachine
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class StepFunctionInvokeActionDsl {
    private val cdkBuilder: StepFunctionInvokeAction.Builder =
        StepFunctionInvokeAction.Builder.create()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun executionNamePrefix(executionNamePrefix: String) {
        cdkBuilder.executionNamePrefix(executionNamePrefix)
    }

    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun stateMachine(stateMachine: IStateMachine) {
        cdkBuilder.stateMachine(stateMachine)
    }

    public fun stateMachineInput(stateMachineInput: StateMachineInput) {
        cdkBuilder.stateMachineInput(stateMachineInput)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): StepFunctionInvokeAction = cdkBuilder.build()
}
