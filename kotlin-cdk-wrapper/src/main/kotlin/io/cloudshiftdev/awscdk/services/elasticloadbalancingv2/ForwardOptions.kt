@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Options for `ListenerAction.forward()`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ForwardOptions forwardOptions = ForwardOptions.builder()
 * .stickinessDuration(Duration.minutes(30))
 * .build();
 * ```
 */
public interface ForwardOptions {
  /**
   * For how long clients should be directed to the same target group.
   *
   * Range between 1 second and 7 days.
   *
   * Default: - No stickiness
   */
  public fun stickinessDuration(): Duration? =
      unwrap(this).getStickinessDuration()?.let(Duration::wrap)

  /**
   * A builder for [ForwardOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param stickinessDuration For how long clients should be directed to the same target group.
     * Range between 1 second and 7 days.
     */
    public fun stickinessDuration(stickinessDuration: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions.builder()

    /**
     * @param stickinessDuration For how long clients should be directed to the same target group.
     * Range between 1 second and 7 days.
     */
    override fun stickinessDuration(stickinessDuration: Duration) {
      cdkBuilder.stickinessDuration(stickinessDuration.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions,
  ) : CdkObject(cdkObject), ForwardOptions {
    /**
     * For how long clients should be directed to the same target group.
     *
     * Range between 1 second and 7 days.
     *
     * Default: - No stickiness
     */
    override fun stickinessDuration(): Duration? =
        unwrap(this).getStickinessDuration()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ForwardOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions):
        ForwardOptions = CdkObjectWrappers.wrap(cdkObject) as? ForwardOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ForwardOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions
  }
}
