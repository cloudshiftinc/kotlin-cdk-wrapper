package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VersionOptions : EventInvokeConfigOptions {
  /**
   * SHA256 of the version of the Lambda source code.
   *
   * Specify to validate that you're deploying the right version.
   *
   * Default: No validation is performed
   */
  public fun codeSha256(): String? = unwrap(this).getCodeSha256()

  /**
   * Description of the version.
   *
   * Default: Description of the Lambda
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies a provisioned concurrency configuration for a function's version.
   *
   * Default: No provisioned concurrency
   */
  public fun provisionedConcurrentExecutions(): Number? =
      unwrap(this).getProvisionedConcurrentExecutions()

  /**
   * Whether to retain old versions of this function when a new version is created.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [VersionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param codeSha256 SHA256 of the version of the Lambda source code.
     * Specify to validate that you're deploying the right version.
     */
    public fun codeSha256(codeSha256: String)

    /**
     * @param description Description of the version.
     */
    public fun description(description: String)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum: 60 seconds
     * Maximum: 6 hours
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param onFailure The destination for failed invocations.
     */
    public fun onFailure(onFailure: IDestination)

    /**
     * @param onSuccess The destination for successful invocations.
     */
    public fun onSuccess(onSuccess: IDestination)

    /**
     * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for
     * a function's version.
     */
    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    /**
     * @param removalPolicy Whether to retain old versions of this function when a new version is
     * created.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionOptions.Builder =
        software.amazon.awscdk.services.lambda.VersionOptions.builder()

    /**
     * @param codeSha256 SHA256 of the version of the Lambda source code.
     * Specify to validate that you're deploying the right version.
     */
    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    /**
     * @param description Description of the version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum: 60 seconds
     * Maximum: 6 hours
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * @param onFailure The destination for failed invocations.
     */
    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination::unwrap))
    }

    /**
     * @param onSuccess The destination for successful invocations.
     */
    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination::unwrap))
    }

    /**
     * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for
     * a function's version.
     */
    override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
      cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    /**
     * @param removalPolicy Whether to retain old versions of this function when a new version is
     * created.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.VersionOptions,
  ) : VersionOptions {
    /**
     * SHA256 of the version of the Lambda source code.
     *
     * Specify to validate that you're deploying the right version.
     *
     * Default: No validation is performed
     */
    override fun codeSha256(): String? = unwrap(this).getCodeSha256()

    /**
     * Description of the version.
     *
     * Default: Description of the Lambda
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     */
    override fun onFailure(): IDestination? = unwrap(this).getOnFailure()?.let(IDestination::wrap)

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     */
    override fun onSuccess(): IDestination? = unwrap(this).getOnSuccess()?.let(IDestination::wrap)

    /**
     * Specifies a provisioned concurrency configuration for a function's version.
     *
     * Default: No provisioned concurrency
     */
    override fun provisionedConcurrentExecutions(): Number? =
        unwrap(this).getProvisionedConcurrentExecutions()

    /**
     * Whether to retain old versions of this function when a new version is created.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     */
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
