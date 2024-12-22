@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Options when Applying an Aspect.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * AspectOptions aspectOptions = AspectOptions.builder()
 * .priority(123)
 * .build();
 * ```
 */
public interface AspectOptions {
  /**
   * The priority value to apply on an Aspect.
   *
   * Priority must be a non-negative integer.
   *
   * Default: - AspectPriority.DEFAULT
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * A builder for [AspectOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param priority The priority value to apply on an Aspect.
     * Priority must be a non-negative integer.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AspectOptions.Builder =
        software.amazon.awscdk.AspectOptions.builder()

    /**
     * @param priority The priority value to apply on an Aspect.
     * Priority must be a non-negative integer.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.AspectOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.AspectOptions,
  ) : CdkObject(cdkObject),
      AspectOptions {
    /**
     * The priority value to apply on an Aspect.
     *
     * Priority must be a non-negative integer.
     *
     * Default: - AspectPriority.DEFAULT
     */
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AspectOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AspectOptions): AspectOptions =
        CdkObjectWrappers.wrap(cdkObject) as? AspectOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AspectOptions): software.amazon.awscdk.AspectOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.AspectOptions
  }
}
