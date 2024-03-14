package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface EventInvokeConfigOptions {
  public fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

  public fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

  public fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  public interface Builder {
    public fun maxEventAge(maxEventAge: Duration) {
    }

    public fun onFailure(onFailure: IDestination) {
    }

    public fun onSuccess(onSuccess: IDestination) {
    }

    public fun retryAttempts(retryAttempts: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventInvokeConfigOptions.Builder
        = software.amazon.awscdk.services.lambda.EventInvokeConfigOptions.builder()

    public override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    public override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    public override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    public override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventInvokeConfigOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfigOptions,
  ) : EventInvokeConfigOptions {
    public override fun maxEventAge(): Duration? =
        unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    public override fun onFailure(): IDestination? =
        unwrap(this).getOnFailure()?.let(IDestination::wrap)

    public override fun onSuccess(): IDestination? =
        unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EventInvokeConfigOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventInvokeConfigOptions):
        EventInvokeConfigOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventInvokeConfigOptions):
        software.amazon.awscdk.services.lambda.EventInvokeConfigOptions = (wrapped as
        Wrapper).cdkObject
  }
}
