@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.DefinitionBody
import software.amazon.awscdk.services.stepfunctions.IChainable
import software.amazon.awscdk.services.stepfunctions.LogOptions
import software.amazon.awscdk.services.stepfunctions.StateMachineProps
import software.amazon.awscdk.services.stepfunctions.StateMachineType

/**
 * Properties for defining a State Machine.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact inputArtifact = new Artifact();
 * Pass startState = new Pass(this, "StartState");
 * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
 * .definition(startState)
 * .build();
 * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
 * .actionName("Invoke")
 * .stateMachine(simpleStateMachine)
 * .stateMachineInput(StateMachineInput.filePath(inputArtifact.atPath("assets/input.json")))
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("StepFunctions")
 * .actions(List.of(stepFunctionAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class StateMachinePropsDsl {
    private val cdkBuilder: StateMachineProps.Builder = StateMachineProps.builder()

    /** @param comment Comment that describes this state machine. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param definition Definition for this state machine.
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     */
    @Deprecated(message = "deprecated in CDK")
    public fun definition(definition: IChainable) {
        cdkBuilder.definition(definition)
    }

    /** @param definitionBody Definition for this state machine. */
    public fun definitionBody(definitionBody: DefinitionBody) {
        cdkBuilder.definitionBody(definitionBody)
    }

    /** @param definitionSubstitutions substitutions for the definition body aas a key-value map. */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
        cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /** @param logs Defines what execution history events are logged and where they are logged. */
    public fun logs(logs: LogOptionsDsl.() -> Unit = {}) {
        val builder = LogOptionsDsl()
        builder.apply(logs)
        cdkBuilder.logs(builder.build())
    }

    /** @param logs Defines what execution history events are logged and where they are logged. */
    public fun logs(logs: LogOptions) {
        cdkBuilder.logs(logs)
    }

    /** @param removalPolicy The removal policy to apply to state machine. */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /** @param role The execution role for the state machine service. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /** @param stateMachineName A name for the state machine. */
    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    /** @param stateMachineType Type of the state machine. */
    public fun stateMachineType(stateMachineType: StateMachineType) {
        cdkBuilder.stateMachineType(stateMachineType)
    }

    /** @param timeout Maximum run time for this state machine. */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this state
     *   machine.
     */
    public fun tracingEnabled(tracingEnabled: Boolean) {
        cdkBuilder.tracingEnabled(tracingEnabled)
    }

    public fun build(): StateMachineProps = cdkBuilder.build()
}
