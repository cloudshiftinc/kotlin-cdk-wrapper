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

package io.cloudshiftdev.awscdkdsl.services.ecs.patterns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for configuring a new container.
 *
 * Example:
 * ```
 * // Two network load balancers, each with their own listener and target group.
 * Cluster cluster;
 * NetworkMultipleTargetGroupsEc2Service loadBalancedEc2Service =
 * NetworkMultipleTargetGroupsEc2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(256)
 * .taskImageOptions(NetworkLoadBalancedTaskImageProps.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .loadBalancers(List.of(NetworkLoadBalancerProps.builder()
 * .name("lb1")
 * .listeners(List.of(NetworkListenerProps.builder()
 * .name("listener1")
 * .build()))
 * .build(), NetworkLoadBalancerProps.builder()
 * .name("lb2")
 * .listeners(List.of(NetworkListenerProps.builder()
 * .name("listener2")
 * .build()))
 * .build()))
 * .targetGroups(List.of(NetworkTargetProps.builder()
 * .containerPort(80)
 * .listener("listener1")
 * .build(), NetworkTargetProps.builder()
 * .containerPort(90)
 * .listener("listener2")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkLoadBalancedTaskImagePropsDsl {
    private val cdkBuilder: NetworkLoadBalancedTaskImageProps.Builder =
        NetworkLoadBalancedTaskImageProps.builder()

    private val _containerPorts: MutableList<Number> = mutableListOf()

    /** @param containerName The container name value to be specified in the task definition. */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /**
     * @param containerPorts A list of port numbers on the container that is bound to the
     *   user-specified or automatically assigned host port. If you are using containers in a task
     *   with the awsvpc or host network mode, exposed ports should be specified using
     *   containerPort. If you are using containers in a task with the bridge network mode and you
     *   specify a container port and not a host port, your container automatically receives a host
     *   port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    public fun containerPorts(vararg containerPorts: Number) {
        _containerPorts.addAll(listOf(*containerPorts))
    }

    /**
     * @param containerPorts A list of port numbers on the container that is bound to the
     *   user-specified or automatically assigned host port. If you are using containers in a task
     *   with the awsvpc or host network mode, exposed ports should be specified using
     *   containerPort. If you are using containers in a task with the bridge network mode and you
     *   specify a container port and not a host port, your container automatically receives a host
     *   port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    public fun containerPorts(containerPorts: Collection<Number>) {
        _containerPorts.addAll(containerPorts)
    }

    /** @param dockerLabels A key/value map of labels to add to the container. */
    public fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    /** @param enableLogging Flag to indicate whether to enable logging. */
    public fun enableLogging(enableLogging: Boolean) {
        cdkBuilder.enableLogging(enableLogging)
    }

    /** @param environment The environment variables to pass to the container. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param executionRole The name of the task execution IAM role that grants the Amazon ECS
     *   container agent permission to call AWS APIs on your behalf.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param family The name of a family that this task definition is registered to. A family
     *   groups multiple versions of a task definition.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * @param image The image used to start a container. Image or taskDefinition must be specified,
     *   but not both.
     */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /** @param logDriver The log driver to use. */
    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    /** @param secrets The secrets to expose to the container as an environment variable. */
    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    /**
     * @param taskRole The name of the task IAM role that grants containers in the task permission
     *   to call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    public fun build(): NetworkLoadBalancedTaskImageProps {
        if (_containerPorts.isNotEmpty()) cdkBuilder.containerPorts(_containerPorts)
        return cdkBuilder.build()
    }
}
