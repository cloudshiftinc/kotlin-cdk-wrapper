@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for finding reachable states.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * FindStateOptions findStateOptions = FindStateOptions.builder()
 * .includeErrorHandlers(false)
 * .build();
 * ```
 */
public interface FindStateOptions {
  /**
   * Whether or not to follow error-handling transitions.
   *
   * Default: false
   */
  public fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

  /**
   * A builder for [FindStateOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param includeErrorHandlers Whether or not to follow error-handling transitions.
     */
    public fun includeErrorHandlers(includeErrorHandlers: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FindStateOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.FindStateOptions.builder()

    /**
     * @param includeErrorHandlers Whether or not to follow error-handling transitions.
     */
    override fun includeErrorHandlers(includeErrorHandlers: Boolean) {
      cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.FindStateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.FindStateOptions,
  ) : CdkObject(cdkObject),
      FindStateOptions {
    /**
     * Whether or not to follow error-handling transitions.
     *
     * Default: false
     */
    override fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FindStateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FindStateOptions):
        FindStateOptions = CdkObjectWrappers.wrap(cdkObject) as? FindStateOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FindStateOptions):
        software.amazon.awscdk.services.stepfunctions.FindStateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.FindStateOptions
  }
}
