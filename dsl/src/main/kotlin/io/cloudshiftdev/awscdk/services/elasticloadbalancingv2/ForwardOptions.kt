package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

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
      cdkBuilder.stickinessDuration(stickinessDuration.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions,
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
        ForwardOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ForwardOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions
  }
}