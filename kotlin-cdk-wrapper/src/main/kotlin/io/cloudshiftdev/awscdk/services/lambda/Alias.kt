@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new alias to a particular version of a Lambda function.
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
public open class Alias(
  cdkObject: software.amazon.awscdk.services.lambda.Alias,
) : QualifiedFunctionBase(cdkObject),
    IAlias {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AliasProps,
  ) :
      this(software.amazon.awscdk.services.lambda.Alias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AliasProps.Builder.() -> Unit,
  ) : this(scope, id, AliasProps(props)
  )

  /**
   * Configure provisioned concurrency autoscaling on a function alias.
   *
   * Returns a scalable attribute that can call
   * `scaleOnUtilization()` and `scaleOnSchedule()`.
   *
   * @param options Autoscaling options. 
   */
  public open fun addAutoScaling(options: AutoScalingOptions): IScalableFunctionAttribute =
      unwrap(this).addAutoScaling(options.let(AutoScalingOptions.Companion::unwrap)).let(IScalableFunctionAttribute::wrap)

  /**
   * Configure provisioned concurrency autoscaling on a function alias.
   *
   * Returns a scalable attribute that can call
   * `scaleOnUtilization()` and `scaleOnSchedule()`.
   *
   * @param options Autoscaling options. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1939eaaefe45a52e29d71e48c2c7d3c23205eb5582cb105e3cb351edf5919714")
  public open fun addAutoScaling(options: AutoScalingOptions.Builder.() -> Unit):
      IScalableFunctionAttribute = addAutoScaling(AutoScalingOptions(options))

  /**
   * Name of this alias.
   */
  public override fun aliasName(): String = unwrap(this).getAliasName()

  /**
   * The architecture of this Lambda Function.
   */
  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  /**
   * ARN of this alias.
   *
   * Used to be able to use Alias in place of a regular Lambda. Lambda accepts
   * ARNs everywhere it accepts function names.
   */
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  /**
   * ARN of this alias.
   *
   * Used to be able to use Alias in place of a regular Lambda. Lambda accepts
   * ARNs everywhere it accepts function names.
   */
  public override fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * The principal this Lambda Function is running as.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * The underlying `IFunction`.
   */
  public override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

  /**
   * Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The IAM role associated with this function.
   *
   * Undefined if the function was imported without a role.
   */
  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The underlying Lambda function version.
   */
  public override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.Alias].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param additionalVersions Additional versions with individual weights this alias points to. 
     */
    public fun additionalVersions(additionalVersions: List<VersionWeight>)

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
     *
     * @param additionalVersions Additional versions with individual weights this alias points to. 
     */
    public fun additionalVersions(vararg additionalVersions: VersionWeight)

    /**
     * Name of this alias.
     *
     * @param aliasName Name of this alias. 
     */
    public fun aliasName(aliasName: String)

    /**
     * Description for the alias.
     *
     * Default: No description
     *
     * @param description Description for the alias. 
     */
    public fun description(description: String)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     *
     * @param onFailure The destination for failed invocations. 
     */
    public fun onFailure(onFailure: IDestination)

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     *
     * @param onSuccess The destination for successful invocations. 
     */
    public fun onSuccess(onSuccess: IDestination)

    /**
     * Specifies a provisioned concurrency configuration for a function's alias.
     *
     * Default: No provisioned concurrency
     *
     * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for
     * a function's alias. 
     */
    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Function version this alias refers to.
     *
     * Use lambda.currentVersion to reference a version with your latest changes.
     *
     * @param version Function version this alias refers to. 
     */
    public fun version(version: IVersion)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Alias.Builder =
        software.amazon.awscdk.services.lambda.Alias.Builder.create(scope, id)

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
     *
     * @param additionalVersions Additional versions with individual weights this alias points to. 
     */
    override fun additionalVersions(additionalVersions: List<VersionWeight>) {
      cdkBuilder.additionalVersions(additionalVersions.map(VersionWeight.Companion::unwrap))
    }

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
     *
     * @param additionalVersions Additional versions with individual weights this alias points to. 
     */
    override fun additionalVersions(vararg additionalVersions: VersionWeight): Unit =
        additionalVersions(additionalVersions.toList())

    /**
     * Name of this alias.
     *
     * @param aliasName Name of this alias. 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * Description for the alias.
     *
     * Default: No description
     *
     * @param description Description for the alias. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum: 60 seconds
     * Maximum: 6 hours
     *
     * Default: Duration.hours(6)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The destination for failed invocations.
     *
     * Default: - no destination
     *
     * @param onFailure The destination for failed invocations. 
     */
    override fun onFailure(onFailure: IDestination) {
      cdkBuilder.onFailure(onFailure.let(IDestination.Companion::unwrap))
    }

    /**
     * The destination for successful invocations.
     *
     * Default: - no destination
     *
     * @param onSuccess The destination for successful invocations. 
     */
    override fun onSuccess(onSuccess: IDestination) {
      cdkBuilder.onSuccess(onSuccess.let(IDestination.Companion::unwrap))
    }

    /**
     * Specifies a provisioned concurrency configuration for a function's alias.
     *
     * Default: No provisioned concurrency
     *
     * @param provisionedConcurrentExecutions Specifies a provisioned concurrency configuration for
     * a function's alias. 
     */
    override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number) {
      cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum: 0
     * Maximum: 2
     *
     * Default: 2
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Function version this alias refers to.
     *
     * Use lambda.currentVersion to reference a version with your latest changes.
     *
     * @param version Function version this alias refers to. 
     */
    override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.Alias = cdkBuilder.build()
  }

  public companion object {
    public fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes,
    ): IAlias =
        software.amazon.awscdk.services.lambda.Alias.fromAliasAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(AliasAttributes.Companion::unwrap)).let(IAlias::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33308014d704af36d994cc374bcae095f260400d1c1da242bd71dc6553c34889")
    public fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes.Builder.() -> Unit,
    ): IAlias = fromAliasAttributes(scope, id, AliasAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Alias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Alias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Alias): Alias =
        Alias(cdkObject)

    internal fun unwrap(wrapped: Alias): software.amazon.awscdk.services.lambda.Alias =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.Alias
  }
}
