@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Option properties for JSONPath state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * JsonPathCommonOptions jsonPathCommonOptions = JsonPathCommonOptions.builder()
 * .inputPath("inputPath")
 * .outputPath("outputPath")
 * .build();
 * ```
 */
public interface JsonPathCommonOptions {
  /**
   * JSONPath expression to select part of the state to be the input to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * input to be the empty object {}.
   *
   * Default: $
   */
  public fun inputPath(): String? = unwrap(this).getInputPath()

  /**
   * JSONPath expression to select part of the state to be the output to this state.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the effective
   * output to be the empty object {}.
   *
   * Default: $
   */
  public fun outputPath(): String? = unwrap(this).getOutputPath()

  /**
   * A builder for [JsonPathCommonOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     */
    public fun inputPath(inputPath: String)

    /**
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    public fun outputPath(outputPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions.builder()

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
     * @param outputPath JSONPath expression to select part of the state to be the output to this
     * state.
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions,
  ) : CdkObject(cdkObject),
      JsonPathCommonOptions {
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
     * JSONPath expression to select part of the state to be the output to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: $
     */
    override fun outputPath(): String? = unwrap(this).getOutputPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonPathCommonOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions):
        JsonPathCommonOptions = CdkObjectWrappers.wrap(cdkObject) as? JsonPathCommonOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonPathCommonOptions):
        software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.JsonPathCommonOptions
  }
}
