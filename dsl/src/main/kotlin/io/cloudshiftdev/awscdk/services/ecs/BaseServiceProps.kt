package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface BaseServiceProps : BaseServiceOptions {
  /**
   * The launch type on which to run your service.
   *
   * LaunchType will be omitted if capacity provider strategies are specified on the service.
   *
   * @see <a href=" -
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy
   * Valid values are: LaunchType.ECS or LaunchType.FARGATE or LaunchType.EXTERNAL"> -
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy
   * Valid values are: LaunchType.ECS or LaunchType.FARGATE or LaunchType.EXTERNAL</a>
   */
  public fun launchType(): LaunchType

  /**
   * A builder for [BaseServiceProps]
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4081b2ab65daf57f1fe36a9dae8dc441e506d8ac33330897ce6b4e00c916c9e8")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f07aa7dcefcd2c1b834d6e6e23205225eaac5484e07ff385598602a8dbace4")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a3647e187ab8457ec35d8806f1d6744740b31d538108b8dd21446afeda14fbe")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4653edd03a894927de621eef5f1ca88e08cb0cecc93fd6fb87da78d83220a60")
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
     * @param launchType The launch type on which to run your service. 
     * LaunchType will be omitted if capacity provider strategies are specified on the service.
     */
    public fun launchType(launchType: LaunchType)

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
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps)

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc2afc8454fe3dd550ddbdfe75a6a4b565ebf33147d6a37c67826829d84d2956")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit)

    /**
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BaseServiceProps.Builder =
        software.amazon.awscdk.services.ecs.BaseServiceProps.builder()

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4081b2ab65daf57f1fe36a9dae8dc441e506d8ac33330897ce6b4e00c916c9e8")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f07aa7dcefcd2c1b834d6e6e23205225eaac5484e07ff385598602a8dbace4")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a3647e187ab8457ec35d8806f1d6744740b31d538108b8dd21446afeda14fbe")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4653edd03a894927de621eef5f1ca88e08cb0cecc93fd6fb87da78d83220a60")
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
     * @param launchType The launch type on which to run your service. 
     * LaunchType will be omitted if capacity provider strategies are specified on the service.
     */
    override fun launchType(launchType: LaunchType) {
      cdkBuilder.launchType(launchType.let(LaunchType::unwrap))
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
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    override fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps::unwrap))
    }

    /**
     * @param serviceConnectConfiguration Configuration for Service Connect.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc2afc8454fe3dd550ddbdfe75a6a4b565ebf33147d6a37c67826829d84d2956")
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

    public fun build(): software.amazon.awscdk.services.ecs.BaseServiceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.BaseServiceProps,
  ) : CdkObject(cdkObject), BaseServiceProps {
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
     * The launch type on which to run your service.
     *
     * LaunchType will be omitted if capacity provider strategies are specified on the service.
     *
     * @see <a href=" -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy
     * Valid values are: LaunchType.ECS or LaunchType.FARGATE or LaunchType.EXTERNAL"> -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy
     * Valid values are: LaunchType.ECS or LaunchType.FARGATE or LaunchType.EXTERNAL</a>
     */
    override fun launchType(): LaunchType = unwrap(this).getLaunchType().let(LaunchType::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BaseServiceProps):
        BaseServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseServiceProps):
        software.amazon.awscdk.services.ecs.BaseServiceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.BaseServiceProps
  }
}
