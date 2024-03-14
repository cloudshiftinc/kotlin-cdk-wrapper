package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Version internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.Version,
) : QualifiedFunctionBase(cdkObject), IVersion {
  @Deprecated(message = "deprecated in CDK")
  public override fun addAlias(aliasName: String): Alias =
      unwrap(this).addAlias(aliasName).let(Alias::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun addAlias(aliasName: String, options: AliasOptions): Alias =
      unwrap(this).addAlias(aliasName, options.let(AliasOptions::unwrap)).let(Alias::wrap)

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ff57343b4e1566ac76515fa826125e96564152d30ba0ef3d24569a9cf452484")
  public override fun addAlias(aliasName: String, options: AliasOptions.Builder.() -> Unit): Alias =
      addAlias(aliasName, AliasOptions(options))

  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  public override fun edgeArn(): String = unwrap(this).getEdgeArn()

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

  public override fun version(): String = unwrap(this).getVersion()

  public interface Builder {
    public fun codeSha256(codeSha256: String)

    public fun description(description: String)

    public fun lambda(lambda: IFunction)

    public fun maxEventAge(maxEventAge: Duration)

    public fun onFailure(onFailure: IDestination)

    public fun onSuccess(onSuccess: IDestination)

    public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: Number)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Version.Builder =
        software.amazon.awscdk.services.lambda.Version.Builder.create(scope, id)

    override fun codeSha256(codeSha256: String) {
      cdkBuilder.codeSha256(codeSha256)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun lambda(lambda: IFunction) {
      cdkBuilder.lambda(lambda.let(IFunction::unwrap))
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

    public fun build(): software.amazon.awscdk.services.lambda.Version = cdkBuilder.build()
  }

  public companion object {
    public open fun fromVersionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      versionArn: String,
    ): IVersion =
        software.amazon.awscdk.services.lambda.Version.fromVersionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, versionArn).let(IVersion::wrap)

    public open fun fromVersionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VersionAttributes,
    ): IVersion =
        software.amazon.awscdk.services.lambda.Version.fromVersionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VersionAttributes::unwrap)).let(IVersion::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb465a0d3cfc3652ccdc9929ccc263eba569adee02088db50e59eb21d89d2830")
    public open fun fromVersionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VersionAttributes.Builder.() -> Unit,
    ): IVersion = fromVersionAttributes(scope, id, VersionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Version {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Version(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Version): Version =
        Version(cdkObject)

    internal fun unwrap(wrapped: Version): software.amazon.awscdk.services.lambda.Version =
        wrapped.cdkObject
  }
}
