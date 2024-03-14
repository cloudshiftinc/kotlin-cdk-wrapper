package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Alias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.Alias,
) : QualifiedFunctionBase(cdkObject), IAlias {
  public open fun addAutoScaling(options: AutoScalingOptions): IScalableFunctionAttribute =
      unwrap(this).addAutoScaling(options.let(AutoScalingOptions::unwrap)).let(IScalableFunctionAttribute::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1939eaaefe45a52e29d71e48c2c7d3c23205eb5582cb105e3cb351edf5919714")
  public open fun addAutoScaling(options: AutoScalingOptions.Builder.() -> Unit):
      IScalableFunctionAttribute = addAutoScaling(AutoScalingOptions(options))

  public override fun aliasName(): String = unwrap(this).getAliasName()

  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun functionName(): String = unwrap(this).getFunctionName()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)

  public interface Builder {
    public fun additionalVersions(additionalVersions: List<VersionWeight>)

    public fun aliasName(aliasName: String)

    public fun description(description: String)

    public fun maxEventAge(maxEventAge: Duration)

    public fun onFailure(onFailure: IDestination)

    public fun onSuccess(onSuccess: IDestination)

    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    public fun retryAttempts(retryAttempts: Number)

    public fun version(version: IVersion)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Alias.Builder =
        software.amazon.awscdk.services.lambda.Alias.Builder.create(scope, id)

    override fun additionalVersions(additionalVersions: List<VersionWeight>) {
      cdkBuilder.additionalVersions(additionalVersions.map(VersionWeight::unwrap))
    }

    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
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

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.Alias = cdkBuilder.build()
  }

  public companion object {
    public open fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes,
    ): IAlias =
        software.amazon.awscdk.services.lambda.Alias.fromAliasAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(AliasAttributes::unwrap)).let(IAlias::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33308014d704af36d994cc374bcae095f260400d1c1da242bd71dc6553c34889")
    public open fun fromAliasAttributes(
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
        wrapped.cdkObject
  }
}
