package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VersionOptions : EventInvokeConfigOptions {
  public fun codeSha256(): String? = unwrap(this).getCodeSha256()

  public fun description(): String? = unwrap(this).getDescription()

  public fun provisionedConcurrentExecutions(): Number? =
      unwrap(this).getProvisionedConcurrentExecutions()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public interface Builder {
    public fun codeSha256(codeSha256: String)

    public fun description(description: String)

    public fun maxEventAge(maxEventAge: Duration)

    public fun onFailure(onFailure: IDestination)

    public fun onSuccess(onSuccess: IDestination)

    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionOptions.Builder =
        software.amazon.awscdk.services.lambda.VersionOptions.builder()

    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
      cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.VersionOptions,
  ) : VersionOptions {
    override fun codeSha256(): String? = unwrap(this).getCodeSha256()

    override fun description(): String? = unwrap(this).getDescription()

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

    override fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    override fun provisionedConcurrentExecutions(): Number? =
        unwrap(this).getProvisionedConcurrentExecutions()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VersionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.VersionOptions):
        VersionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VersionOptions):
        software.amazon.awscdk.services.lambda.VersionOptions = (wrapped as Wrapper).cdkObject
  }
}
