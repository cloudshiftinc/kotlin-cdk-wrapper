package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface NetworkForwardOptions {
  public fun stickinessDuration(): Duration? =
      unwrap(this).getStickinessDuration()?.let(Duration::wrap)

  public interface Builder {
    public fun stickinessDuration(stickinessDuration: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions.builder()

    override fun stickinessDuration(stickinessDuration: Duration) {
      cdkBuilder.stickinessDuration(stickinessDuration.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions,
  ) : NetworkForwardOptions {
    override fun stickinessDuration(): Duration? =
        unwrap(this).getStickinessDuration()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkForwardOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions):
        NetworkForwardOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkForwardOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions = (wrapped as
        Wrapper).cdkObject
  }
}
