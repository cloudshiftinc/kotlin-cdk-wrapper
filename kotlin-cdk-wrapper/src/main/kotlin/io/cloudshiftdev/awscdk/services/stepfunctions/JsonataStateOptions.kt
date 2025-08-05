@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Option properties for JSONata task state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object arguments_;
 * Object outputs;
 * JsonataStateOptions jsonataStateOptions = JsonataStateOptions.builder()
 * .arguments(arguments_)
 * .outputs(outputs)
 * .build();
 * ```
 */
public interface JsonataStateOptions : JsonataCommonOptions {
  /**
   * Parameters pass a collection of key-value pairs, either static values or JSONata expressions
   * that select from the input.
   *
   * Default: - No arguments
   *
   * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/transforming-data.html)
   */
  public fun arguments(): Any? = unwrap(this).getArguments()

  /**
   * A builder for [JsonataStateOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arguments Parameters pass a collection of key-value pairs, either static values or
     * JSONata expressions that select from the input.
     */
    public fun arguments(arguments: Any)

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
        software.amazon.awscdk.services.stepfunctions.JsonataStateOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.JsonataStateOptions.builder()

    /**
     * @param arguments Parameters pass a collection of key-value pairs, either static values or
     * JSONata expressions that select from the input.
     */
    override fun arguments(arguments: Any) {
      cdkBuilder.arguments(arguments)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.JsonataStateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.JsonataStateOptions,
  ) : CdkObject(cdkObject),
      JsonataStateOptions {
    /**
     * Parameters pass a collection of key-value pairs, either static values or JSONata expressions
     * that select from the input.
     *
     * Default: - No arguments
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/transforming-data.html)
     */
    override fun arguments(): Any? = unwrap(this).getArguments()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonataStateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.JsonataStateOptions):
        JsonataStateOptions = CdkObjectWrappers.wrap(cdkObject) as? JsonataStateOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonataStateOptions):
        software.amazon.awscdk.services.stepfunctions.JsonataStateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.JsonataStateOptions
  }
}
