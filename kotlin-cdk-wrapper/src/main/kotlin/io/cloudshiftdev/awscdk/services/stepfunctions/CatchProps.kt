@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Error handler details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * CatchProps catchProps = CatchProps.builder()
 * .errors(List.of("errors"))
 * .resultPath("resultPath")
 * .build();
 * ```
 */
public interface CatchProps {
  /**
   * Errors to recover from by going to the given state.
   *
   * A list of error strings to retry, which can be either predefined errors
   * (for example Errors.NoChoiceMatched) or a self-defined error.
   *
   * Default: All errors
   */
  public fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

  /**
   * JSONPath expression to indicate where to inject the error data.
   *
   * May also be the special value JsonPath.DISCARD, which will cause the error
   * data to be discarded.
   *
   * Default: $
   */
  public fun resultPath(): String? = unwrap(this).getResultPath()

  /**
   * A builder for [CatchProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(errors: List<String>)

    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(vararg errors: String)

    /**
     * @param resultPath JSONPath expression to indicate where to inject the error data.
     * May also be the special value JsonPath.DISCARD, which will cause the error
     * data to be discarded.
     */
    public fun resultPath(resultPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CatchProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CatchProps.builder()

    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    override fun errors(errors: List<String>) {
      cdkBuilder.errors(errors)
    }

    /**
     * @param errors Errors to recover from by going to the given state.
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    override fun errors(vararg errors: String): Unit = errors(errors.toList())

    /**
     * @param resultPath JSONPath expression to indicate where to inject the error data.
     * May also be the special value JsonPath.DISCARD, which will cause the error
     * data to be discarded.
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CatchProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CatchProps,
  ) : CdkObject(cdkObject), CatchProps {
    /**
     * Errors to recover from by going to the given state.
     *
     * A list of error strings to retry, which can be either predefined errors
     * (for example Errors.NoChoiceMatched) or a self-defined error.
     *
     * Default: All errors
     */
    override fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

    /**
     * JSONPath expression to indicate where to inject the error data.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the error
     * data to be discarded.
     *
     * Default: $
     */
    override fun resultPath(): String? = unwrap(this).getResultPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CatchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CatchProps):
        CatchProps = CdkObjectWrappers.wrap(cdkObject) as CatchProps

    internal fun unwrap(wrapped: CatchProps):
        software.amazon.awscdk.services.stepfunctions.CatchProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.CatchProps
  }
}
