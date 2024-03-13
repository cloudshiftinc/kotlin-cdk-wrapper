package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface ForwardOptions {
  public fun stickinessDuration(): Duration? =
      unwrap(this).getStickinessDuration()?.let(Duration::wrap)

  public interface Builder {
    public fun stickinessDuration(stickinessDuration: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions.builder()

    public override fun stickinessDuration(stickinessDuration: Duration) {
      cdkBuilder.stickinessDuration(stickinessDuration.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions,
  ) : ForwardOptions {
    public override fun stickinessDuration(): Duration? =
        unwrap(this).getStickinessDuration()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ForwardOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions):
        ForwardOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ForwardOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions = (wrapped as
        Wrapper).cdkObject
  }
}
