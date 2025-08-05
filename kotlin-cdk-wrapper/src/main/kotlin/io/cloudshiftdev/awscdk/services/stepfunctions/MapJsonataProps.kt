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
 * Properties for defining a Map state that using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object assign;
 * Object itemSelector;
 * Object outputs;
 * Object parameters;
 * ProvideItems provideItems;
 * MapJsonataProps mapJsonataProps = MapJsonataProps.builder()
 * .assign(Map.of(
 * "assignKey", assign))
 * .comment("comment")
 * .items(provideItems)
 * .itemSelector(Map.of(
 * "itemSelectorKey", itemSelector))
 * .jsonataItemSelector("jsonataItemSelector")
 * .maxConcurrency(123)
 * .outputs(outputs)
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface MapJsonataProps : StateBaseProps, MapBaseOptions, MapBaseJsonataOptions {
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
   * A builder for [MapJsonataProps]
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
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    public fun itemSelector(itemSelector: Map<String, Any>)

    /**
     * @param items The array that the Map state will iterate over.
     */
    public fun items(items: ProvideItems)

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
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)

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
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.MapJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.MapJsonataProps.builder()

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
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.MapJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.MapJsonataProps,
  ) : CdkObject(cdkObject),
      MapJsonataProps {
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
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MapJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapJsonataProps):
        MapJsonataProps = CdkObjectWrappers.wrap(cdkObject) as? MapJsonataProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapJsonataProps):
        software.amazon.awscdk.services.stepfunctions.MapJsonataProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapJsonataProps
  }
}
