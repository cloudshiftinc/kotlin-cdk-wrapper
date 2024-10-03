@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Distributed Mode Map state in the state machine.
 *
 * A `Map` state can be used to run a set of steps for each element of an input array.
 * A Map state will execute the same steps for multiple entries of an array in the state input.
 *
 * While the Parallel state executes multiple branches of steps using the same input, a Map state
 * will execute the same steps for multiple entries of an array in the state input.
 *
 * A `Map` state in `Distributed` mode will execute a child workflow for each iteration of the Map
 * state.
 * This serves to increase concurrency and allows for larger workloads to be run in a single state
 * machine.
 *
 * Example:
 *
 * ```
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "DistributedMap")
 * .mapExecutionType(StateMachineType.EXPRESS)
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass"), ProcessorConfig.builder()
 * .mode(ProcessorMode.DISTRIBUTED)
 * .executionType(ProcessorType.STANDARD)
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-distributed.html)
 */
public open class DistributedMap(
  cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMap,
) : MapBase(cdkObject),
    INextable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.DistributedMap(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DistributedMapProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.DistributedMap(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DistributedMapProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DistributedMapProps.Builder.() -> Unit,
  ) : this(scope, id, DistributedMapProps(props)
  )

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable): DistributedMap =
      unwrap(this).addCatch(handler.let(IChainable.Companion::unwrap)).let(DistributedMap::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable, props: CatchProps): DistributedMap =
      unwrap(this).addCatch(handler.let(IChainable.Companion::unwrap),
      props.let(CatchProps.Companion::unwrap)).let(DistributedMap::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6635925eb39e6635549b784d2bdbc4cd33319139abc889c8271e518085caea7")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit):
      DistributedMap = addCatch(handler, CatchProps(props))

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(): DistributedMap = unwrap(this).addRetry().let(DistributedMap::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(props: RetryProps): DistributedMap =
      unwrap(this).addRetry(props.let(RetryProps.Companion::unwrap)).let(DistributedMap::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dce54c3cd0806411bf442674d791696bae21a79e691a761f2d5d8d2329efa375")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): DistributedMap =
      addRetry(RetryProps(props))

  /**
   * Define item processor in a Distributed Map.
   *
   * A Distributed Map must have a non-empty item processor
   *
   * @param processor 
   * @param config
   */
  public open fun itemProcessor(processor: IChainable): DistributedMap =
      unwrap(this).itemProcessor(processor.let(IChainable.Companion::unwrap)).let(DistributedMap::wrap)

  /**
   * Define item processor in a Distributed Map.
   *
   * A Distributed Map must have a non-empty item processor
   *
   * @param processor 
   * @param config
   */
  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig): DistributedMap =
      unwrap(this).itemProcessor(processor.let(IChainable.Companion::unwrap),
      config.let(ProcessorConfig.Companion::unwrap)).let(DistributedMap::wrap)

  /**
   * Define item processor in a Distributed Map.
   *
   * A Distributed Map must have a non-empty item processor
   *
   * @param processor 
   * @param config
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("252a9aadcff97f3e0a2ffd08ee67fa9299ca1ca7b082b6b7475ee45c4f2f40e9")
  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig.Builder.() -> Unit):
      DistributedMap = itemProcessor(processor, ProcessorConfig(config))

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.DistributedMap].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     *
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution. 
     */
    public fun itemBatcher(itemBatcher: ItemBatcher)

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     *
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aeab7f37a832a31bb89e715fbeb99a51fb9a2dd36e09f574eeec72eac44f70c")
    public fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit)

    /**
     * ItemReader.
     *
     * Configuration for where to read items dataset in S3 to iterate
     *
     * Default: - No itemReader
     *
     * @param itemReader ItemReader. 
     */
    public fun itemReader(itemReader: IItemReader)

    /**
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters`). 
     */
    public fun itemSelector(itemSelector: Map<String, Any>)

    /**
     * JSONPath expression to select the array to iterate over.
     *
     * Default: $
     *
     * @param itemsPath JSONPath expression to select the array to iterate over. 
     */
    public fun itemsPath(itemsPath: String)

    /**
     * Label.
     *
     * Unique name for the Distributed Map state added to each Map Run
     *
     * Default: - No label
     *
     * @param label Label. 
     */
    public fun label(label: String)

    /**
     * MapExecutionType.
     *
     * The execution type of the distributed map state
     *
     * This property overwrites ProcessorConfig.executionType
     *
     * Default: StateMachineType.STANDARD
     *
     * @param mapExecutionType MapExecutionType. 
     */
    public fun mapExecutionType(mapExecutionType: StateMachineType)

    /**
     * MaxConcurrency.
     *
     * An upper bound on the number of iterations you want running at once.
     *
     * Default: - full concurrency
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
     * @param maxConcurrency MaxConcurrency. 
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * MaxConcurrencyPath.
     *
     * A JsonPath that specifies the maximum concurrency dynamically from the state input.
     *
     * Default: - full concurrency
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
     * @param maxConcurrencyPath MaxConcurrencyPath. 
     */
    public fun maxConcurrencyPath(maxConcurrencyPath: String)

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @param resultWriter Configuration for S3 location in which to save Map Run results. 
     */
    public fun resultWriter(resultWriter: ResultWriter)

    /**
     * Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @param resultWriter Configuration for S3 location in which to save Map Run results. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16ba6ed0c805133e4b1d136a01333f5d91a2ddba1b0a40565a0fd7525711bc3c")
    public fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * ToleratedFailureCount.
     *
     * Number of failed items to tolerate in a Map Run, as static number
     *
     * Default: - No toleratedFailureCount
     *
     * @param toleratedFailureCount ToleratedFailureCount. 
     */
    public fun toleratedFailureCount(toleratedFailureCount: Number)

    /**
     * ToleratedFailureCountPath.
     *
     * Number of failed items to tolerate in a Map Run, as JsonPath
     *
     * Default: - No toleratedFailureCountPath
     *
     * @param toleratedFailureCountPath ToleratedFailureCountPath. 
     */
    public fun toleratedFailureCountPath(toleratedFailureCountPath: String)

    /**
     * ToleratedFailurePercentage.
     *
     * Percentage of failed items to tolerate in a Map Run, as static number
     *
     * Default: - No toleratedFailurePercentage
     *
     * @param toleratedFailurePercentage ToleratedFailurePercentage. 
     */
    public fun toleratedFailurePercentage(toleratedFailurePercentage: Number)

    /**
     * ToleratedFailurePercentagePath.
     *
     * Percentage of failed items to tolerate in a Map Run, as JsonPath
     *
     * Default: - No toleratedFailurePercentagePath
     *
     * @param toleratedFailurePercentagePath ToleratedFailurePercentagePath. 
     */
    public fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.DistributedMap.Builder =
        software.amazon.awscdk.services.stepfunctions.DistributedMap.Builder.create(scope, id)

    /**
     * An optional description for this state.
     *
     * Default: No comment
     *
     * @param comment An optional description for this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     *
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution. 
     */
    override fun itemBatcher(itemBatcher: ItemBatcher) {
      cdkBuilder.itemBatcher(itemBatcher.let(ItemBatcher.Companion::unwrap))
    }

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     *
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8aeab7f37a832a31bb89e715fbeb99a51fb9a2dd36e09f574eeec72eac44f70c")
    override fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit): Unit =
        itemBatcher(ItemBatcher(itemBatcher))

    /**
     * ItemReader.
     *
     * Configuration for where to read items dataset in S3 to iterate
     *
     * Default: - No itemReader
     *
     * @param itemReader ItemReader. 
     */
    override fun itemReader(itemReader: IItemReader) {
      cdkBuilder.itemReader(itemReader.let(IItemReader.Companion::unwrap))
    }

    /**
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters`). 
     */
    override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * JSONPath expression to select the array to iterate over.
     *
     * Default: $
     *
     * @param itemsPath JSONPath expression to select the array to iterate over. 
     */
    override fun itemsPath(itemsPath: String) {
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
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * MapExecutionType.
     *
     * The execution type of the distributed map state
     *
     * This property overwrites ProcessorConfig.executionType
     *
     * Default: StateMachineType.STANDARD
     *
     * @param mapExecutionType MapExecutionType. 
     */
    override fun mapExecutionType(mapExecutionType: StateMachineType) {
      cdkBuilder.mapExecutionType(mapExecutionType.let(StateMachineType.Companion::unwrap))
    }

    /**
     * MaxConcurrency.
     *
     * An upper bound on the number of iterations you want running at once.
     *
     * Default: - full concurrency
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
     * @param maxConcurrency MaxConcurrency. 
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * MaxConcurrencyPath.
     *
     * A JsonPath that specifies the maximum concurrency dynamically from the state input.
     *
     * Default: - full concurrency
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
     * @param maxConcurrencyPath MaxConcurrencyPath. 
     */
    override fun maxConcurrencyPath(maxConcurrencyPath: String) {
      cdkBuilder.maxConcurrencyPath(maxConcurrencyPath)
    }

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     *
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @param resultWriter Configuration for S3 location in which to save Map Run results. 
     */
    override fun resultWriter(resultWriter: ResultWriter) {
      cdkBuilder.resultWriter(resultWriter.let(ResultWriter.Companion::unwrap))
    }

    /**
     * Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @param resultWriter Configuration for S3 location in which to save Map Run results. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16ba6ed0c805133e4b1d136a01333f5d91a2ddba1b0a40565a0fd7525711bc3c")
    override fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit): Unit =
        resultWriter(ResultWriter(resultWriter))

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
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
    override fun toleratedFailureCount(toleratedFailureCount: Number) {
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
    override fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
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
    override fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
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
    override fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
      cdkBuilder.toleratedFailurePercentagePath(toleratedFailurePercentagePath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.DistributedMap =
        cdkBuilder.build()
  }

  public companion object {
    public fun isDistributedMap(x: Any): Boolean =
        software.amazon.awscdk.services.stepfunctions.DistributedMap.isDistributedMap(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DistributedMap {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DistributedMap(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMap):
        DistributedMap = DistributedMap(cdkObject)

    internal fun unwrap(wrapped: DistributedMap):
        software.amazon.awscdk.services.stepfunctions.DistributedMap = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.DistributedMap
  }
}
