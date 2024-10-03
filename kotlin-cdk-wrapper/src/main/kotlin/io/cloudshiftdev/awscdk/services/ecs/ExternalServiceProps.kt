@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The properties for defining a service using the External launch type.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * ExternalService service = ExternalService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .desiredCount(5)
 * .build();
 * ```
 */
public interface ExternalServiceProps : BaseServiceOptions {
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
   * A builder for [ExternalServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("563eb188d3752a85956cf83f547dbc74b69601025631aca74b0df0aa9d50b71e")
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
    @JvmName("fd6bf9e3fca473d8bd8fdbb34b4a1797bea4eafe7c54185e68293cb2e2ee89a5")
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
    @JvmName("eb5aa1117e0c181c7621c84c5921f2087657dc5b59f5890799eda0845b21298c")
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
    @JvmName("5e504b8c39c1a9137f1e2e5997fcbe2a9832444c0695abfc2d390b97c3d98ad2")
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
    @JvmName("c722b7f7849234f2e75c38684c12d8a958862635eceb6673c0e7e811b3e632d4")
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExternalServiceProps.Builder =
        software.amazon.awscdk.services.ecs.ExternalServiceProps.builder()

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service.
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy.Companion::unwrap))
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
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker.Companion::unwrap))
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker.
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("563eb188d3752a85956cf83f547dbc74b69601025631aca74b0df0aa9d50b71e")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions.Companion::unwrap))
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd6bf9e3fca473d8bd8fdbb34b4a1797bea4eafe7c54185e68293cb2e2ee89a5")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time.
     */
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig.Companion::unwrap))
    }

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb5aa1117e0c181c7621c84c5921f2087657dc5b59f5890799eda0845b21298c")
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit): Unit
        = deploymentAlarms(DeploymentAlarmConfig(deploymentAlarms))

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController.Companion::unwrap))
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service.
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e504b8c39c1a9137f1e2e5997fcbe2a9832444c0695abfc2d390b97c3d98ad2")
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
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration.Companion::unwrap))
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
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service.
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
     * PropagatedTagSource.NONE
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * @param securityGroups The security groups to associate with the service.
     * If you do not specify a security group, a new security group is created.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
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
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps.Companion::unwrap))
    }

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c722b7f7849234f2e75c38684c12d8a958862635eceb6673c0e7e811b3e632d4")
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
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * @param taskDefinitionRevision Revision number for the task definition or `latest` to use the
     * latest active task revision.
     */
    override fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision) {
      cdkBuilder.taskDefinitionRevision(taskDefinitionRevision.let(TaskDefinitionRevision.Companion::unwrap))
    }

    /**
     * @param volumeConfigurations Configuration details for a volume used by the service.
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     */
    override fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.map(ServiceManagedVolume.Companion::unwrap))
    }

    /**
     * @param volumeConfigurations Configuration details for a volume used by the service.
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     */
    override fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.ecs.ExternalServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ExternalServiceProps,
  ) : CdkObject(cdkObject),
      ExternalServiceProps {
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
    override fun enableECSManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExternalServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalServiceProps):
        ExternalServiceProps = CdkObjectWrappers.wrap(cdkObject) as? ExternalServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExternalServiceProps):
        software.amazon.awscdk.services.ecs.ExternalServiceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ExternalServiceProps
  }
}
