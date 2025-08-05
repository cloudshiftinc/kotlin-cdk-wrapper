@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Base properties for defining a Map state that using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object outputs;
 * ProvideItems provideItems;
 * MapBaseJsonataOptions mapBaseJsonataOptions = MapBaseJsonataOptions.builder()
 * .items(provideItems)
 * .outputs(outputs)
 * .build();
 * ```
 */
public interface MapBaseJsonataOptions : JsonataCommonOptions {
  /**
   * The array that the Map state will iterate over.
   *
   * Default: - The state input as is.
   */
  public fun items(): ProvideItems? = unwrap(this).getItems()?.let(ProvideItems::wrap)

  /**
   * A builder for [MapBaseJsonataOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param items The array that the Map state will iterate over.
     */
    public fun items(items: ProvideItems)

    /**
     * @param outputs Used to specify and transform output from the state.
     * When specified, the value overrides the state output default.
     * The output field accepts any JSON value (object, array, string, number, boolean, null).
     * Any string value, including those inside objects or arrays,
     * will be evaluated as JSONata if surrounded by {% %} characters.
     * Output also accepts a JSONata expression directly.
     */
    public fun outputs(outputs: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions.builder()

    /**
     * @param items The array that the Map state will iterate over.
     */
    override fun items(items: ProvideItems) {
      cdkBuilder.items(items.let(ProvideItems.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions,
  ) : CdkObject(cdkObject),
      MapBaseJsonataOptions {
    /**
     * The array that the Map state will iterate over.
     *
     * Default: - The state input as is.
     */
    override fun items(): ProvideItems? = unwrap(this).getItems()?.let(ProvideItems::wrap)

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MapBaseJsonataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions):
        MapBaseJsonataOptions = CdkObjectWrappers.wrap(cdkObject) as? MapBaseJsonataOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapBaseJsonataOptions):
        software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapBaseJsonataOptions
  }
}
