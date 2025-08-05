@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties shared by all states.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * StateBaseProps stateBaseProps = StateBaseProps.builder()
 * .comment("comment")
 * .queryLanguage(QueryLanguage.JSON_PATH)
 * .stateName("stateName")
 * .build();
 * ```
 */
public interface StateBaseProps {
  /**
   * A comment describing this state.
   *
   * Default: No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The name of the query language used by the state.
   *
   * If the state does not contain a `queryLanguage` field,
   * then it will use the query language specified in the top-level `queryLanguage` field.
   *
   * Default: - JSONPath
   */
  public fun queryLanguage(): QueryLanguage? =
      unwrap(this).getQueryLanguage()?.let(QueryLanguage::wrap)

  /**
   * Optional name for this state.
   *
   * Default: - The construct ID will be used as state name
   */
  public fun stateName(): String? = unwrap(this).getStateName()

  /**
   * A builder for [StateBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment describing this state.
     */
    public fun comment(comment: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.StateBaseProps.Builder =
        software.amazon.awscdk.services.stepfunctions.StateBaseProps.builder()

    /**
     * @param comment A comment describing this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.StateBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.StateBaseProps,
  ) : CdkObject(cdkObject),
      StateBaseProps {
    /**
     * A comment describing this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): StateBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateBaseProps):
        StateBaseProps = CdkObjectWrappers.wrap(cdkObject) as? StateBaseProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StateBaseProps):
        software.amazon.awscdk.services.stepfunctions.StateBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.StateBaseProps
  }
}
