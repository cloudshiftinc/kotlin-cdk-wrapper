@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for `lambda.Alias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * IDestination destination;
 * Version version;
 * AliasOptions aliasOptions = AliasOptions.builder()
 * .additionalVersions(List.of(VersionWeight.builder()
 * .version(version)
 * .weight(123)
 * .build()))
 * .description("description")
 * .maxEventAge(Duration.minutes(30))
 * .onFailure(destination)
 * .onSuccess(destination)
 * .provisionedConcurrentExecutions(123)
 * .retryAttempts(123)
 * .build();
 * ```
 */
public interface AliasOptions : EventInvokeConfigOptions {
  /**
   * Additional versions with individual weights this alias points to.
   *
   * Individual additional version weights specified here should add up to
   * (less than) one. All remaining weight is routed to the default
   * version.
   *
   * For example, the config is
   *
   * version: "1"
   * additionalVersions: [{ version: "2", weight: 0.05 }]
   *
   * Then 5% of traffic will be routed to function version 2, while
   * the remaining 95% of traffic will be routed to function version 1.
   *
   * Default: No additional versions
   */
  public fun additionalVersions(): List<VersionWeight> =
      unwrap(this).getAdditionalVersions()?.map(VersionWeight::wrap) ?: emptyList()

  /**
   * Description for the alias.
   *
   * Default: No description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies a provisioned concurrency configuration for a function's alias.
   *
   * Default: No provisioned concurrency
   */
  public fun provisionedConcurrentExecutions(): Number? =
      unwrap(this).getProvisionedConcurrentExecutions()

  /**
   * A builder for [AliasOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalVersions Additional versions with individual weights this alias points to.
     * Individual additional version weights specified here should add up to
     * (less than) one. All remaining weight is routed to the default
     * version.
     *
     * For example, the config is
     *
     * version: "1"
     * additionalVersions: [{ version: "2", weight: 0.05 }]
     *
     * Then 5% of traffic will be routed to function version 2, while
     * the remaining 95% of traffic will be routed to function version 1.
     */
    public fun additionalVersions(additionalVersions: List<VersionWeight>)

    /**
     * @param additionalVersions Additional versions with individual weights this alias points to.
     * Individual additional version weights specified here should add up to
     * (less than) one. All remaining weight is routed to the default
     * version.
     *
     * For example, the config is
     *
     * version: "1"
     * additionalVersions: [{ version: "2", weight: 0.05 }]
     *
     * Then 5% of traffic will be routed to function version 2, while
     * the remaining 95% of traffic will be routed to function version 1.
     */
    public fun additionalVersions(vararg additionalVersions: VersionWeight)

    /**
     * @param description Description for the alias.
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
     * a function's alias.
     */
    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AliasOptions.Builder =
        software.amazon.awscdk.services.lambda.AliasOptions.builder()

    /**
     * @param additionalVersions Additional versions with individual weights this alias points to.
     * Individual additional version weights specified here should add up to
     * (less than) one. All remaining weight is routed to the default
     * version.
     *
     * For example, the config is
     *
     * version: "1"
     * additionalVersions: [{ version: "2", weight: 0.05 }]
     *
     * Then 5% of traffic will be routed to function version 2, while
     * the remaining 95% of traffic will be routed to function version 1.
     */
    override fun additionalVersions(additionalVersions: List<VersionWeight>) {
      cdkBuilder.additionalVersions(additionalVersions.map(VersionWeight::unwrap))
    }

    /**
     * @param additionalVersions Additional versions with individual weights this alias points to.
     * Individual additional version weights specified here should add up to
     * (less than) one. All remaining weight is routed to the default
     * version.
     *
     * For example, the config is
     *
     * version: "1"
     * additionalVersions: [{ version: "2", weight: 0.05 }]
     *
     * Then 5% of traffic will be routed to function version 2, while
     * the remaining 95% of traffic will be routed to function version 1.
     */
    override fun additionalVersions(vararg additionalVersions: VersionWeight): Unit =
        additionalVersions(additionalVersions.toList())

    /**
     * @param description Description for the alias.
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
     * a function's alias.
     */
    override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
      cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum: 0
     * Maximum: 2
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.lambda.AliasOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.AliasOptions,
  ) : CdkObject(cdkObject), AliasOptions {
    /**
     * Additional versions with individual weights this alias points to.
     *
     * Individual additional version weights specified here should add up to
     * (less than) one. All remaining weight is routed to the default
     * version.
     *
     * For example, the config is
     *
     * version: "1"
     * additionalVersions: [{ version: "2", weight: 0.05 }]
     *
     * Then 5% of traffic will be routed to function version 2, while
     * the remaining 95% of traffic will be routed to function version 1.
     *
     * Default: No additional versions
     */
    override fun additionalVersions(): List<VersionWeight> =
        unwrap(this).getAdditionalVersions()?.map(VersionWeight::wrap) ?: emptyList()

    /**
     * Description for the alias.
     *
     * Default: No description
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
     * Specifies a provisioned concurrency configuration for a function's alias.
     *
     * Default: No provisioned concurrency
     */
    override fun provisionedConcurrentExecutions(): Number? =
        unwrap(this).getProvisionedConcurrentExecutions()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AliasOptions): AliasOptions
        = CdkObjectWrappers.wrap(cdkObject) as? AliasOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasOptions): software.amazon.awscdk.services.lambda.AliasOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.AliasOptions
  }
}
