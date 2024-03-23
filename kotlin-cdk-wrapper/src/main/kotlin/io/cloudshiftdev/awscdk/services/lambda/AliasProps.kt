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
 * Properties for a new Lambda alias.
 *
 * Example:
 *
 * ```
 * CfnParametersCode lambdaCode = Code.fromCfnParameters();
 * Function func = Function.Builder.create(this, "Lambda")
 * .code(lambdaCode)
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_LATEST)
 * .build();
 * // used to make sure each CDK synthesis produces a different Version
 * Version version = func.getCurrentVersion();
 * Alias alias = Alias.Builder.create(this, "LambdaAlias")
 * .aliasName("Prod")
 * .version(version)
 * .build();
 * LambdaDeploymentGroup.Builder.create(this, "DeploymentGroup")
 * .alias(alias)
 * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
 * .build();
 * ```
 */
public interface AliasProps : AliasOptions {
  /**
   * Name of this alias.
   */
  public fun aliasName(): String

  /**
   * Function version this alias refers to.
   *
   * Use lambda.currentVersion to reference a version with your latest changes.
   */
  public fun version(): IVersion

  /**
   * A builder for [AliasProps]
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
     * @param aliasName Name of this alias. 
     */
    public fun aliasName(aliasName: String)

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

    /**
     * @param version Function version this alias refers to. 
     * Use lambda.currentVersion to reference a version with your latest changes.
     */
    public fun version(version: IVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AliasProps.Builder =
        software.amazon.awscdk.services.lambda.AliasProps.builder()

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
     * @param aliasName Name of this alias. 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

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

    /**
     * @param version Function version this alias refers to. 
     * Use lambda.currentVersion to reference a version with your latest changes.
     */
    override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.AliasProps,
  ) : CdkObject(cdkObject), AliasProps {
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
     * Name of this alias.
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

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

    /**
     * Function version this alias refers to.
     *
     * Use lambda.currentVersion to reference a version with your latest changes.
     */
    override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AliasProps): AliasProps =
        CdkObjectWrappers.wrap(cdkObject) as? AliasProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasProps): software.amazon.awscdk.services.lambda.AliasProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.AliasProps
  }
}
