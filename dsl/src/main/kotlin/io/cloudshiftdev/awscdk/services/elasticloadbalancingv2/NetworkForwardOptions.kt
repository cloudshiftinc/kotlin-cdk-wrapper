package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface NetworkForwardOptions {
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
   * A builder for [NetworkForwardOptions]
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
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions.builder()

    /**
     * @param stickinessDuration For how long clients should be directed to the same target group.
     * Range between 1 second and 7 days.
     */
    override fun stickinessDuration(stickinessDuration: Duration) {
      cdkBuilder.stickinessDuration(stickinessDuration.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions,
  ) : CdkObject(cdkObject), NetworkForwardOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkForwardOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions):
        NetworkForwardOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkForwardOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions
  }
}
