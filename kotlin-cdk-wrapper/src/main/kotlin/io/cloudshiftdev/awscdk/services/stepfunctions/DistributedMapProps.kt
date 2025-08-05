@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for configuring a Distribute Map state.
 *
 * Example:
 *
 * ```
 * / **
 * * JSON state input:
 * *  {
 * *    "bucketName": "my-bucket",
 * *    "prefix": "item"
 * *  }
 * *&#47;
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "DistributedMap")
 * .itemReader(S3ObjectsItemReader.Builder.create()
 * .bucketNamePath(JsonPath.stringAt("$.bucketName"))
 * .prefix(JsonPath.stringAt("$.prefix"))
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass"));
 * ```
 */
public interface DistributedMapProps : MapBaseProps, MapBaseOptions, MapBaseJsonPathOptions,
    MapBaseJsonataOptions {
  /**
   * Workflow variables to store in this step.
   *
   * Using workflow variables, you can store data in a step and retrieve that data in future steps.
   *
   * Default: - Not assign variables
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
   */
  public override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: $
   */
  public override fun inputPath(): String? = unwrap(this).getInputPath()

  /**
   * Specifies to process a group of items in a single child workflow execution.
   *
   * Default: - No itemBatcher
   */
  public fun itemBatcher(): ItemBatcher? = unwrap(this).getItemBatcher()?.let(ItemBatcher::wrap)

  /**
   * ItemReader.
   *
   * Configuration for where to read items dataset in S3 to iterate
   *
   * Default: - No itemReader
   */
  public fun itemReader(): IItemReader? = unwrap(this).getItemReader()?.let(IItemReader::wrap)

  /**
   * The JSON that you want to override your default iteration input (mutually exclusive  with
   * `parameters` and `jsonataItemSelector`).
   *
   * Default: $
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
   */
  public override fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?:
      emptyMap()

  /**
   * The array that the Map state will iterate over.
   *
   * Default: - The state input as is.
   */
  public override fun items(): ProvideItems? = unwrap(this).getItems()?.let(ProvideItems::wrap)

  /**
   * JSONPath expression to select the array to iterate over.
   *
   * Default: $
   */
  public override fun itemsPath(): String? = unwrap(this).getItemsPath()

  /**
   * Jsonata expression that evaluates to a JSON array to override your default iteration input
   * (mutually exclusive with `parameters` and `itemSelector`).
   *
   * Example value: `{% {\"foo\": \"foo\", \"input\": $states.input} %}`
   *
   * Default: $
   */
  public override fun jsonataItemSelector(): String? = unwrap(this).getJsonataItemSelector()

  /**
   * Label.
   *
   * Unique name for the Distributed Map state added to each Map Run
   *
   * Default: - No label
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * MapExecutionType.
   *
   * The execution type of the distributed map state
   *
   * This property overwrites ProcessorConfig.executionType
   *
   * Default: StateMachineType.STANDARD
   */
  public fun mapExecutionType(): StateMachineType? =
      unwrap(this).getMapExecutionType()?.let(StateMachineType::wrap)

  /**
   * MaxConcurrency.
   *
   * An upper bound on the number of iterations you want running at once.
   *
   * Default: - full concurrency
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
   */
  public override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  /**
   * MaxConcurrencyPath.
   *
   * A JsonPath that specifies the maximum concurrency dynamically from the state input.
   *
   * Default: - full concurrency
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
   */
  public override fun maxConcurrencyPath(): String? = unwrap(this).getMaxConcurrencyPath()

  /**
   * JSONPath expression to select part of the state to be the output to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   *
   * Default: $
   */
  public override fun outputPath(): String? = unwrap(this).getOutputPath()

  /**
   * Used to specify and transform output from the state.
   *
   * When specified, the value overrides the state output default.
   * The output field accepts any JSON value (object, array, string, number, boolean, null).
   * Any string value, including those inside objects or arrays,
   * will be evaluated as JSONata if surrounded by {% %} characters.
   * Output also accepts a JSONata expression directly.
   *
   * Default: - $states.result or $states.errorOutput
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
   */
  public override fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * JSONPath expression to indicate where to inject the state's output.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the state's
   * input to become its output.
   *
   * Default: $
   */
  public override fun resultPath(): String? = unwrap(this).getResultPath()

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
   */
  public override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?:
      emptyMap()

  /**
   * (deprecated) Configuration for S3 location in which to save Map Run results.
   *
   * Default: - No resultWriter
   *
   * @deprecated Use [resultWriterV2 ]
   */
  @Deprecated(message = "deprecated in CDK")
  public fun resultWriter(): ResultWriter? = unwrap(this).getResultWriter()?.let(ResultWriter::wrap)

  /**
   * Configuration for S3 location in which to save Map Run results Enable
   * "&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2" feature in the context to use
   * resultWriterV2 Example:
   * stack.node.setContext("&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2", true);
   *
   * Default: - No resultWriterV2
   */
  public fun resultWriterV2(): ResultWriterV2? =
      unwrap(this).getResultWriterV2()?.let(ResultWriterV2::wrap)

  /**
   * ToleratedFailureCount.
   *
   * Number of failed items to tolerate in a Map Run, as static number
   *
   * Default: - No toleratedFailureCount
   */
  public fun toleratedFailureCount(): Number? = unwrap(this).getToleratedFailureCount()

  /**
   * ToleratedFailureCountPath.
   *
   * Number of failed items to tolerate in a Map Run, as JsonPath
   *
   * Default: - No toleratedFailureCountPath
   */
  public fun toleratedFailureCountPath(): String? = unwrap(this).getToleratedFailureCountPath()

  /**
   * ToleratedFailurePercentage.
   *
   * Percentage of failed items to tolerate in a Map Run, as static number
   *
   * Default: - No toleratedFailurePercentage
   */
  public fun toleratedFailurePercentage(): Number? = unwrap(this).getToleratedFailurePercentage()

  /**
   * ToleratedFailurePercentagePath.
   *
   * Percentage of failed items to tolerate in a Map Run, as JsonPath
   *
   * Default: - No toleratedFailurePercentagePath
   */
  public fun toleratedFailurePercentagePath(): String? =
      unwrap(this).getToleratedFailurePercentagePath()

  /**
   * A builder for [DistributedMapProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    public fun assign(assign: Map<String, Any>)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution.
     */
    public fun itemBatcher(itemBatcher: ItemBatcher)

    /**
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfc466abd460c2258d435802d216d887efed2e899fe56f547c93866da73cf35a")
    public fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit)

    /**
     * @param itemReader ItemReader.
     * Configuration for where to read items dataset in S3 to iterate
     */
    public fun itemReader(itemReader: IItemReader)

    /**
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    public fun itemSelector(itemSelector: Map<String, Any>)

    /**
     * @param items The array that the Map state will iterate over.
     */
    public fun items(items: ProvideItems)

    /**
     * @param itemsPath JSONPath expression to select the array to iterate over.
     */
    public fun itemsPath(itemsPath: String)

    /**
     * @param jsonataItemSelector Jsonata expression that evaluates to a JSON array to override your
     * default iteration input (mutually exclusive with `parameters` and `itemSelector`).
     * Example value: `{% {\"foo\": \"foo\", \"input\": $states.input} %}`
     */
    public fun jsonataItemSelector(jsonataItemSelector: String)

    /**
     * @param label Label.
     * Unique name for the Distributed Map state added to each Map Run
     */
    public fun label(label: String)

    /**
     * @param mapExecutionType MapExecutionType.
     * The execution type of the distributed map state
     *
     * This property overwrites ProcessorConfig.executionType
     */
    public fun mapExecutionType(mapExecutionType: StateMachineType)

    /**
     * @param maxConcurrency MaxConcurrency.
     * An upper bound on the number of iterations you want running at once.
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * @param maxConcurrencyPath MaxConcurrencyPath.
     * A JsonPath that specifies the maximum concurrency dynamically from the state input.
     */
    public fun maxConcurrencyPath(maxConcurrencyPath: String)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    public fun queryLanguage(queryLanguage: QueryLanguage)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    public fun resultPath(resultPath: String)

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * @param resultWriter Configuration for S3 location in which to save Map Run results.
     * @deprecated Use [resultWriterV2 ]
     */
    @Deprecated(message = "deprecated in CDK")
    public fun resultWriter(resultWriter: ResultWriter)

    /**
     * @param resultWriter Configuration for S3 location in which to save Map Run results.
     * @deprecated Use [resultWriterV2 ]
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f1bea22b30405e0038adacd4b7e46eac1ba1932a0e4516c754b509f597dc076")
    public fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit)

    /**
     * @param resultWriterV2 Configuration for S3 location in which to save Map Run results Enable
     * "&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2" feature in the context to use
     * resultWriterV2 Example:
     * stack.node.setContext("&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2", true);.
     */
    public fun resultWriterV2(resultWriterV2: ResultWriterV2)

    /**
     * @param resultWriterV2 Configuration for S3 location in which to save Map Run results Enable
     * "&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2" feature in the context to use
     * resultWriterV2 Example:
     * stack.node.setContext("&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2", true);.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b68bf173568131ec3134c4d408003970efaf6a97d11c99eca90f885ddb94818")
    public fun resultWriterV2(resultWriterV2: ResultWriterV2.Builder.() -> Unit)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param toleratedFailureCount ToleratedFailureCount.
     * Number of failed items to tolerate in a Map Run, as static number
     */
    public fun toleratedFailureCount(toleratedFailureCount: Number)

    /**
     * @param toleratedFailureCountPath ToleratedFailureCountPath.
     * Number of failed items to tolerate in a Map Run, as JsonPath
     */
    public fun toleratedFailureCountPath(toleratedFailureCountPath: String)

    /**
     * @param toleratedFailurePercentage ToleratedFailurePercentage.
     * Percentage of failed items to tolerate in a Map Run, as static number
     */
    public fun toleratedFailurePercentage(toleratedFailurePercentage: Number)

    /**
     * @param toleratedFailurePercentagePath ToleratedFailurePercentagePath.
     * Percentage of failed items to tolerate in a Map Run, as JsonPath
     */
    public fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.DistributedMapProps.Builder =
        software.amazon.awscdk.services.stepfunctions.DistributedMapProps.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution.
     */
    override fun itemBatcher(itemBatcher: ItemBatcher) {
      cdkBuilder.itemBatcher(itemBatcher.let(ItemBatcher.Companion::unwrap))
    }

    /**
     * @param itemBatcher Specifies to process a group of items in a single child workflow
     * execution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfc466abd460c2258d435802d216d887efed2e899fe56f547c93866da73cf35a")
    override fun itemBatcher(itemBatcher: ItemBatcher.Builder.() -> Unit): Unit =
        itemBatcher(ItemBatcher(itemBatcher))

    /**
     * @param itemReader ItemReader.
     * Configuration for where to read items dataset in S3 to iterate
     */
    override fun itemReader(itemReader: IItemReader) {
      cdkBuilder.itemReader(itemReader.let(IItemReader.Companion::unwrap))
    }

    /**
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param items The array that the Map state will iterate over.
     */
    override fun items(items: ProvideItems) {
      cdkBuilder.items(items.let(ProvideItems.Companion::unwrap))
    }

    /**
     * @param itemsPath JSONPath expression to select the array to iterate over.
     */
    override fun itemsPath(itemsPath: String) {
      cdkBuilder.itemsPath(itemsPath)
    }

    /**
     * @param jsonataItemSelector Jsonata expression that evaluates to a JSON array to override your
     * default iteration input (mutually exclusive with `parameters` and `itemSelector`).
     * Example value: `{% {\"foo\": \"foo\", \"input\": $states.input} %}`
     */
    override fun jsonataItemSelector(jsonataItemSelector: String) {
      cdkBuilder.jsonataItemSelector(jsonataItemSelector)
    }

    /**
     * @param label Label.
     * Unique name for the Distributed Map state added to each Map Run
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param mapExecutionType MapExecutionType.
     * The execution type of the distributed map state
     *
     * This property overwrites ProcessorConfig.executionType
     */
    override fun mapExecutionType(mapExecutionType: StateMachineType) {
      cdkBuilder.mapExecutionType(mapExecutionType.let(StateMachineType.Companion::unwrap))
    }

    /**
     * @param maxConcurrency MaxConcurrency.
     * An upper bound on the number of iterations you want running at once.
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param maxConcurrencyPath MaxConcurrencyPath.
     * A JsonPath that specifies the maximum concurrency dynamically from the state input.
     */
    override fun maxConcurrencyPath(maxConcurrencyPath: String) {
      cdkBuilder.maxConcurrencyPath(maxConcurrencyPath)
    }

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    override fun outputs(outputs: Any) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param queryLanguage The name of the query language used by the state.
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     */
    override fun queryLanguage(queryLanguage: QueryLanguage) {
      cdkBuilder.queryLanguage(queryLanguage.let(QueryLanguage.Companion::unwrap))
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output.
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied.
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param resultWriter Configuration for S3 location in which to save Map Run results.
     * @deprecated Use [resultWriterV2 ]
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resultWriter(resultWriter: ResultWriter) {
      cdkBuilder.resultWriter(resultWriter.let(ResultWriter.Companion::unwrap))
    }

    /**
     * @param resultWriter Configuration for S3 location in which to save Map Run results.
     * @deprecated Use [resultWriterV2 ]
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f1bea22b30405e0038adacd4b7e46eac1ba1932a0e4516c754b509f597dc076")
    override fun resultWriter(resultWriter: ResultWriter.Builder.() -> Unit): Unit =
        resultWriter(ResultWriter(resultWriter))

    /**
     * @param resultWriterV2 Configuration for S3 location in which to save Map Run results Enable
     * "&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2" feature in the context to use
     * resultWriterV2 Example:
     * stack.node.setContext("&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2", true);.
     */
    override fun resultWriterV2(resultWriterV2: ResultWriterV2) {
      cdkBuilder.resultWriterV2(resultWriterV2.let(ResultWriterV2.Companion::unwrap))
    }

    /**
     * @param resultWriterV2 Configuration for S3 location in which to save Map Run results Enable
     * "&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2" feature in the context to use
     * resultWriterV2 Example:
     * stack.node.setContext("&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2", true);.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b68bf173568131ec3134c4d408003970efaf6a97d11c99eca90f885ddb94818")
    override fun resultWriterV2(resultWriterV2: ResultWriterV2.Builder.() -> Unit): Unit =
        resultWriterV2(ResultWriterV2(resultWriterV2))

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param toleratedFailureCount ToleratedFailureCount.
     * Number of failed items to tolerate in a Map Run, as static number
     */
    override fun toleratedFailureCount(toleratedFailureCount: Number) {
      cdkBuilder.toleratedFailureCount(toleratedFailureCount)
    }

    /**
     * @param toleratedFailureCountPath ToleratedFailureCountPath.
     * Number of failed items to tolerate in a Map Run, as JsonPath
     */
    override fun toleratedFailureCountPath(toleratedFailureCountPath: String) {
      cdkBuilder.toleratedFailureCountPath(toleratedFailureCountPath)
    }

    /**
     * @param toleratedFailurePercentage ToleratedFailurePercentage.
     * Percentage of failed items to tolerate in a Map Run, as static number
     */
    override fun toleratedFailurePercentage(toleratedFailurePercentage: Number) {
      cdkBuilder.toleratedFailurePercentage(toleratedFailurePercentage)
    }

    /**
     * @param toleratedFailurePercentagePath ToleratedFailurePercentagePath.
     * Percentage of failed items to tolerate in a Map Run, as JsonPath
     */
    override fun toleratedFailurePercentagePath(toleratedFailurePercentagePath: String) {
      cdkBuilder.toleratedFailurePercentagePath(toleratedFailurePercentagePath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.DistributedMapProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMapProps,
  ) : CdkObject(cdkObject),
      DistributedMapProps {
    /**
     * Workflow variables to store in this step.
     *
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     *
     * Default: - Not assign variables
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-variables.html)
     */
    override fun assign(): Map<String, Any> = unwrap(this).getAssign() ?: emptyMap()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: $
     */
    override fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * Specifies to process a group of items in a single child workflow execution.
     *
     * Default: - No itemBatcher
     */
    override fun itemBatcher(): ItemBatcher? = unwrap(this).getItemBatcher()?.let(ItemBatcher::wrap)

    /**
     * ItemReader.
     *
     * Configuration for where to read items dataset in S3 to iterate
     *
     * Default: - No itemReader
     */
    override fun itemReader(): IItemReader? = unwrap(this).getItemReader()?.let(IItemReader::wrap)

    /**
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters` and `jsonataItemSelector`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     */
    override fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?: emptyMap()

    /**
     * The array that the Map state will iterate over.
     *
     * Default: - The state input as is.
     */
    override fun items(): ProvideItems? = unwrap(this).getItems()?.let(ProvideItems::wrap)

    /**
     * JSONPath expression to select the array to iterate over.
     *
     * Default: $
     */
    override fun itemsPath(): String? = unwrap(this).getItemsPath()

    /**
     * Jsonata expression that evaluates to a JSON array to override your default iteration input
     * (mutually exclusive with `parameters` and `itemSelector`).
     *
     * Example value: `{% {\"foo\": \"foo\", \"input\": $states.input} %}`
     *
     * Default: $
     */
    override fun jsonataItemSelector(): String? = unwrap(this).getJsonataItemSelector()

    /**
     * Label.
     *
     * Unique name for the Distributed Map state added to each Map Run
     *
     * Default: - No label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * MapExecutionType.
     *
     * The execution type of the distributed map state
     *
     * This property overwrites ProcessorConfig.executionType
     *
     * Default: StateMachineType.STANDARD
     */
    override fun mapExecutionType(): StateMachineType? =
        unwrap(this).getMapExecutionType()?.let(StateMachineType::wrap)

    /**
     * MaxConcurrency.
     *
     * An upper bound on the number of iterations you want running at once.
     *
     * Default: - full concurrency
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
     */
    override fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

    /**
     * MaxConcurrencyPath.
     *
     * A JsonPath that specifies the maximum concurrency dynamically from the state input.
     *
     * Default: - full concurrency
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
     */
    override fun maxConcurrencyPath(): String? = unwrap(this).getMaxConcurrencyPath()

    /**
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()

    /**
     * Used to specify and transform output from the state.
     *
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     *
     * Default: - $states.result or $states.errorOutput
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-input-output-filtering.html)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The name of the query language used by the state.
     *
     * If the state does not contain a `queryLanguage` field,
     * then it will use the query language specified in the top-level `queryLanguage` field.
     *
     * Default: - JSONPath
     */
    override fun queryLanguage(): QueryLanguage? =
        unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()

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
     */
    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    /**
     * (deprecated) Configuration for S3 location in which to save Map Run results.
     *
     * Default: - No resultWriter
     *
     * @deprecated Use [resultWriterV2 ]
     */
    @Deprecated(message = "deprecated in CDK")
    override fun resultWriter(): ResultWriter? =
        unwrap(this).getResultWriter()?.let(ResultWriter::wrap)

    /**
     * Configuration for S3 location in which to save Map Run results Enable
     * "&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2" feature in the context to use
     * resultWriterV2 Example:
     * stack.node.setContext("&#64;aws-cdk/aws-stepfunctions:useDistributedMapResultWriterV2", true);
     *
     * Default: - No resultWriterV2
     */
    override fun resultWriterV2(): ResultWriterV2? =
        unwrap(this).getResultWriterV2()?.let(ResultWriterV2::wrap)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * ToleratedFailureCount.
     *
     * Number of failed items to tolerate in a Map Run, as static number
     *
     * Default: - No toleratedFailureCount
     */
    override fun toleratedFailureCount(): Number? = unwrap(this).getToleratedFailureCount()

    /**
     * ToleratedFailureCountPath.
     *
     * Number of failed items to tolerate in a Map Run, as JsonPath
     *
     * Default: - No toleratedFailureCountPath
     */
    override fun toleratedFailureCountPath(): String? = unwrap(this).getToleratedFailureCountPath()

    /**
     * ToleratedFailurePercentage.
     *
     * Percentage of failed items to tolerate in a Map Run, as static number
     *
     * Default: - No toleratedFailurePercentage
     */
    override fun toleratedFailurePercentage(): Number? =
        unwrap(this).getToleratedFailurePercentage()

    /**
     * ToleratedFailurePercentagePath.
     *
     * Percentage of failed items to tolerate in a Map Run, as JsonPath
     *
     * Default: - No toleratedFailurePercentagePath
     */
    override fun toleratedFailurePercentagePath(): String? =
        unwrap(this).getToleratedFailurePercentagePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DistributedMapProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.DistributedMapProps):
        DistributedMapProps = CdkObjectWrappers.wrap(cdkObject) as? DistributedMapProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DistributedMapProps):
        software.amazon.awscdk.services.stepfunctions.DistributedMapProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.DistributedMapProps
  }
}
