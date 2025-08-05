@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Base properties for defining a Map state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object assign;
 * Object itemSelector;
 * MapBaseOptions mapBaseOptions = MapBaseOptions.builder()
 * .assign(Map.of(
 * "assignKey", assign))
 * .itemSelector(Map.of(
 * "itemSelectorKey", itemSelector))
 * .jsonataItemSelector("jsonataItemSelector")
 * .maxConcurrency(123)
 * .build();
 * ```
 */
public interface MapBaseOptions : AssignableStateOptions {
  /**
   * The JSON that you want to override your default iteration input (mutually exclusive  with
   * `parameters` and `jsonataItemSelector`).
   *
   * Default: $
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
   */
  public fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?: emptyMap()

  /**
   * Jsonata expression that evaluates to a JSON array to override your default iteration input
   * (mutually exclusive with `parameters` and `itemSelector`).
   *
   * Example value: `{% {\"foo\": \"foo\", \"input\": $states.input} %}`
   *
   * Default: $
   */
  public fun jsonataItemSelector(): String? = unwrap(this).getJsonataItemSelector()

  /**
   * MaxConcurrency.
   *
   * An upper bound on the number of iterations you want running at once.
   *
   * Default: - full concurrency
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-asl-use-map-state-inline.html#map-state-inline-additional-fields)
   */
  public fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  /**
   * A builder for [MapBaseOptions]
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
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    public fun itemSelector(itemSelector: Map<String, Any>)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.MapBaseOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.MapBaseOptions.builder()

    /**
     * @param assign Workflow variables to store in this step.
     * Using workflow variables, you can store data in a step and retrieve that data in future
     * steps.
     */
    override fun assign(assign: Map<String, Any>) {
      cdkBuilder.assign(assign.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param itemSelector The JSON that you want to override your default iteration input (mutually
     * exclusive  with `parameters` and `jsonataItemSelector`).
     */
    override fun itemSelector(itemSelector: Map<String, Any>) {
      cdkBuilder.itemSelector(itemSelector.mapValues{CdkObjectWrappers.unwrap(it.value)})
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.MapBaseOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.MapBaseOptions,
  ) : CdkObject(cdkObject),
      MapBaseOptions {
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
     * The JSON that you want to override your default iteration input (mutually exclusive  with
     * `parameters` and `jsonataItemSelector`).
     *
     * Default: $
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-itemselector.html)
     */
    override fun itemSelector(): Map<String, Any> = unwrap(this).getItemSelector() ?: emptyMap()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MapBaseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapBaseOptions):
        MapBaseOptions = CdkObjectWrappers.wrap(cdkObject) as? MapBaseOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapBaseOptions):
        software.amazon.awscdk.services.stepfunctions.MapBaseOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapBaseOptions
  }
}
