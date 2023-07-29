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
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Construction properties of the `LambdaInvokeAction Lambda invoke CodePipeline Action`.
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
 */
@CdkDslMarker
public class LambdaInvokeActionPropsDsl {
    private val cdkBuilder: LambdaInvokeActionProps.Builder = LambdaInvokeActionProps.builder()

    private val _inputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param inputs The optional input Artifacts of the Action. A Lambda Action can have up to 5
     *   inputs. The inputs will appear in the event passed to the Lambda, under the
     *   `'CodePipeline.job'.data.inputArtifacts` path.
     */
    public fun inputs(vararg inputs: Artifact) {
        _inputs.addAll(listOf(*inputs))
    }

    /**
     * @param inputs The optional input Artifacts of the Action. A Lambda Action can have up to 5
     *   inputs. The inputs will appear in the event passed to the Lambda, under the
     *   `'CodePipeline.job'.data.inputArtifacts` path.
     */
    public fun inputs(inputs: Collection<Artifact>) {
        _inputs.addAll(inputs)
    }

    /** @param lambda The lambda function to invoke. */
    public fun lambda(lambda: IFunction) {
        cdkBuilder.lambda(lambda)
    }

    /**
     * @param outputs The optional names of the output Artifacts of the Action. A Lambda Action can
     *   have up to 5 outputs. The outputs will appear in the event passed to the Lambda, under the
     *   `'CodePipeline.job'.data.outputArtifacts` path. It is the responsibility of the Lambda to
     *   upload ZIP files with the Artifact contents to the provided locations.
     */
    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * @param outputs The optional names of the output Artifacts of the Action. A Lambda Action can
     *   have up to 5 outputs. The outputs will appear in the event passed to the Lambda, under the
     *   `'CodePipeline.job'.data.outputArtifacts` path. It is the responsibility of the Lambda to
     *   upload ZIP files with the Artifact contents to the provided locations.
     */
    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    /**
     * @param role The Role in which context's this Action will be executing in. The Pipeline's Role
     *   will assume this Role (the required permissions for that will be granted automatically)
     *   right before executing this Action. This Action will be passed into your `IAction.bind`
     *   method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     *   inside the event that the Pipeline will call it with. Only one of `userParameters` or
     *   `userParametersString` can be specified.
     */
    public fun userParameters(userParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(userParameters)
        cdkBuilder.userParameters(builder.map)
    }

    /**
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     *   inside the event that the Pipeline will call it with. Only one of `userParameters` or
     *   `userParametersString` can be specified.
     */
    public fun userParameters(userParameters: Map<String, Any>) {
        cdkBuilder.userParameters(userParameters)
    }

    /**
     * @param userParametersString The string representation of the user parameters that will be
     *   accessible to the invoked Lambda inside the event that the Pipeline will call it with. Only
     *   one of `userParametersString` or `userParameters` can be specified.
     */
    public fun userParametersString(userParametersString: String) {
        cdkBuilder.userParametersString(userParametersString)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): LambdaInvokeActionProps {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
