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

/**
 * Properties for defining a Map state that using JSONPath.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object assign;
 * Object itemSelector;
 * Object parameters;
 * Object resultSelector;
 * MapJsonPathProps mapJsonPathProps = MapJsonPathProps.builder()
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .inputPath("inputPath")
 * .itemSelector(Map.of(
 * "itemSelectorKey", itemSelector))
 * .itemsPath("itemsPath")
 * .jsonataItemSelector("jsonataItemSelector")
 * .maxConcurrency(123)
 * .maxConcurrencyPath("maxConcurrencyPath")
 * .outputPath("outputPath")
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .resultPath("resultPath")
 * .resultSelector(Map.of(
 * "resultSelectorKey", resultSelector))
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface MapJsonPathProps : StateBaseProps, MapBaseOptions, MapBaseJsonPathOptions {
  /**
   * (deprecated) The JSON that you want to override your default iteration input (mutually
   * exclusive  with `itemSelector`).
   *
   * Default: $
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
   * @deprecated Step Functions has deprecated the `parameters` field in favor of
   * the new `itemSelector` field
   */
  @Deprecated(message = "deprecated in CDK")
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * A builder for [MapJsonPathProps]
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
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    public fun itemSelector(itemSelector: Map<String, Any>)

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
     * @param parameters The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`).
     * @deprecated Step Functions has deprecated the `parameters` field in favor of
     * the new `itemSelector` field
     */
    @Deprecated(message = "deprecated in CDK")
    public fun parameters(parameters: Map<String, Any>)

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
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.MapJsonPathProps.Builder =
        software.amazon.awscdk.services.stepfunctions.MapJsonPathProps.builder()

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
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
     * @param parameters The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`).
     * @deprecated Step Functions has deprecated the `parameters` field in favor of
     * the new `itemSelector` field
     */
    @Deprecated(message = "deprecated in CDK")
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.MapJsonPathProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.MapJsonPathProps,
  ) : CdkObject(cdkObject),
      MapJsonPathProps {
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
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters` and `jsonataItemSelector`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     */
    override fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?: emptyMap()

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
     * (deprecated) The JSON that you want to override your default iteration input (mutually
     * exclusive  with `itemSelector`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     * @deprecated Step Functions has deprecated the `parameters` field in favor of
     * the new `itemSelector` field
     */
    @Deprecated(message = "deprecated in CDK")
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MapJsonPathProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapJsonPathProps):
        MapJsonPathProps = CdkObjectWrappers.wrap(cdkObject) as? MapJsonPathProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapJsonPathProps):
        software.amazon.awscdk.services.stepfunctions.MapJsonPathProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapJsonPathProps
  }
}
