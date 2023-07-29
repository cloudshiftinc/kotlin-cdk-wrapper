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
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps

/**
 * The properties for the ApplicationMultipleTargetGroupsEc2Service service.
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
public class ApplicationMultipleTargetGroupsEc2ServicePropsDsl {
    private val cdkBuilder: ApplicationMultipleTargetGroupsEc2ServiceProps.Builder =
        ApplicationMultipleTargetGroupsEc2ServiceProps.builder()

    private val _loadBalancers: MutableList<ApplicationLoadBalancerProps> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    private val _targetGroups: MutableList<ApplicationTargetProps> = mutableListOf()

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     *   discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptionsDsl.() -> Unit = {}) {
        val builder = CloudMapOptionsDsl()
        builder.apply(cloudMapOptions)
        cdkBuilder.cloudMapOptions(builder.build())
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     *   discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
        cdkBuilder.cloudMapOptions(cloudMapOptions)
    }

    /**
     * @param cluster The name of the cluster that hosts the service. If a cluster is specified, the
     *   vpc construct should be omitted. Alternatively, you can omit both cluster and vpc.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param cpu The minimum number of CPU units to reserve for the container. Valid values, which
     *   determines your range of valid values for the memory parameter:
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *   running on the service.
     */
    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     *   within the service. For more information, see
     *   [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /** @param enableExecuteCommand Whether ECS Exec should be enabled. */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     *   scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     *   first started.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(loadBalancers: ApplicationLoadBalancerPropsDsl.() -> Unit) {
        _loadBalancers.add(ApplicationLoadBalancerPropsDsl().apply(loadBalancers).build())
    }

    /**
     * @param loadBalancers The application load balancer that will serve traffic to the service.
     */
    public fun loadBalancers(loadBalancers: Collection<ApplicationLoadBalancerProps>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container. If your
     *   container attempts to exceed the allocated memory, the container is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     *   When system memory is under heavy contention, Docker attempts to keep the container memory
     *   to this soft limit. However, your container can consume more memory when it needs to, up to
     *   either the hard limit specified with the memory parameter (if applicable), or all of the
     *   available memory on the container instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     *
     * Note that this setting will be ignored if TaskImagesOptions is specified
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * @param placementConstraints The placement constraints to use for tasks in the service. For
     *   more information, see
     *   [Amazon ECS Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     */
    public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    /**
     * @param placementConstraints The placement constraints to use for tasks in the service. For
     *   more information, see
     *   [Amazon ECS Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html).
     */
    public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
        _placementConstraints.addAll(placementConstraints)
    }

    /**
     * @param placementStrategies The placement strategies to use for tasks in the service. For more
     *   information, see
     *   [Amazon ECS Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     */
    public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    /**
     * @param placementStrategies The placement strategies to use for tasks in the service. For more
     *   information, see
     *   [Amazon ECS Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html).
     */
    public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
        _placementStrategies.addAll(placementStrategies)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     *   service to the tasks in the service. Tags can only be propagated to the tasks within the
     *   service during service creation.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /** @param serviceName The name of the service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /** @param targetGroups Properties to specify ALB target groups. */
    public fun targetGroups(targetGroups: ApplicationTargetPropsDsl.() -> Unit) {
        _targetGroups.add(ApplicationTargetPropsDsl().apply(targetGroups).build())
    }

    /** @param targetGroups Properties to specify ALB target groups. */
    public fun targetGroups(targetGroups: Collection<ApplicationTargetProps>) {
        _targetGroups.addAll(targetGroups)
    }

    /**
     * @param taskDefinition The task definition to use for tasks in the service. Only one of
     *   TaskDefinition or TaskImageOptions must be specified. [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition. Only one of
     *   TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskImageOptions(
        taskImageOptions: ApplicationLoadBalancedTaskImagePropsDsl.() -> Unit = {}
    ) {
        val builder = ApplicationLoadBalancedTaskImagePropsDsl()
        builder.apply(taskImageOptions)
        cdkBuilder.taskImageOptions(builder.build())
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition. Only one of
     *   TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
        cdkBuilder.taskImageOptions(taskImageOptions)
    }

    /**
     * @param vpc The VPC where the container instances will be launched or the elastic network
     *   interfaces (ENIs) will be deployed. If a vpc is specified, the cluster construct should be
     *   omitted. Alternatively, you can omit both vpc and cluster.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationMultipleTargetGroupsEc2ServiceProps {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
