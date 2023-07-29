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
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBaseProps
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps

/**
 * The properties for the base NetworkMultipleTargetGroupsEc2Service or
 * NetworkMultipleTargetGroupsFargateService service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.route53.*;
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Cluster cluster;
 * ContainerDefinition containerDefinition;
 * ContainerImage containerImage;
 * HostedZone hostedZone;
 * LogDriver logDriver;
 * INamespace namespace;
 * Role role;
 * Secret secret;
 * Vpc vpc;
 * NetworkMultipleTargetGroupsServiceBaseProps networkMultipleTargetGroupsServiceBaseProps =
 * NetworkMultipleTargetGroupsServiceBaseProps.builder()
 * .cloudMapOptions(CloudMapOptions.builder()
 * .cloudMapNamespace(namespace)
 * .container(containerDefinition)
 * .containerPort(123)
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.minutes(30))
 * .failureThreshold(123)
 * .name("name")
 * .build())
 * .cluster(cluster)
 * .desiredCount(123)
 * .enableECSManagedTags(false)
 * .enableExecuteCommand(false)
 * .healthCheckGracePeriod(Duration.minutes(30))
 * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
 * .listeners(List.of(NetworkListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .domainName("domainName")
 * .domainZone(hostedZone)
 * .publicLoadBalancer(false)
 * .build()))
 * .propagateTags(PropagatedTagSource.SERVICE)
 * .serviceName("serviceName")
 * .targetGroups(List.of(NetworkTargetProps.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .listener("listener")
 * .build()))
 * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
 * .image(containerImage)
 * // the properties below are optional
 * .containerName("containerName")
 * .containerPorts(List.of(123))
 * .dockerLabels(Map.of(
 * "dockerLabelsKey", "dockerLabels"))
 * .enableLogging(false)
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .executionRole(role)
 * .family("family")
 * .logDriver(logDriver)
 * .secrets(Map.of(
 * "secretsKey", secret))
 * .taskRole(role)
 * .build())
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkMultipleTargetGroupsServiceBasePropsDsl {
    private val cdkBuilder: NetworkMultipleTargetGroupsServiceBaseProps.Builder =
        NetworkMultipleTargetGroupsServiceBaseProps.builder()

    private val _loadBalancers: MutableList<NetworkLoadBalancerProps> = mutableListOf()

    private val _targetGroups: MutableList<NetworkTargetProps> = mutableListOf()

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
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *   running on the service. The minimum value is 1
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

    /** @param loadBalancers The network load balancer that will serve traffic to the service. */
    public fun loadBalancers(loadBalancers: NetworkLoadBalancerPropsDsl.() -> Unit) {
        _loadBalancers.add(NetworkLoadBalancerPropsDsl().apply(loadBalancers).build())
    }

    /** @param loadBalancers The network load balancer that will serve traffic to the service. */
    public fun loadBalancers(loadBalancers: Collection<NetworkLoadBalancerProps>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     *   service to the tasks in the service. Tags can only be propagated to the tasks within the
     *   service during service creation.
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /** @param serviceName Name of the service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /** @param targetGroups Properties to specify NLB target groups. */
    public fun targetGroups(targetGroups: NetworkTargetPropsDsl.() -> Unit) {
        _targetGroups.add(NetworkTargetPropsDsl().apply(targetGroups).build())
    }

    /** @param targetGroups Properties to specify NLB target groups. */
    public fun targetGroups(targetGroups: Collection<NetworkTargetProps>) {
        _targetGroups.addAll(targetGroups)
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition. Only one of
     *   TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskImageOptions(
        taskImageOptions: NetworkLoadBalancedTaskImagePropsDsl.() -> Unit = {}
    ) {
        val builder = NetworkLoadBalancedTaskImagePropsDsl()
        builder.apply(taskImageOptions)
        cdkBuilder.taskImageOptions(builder.build())
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition. Only one of
     *   TaskDefinition or TaskImageOptions must be specified.
     */
    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps) {
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

    public fun build(): NetworkMultipleTargetGroupsServiceBaseProps {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
