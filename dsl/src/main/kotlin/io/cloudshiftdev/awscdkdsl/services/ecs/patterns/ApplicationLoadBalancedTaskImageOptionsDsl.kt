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
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.iam.IRole

/**
 * Example:
 * ```
 * Cluster cluster;
 * ApplicationLoadBalancedFargateService loadBalancedFargateService =
 * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .memoryLimitMiB(1024)
 * .desiredCount(1)
 * .cpu(512)
 * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build())
 * .taskSubnets(SubnetSelection.builder()
 * .subnets(List.of(Subnet.fromSubnetId(this, "subnet", "VpcISOLATEDSubnet1Subnet80F07FA0")))
 * .build())
 * .loadBalancerName("application-lb-name")
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancedTaskImageOptionsDsl {
    private val cdkBuilder: ApplicationLoadBalancedTaskImageOptions.Builder =
        ApplicationLoadBalancedTaskImageOptions.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _entryPoint: MutableList<String> = mutableListOf()

    /**
     * @param command The command that's passed to the container. If there are multiple arguments,
     *   make sure that each argument is a separated string in the array.
     *
     * This parameter maps to `Cmd` in the
     * [Create a container](https://docs.docker.com/engine/api/v1.38/#operation/ContainerCreate)
     * section of the [Docker Remote API](https://docs.docker.com/engine/api/v1.38/) and the
     * `COMMAND` parameter to
     * [docker run](https://docs.docker.com/engine/reference/commandline/run/).
     *
     * For more information about the Docker `CMD` parameter, see
     * https://docs.docker.com/engine/reference/builder/#cmd.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The command that's passed to the container. If there are multiple arguments,
     *   make sure that each argument is a separated string in the array.
     *
     * This parameter maps to `Cmd` in the
     * [Create a container](https://docs.docker.com/engine/api/v1.38/#operation/ContainerCreate)
     * section of the [Docker Remote API](https://docs.docker.com/engine/api/v1.38/) and the
     * `COMMAND` parameter to
     * [docker run](https://docs.docker.com/engine/reference/commandline/run/).
     *
     * For more information about the Docker `CMD` parameter, see
     * https://docs.docker.com/engine/reference/builder/#cmd.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /** @param containerName The container name value to be specified in the task definition. */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /**
     * @param containerPort The port number on the container that is bound to the user-specified or
     *   automatically assigned host port. If you are using containers in a task with the awsvpc or
     *   host network mode, exposed ports should be specified using containerPort. If you are using
     *   containers in a task with the bridge network mode and you specify a container port and not
     *   a host port, your container automatically receives a host port in the ephemeral port range.
     *
     * Port mappings that are automatically assigned in this way do not count toward the 100
     * reserved ports limit of a container instance.
     *
     * For more information, see
     * [hostPort](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PortMapping.html#ECS-Type-PortMapping-hostPort).
     */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    /** @param dockerLabels A key/value map of labels to add to the container. */
    public fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    /** @param enableLogging Flag to indicate whether to enable logging. */
    public fun enableLogging(enableLogging: Boolean) {
        cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * @param entryPoint The entry point that's passed to the container. This parameter maps to
     *   `Entrypoint` in the
     *   [Create a container](https://docs.docker.com/engine/api/v1.38/#operation/ContainerCreate)
     *   section of the [Docker Remote API](https://docs.docker.com/engine/api/v1.38/) and the
     *   `--entrypoint` option to
     *   [docker run](https://docs.docker.com/engine/reference/commandline/run/).
     *
     * For more information about the Docker `ENTRYPOINT` parameter, see
     * https://docs.docker.com/engine/reference/builder/#entrypoint.
     */
    public fun entryPoint(vararg entryPoint: String) {
        _entryPoint.addAll(listOf(*entryPoint))
    }

    /**
     * @param entryPoint The entry point that's passed to the container. This parameter maps to
     *   `Entrypoint` in the
     *   [Create a container](https://docs.docker.com/engine/api/v1.38/#operation/ContainerCreate)
     *   section of the [Docker Remote API](https://docs.docker.com/engine/api/v1.38/) and the
     *   `--entrypoint` option to
     *   [docker run](https://docs.docker.com/engine/reference/commandline/run/).
     *
     * For more information about the Docker `ENTRYPOINT` parameter, see
     * https://docs.docker.com/engine/reference/builder/#entrypoint.
     */
    public fun entryPoint(entryPoint: Collection<String>) {
        _entryPoint.addAll(entryPoint)
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
     *   not both.
     */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /** @param logDriver The log driver to use. */
    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    /** @param secrets The secret to expose to the container as an environment variable. */
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

    public fun build(): ApplicationLoadBalancedTaskImageOptions {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
        return cdkBuilder.build()
    }
}
