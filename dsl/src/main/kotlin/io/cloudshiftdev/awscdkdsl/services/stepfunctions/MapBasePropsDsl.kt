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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.MapBaseProps

/**
 * Properties for defining a Map state.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * Object itemSelector;
 * Object resultSelector;
 * MapBaseProps mapBaseProps = MapBaseProps.builder()
 * .comment("comment")
 * .inputPath("inputPath")
 * .itemSelector(Map.of(
 * "itemSelectorKey", itemSelector))
 * .itemsPath("itemsPath")
 * .maxConcurrency(123)
 * .outputPath("outputPath")
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .build();
 * ```
 */
@CdkDslMarker
public class MapBasePropsDsl {
    private val cdkBuilder: MapBaseProps.Builder = MapBaseProps.builder()

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

    /**
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     *   exclusive with `parameters`).
     */
    public fun itemSelector(itemSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(itemSelector)
        cdkBuilder.itemSelector(builder.map)
    }

    /**
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     *   exclusive with `parameters`).
     */
    public fun itemSelector(itemSelector: Map<String, Any>) {
        cdkBuilder.itemSelector(itemSelector)
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

    /** @param stateName Optional name for this state. */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    public fun build(): MapBaseProps = cdkBuilder.build()
}
