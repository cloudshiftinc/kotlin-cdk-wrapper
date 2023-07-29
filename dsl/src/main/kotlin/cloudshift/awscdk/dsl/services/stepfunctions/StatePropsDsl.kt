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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.StateProps

/**
 * Properties shared by all states.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Object parameters;
 * Object resultSelector;
 * StateProps stateProps = StateProps.builder()
 * .comment("comment")
 * .inputPath("inputPath")
 * .outputPath("outputPath")
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .build();
 * ```
 */
@CdkDslMarker
public class StatePropsDsl {
    private val cdkBuilder: StateProps.Builder = StateProps.builder()

    /** @param comment A comment describing this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective
     *   output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param parameters Parameters pass a collection of key-value pairs, either static values or
     *   JSONPath expressions that select from the input.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters Parameters pass a collection of key-value pairs, either static values or
     *   JSONPath expressions that select from the input.
     */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output. May
     *   also be the special value JsonPath.DISCARD, which will cause the state's input to become
     *   its output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    public fun build(): StateProps = cdkBuilder.build()
}
