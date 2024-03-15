@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.EnableScalingProps
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import io.cloudshiftdev.awscdk.services.servicediscovery.IService
import io.cloudshiftdev.awscdk.services.servicediscovery.Service
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class BaseService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.BaseService,
) : Resource(cdkObject), IBaseService, IApplicationLoadBalancerTarget, INetworkLoadBalancerTarget,
    ILoadBalancerTarget {
  public open fun addVolume(volume: ServiceManagedVolume) {
    unwrap(this).addVolume(volume.let(ServiceManagedVolume::unwrap))
  }

  public open fun associateCloudMapService(options: AssociateCloudMapServiceOptions) {
    unwrap(this).associateCloudMapService(options.let(AssociateCloudMapServiceOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9efdde89b809884516ab0c4bd40829d6167d5f1d27bdea442fed263281456fdd")
  public open
      fun associateCloudMapService(options: AssociateCloudMapServiceOptions.Builder.() -> Unit):
      Unit = associateCloudMapService(AssociateCloudMapServiceOptions(options))

  public override fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  public override fun attachToClassicLb(loadBalancer: LoadBalancer) {
    unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
  }

  public override fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  public open fun autoScaleTaskCount(props: EnableScalingProps): ScalableTaskCount =
      unwrap(this).autoScaleTaskCount(props.let(EnableScalingProps::unwrap)).let(ScalableTaskCount::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0163fbd7c68d4e9af9f18b4ef7de232b93ee41c4e9599b548a4b01bab6ca323c")
  public open fun autoScaleTaskCount(props: EnableScalingProps.Builder.() -> Unit):
      ScalableTaskCount = autoScaleTaskCount(EnableScalingProps(props))

  public open fun cloudMapService(): IService? =
      unwrap(this).getCloudMapService()?.let(IService::wrap)

  public override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun enableCloudMap(options: CloudMapOptions): Service =
      unwrap(this).enableCloudMap(options.let(CloudMapOptions::unwrap)).let(Service::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb98c16499f233304e458ef17b6e5c9df09e38dbe3c56301d0f41038fbab0cc")
  public open fun enableCloudMap(options: CloudMapOptions.Builder.() -> Unit): Service =
      enableCloudMap(CloudMapOptions(options))

  public open fun enableDeploymentAlarms(alarmNames: List<String>) {
    unwrap(this).enableDeploymentAlarms(alarmNames)
  }

  public open fun enableDeploymentAlarms(vararg alarmNames: String): Unit =
      enableDeploymentAlarms(alarmNames.toList())

  public open fun enableDeploymentAlarms(alarmNames: List<String>,
      options: DeploymentAlarmOptions) {
    unwrap(this).enableDeploymentAlarms(alarmNames, options.let(DeploymentAlarmOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("faa096196e26c43168bbe2a7539d28b35d17610a85ae670f17d9ba099a122b12")
  public open fun enableDeploymentAlarms(alarmNames: List<String>,
      options: DeploymentAlarmOptions.Builder.() -> Unit): Unit = enableDeploymentAlarms(alarmNames,
      DeploymentAlarmOptions(options))

  public open fun enableServiceConnect() {
    unwrap(this).enableServiceConnect()
  }

  public open fun enableServiceConnect(config: ServiceConnectProps) {
    unwrap(this).enableServiceConnect(config.let(ServiceConnectProps::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ba39869975a7164464de6ba9b9d3a808c66b29119948bb4a9eb098f74ee244e4")
  public open fun enableServiceConnect(config: ServiceConnectProps.Builder.() -> Unit): Unit =
      enableServiceConnect(ServiceConnectProps(config))

  public open fun loadBalancerTarget(options: LoadBalancerTargetOptions): IEcsLoadBalancerTarget =
      unwrap(this).loadBalancerTarget(options.let(LoadBalancerTargetOptions::unwrap)).let(IEcsLoadBalancerTarget::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c1f6de1e98dab0564840813319e438b96687e7140defdd69ba7bee4103a780f")
  public open fun loadBalancerTarget(options: LoadBalancerTargetOptions.Builder.() -> Unit):
      IEcsLoadBalancerTarget = loadBalancerTarget(LoadBalancerTargetOptions(options))

  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public open fun metricCpuUtilization(): Metric =
      unwrap(this).metricCpuUtilization().let(Metric::wrap)

  public open fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCpuUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public open fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  public open fun metricMemoryUtilization(): Metric =
      unwrap(this).metricMemoryUtilization().let(Metric::wrap)

  public open fun metricMemoryUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMemoryUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("920fdd548a5bd9f6f382929d6f52aa6b867238ab20350ec7f65f1d26154d7844")
  public open fun metricMemoryUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMemoryUtilization(MetricOptions(props))

  public open fun registerLoadBalancerTargets(targets: EcsTarget) {
    unwrap(this).registerLoadBalancerTargets(targets.let(EcsTarget::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3682e9eed91689cc4ed6f8310140605bef4e35e0fda59587fde4c2fc019cfaa6")
  public open fun registerLoadBalancerTargets(targets: EcsTarget.Builder.() -> Unit): Unit =
      registerLoadBalancerTargets(EcsTarget(targets))

  public override fun serviceArn(): String = unwrap(this).getServiceArn()

  public override fun serviceName(): String = unwrap(this).getServiceName()

  public open fun taskDefinition(): TaskDefinition =
      unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.BaseService,
  ) : BaseService(cdkObject)

  public companion object {
    public fun fromServiceArnWithCluster(
      scope: Construct,
      id: String,
      serviceArn: String,
    ): IBaseService =
        software.amazon.awscdk.services.ecs.BaseService.fromServiceArnWithCluster(scope.let(Construct::unwrap),
        id, serviceArn).let(IBaseService::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BaseService): BaseService =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseService): software.amazon.awscdk.services.ecs.BaseService =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.BaseService
  }
}
