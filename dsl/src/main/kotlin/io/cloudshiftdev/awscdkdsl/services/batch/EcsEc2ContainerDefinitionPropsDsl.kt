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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.batch.EcsEc2ContainerDefinitionProps
import software.amazon.awscdk.services.batch.EcsVolume
import software.amazon.awscdk.services.batch.LinuxParameters
import software.amazon.awscdk.services.batch.Secret
import software.amazon.awscdk.services.batch.Ulimit
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.iam.IRole

/**
 * Props to configure an EcsEc2ContainerDefinition.
 *
 * Example:
 * ```
 * IVpc vpc;
 * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
 * .vpc(vpc)
 * .build())
 * .order(1)
 * .build()))
 * .priority(10)
 * .build();
 * User user = new User(this, "MyUser");
 * ecsJob.grantSubmitJob(user, queue);
 * ```
 */
@CdkDslMarker
public class EcsEc2ContainerDefinitionPropsDsl {
    private val cdkBuilder: EcsEc2ContainerDefinitionProps.Builder =
        EcsEc2ContainerDefinitionProps.builder()

    private val _command: MutableList<String> = mutableListOf()

    private val _ulimits: MutableList<Ulimit> = mutableListOf()

    private val _volumes: MutableList<EcsVolume> = mutableListOf()

    /** @param command The command that's passed to the container. */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /** @param command The command that's passed to the container. */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param cpu The number of vCPUs reserved for the container. Each vCPU is equivalent to 1,024
     *   CPU shares. For containers running on EC2 resources, you must specify at least one vCPU.
     */
    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * @param environment The environment variables to pass to a container. Cannot start with
     *   `AWS_BATCH`. We don't recommend using plaintext environment variables for sensitive
     *   information, such as credential data.
     */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param executionRole The role used by Amazon ECS container and AWS Fargate agents to make AWS
     *   API calls on your behalf.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param gpu The number of physical GPUs to reserve for the container. Make sure that the
     *   number of GPUs reserved for all containers in a job doesn't exceed the number of available
     *   GPUs on the compute resource that the job is launched on.
     */
    public fun gpu(gpu: Number) {
        cdkBuilder.gpu(gpu)
    }

    /** @param image The image that this container will run. */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /** @param jobRole The role that the container can assume. */
    public fun jobRole(jobRole: IRole) {
        cdkBuilder.jobRole(jobRole)
    }

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     *   as details for device mappings.
     */
    public fun linuxParameters(linuxParameters: LinuxParameters) {
        cdkBuilder.linuxParameters(linuxParameters)
    }

    /** @param logging The loging configuration for this Job. */
    public fun logging(logging: LogDriver) {
        cdkBuilder.logging(logging)
    }

    /**
     * @param memory The memory hard limit present to the container. If your container attempts to
     *   exceed the memory specified, the container is terminated. You must specify at least 4 MiB
     *   of memory for a job.
     */
    public fun memory(memory: Size) {
        cdkBuilder.memory(memory)
    }

    /**
     * @param privileged When this parameter is true, the container is given elevated permissions on
     *   the host container instance (similar to the root user).
     */
    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    /** @param readonlyRootFilesystem Gives the container readonly access to its root filesystem. */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * @param secrets A map from environment variable names to the secrets for the container. Allows
     *   your job definitions to reference the secret by the environment variable name defined in
     *   this property.
     */
    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    /** @param ulimits Limits to set for the user this docker container will run as. */
    public fun ulimits(ulimits: UlimitDsl.() -> Unit) {
        _ulimits.add(UlimitDsl().apply(ulimits).build())
    }

    /** @param ulimits Limits to set for the user this docker container will run as. */
    public fun ulimits(ulimits: Collection<Ulimit>) {
        _ulimits.addAll(ulimits)
    }

    /** @param user The user name to use inside the container. */
    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    /**
     * @param volumes The volumes to mount to this container. Automatically added to the job
     *   definition.
     */
    public fun volumes(vararg volumes: EcsVolume) {
        _volumes.addAll(listOf(*volumes))
    }

    /**
     * @param volumes The volumes to mount to this container. Automatically added to the job
     *   definition.
     */
    public fun volumes(volumes: Collection<EcsVolume>) {
        _volumes.addAll(volumes)
    }

    public fun build(): EcsEc2ContainerDefinitionProps {
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_ulimits.isNotEmpty()) cdkBuilder.ulimits(_ulimits)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
