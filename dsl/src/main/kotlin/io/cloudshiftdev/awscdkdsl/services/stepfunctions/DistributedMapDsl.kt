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
import software.amazon.awscdk.services.stepfunctions.DistributedMap
import software.amazon.awscdk.services.stepfunctions.IItemReader
import software.amazon.awscdk.services.stepfunctions.ItemBatcher
import software.amazon.awscdk.services.stepfunctions.ResultWriter
import software.amazon.awscdk.services.stepfunctions.StateMachineType
import software.constructs.Construct

/**
 * Define a Distributed Mode Map state in the state machine.
 *
 * A `Map` state can be used to run a set of steps for each element of an input array. A Map state
 * will execute the same steps for multiple entries of an array in the state input.
 *
 * While the Parallel state executes multiple branches of steps using the same input, a Map state
 * will execute the same steps for multiple entries of an array in the state input.
 *
 * A `Map` state in `Distributed` mode will execute a child workflow for each iteration of the Map
 * state. This serves to increase concurrency and allows for larger workloads to be run in a single
 * state machine.
 *
 * Example:
 * ```
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass State"));
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-distributed.html)
 */
@CdkDslMarker
public class DistributedMapDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DistributedMap.Builder = DistributedMap.Builder.create(scope, id)

    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective input to be
     * the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     *
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     *   execution.
     */
    public fun itemBatcher(itemBatcher: ItemBatcherDsl.() -> Unit = {}) {
        val builder = ItemBatcherDsl()
        builder.apply(itemBatcher)
        cdkBuilder.itemBatcher(builder.build())
    }

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     *
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     *   execution.
     */
    public fun itemBatcher(itemBatcher: ItemBatcher) {
        cdkBuilder.itemBatcher(itemBatcher)
    }

    /**
     * ItemReader.
     *
     * Configuration for where to read items dataset in S3 to iterate
     *
     * Default: - No itemReader
     *
     * @param itemReader ItemReader.
     */
    public fun itemReader(itemReader: IItemReader) {
        cdkBuilder.itemReader(itemReader)
    }

    /**
     * The JSON that you want to override your default iteration input (mutually exclusive with
     * `parameters`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     *
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     *   exclusive with `parameters`).
     */
    public fun itemSelector(itemSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(itemSelector)
        cdkBuilder.itemSelector(builder.map)
    }

    /**
     * The JSON that you want to override your default iteration input (mutually exclusive with
     * `parameters`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     *
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     *   exclusive with `parameters`).
     */
    public fun itemSelector(itemSelector: Map<String, Any>) {
        cdkBuilder.itemSelector(itemSelector)
    }

    /**
     * JSONPath expression to select the array to iterate over.
     *
     * Default: $
     *
     * @param itemsPath JSONPath expression to select the array to iterate over.
     */
    public fun itemsPath(itemsPath: String) {
        cdkBuilder.itemsPath(itemsPath)
    }

    /**
     * Label.
     *
     * Unique name for the Distributed Map state added to each Map Run
     *
     * Default: - No label
     *
     * @param label Label.
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /**
     * MapExecutionType.
     *
     * The execution type of the distributed map state
     *
     * Default: StateMachineType.STANDARD
     *
     * @param mapExecutionType MapExecutionType.
     */
    public fun mapExecutionType(mapExecutionType: StateMachineType) {
        cdkBuilder.mapExecutionType(mapExecutionType)
    }

    /**
     * MaxConcurrency.
     *
     * An upper bound on the number of iterations you want running at once.
     *
     * Default: - full concurrency
     *
     * @param maxConcurrency MaxConcurrency.
     */
    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective output to be
     * the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     *   state.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's input to become
     * its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static or selected from
     * the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     *
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @param resultWriter Configuration for S3 location in which to save Map Run results.
     */
    public fun resultWriter(resultWriter: ResultWriterDsl.() -> Unit = {}) {
        val builder = ResultWriterDsl()
        builder.apply(resultWriter)
        cdkBuilder.resultWriter(builder.build())
    }

    /**
     * Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @param resultWriter Configuration for S3 location in which to save Map Run results.
     */
    public fun resultWriter(resultWriter: ResultWriter) {
        cdkBuilder.resultWriter(resultWriter)
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String) {
        cdkBuilder.stateName(stateName)
    }

    /**
     * ToleratedFailureCount.
     *
     * Number of failed items to tolerate in a Map Run, as static number
     *
     * Default: - No toleratedFailureCount
     *
     * @param toleratedFailureCount ToleratedFailureCount.
     */
    public fun toleratedFailureCount(toleratedFailureCount: Number) {
        cdkBuilder.toleratedFailureCount(toleratedFailureCount)
    }

    /**
     * ToleratedFailureCountPath.
     *
     * Number of failed items to tolerate in a Map Run, as JsonPath
     *
     * Default: - No toleratedFailureCountPath
     *
     * @param toleratedFailureCountPath ToleratedFailureCountPath.
     */
    public fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
        cdkBuilder.toleratedFailureCountPath(toleratedFailureCountPath)
    }

    /**
     * ToleratedFailurePercentage.
     *
     * Percentage of failed items to tolerate in a Map Run, as static number
     *
     * Default: - No toleratedFailurePercentage
     *
     * @param toleratedFailurePercentage ToleratedFailurePercentage.
     */
    public fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
        cdkBuilder.toleratedFailurePercentage(toleratedFailurePercentage)
    }

    /**
     * ToleratedFailurePercentagePath.
     *
     * Percentage of failed items to tolerate in a Map Run, as JsonPath
     *
     * Default: - No toleratedFailurePercentagePath
     *
     * @param toleratedFailurePercentagePath ToleratedFailurePercentagePath.
     */
    public fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
        cdkBuilder.toleratedFailurePercentagePath(toleratedFailurePercentagePath)
    }

    public fun build(): DistributedMap = cdkBuilder.build()
}
