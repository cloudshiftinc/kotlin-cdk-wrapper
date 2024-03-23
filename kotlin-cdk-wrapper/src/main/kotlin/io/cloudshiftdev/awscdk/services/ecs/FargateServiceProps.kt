@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for defining a service using the Fargate launch type.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Alarm elbAlarm;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .deploymentAlarms(DeploymentAlarmConfig.builder()
 * .alarmNames(List.of(elbAlarm.getAlarmName()))
 * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
 * .build())
 * .build();
 * // Defining a deployment alarm after the service has been created
 * String cpuAlarmName = "MyCpuMetricAlarm";
 * Alarm.Builder.create(this, "CPUAlarm")
 * .alarmName(cpuAlarmName)
 * .metric(service.metricCpuUtilization())
 * .evaluationPeriods(2)
 * .threshold(80)
 * .build();
 * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
 * .behavior(AlarmBehavior.FAIL_ON_ALARM)
 * .build());
 * ```
 */
public interface FargateServiceProps : BaseServiceOptions {
  /**
   * Specifies whether the task's elastic network interface receives a public IP address.
   *
   * If true, each task will receive a public IP address.
   *
   * Default: false
   */
  public fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

  /**
   * The platform version on which to run your service.
   *
   * If one is not specified, the LATEST platform version is used by default. For more information,
   * see
   * [AWS Fargate Platform
   * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   * in the Amazon Elastic Container Service Developer Guide.
   *
   * Default: Latest
   */
  public fun platformVersion(): FargatePlatformVersion? =
      unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

  /**
   * The security groups to associate with the service.
   *
   * If you do not specify a security group, a new security group is created.
   *
   * Default: - A new security group is created.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The task definition to use for tasks in the service.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun taskDefinition(): TaskDefinition

  /**
   * The subnets to associate with the service.
   *
   * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
   * Private, Isolated, Public, in that order.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [FargateServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address.
     * If true, each task will receive a public IP address.
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97041b0a38571cc8605381cf4b62bfe6e6f2cb1c10668873a65fe2366006c82")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ef6054ce160a02e9280df91e8f8e5b265841244c8f6cb5f5090dae3ddc9cea0")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * @param cluster The name of the cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time.
     */
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig)

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d36fe77f2e6bed870c367fd3d461209d4106d0a8f881efe5c11846abdafdac4e")
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit)

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentController)

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21dd970cf46505f582b94419c5c6bc10a2aaf44f9c5f0402475ef0f3122b0ad2")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * @param enableExecuteCommand Whether to enable the ability to execute into a container.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number)

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment.
     */
    public fun minHealthyPercent(minHealthyPercent: Number)

    /**
     * @param platformVersion The platform version on which to run your service.
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
     * PropagatedTagSource.NONE
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * @param securityGroups The security groups to associate with the service.
     * If you do not specify a security group, a new security group is created.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups to associate with the service.
     * If you do not specify a security group, a new security group is created.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps)

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("923f41ab625b82d19f1aa0c39eff2d35592ea8eca6f010e21c2253d0bbbeb33a")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)

    /**
     * @param taskDefinition The task definition to use for tasks in the service. 
     * [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * @param taskDefinitionRevision Revision number for the task definition or `latest` to use the
     * latest active task revision.
     */
    public fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision)

    /**
     * @param volumeConfigurations Configuration details for a volume used by the service.
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     */
    public fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>)

    /**
     * @param volumeConfigurations Configuration details for a volume used by the service.
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     */
    public fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume)

    /**
     * @param vpcSubnets The subnets to associate with the service.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets The subnets to associate with the service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad27f7d763942b1e309d93ec1f2a9578f5993bc96737aaaea83e2f076ed227de")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateServiceProps.Builder =
        software.amazon.awscdk.services.ecs.FargateServiceProps.builder()

    /**
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address.
     * If true, each task will receive a public IP address.
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97041b0a38571cc8605381cf4b62bfe6e6f2cb1c10668873a65fe2366006c82")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ef6054ce160a02e9280df91e8f8e5b265841244c8f6cb5f5090dae3ddc9cea0")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time.
     */
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig::unwrap))
    }

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d36fe77f2e6bed870c367fd3d461209d4106d0a8f881efe5c11846abdafdac4e")
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit): Unit
        = deploymentAlarms(DeploymentAlarmConfig(deploymentAlarms))

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21dd970cf46505f582b94419c5c6bc10a2aaf44f9c5f0402475ef0f3122b0ad2")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service.
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service.
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * @param enableExecuteCommand Whether to enable the ability to execute into a container.
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started.
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment.
     */
    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * @param platformVersion The platform version on which to run your service.
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
     * PropagatedTagSource.NONE
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * @param securityGroups The security groups to associate with the service.
     * If you do not specify a security group, a new security group is created.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups to associate with the service.
     * If you do not specify a security group, a new security group is created.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    override fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps::unwrap))
    }

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("923f41ab625b82d19f1aa0c39eff2d35592ea8eca6f010e21c2253d0bbbeb33a")
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit):
        Unit = serviceConnectConfiguration(ServiceConnectProps(serviceConnectConfiguration))

    /**
     * @param serviceName The name of the service.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param taskDefinition The task definition to use for tasks in the service. 
     * [disable-awslint:ref-via-interface]
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    /**
     * @param taskDefinitionRevision Revision number for the task definition or `latest` to use the
     * latest active task revision.
     */
    override fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision) {
      cdkBuilder.taskDefinitionRevision(taskDefinitionRevision.let(TaskDefinitionRevision::unwrap))
    }

    /**
     * @param volumeConfigurations Configuration details for a volume used by the service.
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     */
    override fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.map(ServiceManagedVolume::unwrap))
    }

    /**
     * @param volumeConfigurations Configuration details for a volume used by the service.
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     */
    override fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    /**
     * @param vpcSubnets The subnets to associate with the service.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets The subnets to associate with the service.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad27f7d763942b1e309d93ec1f2a9578f5993bc96737aaaea83e2f076ed227de")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ecs.FargateServiceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.FargateServiceProps,
  ) : CdkObject(cdkObject), FargateServiceProps {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, each task will receive a public IP address.
     *
     * Default: false
     */
    override fun assignPublicIp(): Boolean? = unwrap(this).getAssignPublicIp()

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     */
    override fun capacityProviderStrategies(): List<CapacityProviderStrategy> =
        unwrap(this).getCapacityProviderStrategies()?.map(CapacityProviderStrategy::wrap) ?:
        emptyList()

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     */
    override fun circuitBreaker(): DeploymentCircuitBreaker? =
        unwrap(this).getCircuitBreaker()?.let(DeploymentCircuitBreaker::wrap)

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     */
    override fun cloudMapOptions(): CloudMapOptions? =
        unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

    /**
     * The name of the cluster that hosts the service.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a
     * state of alarm during the deployment or bake time.
     *
     * Default: - No alarms will be monitored during deployment.
     */
    override fun deploymentAlarms(): DeploymentAlarmConfig? =
        unwrap(this).getDeploymentAlarms()?.let(DeploymentAlarmConfig::wrap)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     */
    override fun deploymentController(): DeploymentController? =
        unwrap(this).getDeploymentController()?.let(DeploymentController::wrap)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: - When creating the service, default is 1; when updating the service, default uses
     * the current task number.
     */
    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     */
    override fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    /**
     * Whether to enable the ability to execute into a container.
     *
     * Default: - undefined
     */
    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     */
    override fun healthCheckGracePeriod(): Duration? =
        unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - 100 if daemon, otherwise 200
     */
    override fun maxHealthyPercent(): Number? = unwrap(this).getMaxHealthyPercent()

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - 0 if daemon, otherwise 50
     */
    override fun minHealthyPercent(): Number? = unwrap(this).getMinHealthyPercent()

    /**
     * The platform version on which to run your service.
     *
     * If one is not specified, the LATEST platform version is used by default. For more
     * information, see
     * [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * Default: Latest
     */
    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
     * PropagatedTagSource.NONE
     *
     * Default: PropagatedTagSource.NONE
     */
    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Configuration for Service Connect.
     *
     * Default: No ports are advertised via Service Connect on this service, and the service
     * cannot make requests to other services via Service Connect.
     */
    override fun serviceConnectConfiguration(): ServiceConnectProps? =
        unwrap(this).getServiceConnectConfiguration()?.let(ServiceConnectProps::wrap)

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * The task definition to use for tasks in the service.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun taskDefinition(): TaskDefinition =
        unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

    /**
     * Revision number for the task definition or `latest` to use the latest active task revision.
     *
     * Default: - Uses the revision of the passed task definition deployed by CloudFormation
     */
    override fun taskDefinitionRevision(): TaskDefinitionRevision? =
        unwrap(this).getTaskDefinitionRevision()?.let(TaskDefinitionRevision::wrap)

    /**
     * Configuration details for a volume used by the service.
     *
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     *
     * Default: - undefined
     */
    override fun volumeConfigurations(): List<ServiceManagedVolume> =
        unwrap(this).getVolumeConfigurations()?.map(ServiceManagedVolume::wrap) ?: emptyList()

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateServiceProps):
        FargateServiceProps = CdkObjectWrappers.wrap(cdkObject) as? FargateServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateServiceProps):
        software.amazon.awscdk.services.ecs.FargateServiceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.FargateServiceProps
  }
}
