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
import software.amazon.awscdk.services.stepfunctions.StateMachine
import software.amazon.awscdk.services.stepfunctions.StateMachineType
import software.constructs.Construct

/**
 * Define a StepFunctions State Machine.
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
public class StateMachineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: StateMachine.Builder = StateMachine.Builder.create(scope, id)

    /**
     * (deprecated) Definition for this state machine.
     *
     * @param definition Definition for this state machine.
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     */
    @Deprecated(message = "deprecated in CDK")
    public fun definition(definition: IChainable) {
        cdkBuilder.definition(definition)
    }

    /**
     * Definition for this state machine.
     *
     * @param definitionBody Definition for this state machine.
     */
    public fun definitionBody(definitionBody: DefinitionBody) {
        cdkBuilder.definitionBody(definitionBody)
    }

    /**
     * substitutions for the definition body aas a key-value map.
     *
     * @param definitionSubstitutions substitutions for the definition body aas a key-value map.
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
        cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     *
     * @param logs Defines what execution history events are logged and where they are logged.
     */
    public fun logs(logs: LogOptionsDsl.() -> Unit = {}) {
        val builder = LogOptionsDsl()
        builder.apply(logs)
        cdkBuilder.logs(builder.build())
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     *
     * @param logs Defines what execution history events are logged and where they are logged.
     */
    public fun logs(logs: LogOptions) {
        cdkBuilder.logs(logs)
    }

    /**
     * The removal policy to apply to state machine.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply to state machine.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * The execution role for the state machine service.
     *
     * Default: A role is automatically created
     *
     * @param role The execution role for the state machine service.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * A name for the state machine.
     *
     * Default: A name is automatically generated
     *
     * @param stateMachineName A name for the state machine.
     */
    public fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
    }

    /**
     * Type of the state machine.
     *
     * Default: StateMachineType.STANDARD
     *
     * @param stateMachineType Type of the state machine.
     */
    public fun stateMachineType(stateMachineType: StateMachineType) {
        cdkBuilder.stateMachineType(stateMachineType)
    }

    /**
     * Maximum run time for this state machine.
     *
     * Default: No timeout
     *
     * @param timeout Maximum run time for this state machine.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this state machine.
     *
     * Default: false
     *
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this state
     *   machine.
     */
    public fun tracingEnabled(tracingEnabled: Boolean) {
        cdkBuilder.tracingEnabled(tracingEnabled)
    }

    public fun build(): StateMachine = cdkBuilder.build()
}
