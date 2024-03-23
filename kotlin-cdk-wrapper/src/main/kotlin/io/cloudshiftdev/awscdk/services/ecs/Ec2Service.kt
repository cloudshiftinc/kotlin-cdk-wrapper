@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This creates a service using the EC2 launch type on an ECS cluster.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * Ec2Service service = Ec2Service.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
 * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
 * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
 * .containerName("MyContainer")
 * .containerPort(80)
 * .build()));
 * ```
 */
public open class Ec2Service(
  cdkObject: software.amazon.awscdk.services.ecs.Ec2Service,
) : BaseService(cdkObject), IEc2Service {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: Ec2ServiceProps,
  ) :
      this(software.amazon.awscdk.services.ecs.Ec2Service(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(Ec2ServiceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: Ec2ServiceProps.Builder.() -> Unit,
  ) : this(scope, id, Ec2ServiceProps(props)
  )

  /**
   * Adds one or more placement constraints to use for tasks in the service.
   *
   * For more information, see
   * [Amazon ECS Task Placement
   * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
   *
   * @param constraints 
   */
  public open fun addPlacementConstraints(vararg constraints: PlacementConstraint) {
    unwrap(this).addPlacementConstraints(*constraints.map(PlacementConstraint::unwrap).toTypedArray())
  }

  /**
   * Adds one or more placement strategies to use for tasks in the service.
   *
   * For more information, see
   * [Amazon ECS Task Placement
   * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
   *
   * @param strategies 
   */
  public open fun addPlacementStrategies(vararg strategies: PlacementStrategy) {
    unwrap(this).addPlacementStrategies(*strategies.map(PlacementStrategy::unwrap).toTypedArray())
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.Ec2Service].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, each task will receive a public IP address.
     *
     * This property is only used for tasks that use the awsvpc network mode.
     *
     * Default: false
     *
     * @param assignPublicIp Specifies whether the task's elastic network interface receives a
     * public IP address. 
     */
    public fun assignPublicIp(assignPublicIp: Boolean)

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
    @JvmName("e23455443786fb538a40c3eacae9199768b8e001bfa3f8111099e51dfb8c065b")
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
    @JvmName("d85c7b6fdb0b9506661e7c01d11a52287ddcebb9de80c634087817e94bbe6945")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    /**
     * The name of the cluster that hosts the service.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * Specifies whether the service will use the daemon scheduling strategy.
     *
     * If true, the service scheduler deploys exactly one task on each container instance in your
     * cluster.
     *
     * When you are using this strategy, do not specify a desired number of tasks or any task
     * placement strategies.
     *
     * Default: false
     *
     * @param daemon Specifies whether the service will use the daemon scheduling strategy. 
     */
    public fun daemon(daemon: Boolean)

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
    @JvmName("4599c276ed248f7392a98339be67e1822146aa73502a5a9910f25e72a4416e7b")
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
    @JvmName("ca426c70ee8c6ec0eb942e70302b1b7b1ef4aefc663c1e01754d53ef620566f7")
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
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    public fun placementConstraints(placementConstraints: List<PlacementConstraint>)

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint)

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    public fun placementStrategies(placementStrategies: List<PlacementStrategy>)

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy)

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
     * This property is only used for tasks that use the awsvpc network mode.
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
     * This property is only used for tasks that use the awsvpc network mode.
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
    @JvmName("948729db429d07550a9a63b5340afcd2c7dbf969a2856730b348a0aef129dd7e")
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
     * This property is only used for tasks that use the awsvpc network mode.
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
     * This property is only used for tasks that use the awsvpc network mode.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bffb9afdd7f6f4d65bdaba1c8e021e51638743b2706bee102d058f0b24dfefe")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2Service.Builder =
        software.amazon.awscdk.services.ecs.Ec2Service.Builder.create(scope, id)

    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * If true, each task will receive a public IP address.
     *
     * This property is only used for tasks that use the awsvpc network mode.
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
     * A list of Capacity Provider strategies used to place a service.
     *
     * Default: - undefined
     *
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     * service. 
     */
    override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
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
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
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
    @JvmName("e23455443786fb538a40c3eacae9199768b8e001bfa3f8111099e51dfb8c065b")
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
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
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
    @JvmName("d85c7b6fdb0b9506661e7c01d11a52287ddcebb9de80c634087817e94bbe6945")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    /**
     * The name of the cluster that hosts the service.
     *
     * @param cluster The name of the cluster that hosts the service. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * Specifies whether the service will use the daemon scheduling strategy.
     *
     * If true, the service scheduler deploys exactly one task on each container instance in your
     * cluster.
     *
     * When you are using this strategy, do not specify a desired number of tasks or any task
     * placement strategies.
     *
     * Default: false
     *
     * @param daemon Specifies whether the service will use the daemon scheduling strategy. 
     */
    override fun daemon(daemon: Boolean) {
      cdkBuilder.daemon(daemon)
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
      cdkBuilder.deploymentAlarms(deploymentAlarms.let(DeploymentAlarmConfig::unwrap))
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
    @JvmName("4599c276ed248f7392a98339be67e1822146aa73502a5a9910f25e72a4416e7b")
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
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
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
    @JvmName("ca426c70ee8c6ec0eb942e70302b1b7b1ef4aefc663c1e01754d53ef620566f7")
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
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
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
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service. 
     */
    override fun placementConstraints(vararg placementConstraints: PlacementConstraint): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement
     * Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service. 
     */
    override fun placementStrategies(vararg placementStrategies: PlacementStrategy): Unit =
        placementStrategies(placementStrategies.toList())

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
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * This property is only used for tasks that use the awsvpc network mode.
     *
     * Default: - A new security group is created.
     *
     * @param securityGroups The security groups to associate with the service. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * The security groups to associate with the service.
     *
     * If you do not specify a security group, a new security group is created.
     *
     * This property is only used for tasks that use the awsvpc network mode.
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
      cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration.let(ServiceConnectProps::unwrap))
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
    @JvmName("948729db429d07550a9a63b5340afcd2c7dbf969a2856730b348a0aef129dd7e")
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
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
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
      cdkBuilder.taskDefinitionRevision(taskDefinitionRevision.let(TaskDefinitionRevision::unwrap))
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
      cdkBuilder.volumeConfigurations(volumeConfigurations.map(ServiceManagedVolume::unwrap))
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
     * This property is only used for tasks that use the awsvpc network mode.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * The subnets to associate with the service.
     *
     * This property is only used for tasks that use the awsvpc network mode.
     *
     * Default: - Public subnets if `assignPublicIp` is set, otherwise the first available one of
     * Private, Isolated, Public, in that order.
     *
     * @param vpcSubnets The subnets to associate with the service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bffb9afdd7f6f4d65bdaba1c8e021e51638743b2706bee102d058f0b24dfefe")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ecs.Ec2Service = cdkBuilder.build()
  }

  public companion object {
    public fun fromEc2ServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ec2ServiceArn: String,
    ): IEc2Service =
        software.amazon.awscdk.services.ecs.Ec2Service.fromEc2ServiceArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, ec2ServiceArn).let(IEc2Service::wrap)

    public fun fromEc2ServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2ServiceAttributes,
    ): IBaseService =
        software.amazon.awscdk.services.ecs.Ec2Service.fromEc2ServiceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(Ec2ServiceAttributes::unwrap)).let(IBaseService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("deda49ac6a4ffe06a7cd5863c7416e87d620457ecd6508bced33ce9c2f31b151")
    public fun fromEc2ServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: Ec2ServiceAttributes.Builder.() -> Unit,
    ): IBaseService = fromEc2ServiceAttributes(scope, id, Ec2ServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Ec2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Ec2Service(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2Service): Ec2Service =
        Ec2Service(cdkObject)

    internal fun unwrap(wrapped: Ec2Service): software.amazon.awscdk.services.ecs.Ec2Service =
        wrapped.cdkObject as software.amazon.awscdk.services.ecs.Ec2Service
  }
}
