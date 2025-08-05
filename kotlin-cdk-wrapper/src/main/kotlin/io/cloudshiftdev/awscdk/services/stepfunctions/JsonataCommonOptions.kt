@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Option properties for JSONata state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object outputs;
 * JsonataCommonOptions jsonataCommonOptions = JsonataCommonOptions.builder()
 * .outputs(outputs)
 * .build();
 * ```
 */
public interface JsonataCommonOptions {
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
  public fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * A builder for [JsonataCommonOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
        software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions,
  ) : CdkObject(cdkObject),
      JsonataCommonOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonataCommonOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions):
        JsonataCommonOptions = CdkObjectWrappers.wrap(cdkObject) as? JsonataCommonOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonataCommonOptions):
        software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.JsonataCommonOptions
  }
}
