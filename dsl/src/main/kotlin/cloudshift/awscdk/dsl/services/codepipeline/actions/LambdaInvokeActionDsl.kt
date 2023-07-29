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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

/**
 * CodePipeline invoke Action that is provided by an AWS Lambda function.
 *
 * Example:
 * ```
 * Function fn;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * LambdaInvokeAction lambdaAction = LambdaInvokeAction.Builder.create()
 * .actionName("Lambda")
 * .lambda(fn)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Lambda")
 * .actions(List.of(lambdaAction))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html)
 */
@CdkDslMarker
public class LambdaInvokeActionDsl {
    private val cdkBuilder: LambdaInvokeAction.Builder = LambdaInvokeAction.Builder.create()

    private val _inputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * The optional input Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 inputs. The inputs will appear in the event passed to the
     * Lambda, under the `'CodePipeline.job'.data.inputArtifacts` path.
     *
     * Default: the Action will not have any inputs
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     *
     * @param inputs The optional input Artifacts of the Action.
     */
    public fun inputs(vararg inputs: Artifact) {
        _inputs.addAll(listOf(*inputs))
    }

    /**
     * The optional input Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 inputs. The inputs will appear in the event passed to the
     * Lambda, under the `'CodePipeline.job'.data.inputArtifacts` path.
     *
     * Default: the Action will not have any inputs
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     *
     * @param inputs The optional input Artifacts of the Action.
     */
    public fun inputs(inputs: Collection<Artifact>) {
        _inputs.addAll(inputs)
    }

    /**
     * The lambda function to invoke.
     *
     * @param lambda The lambda function to invoke.
     */
    public fun lambda(lambda: IFunction) {
        cdkBuilder.lambda(lambda)
    }

    /**
     * The optional names of the output Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 outputs. The outputs will appear in the event passed to the
     * Lambda, under the `'CodePipeline.job'.data.outputArtifacts` path. It is the responsibility of
     * the Lambda to upload ZIP files with the Artifact contents to the provided locations.
     *
     * Default: the Action will not have any outputs
     *
     * @param outputs The optional names of the output Artifacts of the Action.
     */
    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * The optional names of the output Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 outputs. The outputs will appear in the event passed to the
     * Lambda, under the `'CodePipeline.job'.data.outputArtifacts` path. It is the responsibility of
     * the Lambda to upload ZIP files with the Artifact contents to the provided locations.
     *
     * Default: the Action will not have any outputs
     *
     * @param outputs The optional names of the output Artifacts of the Action.
     */
    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role (the required permissions for that will be granted
     * automatically) right before executing this Action. This Action will be passed into your
     * `IAction.bind` method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     *
     * @param runOrder The runOrder property for this Action.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * A set of key-value pairs that will be accessible to the invoked Lambda inside the event that
     * the Pipeline will call it with.
     *
     * Only one of `userParameters` or `userParametersString` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     *
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     *   inside the event that the Pipeline will call it with.
     */
    public fun userParameters(userParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(userParameters)
        cdkBuilder.userParameters(builder.map)
    }

    /**
     * A set of key-value pairs that will be accessible to the invoked Lambda inside the event that
     * the Pipeline will call it with.
     *
     * Only one of `userParameters` or `userParametersString` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     *
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     *   inside the event that the Pipeline will call it with.
     */
    public fun userParameters(userParameters: Map<String, Any>) {
        cdkBuilder.userParameters(userParameters)
    }

    /**
     * The string representation of the user parameters that will be accessible to the invoked
     * Lambda inside the event that the Pipeline will call it with.
     *
     * Only one of `userParametersString` or `userParameters` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * @param userParametersString The string representation of the user parameters that will be
     *   accessible to the invoked Lambda inside the event that the Pipeline will call it with.
     */
    public fun userParametersString(userParametersString: String) {
        cdkBuilder.userParametersString(userParametersString)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names, if any of the
     * action's variables were referenced - otherwise, no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): LambdaInvokeAction {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
