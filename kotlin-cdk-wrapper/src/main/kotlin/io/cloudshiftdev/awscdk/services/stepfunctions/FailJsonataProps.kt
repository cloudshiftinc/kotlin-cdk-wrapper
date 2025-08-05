@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a Fail state that using JSONata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * FailJsonataProps failJsonataProps = FailJsonataProps.builder()
 * .cause("cause")
 * .comment("comment")
 * .error("error")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface FailJsonataProps : StateBaseProps {
  /**
   * A description for the cause of the failure.
   *
   * Default: - No description
   */
  public fun cause(): String? = unwrap(this).getCause()

  /**
   * Error code used to represent this failure.
   *
   * Default: - No error code
   */
  public fun error(): String? = unwrap(this).getError()

  /**
   * A builder for [FailJsonataProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cause A description for the cause of the failure.
     */
    public fun cause(cause: String)

    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

    /**
     * @param error Error code used to represent this failure.
     */
    public fun error(error: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FailJsonataProps.Builder =
        software.amazon.awscdk.services.stepfunctions.FailJsonataProps.builder()

    /**
     * @param cause A description for the cause of the failure.
     */
    override fun cause(cause: String) {
      cdkBuilder.cause(cause)
    }

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param error Error code used to represent this failure.
     */
    override fun error(error: String) {
      cdkBuilder.error(error)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.FailJsonataProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.FailJsonataProps,
  ) : CdkObject(cdkObject),
      FailJsonataProps {
    /**
     * A description for the cause of the failure.
     *
     * Default: - No description
     */
    override fun cause(): String? = unwrap(this).getCause()

    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Error code used to represent this failure.
     *
     * Default: - No error code
     */
    override fun error(): String? = unwrap(this).getError()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): FailJsonataProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FailJsonataProps):
        FailJsonataProps = CdkObjectWrappers.wrap(cdkObject) as? FailJsonataProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FailJsonataProps):
        software.amazon.awscdk.services.stepfunctions.FailJsonataProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.FailJsonataProps
  }
}
