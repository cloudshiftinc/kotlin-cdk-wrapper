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
import cloudshift.awscdk.dsl.services.ecs.CapacityProviderStrategyDsl
import cloudshift.awscdk.dsl.services.ecs.CloudMapOptionsDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentCircuitBreakerDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentControllerDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
import software.amazon.awscdk.services.route53.IHostedZone

/**
 * The properties for the ApplicationLoadBalancedEc2Service service.
 *
 * Example:
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedEc2Service loadBalancedEcsService =
 * ApplicationLoadBalancedEc2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("test"))
 * .environment(Map.of(
 * "TEST_ENVIRONMENT_VARIABLE1", "test environment variable 1 value",
 * "TEST_ENVIRONMENT_VARIABLE2", "test environment variable 2 value"))
 * .command(List.of("command"))
 * .entryPoint(List.of("entry", "point"))
 * .build())
 * .desiredCount(2)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancedEc2ServicePropsDsl {
    private val cdkBuilder: ApplicationLoadBalancedEc2ServiceProps.Builder =
        ApplicationLoadBalancedEc2ServiceProps.builder()

    private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     *   service.
     */
    public fun capacityProviderStrategies(
        capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit
    ) {
        _capacityProviderStrategies.add(
            CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build()
        )
    }

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     *   service.
     */
    public fun capacityProviderStrategies(
        capacityProviderStrategies: Collection<CapacityProviderStrategy>
    ) {
        _capacityProviderStrategies.addAll(capacityProviderStrategies)
    }

    /**
     * @param certificate Certificate Manager certificate to associate with the load balancer.
     *   Setting this option will set the load balancer protocol to HTTPS.
     */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker. If this property is
     *   defined, circuit breaker will be implicitly enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
        val builder = DeploymentCircuitBreakerDsl()
        builder.apply(circuitBreaker)
        cdkBuilder.circuitBreaker(builder.build())
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker. If this property is
     *   defined, circuit breaker will be implicitly enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
        cdkBuilder.circuitBreaker(circuitBreaker)
    }

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
     * @param cpu The number of cpu units used by the task. Valid values, which determines your
     *   range of valid values for the memory parameter:
     *
     * 256 (.25 vCPU) - Available memory values: 0.5GB, 1GB, 2GB
     *
     * 512 (.5 vCPU) - Available memory values: 1GB, 2GB, 3GB, 4GB
     *
     * 1024 (1 vCPU) - Available memory values: 2GB, 3GB, 4GB, 5GB, 6GB, 7GB, 8GB
     *
     * 2048 (2 vCPU) - Available memory values: Between 4GB and 16GB in 1GB increments
     *
     * 4096 (4 vCPU) - Available memory values: Between 8GB and 30GB in 1GB increments
     *
     * This default is set in the underlying FargateTaskDefinition construct.
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service. For
     *   more information, see
     *   [Amazon ECS Deployment Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentControllerDsl.() -> Unit = {}) {
        val builder = DeploymentControllerDsl()
        builder.apply(deploymentController)
        cdkBuilder.deploymentController(builder.build())
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service. For
     *   more information, see
     *   [Amazon ECS Deployment Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentController) {
        cdkBuilder.deploymentController(deploymentController)
    }

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *   running on the service. The minimum value is 1
     */
    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    /** @param domainName The domain name for the service, e.g. "api.example.com.". */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.". */
    public fun domainZone(domainZone: IHostedZone) {
        cdkBuilder.domainZone(domainZone)
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
     * @param idleTimeout The load balancer idle timeout, in seconds. Can be between 1 and 4000
     *   seconds
     */
    public fun idleTimeout(idleTimeout: Duration) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    /**
     * @param listenerPort Listener port of the application load balancer that will serve traffic to
     *   the service.
     */
    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * @param loadBalancer The application load balancer that will serve traffic to the service. The
     *   VPC attribute of a load balancer must be specified for it to be used to create a new
     *   service with this pattern.
     *
     * [disable-awslint:ref-via-interface]
     */
    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    /** @param loadBalancerName Name of the load balancer. */
    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     *   ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number) {
        cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * @param memoryLimitMiB The hard limit (in MiB) of memory to present to the container. If your
     *   container attempts to exceed the allocated memory, the container is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     *   When system memory is under contention, Docker attempts to keep the container memory within
     *   the limit. If the container requires more memory, it can consume up to the value specified
     *   by the Memory property or all of the available memory on the container instance—whichever
     *   comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required.
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     *   ECS service's DesiredCount value, that must continue to run and remain healthy during a
     *   deployment.
     */
    public fun minHealthyPercent(minHealthyPercent: Number) {
        cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * @param openListener Determines whether or not the Security Group for the Load Balancer's
     *   Listener will be open to all traffic by default.
     */
    public fun openListener(openListener: Boolean) {
        cdkBuilder.openListener(openListener)
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

    /**
     * @param protocol The protocol for connections from clients to the load balancer. The load
     *   balancer port is determined from the protocol (port 80 for HTTP, port 443 for HTTPS). If
     *   HTTPS, either a certificate or domain name and domain zone must also be specified.
     */
    public fun protocol(protocol: ApplicationProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param protocolVersion The protocol version to use. */
    public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
        cdkBuilder.protocolVersion(protocolVersion)
    }

    /** @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing. */
    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
        cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    /**
     * @param recordType Specifies whether the Route53 record should be a CNAME, an A record using
     *   the Alias feature or no record at all. This is useful if you need to work with DNS systems
     *   that do not support alias records.
     */
    public fun recordType(recordType: ApplicationLoadBalancedServiceRecordType) {
        cdkBuilder.recordType(recordType)
    }

    /**
     * @param redirectHttp Specifies whether the load balancer should redirect traffic on port 80 to
     *   port 443 to support HTTP-&gt;HTTPS redirects This is only valid if the protocol of the ALB
     *   is HTTPS.
     */
    public fun redirectHttp(redirectHttp: Boolean) {
        cdkBuilder.redirectHttp(redirectHttp)
    }

    /** @param serviceName The name of the service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported
     *   by the ALB Listener.
     */
    public fun sslPolicy(sslPolicy: SslPolicy) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    /**
     * @param targetProtocol The protocol for connections from the load balancer to the ECS tasks.
     *   The default target port is determined from the protocol (port 80 for HTTP, port 443 for
     *   HTTPS).
     */
    public fun targetProtocol(targetProtocol: ApplicationProtocol) {
        cdkBuilder.targetProtocol(targetProtocol)
    }

    /**
     * @param taskDefinition The task definition to use for tasks in the service. TaskDefinition or
     *   TaskImageOptions must be specified, but not both.. [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     *   TaskDefinition or TaskImageOptions must be specified, but not both.
     */
    public fun taskImageOptions(
        taskImageOptions: ApplicationLoadBalancedTaskImageOptionsDsl.() -> Unit = {}
    ) {
        val builder = ApplicationLoadBalancedTaskImageOptionsDsl()
        builder.apply(taskImageOptions)
        cdkBuilder.taskImageOptions(builder.build())
    }

    /**
     * @param taskImageOptions The properties required to create a new task definition.
     *   TaskDefinition or TaskImageOptions must be specified, but not both.
     */
    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageOptions) {
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

    public fun build(): ApplicationLoadBalancedEc2ServiceProps {
        if (_capacityProviderStrategies.isNotEmpty())
            cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        return cdkBuilder.build()
    }
}
