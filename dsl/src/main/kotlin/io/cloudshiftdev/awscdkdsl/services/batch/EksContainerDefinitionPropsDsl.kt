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
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.batch.EksContainerDefinitionProps
import software.amazon.awscdk.services.batch.EksVolume
import software.amazon.awscdk.services.batch.ImagePullPolicy
import software.amazon.awscdk.services.ecs.ContainerImage

/**
 * Props to configure an EksContainerDefinition.
 *
 * Example:
 * ```
 * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
 * .container(EksContainerDefinition.Builder.create(this, "container")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
 * .name("myEmptyDirVolume")
 * .mountPath("/mount/path")
 * .medium(EmptyDirMediumType.MEMORY)
 * .readonly(true)
 * .sizeLimit(Size.mebibytes(2048))
 * .build())))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EksContainerDefinitionPropsDsl {
    private val cdkBuilder: EksContainerDefinitionProps.Builder =
        EksContainerDefinitionProps.builder()

    private val _args: MutableList<String> = mutableListOf()

    private val _command: MutableList<String> = mutableListOf()

    private val _volumes: MutableList<EksVolume> = mutableListOf()

    /**
     * @param args An array of arguments to the entrypoint. If this isn't specified, the CMD of the
     *   container image is used. This corresponds to the args member in the Entrypoint portion of
     *   the Pod in Kubernetes. Environment variable references are expanded using the container's
     *   environment. If the referenced environment variable doesn't exist, the reference in the
     *   command isn't changed. For example, if the reference is to "$(NAME1)" and the NAME1
     *   environment variable doesn't exist, the command string will remain "$(NAME1)." $$ is
     *   replaced with $, and the resulting string isn't expanded. or example, $$(VAR_NAME) is
     *   passed as $(VAR_NAME) whether or not the VAR_NAME environment variable exists.
     */
    public fun args(vararg args: String) {
        _args.addAll(listOf(*args))
    }

    /**
     * @param args An array of arguments to the entrypoint. If this isn't specified, the CMD of the
     *   container image is used. This corresponds to the args member in the Entrypoint portion of
     *   the Pod in Kubernetes. Environment variable references are expanded using the container's
     *   environment. If the referenced environment variable doesn't exist, the reference in the
     *   command isn't changed. For example, if the reference is to "$(NAME1)" and the NAME1
     *   environment variable doesn't exist, the command string will remain "$(NAME1)." $$ is
     *   replaced with $, and the resulting string isn't expanded. or example, $$(VAR_NAME) is
     *   passed as $(VAR_NAME) whether or not the VAR_NAME environment variable exists.
     */
    public fun args(args: Collection<String>) {
        _args.addAll(args)
    }

    /**
     * @param command The entrypoint for the container. This isn't run within a shell. If this isn't
     *   specified, the `ENTRYPOINT` of the container image is used. Environment variable references
     *   are expanded using the container's environment. If the referenced environment variable
     *   doesn't exist, the reference in the command isn't changed. For example, if the reference is
     *   to `"$(NAME1)"` and the `NAME1` environment variable doesn't exist, the command string will
     *   remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting string isn't expanded. For
     *   example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     *   environment variable exists.
     *
     * The entrypoint can't be updated.
     */
    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    /**
     * @param command The entrypoint for the container. This isn't run within a shell. If this isn't
     *   specified, the `ENTRYPOINT` of the container image is used. Environment variable references
     *   are expanded using the container's environment. If the referenced environment variable
     *   doesn't exist, the reference in the command isn't changed. For example, if the reference is
     *   to `"$(NAME1)"` and the `NAME1` environment variable doesn't exist, the command string will
     *   remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting string isn't expanded. For
     *   example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     *   environment variable exists.
     *
     * The entrypoint can't be updated.
     */
    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    /**
     * @param cpuLimit The hard limit of CPUs to present to this container. Must be an even multiple
     *   of 0.25. If your container attempts to exceed this limit, it will be terminated.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required. If both are specified, then
     * `cpuLimit` must be at least as large as `cpuReservation`.
     */
    public fun cpuLimit(cpuLimit: Number) {
        cdkBuilder.cpuLimit(cpuLimit)
    }

    /**
     * @param cpuReservation The soft limit of CPUs to reserve for the container Must be an even
     *   multiple of 0.25. The container will given at least this many CPUs, but may consume more.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required. If both are specified, then
     * `cpuLimit` must be at least as large as `cpuReservation`.
     */
    public fun cpuReservation(cpuReservation: Number) {
        cdkBuilder.cpuReservation(cpuReservation)
    }

    /**
     * @param env The environment variables to pass to this container. *Note*: Environment variables
     *   cannot start with "AWS_BATCH". This naming convention is reserved for variables that AWS
     *   Batch sets.
     */
    public fun env(env: Map<String, String>) {
        cdkBuilder.env(env)
    }

    /**
     * @param gpuLimit The hard limit of GPUs to present to this container. If your container
     *   attempts to exceed this limit, it will be terminated.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     */
    public fun gpuLimit(gpuLimit: Number) {
        cdkBuilder.gpuLimit(gpuLimit)
    }

    /**
     * @param gpuReservation The soft limit of CPUs to reserve for the container Must be an even
     *   multiple of 0.25. The container will given at least this many CPUs, but may consume more.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     */
    public fun gpuReservation(gpuReservation: Number) {
        cdkBuilder.gpuReservation(gpuReservation)
    }

    /** @param image The image that this container will run. */
    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    /** @param imagePullPolicy The image pull policy for this container. */
    public fun imagePullPolicy(imagePullPolicy: ImagePullPolicy) {
        cdkBuilder.imagePullPolicy(imagePullPolicy)
    }

    /**
     * @param memoryLimit The amount (in MiB) of memory to present to the container. If your
     *   container attempts to exceed the allocated memory, it will be terminated.
     *
     * Must be larger that 4 MiB
     *
     * At least one of `memoryLimit` and `memoryReservation` is required
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible for the specific instance type that you are using.
     */
    public fun memoryLimit(memoryLimit: Size) {
        cdkBuilder.memoryLimit(memoryLimit)
    }

    /**
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container. Your
     *   container will be given at least this much memory, but may consume more.
     *
     * Must be larger that 4 MiB
     *
     * When system memory is under heavy contention, Docker attempts to keep the container memory to
     * this soft limit. However, your container can consume more memory when it needs to, up to
     * either the hard limit specified with the memory parameter (if applicable), or all of the
     * available memory on the container instance, whichever comes first.
     *
     * At least one of `memoryLimit` and `memoryReservation` is required. If both are specified,
     * then `memoryLimit` must be equal to `memoryReservation`
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible for the specific instance type that you are using.
     */
    public fun memoryReservation(memoryReservation: Size) {
        cdkBuilder.memoryReservation(memoryReservation)
    }

    /** @param name The name of this container. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param privileged If specified, gives this container elevated permissions on the host
     *   container instance. The level of permissions are similar to the root user permissions.
     *
     * This parameter maps to `privileged` policy in the Privileged pod security policies in the
     * Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    /**
     * @param readonlyRootFilesystem If specified, gives this container readonly access to its root
     *   file system. This parameter maps to `ReadOnlyRootFilesystem` policy in the Volumes and file
     *   systems pod security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * @param runAsGroup If specified, the container is run as the specified group ID (`gid`). If
     *   this parameter isn't specified, the default is the group that's specified in the image
     *   metadata. This parameter maps to `RunAsGroup` and `MustRunAs` policy in the Users and
     *   groups pod security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun runAsGroup(runAsGroup: Number) {
        cdkBuilder.runAsGroup(runAsGroup)
    }

    /**
     * @param runAsRoot If specified, the container is run as a user with a `uid` other than 0.
     *   Otherwise, no such rule is enforced. This parameter maps to `RunAsUser` and
     *   `MustRunAsNonRoot` policy in the Users and groups pod security policies in the Kubernetes
     *   documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun runAsRoot(runAsRoot: Boolean) {
        cdkBuilder.runAsRoot(runAsRoot)
    }

    /**
     * @param runAsUser If specified, this container is run as the specified user ID (`uid`). This
     *   parameter maps to `RunAsUser` and `MustRunAs` policy in the Users and groups pod security
     *   policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun runAsUser(runAsUser: Number) {
        cdkBuilder.runAsUser(runAsUser)
    }

    /** @param volumes The Volumes to mount to this container. Automatically added to the Pod. */
    public fun volumes(vararg volumes: EksVolume) {
        _volumes.addAll(listOf(*volumes))
    }

    /** @param volumes The Volumes to mount to this container. Automatically added to the Pod. */
    public fun volumes(volumes: Collection<EksVolume>) {
        _volumes.addAll(volumes)
    }

    public fun build(): EksContainerDefinitionProps {
        if (_args.isNotEmpty()) cdkBuilder.args(_args)
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
