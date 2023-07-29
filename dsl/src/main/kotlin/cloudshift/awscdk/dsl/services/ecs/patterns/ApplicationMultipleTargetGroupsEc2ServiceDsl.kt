@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ecs.CloudMapOptionsDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps
import software.constructs.Construct

/**
 * An EC2 service running on an ECS cluster fronted by an application load balancer.
 *
 * Example:
 * ```
 * // One application load balancer with one listener and two target groups.
 * Cluster cluster;
 * ApplicationMultipleTargetGroupsEc2Service loadBalancedEc2Service =
 * ApplicationMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(256)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageProps.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .targetGroups(List.of(ApplicationTargetProps.builder()
 * .containerPort(80)
 * .build(), ApplicationTargetProps.builder()
 * .containerPort(90)
 * .pathPattern("a/b/c")
 * .priority(10)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationMultipleTargetGroupsEc2ServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ApplicationMultipleTargetGroupsEc2Service.Builder =
        ApplicationMultipleTargetGroupsEc2Service.Builder.create(scope, id)

    private val _loadBalancers: MutableList<ApplicationLoadBalancerProps> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    private val _targetGroups: MutableList<ApplicationTargetProps> = mutableListOf()

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     *   discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptionsDsl.() -> Unit = {}) {
        val builder = CloudMapOptionsDsl()
        builder.apply(cloudMapOptions)
        cdkBuilder.cloudMapOptions(builder.build())
    }

    /**
     * The options for configuring an Amazon ECS service to use service discovery.
     *
     * Default: - AWS Cloud Map service discovery is not enabled.
     *
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     *   discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
        cdkBuilder.cloudMapOptions(cloudMapOptions)
    }

    /**
     * The name of the cluster that hosts the service.
     *
     * If a cluster is specified, the vpc construct should be omitted. Alternatively, you can omit
     * both cluster and vpc.
     *
     * Default: - create a new cluster; if both cluster and vpc are omitted, a new VPC will be
     * created for you.
     *
     * @param cluster The name of the cluster that hosts the service.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * The minimum number of CPU units to reserve for the container.
     *
     * Valid values, which determines your range of valid values for the memory parameter:
     *
     * Default: - No minimum CPU units reserved.
     *
     * @param cpu The minimum number of CPU units to reserve for the container.
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * The desired number of instantiations of the task definition to keep running on the service.
     *
     * Default: - If the feature flag, ECS_REMOVE_DEFAULT_DESIRED_COUNT is false, the default is 1;
     * if true, the default is 1 for all new services and uses the existing services desired count
     * when updating an existing service.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *   running on the service.
     */
    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     *
     * Default: false
     *
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     *   within the service.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Whether ECS Exec should be enabled.
     *
     * Default: - false
     *
     * @param enableExecuteCommand Whether ECS Exec should be enabled.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
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
     *   scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     *   first started.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    /**
     * The application load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     *
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(loadBalancers: ApplicationLoadBalancerPropsDsl.() -> Unit) {
        _loadBalancers.add(ApplicationLoadBalancerPropsDsl().apply(loadBalancers).build())
    }

    /**
     * The application load balancer that will serve traffic to the service.
     *
     * Default: - a new load balancer with a listener will be created.
     *
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(loadBalancers: Collection<ApplicationLoadBalancerProps>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under heavy contention, Docker attempts to keep the container memory to
     * this soft limit. However, your container can consume more memory when it needs to, up to
     * either the hard limit specified with the memory parameter (if applicable), or all of the
     * available memory on the container instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Note that this setting will be ignored if TaskImagesOptions is specified
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service.
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    /**
     * The placement constraints to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     *
     * Default: - No constraints.
     *
     * @param placementConstraints The placement constraints to use for tasks in the service.
     */
    public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
        _placementConstraints.addAll(placementConstraints)
    }

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service.
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    /**
     * The placement strategies to use for tasks in the service.
     *
     * For more information, see
     * [Amazon ECS Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     *
     * Default: - No strategies.
     *
     * @param placementStrategies The placement strategies to use for tasks in the service.
     */
    public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
        _placementStrategies.addAll(placementStrategies)
    }

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks
     * in the service.
     *
     * Tags can only be propagated to the tasks within the service during service creation.
     *
     * Default: - none
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     *   service to the tasks in the service.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * The name of the service.
     *
     * Default: - CloudFormation-generated name.
     *
     * @param serviceName The name of the service.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * Properties to specify ALB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     *
     * @param targetGroups Properties to specify ALB target groups.
     */
    public fun targetGroups(targetGroups: ApplicationTargetPropsDsl.() -> Unit) {
        _targetGroups.add(ApplicationTargetPropsDsl().apply(targetGroups).build())
    }

    /**
     * Properties to specify ALB target groups.
     *
     * Default: - default portMapping registered as target group and attached to the first defined
     * listener
     *
     * @param targetGroups Properties to specify ALB target groups.
     */
    public fun targetGroups(targetGroups: Collection<ApplicationTargetProps>) {
        _targetGroups.addAll(targetGroups)
    }

    /**
     * The task definition to use for tasks in the service. Only one of TaskDefinition or
     * TaskImageOptions must be specified.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     *
     * @param taskDefinition The task definition to use for tasks in the service. Only one of
     *   TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: none
     *
     * @param taskImageOptions The properties required to create a new task definition.
     */
    public fun taskImageOptions(
        taskImageOptions: ApplicationLoadBalancedTaskImagePropsDsl.() -> Unit = {}
    ) {
        val builder = ApplicationLoadBalancedTaskImagePropsDsl()
        builder.apply(taskImageOptions)
        cdkBuilder.taskImageOptions(builder.build())
    }

    /**
     * The properties required to create a new task definition.
     *
     * Only one of TaskDefinition or TaskImageOptions must be specified.
     *
     * Default: none
     *
     * @param taskImageOptions The properties required to create a new task definition.
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
        cdkBuilder.taskImageOptions(taskImageOptions)
    }

    /**
     * The VPC where the container instances will be launched or the elastic network interfaces
     * (ENIs) will be deployed.
     *
     * If a vpc is specified, the cluster construct should be omitted. Alternatively, you can omit
     * both vpc and cluster.
     *
     * Default: - uses the VPC defined in the cluster or creates a new VPC.
     *
     * @param vpc The VPC where the container instances will be launched or the elastic network
     *   interfaces (ENIs) will be deployed.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationMultipleTargetGroupsEc2Service {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
