package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateService
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationMultipleTargetGroupsFargateService internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService,
) : ApplicationMultipleTargetGroupsServiceBase(cdkObject) {
  public open fun assignPublicIp(): Boolean = unwrap(this).getAssignPublicIp()

  public open fun service(): FargateService = unwrap(this).getService().let(FargateService::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun targetGroup(): ApplicationTargetGroup =
      unwrap(this).getTargetGroup().let(ApplicationTargetGroup::wrap)

  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean) {
    }

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("712be5f1e131c638ed95475dff64f13a48c29f44ae442a2119763bf883dd4a94")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun desiredCount(desiredCount: Number) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    }

    public fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun platformVersion(platformVersion: FargatePlatformVersion) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69dcd7c4e3108bf2b069391264b2886743b8a22a489b1401fc95b72caa1bc77a")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
    }

    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    }

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("915c961f86b74e2e76719b9f4270829ced9adc70ea13a7152156d997b3bf6b03")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService.Builder.create(scope,
        id)

    public override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("712be5f1e131c638ed95475dff64f13a48c29f44ae442a2119763bf883dd4a94")
    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    public override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    public override fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(ApplicationLoadBalancerProps::unwrap))
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    public override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    public override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69dcd7c4e3108bf2b069391264b2886743b8a22a489b1401fc95b72caa1bc77a")
    public override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(ApplicationTargetProps::unwrap))
    }

    public override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    public override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("915c961f86b74e2e76719b9f4270829ced9adc70ea13a7152156d997b3bf6b03")
    public override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageProps(taskImageOptions))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationMultipleTargetGroupsFargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationMultipleTargetGroupsFargateService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService):
        ApplicationMultipleTargetGroupsFargateService =
        ApplicationMultipleTargetGroupsFargateService(cdkObject)

    internal fun unwrap(wrapped: ApplicationMultipleTargetGroupsFargateService):
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService =
        wrapped.cdkObject
  }
}
