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
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
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

public open class NetworkMultipleTargetGroupsFargateService internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService,
) : NetworkMultipleTargetGroupsServiceBase(cdkObject) {
  public open fun assignPublicIp(): Boolean = unwrap(this).getAssignPublicIp()

  public open fun service(): FargateService = unwrap(this).getService().let(FargateService::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun targetGroup(): NetworkTargetGroup =
      unwrap(this).getTargetGroup().let(NetworkTargetGroup::wrap)

  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0761d3396a1bb7593b4abfbfbff2578c68311b4e741661efa869a4109961f83")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun cpu(cpu: Number)

    public fun desiredCount(desiredCount: Number)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    public fun loadBalancers(loadBalancers: List<NetworkLoadBalancerProps>)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun platformVersion(platformVersion: FargatePlatformVersion)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c36fac3ddf8e2370b9348cfbce2fafabfc9c870624d8e79d384c1e22697fcba9")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun serviceName(serviceName: String)

    public fun targetGroups(targetGroups: List<NetworkTargetProps>)

    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b19f2ae88adb24d5c883d69d91f1f3c5590b006c7333b0ecf8d42d073d75455")
    public
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService.Builder.create(scope,
        id)

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0761d3396a1bb7593b4abfbfbff2578c68311b4e741661efa869a4109961f83")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    override fun loadBalancers(loadBalancers: List<NetworkLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(NetworkLoadBalancerProps::unwrap))
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c36fac3ddf8e2370b9348cfbce2fafabfc9c870624d8e79d384c1e22697fcba9")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun targetGroups(targetGroups: List<NetworkTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(NetworkTargetProps::unwrap))
    }

    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    override fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(NetworkLoadBalancedTaskImageProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b19f2ae88adb24d5c883d69d91f1f3c5590b006c7333b0ecf8d42d073d75455")
    override
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(NetworkLoadBalancedTaskImageProps(taskImageOptions))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkMultipleTargetGroupsFargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkMultipleTargetGroupsFargateService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService):
        NetworkMultipleTargetGroupsFargateService =
        NetworkMultipleTargetGroupsFargateService(cdkObject)

    internal fun unwrap(wrapped: NetworkMultipleTargetGroupsFargateService):
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService =
        wrapped.cdkObject
  }
}
