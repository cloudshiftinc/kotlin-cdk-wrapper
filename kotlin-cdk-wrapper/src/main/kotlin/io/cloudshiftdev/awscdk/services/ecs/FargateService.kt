@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This creates a service using the Fargate launch type on an ECS cluster.
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
 * .minHealthyPercent(100)
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
public open class FargateService(
  cdkObject: software.amazon.awscdk.services.ecs.FargateService,
) : BaseService(cdkObject),
    IFargateService {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FargateServiceProps,
  ) :
      this(software.amazon.awscdk.services.ecs.FargateService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FargateServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FargateServiceProps.Builder.() -> Unit,
  ) : this(scope, id, FargateServiceProps(props)
  )

  /**
   * Registers the service as a target of a Classic Load Balancer (CLB).
   *
   * Don't call this. Call `loadBalancer.addTarget()` instead.
   *
   * @param loadBalancer 
   */
  public override fun attachToClassicLB(loadBalancer: LoadBalancer) {
    unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.FargateService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, each task will receive a public IP address.
     *
     * Default: false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

    /**
     * Whether to use Availability Zone rebalancing for the service.
     *
     * If enabled, `maxHealthyPercent` must be greater than 100, and the service must not be a
     * target
     * of a Classic Load Balancer.
     *
     * Default: AvailabilityZoneRebalancing.DISABLED
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-rebalancing.html)
     * @param availabilityZoneRebalancing Whether to use Availability Zone rebalancing for the
     * service. 
     */
    public fun availabilityZoneRebalancing(availabilityZoneRebalancing: AvailabilityZoneRebalancing)

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>)

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    public fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker)

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4133a5d5444a3ad32024ac1bdb3aad4ca6d2044f408b729296940b41ba29997")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit)

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d2703f8bbc1f869e307080200a2798a7db4ac891d546f15bc6804480b796296")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * The name of the cluster that hosts the service.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a
     * state of alarm during the deployment or bake time.
     *
     * Default: - No alarms will be monitored during deployment.
     *
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time. 
     */
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig)

    /**
     * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a
     * state of alarm during the deployment or bake time.
     *
     * Default: - No alarms will be monitored during deployment.
     *
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fba7bfc6bbaec8f7ce17a64df0b3e3f774311f4bb6b68689cbc622a5cb8dbe7f")
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    public fun deploymentController(deploymentController: DeploymentController)

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4191ad45937172fc43b2c8cb1cd42ab6fb9217c27289514c478654666afbc6e0")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit)

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: - When creating the service, default is 1; when updating the service, default uses
     * the current task number.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service. 
     */
    public fun desiredCount(desiredCount: Number)

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service. 
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    /**
     * Whether to enable the ability to execute into a container.
     *
     * Default: - undefined
     *
     * @param enableExecuteCommand Whether to enable the ability to execute into a container. 
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     *
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started. 
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - 100 if daemon, otherwise 200
     *
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment. 
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number)

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - 0 if daemon, otherwise 50
     *
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment. 
     */
    public fun minHealthyPercent(minHealthyPercent: Number)

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
     *
     * @param platformVersion The platform version on which to run your service. 
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
     * PropagatedTagSource.NONE
     *
     * Default: PropagatedTagSource.NONE
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. 
     */
    public fun propagateTags(propagateTags: PropagatedTagSource)

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Configuration for Service Connect.
     *
     * Default: No ports are advertised via Service Connect on this service, and the service
     * cannot make requests to other services via Service Connect.
     *
     * @param serviceConnectConfiguration Configuration for Service Connect. 
     */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps)

    /**
     * Configuration for Service Connect.
     *
     * Default: No ports are advertised via Service Connect on this service, and the service
     * cannot make requests to other services via Service Connect.
     *
     * @param serviceConnectConfiguration Configuration for Service Connect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00341cc9ac612e3652f4a111b430e8c917ac8622d39cc00d0f091ebbb440488")
    public
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit)

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * The task definition to use for tasks in the service.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param taskDefinition The task definition to use for tasks in the service. 
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * Revision number for the task definition or `latest` to use the latest active task revision.
     *
     * Default: - Uses the revision of the passed task definition deployed by CloudFormation
     *
     * @param taskDefinitionRevision Revision number for the task definition or `latest` to use the
     * latest active task revision. 
     */
    public fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision)

    /**
     * Configuration details for a volume used by the service.
     *
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     *
     * Default: - undefined
     *
     * @param volumeConfigurations Configuration details for a volume used by the service. 
     */
    public fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>)

    /**
     * Configuration details for a volume used by the service.
     *
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     *
     * Default: - undefined
     *
     * @param volumeConfigurations Configuration details for a volume used by the service. 
     */
    public fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume)

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("424a118b89462e45ea412cf00a89eaddf35e0cb909046a921e7a57e64bc4420a")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FargateService.Builder =
        software.amazon.awscdk.services.ecs.FargateService.Builder.create(scope, id)

    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, each task will receive a public IP address.
     *
     * Default: false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address. 
     */
    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * Whether to use Availability Zone rebalancing for the service.
     *
     * If enabled, `maxHealthyPercent` must be greater than 100, and the service must not be a
     * target
     * of a Classic Load Balancer.
     *
     * Default: AvailabilityZoneRebalancing.DISABLED
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-rebalancing.html)
     * @param availabilityZoneRebalancing Whether to use Availability Zone rebalancing for the
     * service. 
     */
    override
        fun availabilityZoneRebalancing(availabilityZoneRebalancing: AvailabilityZoneRebalancing) {
      cdkBuilder.availabilityZoneRebalancing(availabilityZoneRebalancing.let(AvailabilityZoneRebalancing.Companion::unwrap))
    }

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy.Companion::unwrap))
    }

    /**
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override fun capacityProviderStrategies(vararg
        capacityProviderStrategies: CapacityProviderStrategy): Unit =
        capacityProviderStrategies(capacityProviderStrategies.toList())

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker.Companion::unwrap))
    }

    /**
     * Whether to enable the deployment circuit breaker.
     *
     * If this property is defined, circuit breaker will be implicitly
     * enabled.
     *
     * Default: - disabled
     *
     * @param circuitBreaker Whether to enable the deployment circuit breaker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4133a5d5444a3ad32024ac1bdb3aad4ca6d2044f408b729296940b41ba29997")
    override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit): Unit =
        circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions.Companion::unwrap))
    }

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     * discovery. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d2703f8bbc1f869e307080200a2798a7db4ac891d546f15bc6804480b796296")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * The name of the cluster that hosts the service.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a
     * state of alarm during the deployment or bake time.
     *
     * Default: - No alarms will be monitored during deployment.
     *
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time. 
     */
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig.Companion::unwrap))
    }

    /**
     * The alarm(s) to monitor during deployment, and behavior to apply if at least one enters a
     * state of alarm during the deployment or bake time.
     *
     * Default: - No alarms will be monitored during deployment.
     *
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     * at least one enters a state of alarm during the deployment or bake time. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fba7bfc6bbaec8f7ce17a64df0b3e3f774311f4bb6b68689cbc622a5cb8dbe7f")
    override fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig.Builder.() -> Unit): Unit
        = deploymentAlarms(DeploymentAlarmConfig(deploymentAlarms))

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController.Companion::unwrap))
    }

    /**
     * Specifies which deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS Deployment
     * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     *
     * Default: - Rolling update (ECS)
     *
     * @param deploymentController Specifies which deployment controller to use for the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4191ad45937172fc43b2c8cb1cd42ab6fb9217c27289514c478654666afbc6e0")
    override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: - When creating the service, default is 1; when updating the service, default uses
     * the current task number.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     * running on the service. 
     */
    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     * within the service. 
     */
    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Whether to enable the ability to execute into a container.
     *
     * Default: - undefined
     *
     * @param enableExecuteCommand Whether to enable the ability to execute into a container. 
     */
    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * Default: - defaults to 60 seconds if at least one load balancer is in-use and it is not
     * already set
     *
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     * scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first
     * started. 
     */
    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that can run in a service during a deployment.
     *
     * Default: - 100 if daemon, otherwise 200
     *
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that can run in a service during a deployment. 
     */
    override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * The minimum number of tasks, specified as a percentage of the Amazon ECS service's
     * DesiredCount value, that must continue to run and remain healthy during a deployment.
     *
     * Default: - 0 if daemon, otherwise 50
     *
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     * ECS service's DesiredCount value, that must continue to run and remain healthy during a
     * deployment. 
     */
    override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

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
     *
     * @param platformVersion The platform version on which to run your service. 
     */
    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion.Companion::unwrap))
    }

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION or
     * PropagatedTagSource.NONE
     *
     * Default: PropagatedTagSource.NONE
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. 
     */
    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource.Companion::unwrap))
    }

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Configuration for Service Connect.
     *
     * Default: No ports are advertised via Service Connect on this service, and the service
     * cannot make requests to other services via Service Connect.
     *
     * @param serviceConnectConfiguration Configuration for Service Connect. 
     */
    override fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps.Companion::unwrap))
    }

    /**
     * Configuration for Service Connect.
     *
     * Default: No ports are advertised via Service Connect on this service, and the service
     * cannot make requests to other services via Service Connect.
     *
     * @param serviceConnectConfiguration Configuration for Service Connect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00341cc9ac612e3652f4a111b430e8c917ac8622d39cc00d0f091ebbb440488")
    override
        fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps.Builder.() -> Unit):
        Unit = serviceConnectConfiguration(ServiceConnectProps(serviceConnectConfiguration))

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * The task definition to use for tasks in the service.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param taskDefinition The task definition to use for tasks in the service. 
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * Revision number for the task definition or `latest` to use the latest active task revision.
     *
     * Default: - Uses the revision of the passed task definition deployed by CloudFormation
     *
     * @param taskDefinitionRevision Revision number for the task definition or `latest` to use the
     * latest active task revision. 
     */
    override fun taskDefinitionRevision(taskDefinitionRevision: TaskDefinitionRevision) {
      cdkBuilder.taskDefinitionRevision(taskDefinitionRevision.let(TaskDefinitionRevision.Companion::unwrap))
    }

    /**
     * Configuration details for a volume used by the service.
     *
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     *
     * Default: - undefined
     *
     * @param volumeConfigurations Configuration details for a volume used by the service. 
     */
    override fun volumeConfigurations(volumeConfigurations: List<ServiceManagedVolume>) {
      cdkBuilder.volumeConfigurations(volumeConfigurations.map(ServiceManagedVolume.Companion::unwrap))
    }

    /**
     * Configuration details for a volume used by the service.
     *
     * This allows you to specify
     * details about the EBS volume that can be attched to ECS tasks.
     *
     * Default: - undefined
     *
     * @param volumeConfigurations Configuration details for a volume used by the service. 
     */
    override fun volumeConfigurations(vararg volumeConfigurations: ServiceManagedVolume): Unit =
        volumeConfigurations(volumeConfigurations.toList())

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * The subnets to associate with the service.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("424a118b89462e45ea412cf00a89eaddf35e0cb909046a921e7a57e64bc4420a")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ecs.FargateService = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.ecs.FargateService.PROPERTY_INJECTION_ID

    public fun fromFargateServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateServiceArn: String,
    ): IFargateService =
        software.amazon.awscdk.services.ecs.FargateService.fromFargateServiceArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, fargateServiceArn).let(IFargateService::wrap)

    public fun fromFargateServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateServiceAttributes,
    ): IBaseService =
        software.amazon.awscdk.services.ecs.FargateService.fromFargateServiceAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(FargateServiceAttributes.Companion::unwrap)).let(IBaseService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c5efe0a0970d19a1c51a45728e582eb1f09f35537ee09070a9268210df4858a")
    public fun fromFargateServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FargateServiceAttributes.Builder.() -> Unit,
    ): IBaseService = fromFargateServiceAttributes(scope, id, FargateServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargateService): FargateService
        = FargateService(cdkObject)

    internal fun unwrap(wrapped: FargateService): software.amazon.awscdk.services.ecs.FargateService
        = wrapped.cdkObject as software.amazon.awscdk.services.ecs.FargateService
  }
}
