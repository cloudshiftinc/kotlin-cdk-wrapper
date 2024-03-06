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
import software.amazon.awscdk.services.stepfunctions.DistributedMapProps
import software.amazon.awscdk.services.stepfunctions.IItemReader
import software.amazon.awscdk.services.stepfunctions.ItemBatcher
import software.amazon.awscdk.services.stepfunctions.ResultWriter
import software.amazon.awscdk.services.stepfunctions.StateMachineType

/**
 * Properties for configuring a Distribute Map state.
 *
 * Example:
 * ```
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass State"));
 * ```
 */
@CdkDslMarker
public class DistributedMapPropsDsl {
    private val cdkBuilder: DistributedMapProps.Builder = DistributedMapProps.builder()

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
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     *   execution.
     */
    public fun itemBatcher(itemBatcher: ItemBatcherDsl.() -> Unit = {}) {
        val builder = ItemBatcherDsl()
        builder.apply(itemBatcher)
        cdkBuilder.itemBatcher(builder.build())
    }

    /**
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     *   execution.
     */
    public fun itemBatcher(itemBatcher: ItemBatcher) {
        cdkBuilder.itemBatcher(itemBatcher)
    }

    /**
     * @param itemReader ItemReader. Configuration for where to read items dataset in S3 to iterate
     */
    public fun itemReader(itemReader: IItemReader) {
        cdkBuilder.itemReader(itemReader)
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

    /** @param label Label. Unique name for the Distributed Map state added to each Map Run */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /** @param mapExecutionType MapExecutionType. The execution type of the distributed map state */
    public fun mapExecutionType(mapExecutionType: StateMachineType) {
        cdkBuilder.mapExecutionType(mapExecutionType)
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

    /** @param resultWriter Configuration for S3 location in which to save Map Run results. */
    public fun resultWriter(resultWriter: ResultWriterDsl.() -> Unit = {}) {
        val builder = ResultWriterDsl()
        builder.apply(resultWriter)
        cdkBuilder.resultWriter(builder.build())
    }

    /** @param resultWriter Configuration for S3 location in which to save Map Run results. */
    public fun resultWriter(resultWriter: ResultWriter) {
        cdkBuilder.resultWriter(resultWriter)
    }

    /** @param stateName Optional name for this state. */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    /**
     * @param toleratedFailureCount ToleratedFailureCount. Number of failed items to tolerate in a
     *   Map Run, as static number
     */
    public fun toleratedFailureCount(toleratedFailureCount: Number) {
        cdkBuilder.toleratedFailureCount(toleratedFailureCount)
    }

    /**
     * @param toleratedFailureCountPath ToleratedFailureCountPath. Number of failed items to
     *   tolerate in a Map Run, as JsonPath
     */
    public fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
        cdkBuilder.toleratedFailureCountPath(toleratedFailureCountPath)
    }

    /**
     * @param toleratedFailurePercentage ToleratedFailurePercentage. Percentage of failed items to
     *   tolerate in a Map Run, as static number
     */
    public fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
        cdkBuilder.toleratedFailurePercentage(toleratedFailurePercentage)
    }

    /**
     * @param toleratedFailurePercentagePath ToleratedFailurePercentagePath. Percentage of failed
     *   items to tolerate in a Map Run, as JsonPath
     */
    public fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
        cdkBuilder.toleratedFailurePercentagePath(toleratedFailurePercentagePath)
    }

    public fun build(): DistributedMapProps = cdkBuilder.build()
}
