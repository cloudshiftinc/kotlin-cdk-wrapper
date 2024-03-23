@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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

/**
 * The base class for Ec2Service and FargateService services.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * IBaseService service = BaseService.fromServiceArnWithCluster(this, "EcsService",
 * "arn:aws:ecs:us-east-1:123456789012:service/myClusterName/myServiceName");
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact buildOutput = new Artifact();
 * // add source and build stages to the pipeline as usual...
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * EcsDeployAction.Builder.create()
 * .actionName("DeployAction")
 * .service(service)
 * .input(buildOutput)
 * .build()))
 * .build());
 * ```
 */
public abstract class BaseService(
  cdkObject: software.amazon.awscdk.services.ecs.BaseService,
) : Resource(cdkObject), IBaseService, IApplicationLoadBalancerTarget, INetworkLoadBalancerTarget,
    ILoadBalancerTarget {
  /**
   * Adds a volume to the Service.
   *
   * @param volume 
   */
  public open fun addVolume(volume: ServiceManagedVolume) {
    unwrap(this).addVolume(volume.let(ServiceManagedVolume::unwrap))
  }

  /**
   * Associates this service with a CloudMap service.
   *
   * @param options 
   */
  public open fun associateCloudMapService(options: AssociateCloudMapServiceOptions) {
    unwrap(this).associateCloudMapService(options.let(AssociateCloudMapServiceOptions::unwrap))
  }

  /**
   * Associates this service with a CloudMap service.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9efdde89b809884516ab0c4bd40829d6167d5f1d27bdea442fed263281456fdd")
  public open
      fun associateCloudMapService(options: AssociateCloudMapServiceOptions.Builder.() -> Unit):
      Unit = associateCloudMapService(AssociateCloudMapServiceOptions(options))

  /**
   * This method is called to attach this service to an Application Load Balancer.
   *
   * Don't call this function directly. Instead, call `listener.addTargets()`
   * to add this service to a load balancer.
   *
   * @param targetGroup 
   */
  public override fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  /**
   * Registers the service as a target of a Classic Load Balancer (CLB).
   *
   * Don't call this. Call `loadBalancer.addTarget()` instead.
   *
   * @param loadBalancer 
   */
  public override fun attachToClassicLb(loadBalancer: LoadBalancer) {
    unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
  }

  /**
   * This method is called to attach this service to a Network Load Balancer.
   *
   * Don't call this function directly. Instead, call `listener.addTargets()`
   * to add this service to a load balancer.
   *
   * @param targetGroup 
   */
  public override fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  /**
   * An attribute representing the minimum and maximum task count for an AutoScalingGroup.
   *
   * @param props 
   */
  public open fun autoScaleTaskCount(props: EnableScalingProps): ScalableTaskCount =
      unwrap(this).autoScaleTaskCount(props.let(EnableScalingProps::unwrap)).let(ScalableTaskCount::wrap)

  /**
   * An attribute representing the minimum and maximum task count for an AutoScalingGroup.
   *
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0163fbd7c68d4e9af9f18b4ef7de232b93ee41c4e9599b548a4b01bab6ca323c")
  public open fun autoScaleTaskCount(props: EnableScalingProps.Builder.() -> Unit):
      ScalableTaskCount = autoScaleTaskCount(EnableScalingProps(props))

  /**
   * The CloudMap service created for this service, if any.
   */
  public open fun cloudMapService(): IService? =
      unwrap(this).getCloudMapService()?.let(IService::wrap)

  /**
   * The cluster that hosts the service.
   */
  public override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  /**
   * The security groups which manage the allowed network traffic for the service.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Enable CloudMap service discovery for the service.
   *
   * @return The created CloudMap service
   * @param options 
   */
  public open fun enableCloudMap(options: CloudMapOptions): Service =
      unwrap(this).enableCloudMap(options.let(CloudMapOptions::unwrap)).let(Service::wrap)

  /**
   * Enable CloudMap service discovery for the service.
   *
   * @return The created CloudMap service
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb98c16499f233304e458ef17b6e5c9df09e38dbe3c56301d0f41038fbab0cc")
  public open fun enableCloudMap(options: CloudMapOptions.Builder.() -> Unit): Service =
      enableCloudMap(CloudMapOptions(options))

  /**
   * Enable Deployment Alarms which take advantage of arbitrary alarms and configure them after
   * service initialization.
   *
   * If you have already enabled deployment alarms, this function can be used to tell ECS about
   * additional alarms that
   * should interrupt a deployment.
   *
   * New alarms specified in subsequent calls of this function will be appended to the existing list
   * of alarms.
   *
   * The same Alarm Behavior must be used on all deployment alarms. If you specify different
   * AlarmBehavior values in
   * multiple calls to this function, or the Alarm Behavior used here doesn't match the one used in
   * the service
   * constructor, an error will be thrown.
   *
   * If the alarm's metric references the service, you cannot pass `Alarm.alarmName` here. That will
   * cause a circular
   * dependency between the service and its deployment alarm. See this package's README for options
   * to alarm on service
   * metrics, and avoid this circular dependency.
   *
   * @param alarmNames 
   * @param options
   */
  public open fun enableDeploymentAlarms(alarmNames: List<String>) {
    unwrap(this).enableDeploymentAlarms(alarmNames)
  }

  /**
   * Enable Deployment Alarms which take advantage of arbitrary alarms and configure them after
   * service initialization.
   *
   * If you have already enabled deployment alarms, this function can be used to tell ECS about
   * additional alarms that
   * should interrupt a deployment.
   *
   * New alarms specified in subsequent calls of this function will be appended to the existing list
   * of alarms.
   *
   * The same Alarm Behavior must be used on all deployment alarms. If you specify different
   * AlarmBehavior values in
   * multiple calls to this function, or the Alarm Behavior used here doesn't match the one used in
   * the service
   * constructor, an error will be thrown.
   *
   * If the alarm's metric references the service, you cannot pass `Alarm.alarmName` here. That will
   * cause a circular
   * dependency between the service and its deployment alarm. See this package's README for options
   * to alarm on service
   * metrics, and avoid this circular dependency.
   *
   * @param alarmNames 
   * @param options
   */
  public open fun enableDeploymentAlarms(vararg alarmNames: String): Unit =
      enableDeploymentAlarms(alarmNames.toList())

  /**
   * Enable Deployment Alarms which take advantage of arbitrary alarms and configure them after
   * service initialization.
   *
   * If you have already enabled deployment alarms, this function can be used to tell ECS about
   * additional alarms that
   * should interrupt a deployment.
   *
   * New alarms specified in subsequent calls of this function will be appended to the existing list
   * of alarms.
   *
   * The same Alarm Behavior must be used on all deployment alarms. If you specify different
   * AlarmBehavior values in
   * multiple calls to this function, or the Alarm Behavior used here doesn't match the one used in
   * the service
   * constructor, an error will be thrown.
   *
   * If the alarm's metric references the service, you cannot pass `Alarm.alarmName` here. That will
   * cause a circular
   * dependency between the service and its deployment alarm. See this package's README for options
   * to alarm on service
   * metrics, and avoid this circular dependency.
   *
   * @param alarmNames 
   * @param options
   */
  public open fun enableDeploymentAlarms(alarmNames: List<String>,
      options: DeploymentAlarmOptions) {
    unwrap(this).enableDeploymentAlarms(alarmNames, options.let(DeploymentAlarmOptions::unwrap))
  }

  /**
   * Enable Deployment Alarms which take advantage of arbitrary alarms and configure them after
   * service initialization.
   *
   * If you have already enabled deployment alarms, this function can be used to tell ECS about
   * additional alarms that
   * should interrupt a deployment.
   *
   * New alarms specified in subsequent calls of this function will be appended to the existing list
   * of alarms.
   *
   * The same Alarm Behavior must be used on all deployment alarms. If you specify different
   * AlarmBehavior values in
   * multiple calls to this function, or the Alarm Behavior used here doesn't match the one used in
   * the service
   * constructor, an error will be thrown.
   *
   * If the alarm's metric references the service, you cannot pass `Alarm.alarmName` here. That will
   * cause a circular
   * dependency between the service and its deployment alarm. See this package's README for options
   * to alarm on service
   * metrics, and avoid this circular dependency.
   *
   * @param alarmNames 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("faa096196e26c43168bbe2a7539d28b35d17610a85ae670f17d9ba099a122b12")
  public open fun enableDeploymentAlarms(alarmNames: List<String>,
      options: DeploymentAlarmOptions.Builder.() -> Unit): Unit = enableDeploymentAlarms(alarmNames,
      DeploymentAlarmOptions(options))

  /**
   * Enable Service Connect on this service.
   *
   * @param config
   */
  public open fun enableServiceConnect() {
    unwrap(this).enableServiceConnect()
  }

  /**
   * Enable Service Connect on this service.
   *
   * @param config
   */
  public open fun enableServiceConnect(config: ServiceConnectProps) {
    unwrap(this).enableServiceConnect(config.let(ServiceConnectProps::unwrap))
  }

  /**
   * Enable Service Connect on this service.
   *
   * @param config
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ba39869975a7164464de6ba9b9d3a808c66b29119948bb4a9eb098f74ee244e4")
  public open fun enableServiceConnect(config: ServiceConnectProps.Builder.() -> Unit): Unit =
      enableServiceConnect(ServiceConnectProps(config))

  /**
   * Return a load balancing target for a specific container and port.
   *
   * Use this function to create a load balancer target if you want to load balance to
   * another container than the first essential container or the first mapped port on
   * the container.
   *
   * Use the return value of this function where you would normally use a load balancer
   * target, instead of the `Service` object itself.
   *
   * Example:
   *
   * ```
   * ApplicationListener listener;
   * BaseService service;
   * listener.addTargets("ECS", AddApplicationTargetsProps.builder()
   * .port(80)
   * .targets(List.of(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
   * .containerName("MyContainer")
   * .containerPort(1234)
   * .build())))
   * .build());
   * ```
   *
   * @param options 
   */
  public open fun loadBalancerTarget(options: LoadBalancerTargetOptions): IEcsLoadBalancerTarget =
      unwrap(this).loadBalancerTarget(options.let(LoadBalancerTargetOptions::unwrap)).let(IEcsLoadBalancerTarget::wrap)

  /**
   * Return a load balancing target for a specific container and port.
   *
   * Use this function to create a load balancer target if you want to load balance to
   * another container than the first essential container or the first mapped port on
   * the container.
   *
   * Use the return value of this function where you would normally use a load balancer
   * target, instead of the `Service` object itself.
   *
   * Example:
   *
   * ```
   * ApplicationListener listener;
   * BaseService service;
   * listener.addTargets("ECS", AddApplicationTargetsProps.builder()
   * .port(80)
   * .targets(List.of(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
   * .containerName("MyContainer")
   * .containerPort(1234)
   * .build())))
   * .build());
   * ```
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c1f6de1e98dab0564840813319e438b96687e7140defdd69ba7bee4103a780f")
  public open fun loadBalancerTarget(options: LoadBalancerTargetOptions.Builder.() -> Unit):
      IEcsLoadBalancerTarget = loadBalancerTarget(LoadBalancerTargetOptions(options))

  /**
   * This method returns the specified CloudWatch metric name for this service.
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * This method returns the specified CloudWatch metric name for this service.
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the specified CloudWatch metric name for this service.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * This method returns the CloudWatch metric for this service's CPU utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricCpuUtilization(): Metric =
      unwrap(this).metricCpuUtilization().let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this service's CPU utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCpuUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this service's CPU utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public open fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  /**
   * This method returns the CloudWatch metric for this service's memory utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricMemoryUtilization(): Metric =
      unwrap(this).metricMemoryUtilization().let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this service's memory utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricMemoryUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMemoryUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this service's memory utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("920fdd548a5bd9f6f382929d6f52aa6b867238ab20350ec7f65f1d26154d7844")
  public open fun metricMemoryUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMemoryUtilization(MetricOptions(props))

  /**
   * Use this function to create all load balancer targets to be registered in this service, add
   * them to target groups, and attach target groups to listeners accordingly.
   *
   * Alternatively, you can use `listener.addTargets()` to create targets and add them to target
   * groups.
   *
   * Example:
   *
   * ```
   * ApplicationListener listener;
   * BaseService service;
   * service.registerLoadBalancerTargets(EcsTarget.builder()
   * .containerName("web")
   * .containerPort(80)
   * .newTargetGroupId("ECS")
   * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
   * .protocol(ApplicationProtocol.HTTPS)
   * .build()))
   * .build());
   * ```
   *
   * @param targets 
   */
  public open fun registerLoadBalancerTargets(vararg targets: EcsTarget) {
    unwrap(this).registerLoadBalancerTargets(*targets.map(EcsTarget::unwrap).toTypedArray())
  }

  /**
   * Use this function to create all load balancer targets to be registered in this service, add
   * them to target groups, and attach target groups to listeners accordingly.
   *
   * Alternatively, you can use `listener.addTargets()` to create targets and add them to target
   * groups.
   *
   * Example:
   *
   * ```
   * ApplicationListener listener;
   * BaseService service;
   * service.registerLoadBalancerTargets(EcsTarget.builder()
   * .containerName("web")
   * .containerPort(80)
   * .newTargetGroupId("ECS")
   * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
   * .protocol(ApplicationProtocol.HTTPS)
   * .build()))
   * .build());
   * ```
   *
   * @param targets 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3682e9eed91689cc4ed6f8310140605bef4e35e0fda59587fde4c2fc019cfaa6")
  public open fun registerLoadBalancerTargets(targets: EcsTarget.Builder.() -> Unit): Unit =
      registerLoadBalancerTargets(EcsTarget(targets))

  /**
   * The Amazon Resource Name (ARN) of the service.
   */
  public override fun serviceArn(): String = unwrap(this).getServiceArn()

  /**
   * The name of the service.
   */
  public override fun serviceName(): String = unwrap(this).getServiceName()

  /**
   * The task definition to use for tasks in the service.
   */
  public open fun taskDefinition(): TaskDefinition =
      unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.BaseService,
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
        CdkObjectWrappers.wrap(cdkObject) as? BaseService ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseService): software.amazon.awscdk.services.ecs.BaseService =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.BaseService
  }
}
