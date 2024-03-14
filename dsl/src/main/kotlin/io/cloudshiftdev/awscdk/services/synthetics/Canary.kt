package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.LifecycleRule
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Canary internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.Canary,
) : Resource(cdkObject), IConnectable {
  public open fun artifactsBucket(): IBucket = unwrap(this).getArtifactsBucket().let(IBucket::wrap)

  public open fun canaryId(): String = unwrap(this).getCanaryId()

  public open fun canaryName(): String = unwrap(this).getCanaryName()

  public open fun canaryState(): String = unwrap(this).getCanaryState()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  public open fun metricDuration(options: MetricOptions): Metric =
      unwrap(this).metricDuration(options.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public open fun metricDuration(options: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(options))

  public open fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

  public open fun metricFailed(options: MetricOptions): Metric =
      unwrap(this).metricFailed(options.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public open fun metricFailed(options: MetricOptions.Builder.() -> Unit): Metric =
      metricFailed(MetricOptions(options))

  public open fun metricSuccessPercent(): Metric =
      unwrap(this).metricSuccessPercent().let(Metric::wrap)

  public open fun metricSuccessPercent(options: MetricOptions): Metric =
      unwrap(this).metricSuccessPercent(options.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("440514f5588d39cbe9cbdeafe3b15d768d76c9e168f35becb0e0afe0d2b06bfb")
  public open fun metricSuccessPercent(options: MetricOptions.Builder.() -> Unit): Metric =
      metricSuccessPercent(MetricOptions(options))

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public interface Builder {
    public fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>)

    public fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cba359b9320a239876b8e1a47380fa5d3221f2548b13aaa4c6ee90331bf90fa7")
    public
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit)

    public fun canaryName(canaryName: String)

    public fun cleanup(cleanup: Cleanup)

    public fun environmentVariables(environmentVariables: Map<String, String>)

    public fun failureRetentionPeriod(failureRetentionPeriod: Duration)

    public fun role(role: IRole)

    public fun runtime(runtime: Runtime)

    public fun schedule(schedule: Schedule)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun startAfterCreation(startAfterCreation: Boolean)

    public fun successRetentionPeriod(successRetentionPeriod: Duration)

    public fun test(test: Test)

    public fun timeToLive(timeToLive: Duration)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea7816fdc9d36fdb22296f345cc70fac642d963ca5449962c72b1b2ad55c7100")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.Canary.Builder =
        software.amazon.awscdk.services.synthetics.Canary.Builder.create(scope, id)

    override fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>) {
      cdkBuilder.artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.map(LifecycleRule::unwrap))
    }

    override fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation) {
      cdkBuilder.artifactsBucketLocation(artifactsBucketLocation.let(ArtifactsBucketLocation::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cba359b9320a239876b8e1a47380fa5d3221f2548b13aaa4c6ee90331bf90fa7")
    override
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit):
        Unit = artifactsBucketLocation(ArtifactsBucketLocation(artifactsBucketLocation))

    override fun canaryName(canaryName: String) {
      cdkBuilder.canaryName(canaryName)
    }

    override fun cleanup(cleanup: Cleanup) {
      cdkBuilder.cleanup(cleanup.let(Cleanup::unwrap))
    }

    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun failureRetentionPeriod(failureRetentionPeriod: Duration) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime::unwrap))
    }

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun startAfterCreation(startAfterCreation: Boolean) {
      cdkBuilder.startAfterCreation(startAfterCreation)
    }

    override fun successRetentionPeriod(successRetentionPeriod: Duration) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod.let(Duration::unwrap))
    }

    override fun test(test: Test) {
      cdkBuilder.test(test.let(Test::unwrap))
    }

    override fun timeToLive(timeToLive: Duration) {
      cdkBuilder.timeToLive(timeToLive.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea7816fdc9d36fdb22296f345cc70fac642d963ca5449962c72b1b2ad55c7100")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.synthetics.Canary = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Canary {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Canary(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Canary): Canary =
        Canary(cdkObject)

    internal fun unwrap(wrapped: Canary): software.amazon.awscdk.services.synthetics.Canary =
        wrapped.cdkObject
  }
}
