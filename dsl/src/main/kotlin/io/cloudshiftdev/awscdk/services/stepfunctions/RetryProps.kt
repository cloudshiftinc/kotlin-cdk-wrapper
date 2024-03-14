package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RetryProps {
  public fun backoffRate(): Number? = unwrap(this).getBackoffRate()

  public fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun jitterStrategy(): JitterType? = unwrap(this).getJitterStrategy()?.let(JitterType::wrap)

  public fun maxAttempts(): Number? = unwrap(this).getMaxAttempts()

  public fun maxDelay(): Duration? = unwrap(this).getMaxDelay()?.let(Duration::wrap)

  public interface Builder {
    public fun backoffRate(backoffRate: Number)

    public fun errors(errors: List<String>)

    public fun interval(interval: Duration)

    public fun jitterStrategy(jitterStrategy: JitterType)

    public fun maxAttempts(maxAttempts: Number)

    public fun maxDelay(maxDelay: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.RetryProps.Builder =
        software.amazon.awscdk.services.stepfunctions.RetryProps.builder()

    override fun backoffRate(backoffRate: Number) {
      cdkBuilder.backoffRate(backoffRate)
    }

    override fun errors(errors: List<String>) {
      cdkBuilder.errors(errors)
    }

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun jitterStrategy(jitterStrategy: JitterType) {
      cdkBuilder.jitterStrategy(jitterStrategy.let(JitterType::unwrap))
    }

    override fun maxAttempts(maxAttempts: Number) {
      cdkBuilder.maxAttempts(maxAttempts)
    }

    override fun maxDelay(maxDelay: Duration) {
      cdkBuilder.maxDelay(maxDelay.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.RetryProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.RetryProps,
  ) : RetryProps {
    override fun backoffRate(): Number? = unwrap(this).getBackoffRate()

    override fun errors(): List<String> = unwrap(this).getErrors() ?: emptyList()

    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    override fun jitterStrategy(): JitterType? =
        unwrap(this).getJitterStrategy()?.let(JitterType::wrap)

    override fun maxAttempts(): Number? = unwrap(this).getMaxAttempts()

    override fun maxDelay(): Duration? = unwrap(this).getMaxDelay()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RetryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.RetryProps):
        RetryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RetryProps):
        software.amazon.awscdk.services.stepfunctions.RetryProps = (wrapped as Wrapper).cdkObject
  }
}
