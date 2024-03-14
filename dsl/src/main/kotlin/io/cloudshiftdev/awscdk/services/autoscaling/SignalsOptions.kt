package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface SignalsOptions {
  public fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public interface Builder {
    public fun minSuccessPercentage(minSuccessPercentage: Number)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.SignalsOptions.Builder =
        software.amazon.awscdk.services.autoscaling.SignalsOptions.builder()

    override fun minSuccessPercentage(minSuccessPercentage: Number) {
      cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.SignalsOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.SignalsOptions,
  ) : SignalsOptions {
    override fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SignalsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.SignalsOptions):
        SignalsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignalsOptions):
        software.amazon.awscdk.services.autoscaling.SignalsOptions = (wrapped as Wrapper).cdkObject
  }
}
