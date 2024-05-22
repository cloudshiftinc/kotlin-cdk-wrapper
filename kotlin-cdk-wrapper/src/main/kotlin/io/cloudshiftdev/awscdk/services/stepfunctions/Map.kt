@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a Map state in the state machine.
 *
 * A `Map` state can be used to run a set of steps for each element of an input array.
 * A Map state will execute the same steps for multiple entries of an array in the state input.
 *
 * While the Parallel state executes multiple branches of steps using the same input, a Map state
 * will execute the same steps for multiple entries of an array in the state input.
 *
 * Example:
 *
 * ```
 * Map map = Map.Builder.create(this, "Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .itemSelector(Map.of(
 * "item", JsonPath.stringAt("$.Map.Item.Value")))
 * .resultPath("$.mapOutput")
 * .build();
 * // The Map iterator can contain a IChainable, which can be an individual or multiple steps
 * chained together.
 * // Below example is with a Choice and Pass step
 * Choice choice = new Choice(this, "Choice");
 * Condition condition1 = Condition.stringEquals("$.item.status", "SUCCESS");
 * Pass step1 = new Pass(this, "Step1");
 * Pass step2 = new Pass(this, "Step2");
 * Pass finish = new Pass(this, "Finish");
 * Chain definition = choice.when(condition1, step1).otherwise(step2).afterwards().next(finish);
 * map.itemProcessor(definition);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-map-state.html)
 */
public open class Map(
  cdkObject: software.amazon.awscdk.services.stepfunctions.Map,
) : MapBase(cdkObject), INextable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.Map(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: MapProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.Map(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(MapProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: MapProps.Builder.() -> Unit,
  ) : this(scope, id, MapProps(props)
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
  public open fun addCatch(handler: IChainable): Map =
      unwrap(this).addCatch(handler.let(IChainable.Companion::unwrap)).let(Map::wrap)

  /**
   * Add a recovery handler for this state.
   *
   * When a particular error occurs, execution will continue at the error
   * handler instead of failing the state machine execution.
   *
   * @param handler 
   * @param props
   */
  public open fun addCatch(handler: IChainable, props: CatchProps): Map =
      unwrap(this).addCatch(handler.let(IChainable.Companion::unwrap),
      props.let(CatchProps.Companion::unwrap)).let(Map::wrap)

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
  @JvmName("649d9f3291ef4d0ef63a8c5a0298abac7d1de4b3e19759ec17eebcb73c9b5546")
  public open fun addCatch(handler: IChainable, props: CatchProps.Builder.() -> Unit): Map =
      addCatch(handler, CatchProps(props))

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(): Map = unwrap(this).addRetry().let(Map::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  public open fun addRetry(props: RetryProps): Map =
      unwrap(this).addRetry(props.let(RetryProps.Companion::unwrap)).let(Map::wrap)

  /**
   * Add retry configuration for this state.
   *
   * This controls if and how the execution will be retried if a particular
   * error occurs.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("661fedc3f68f12ca44a055f347012794aff87d8bc21e2414b45d66eeec8cda0f")
  public open fun addRetry(props: RetryProps.Builder.() -> Unit): Map = addRetry(RetryProps(props))

  /**
   * Define item processor in Map.
   *
   * A Map must either have a non-empty iterator or a non-empty item processor (mutually exclusive 
   * with `iterator`).
   *
   * @param processor 
   * @param config
   */
  public open fun itemProcessor(processor: IChainable): Map =
      unwrap(this).itemProcessor(processor.let(IChainable.Companion::unwrap)).let(Map::wrap)

  /**
   * Define item processor in Map.
   *
   * A Map must either have a non-empty iterator or a non-empty item processor (mutually exclusive 
   * with `iterator`).
   *
   * @param processor 
   * @param config
   */
  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig): Map =
      unwrap(this).itemProcessor(processor.let(IChainable.Companion::unwrap),
      config.let(ProcessorConfig.Companion::unwrap)).let(Map::wrap)

  /**
   * Define item processor in Map.
   *
   * A Map must either have a non-empty iterator or a non-empty item processor (mutually exclusive 
   * with `iterator`).
   *
   * @param processor 
   * @param config
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71a7ba7c6943da14aead58a96c7a9536157cdb72a42de33acb42a1e121af8bfd")
  public open fun itemProcessor(processor: IChainable, config: ProcessorConfig.Builder.() -> Unit):
      Map = itemProcessor(processor, ProcessorConfig(config))

  /**
   * (deprecated) Define iterator state machine in Map.
   *
   * A Map must either have a non-empty iterator or a non-empty item processor (mutually exclusive 
   * with `itemProcessor`).
   *
   * * use `itemProcessor` instead.
   * @param iterator 
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun iterator(iterator: IChainable): Map =
      unwrap(this).iterator(iterator.let(IChainable.Companion::unwrap)).let(Map::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.Map].
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
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters`). 
     */
    public fun itemSelector(itemSelector: kotlin.collections.Map<String, Any>)

    /**
     * JSONPath expression to select the array to iterate over.
     *
     * Default: $
     *
     * @param itemsPath JSONPath expression to select the array to iterate over. 
     */
    public fun itemsPath(itemsPath: String)

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
     * (deprecated) The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @deprecated Step Functions has deprecated the `parameters` field in favor of
     * the new `itemSelector` field
     * @param parameters The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`). 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun parameters(parameters: kotlin.collections.Map<String, Any>)

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
    public fun resultSelector(resultSelector: kotlin.collections.Map<String, Any>)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Map.Builder =
        software.amazon.awscdk.services.stepfunctions.Map.Builder.create(scope, id)

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
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters`). 
     */
    override fun itemSelector(itemSelector: kotlin.collections.Map<String, Any>) {
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
     * (deprecated) The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @deprecated Step Functions has deprecated the `parameters` field in favor of
     * the new `itemSelector` field
     * @param parameters The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`). 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun parameters(parameters: kotlin.collections.Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
    override fun resultSelector(resultSelector: kotlin.collections.Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.Map = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Map {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Map(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Map): Map =
        Map(cdkObject)

    internal fun unwrap(wrapped: Map): software.amazon.awscdk.services.stepfunctions.Map =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.Map
  }
}
