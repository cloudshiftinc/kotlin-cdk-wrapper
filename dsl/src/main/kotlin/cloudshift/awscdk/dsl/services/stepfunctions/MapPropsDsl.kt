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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.MapProps

/**
 * Properties for defining a Map state.
 *
 * Example:
 * ```
 * Map map = Map.Builder.create(this, "Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .build();
 * map.iterator(new Pass(this, "Pass State"));
 * ```
 */
@CdkDslMarker
public class MapPropsDsl {
    private val cdkBuilder: MapProps.Builder = MapProps.builder()

    /** @param comment An optional description for this state. */
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

    /** @param itemsPath JSONPath expression to select the array to iterate over. */
    public fun itemsPath(itemsPath: String) {
        cdkBuilder.itemsPath(itemsPath)
    }

    /**
     * @param maxConcurrency MaxConcurrency. An upper bound on the number of iterations you want
     *   running at once.
     */
    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective
     *   output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /** @param parameters The JSON that you want to override your default iteration input. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters The JSON that you want to override your default iteration input. */
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

    public fun build(): MapProps = cdkBuilder.build()
}
