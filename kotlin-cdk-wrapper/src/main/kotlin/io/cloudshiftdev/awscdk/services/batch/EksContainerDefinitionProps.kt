@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Props to configure an EksContainerDefinition.
 *
 * Example:
 *
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
public interface EksContainerDefinitionProps {
  /**
   * An array of arguments to the entrypoint.
   *
   * If this isn't specified, the CMD of the container image is used.
   * This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes.
   * Environment variable references are expanded using the container's environment.
   * If the referenced environment variable doesn't exist, the reference in the command isn't
   * changed.
   * For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't
   * exist,
   * the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string
   * isn't expanded.
   * or example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment
   * variable exists.
   *
   * Default: - no args
   *
   * [Documentation](https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
   */
  public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

  /**
   * The entrypoint for the container.
   *
   * This isn't run within a shell.
   * If this isn't specified, the `ENTRYPOINT` of the container image is used.
   * Environment variable references are expanded using the container's environment.
   * If the referenced environment variable doesn't exist, the reference in the command isn't
   * changed.
   * For example, if the reference is to `"$(NAME1)"` and the `NAME1` environment variable doesn't
   * exist,
   * the command string will remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting string
   * isn't expanded.
   * For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
   * environment variable exists.
   *
   * The entrypoint can't be updated.
   *
   * Default: - no command
   *
   * [Documentation](https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The hard limit of CPUs to present to this container. Must be an even multiple of 0.25.
   *
   * If your container attempts to exceed this limit, it will be terminated.
   *
   * At least one of `cpuReservation` and `cpuLimit` is required.
   * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
   *
   * Default: - No CPU limit
   *
   * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
   */
  public fun cpuLimit(): Number? = unwrap(this).getCpuLimit()

  /**
   * The soft limit of CPUs to reserve for the container Must be an even multiple of 0.25.
   *
   * The container will given at least this many CPUs, but may consume more.
   *
   * At least one of `cpuReservation` and `cpuLimit` is required.
   * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
   *
   * Default: - No CPUs reserved
   *
   * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
   */
  public fun cpuReservation(): Number? = unwrap(this).getCpuReservation()

  /**
   * The environment variables to pass to this container.
   *
   * *Note*: Environment variables cannot start with "AWS_BATCH".
   * This naming convention is reserved for variables that AWS Batch sets.
   *
   * Default: - no environment variables
   */
  public fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  /**
   * The hard limit of GPUs to present to this container.
   *
   * If your container attempts to exceed this limit, it will be terminated.
   *
   * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
   * `gpuReservation`.
   *
   * Default: - No GPU limit
   *
   * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
   */
  public fun gpuLimit(): Number? = unwrap(this).getGpuLimit()

  /**
   * The soft limit of CPUs to reserve for the container Must be an even multiple of 0.25.
   *
   * The container will given at least this many CPUs, but may consume more.
   *
   * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
   * `gpuReservation`.
   *
   * Default: - No GPUs reserved
   *
   * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
   */
  public fun gpuReservation(): Number? = unwrap(this).getGpuReservation()

  /**
   * The image that this container will run.
   */
  public fun image(): ContainerImage

  /**
   * The image pull policy for this container.
   *
   * Default: - `ALWAYS` if the `:latest` tag is specified, `IF_NOT_PRESENT` otherwise
   *
   * [Documentation](https://kubernetes.io/docs/concepts/containers/images/#updating-images)
   */
  public fun imagePullPolicy(): ImagePullPolicy? =
      unwrap(this).getImagePullPolicy()?.let(ImagePullPolicy::wrap)

  /**
   * The amount (in MiB) of memory to present to the container.
   *
   * If your container attempts to exceed the allocated memory, it will be terminated.
   *
   * Must be larger that 4 MiB
   *
   * At least one of `memoryLimit` and `memoryReservation` is required
   *
   * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
   * possible
   * for the specific instance type that you are using.
   *
   * Default: - No memory limit
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html)
   */
  public fun memoryLimit(): Size? = unwrap(this).getMemoryLimit()?.let(Size::wrap)

  /**
   * The soft limit (in MiB) of memory to reserve for the container.
   *
   * Your container will be given at least this much memory, but may consume more.
   *
   * Must be larger that 4 MiB
   *
   * When system memory is under heavy contention, Docker attempts to keep the
   * container memory to this soft limit. However, your container can consume more
   * memory when it needs to, up to either the hard limit specified with the memory
   * parameter (if applicable), or all of the available memory on the container
   * instance, whichever comes first.
   *
   * At least one of `memoryLimit` and `memoryReservation` is required.
   * If both are specified, then `memoryLimit` must be equal to `memoryReservation`
   *
   * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
   * possible
   * for the specific instance type that you are using.
   *
   * Default: - No memory reserved
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html)
   */
  public fun memoryReservation(): Size? = unwrap(this).getMemoryReservation()?.let(Size::wrap)

  /**
   * The name of this container.
   *
   * Default: : `'Default'`
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * If specified, gives this container elevated permissions on the host container instance.
   *
   * The level of permissions are similar to the root user permissions.
   *
   * This parameter maps to `privileged` policy in the Privileged pod security policies in the
   * Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   *
   * Default: false
   *
   * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems)
   */
  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * If specified, gives this container readonly access to its root file system.
   *
   * This parameter maps to `ReadOnlyRootFilesystem` policy in the Volumes and file systems pod
   * security policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   *
   * Default: false
   *
   * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems)
   */
  public fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  /**
   * If specified, the container is run as the specified group ID (`gid`).
   *
   * If this parameter isn't specified, the default is the group that's specified in the image
   * metadata.
   * This parameter maps to `RunAsGroup` and `MustRunAs` policy in the Users and groups pod security
   * policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   *
   * Default: none
   *
   * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups)
   */
  public fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

  /**
   * If specified, the container is run as a user with a `uid` other than 0.
   *
   * Otherwise, no such rule is enforced.
   * This parameter maps to `RunAsUser` and `MustRunAsNonRoot` policy in the Users and groups pod
   * security policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   *
   * Default: - the container is *not* required to run as a non-root user
   *
   * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups)
   */
  public fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

  /**
   * If specified, this container is run as the specified user ID (`uid`).
   *
   * This parameter maps to `RunAsUser` and `MustRunAs` policy in the Users and groups pod security
   * policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   *
   * Default: - the user that is specified in the image metadata.
   *
   * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups)
   */
  public fun runAsUser(): Number? = unwrap(this).getRunAsUser()

  /**
   * The Volumes to mount to this container.
   *
   * Automatically added to the Pod.
   *
   * Default: - no volumes
   *
   * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
   */
  public fun volumes(): List<EksVolume> = unwrap(this).getVolumes()?.map(EksVolume::wrap) ?:
      emptyList()

  /**
   * A builder for [EksContainerDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param args An array of arguments to the entrypoint.
     * If this isn't specified, the CMD of the container image is used.
     * This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't
     * exist,
     * the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string
     * isn't expanded.
     * or example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment
     * variable exists.
     */
    public fun args(args: List<String>)

    /**
     * @param args An array of arguments to the entrypoint.
     * If this isn't specified, the CMD of the container image is used.
     * This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't
     * exist,
     * the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string
     * isn't expanded.
     * or example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment
     * variable exists.
     */
    public fun args(vararg args: String)

    /**
     * @param command The entrypoint for the container.
     * This isn't run within a shell.
     * If this isn't specified, the `ENTRYPOINT` of the container image is used.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to `"$(NAME1)"` and the `NAME1` environment variable doesn't
     * exist,
     * the command string will remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting
     * string isn't expanded.
     * For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     * environment variable exists.
     *
     * The entrypoint can't be updated.
     */
    public fun command(command: List<String>)

    /**
     * @param command The entrypoint for the container.
     * This isn't run within a shell.
     * If this isn't specified, the `ENTRYPOINT` of the container image is used.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to `"$(NAME1)"` and the `NAME1` environment variable doesn't
     * exist,
     * the command string will remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting
     * string isn't expanded.
     * For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     * environment variable exists.
     *
     * The entrypoint can't be updated.
     */
    public fun command(vararg command: String)

    /**
     * @param cpuLimit The hard limit of CPUs to present to this container. Must be an even multiple
     * of 0.25.
     * If your container attempts to exceed this limit, it will be terminated.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required.
     * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
     */
    public fun cpuLimit(cpuLimit: Number)

    /**
     * @param cpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25.
     * The container will given at least this many CPUs, but may consume more.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required.
     * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
     */
    public fun cpuReservation(cpuReservation: Number)

    /**
     * @param env The environment variables to pass to this container.
     * *Note*: Environment variables cannot start with "AWS_BATCH".
     * This naming convention is reserved for variables that AWS Batch sets.
     */
    public fun env(env: Map<String, String>)

    /**
     * @param gpuLimit The hard limit of GPUs to present to this container.
     * If your container attempts to exceed this limit, it will be terminated.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     */
    public fun gpuLimit(gpuLimit: Number)

    /**
     * @param gpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25.
     * The container will given at least this many CPUs, but may consume more.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     */
    public fun gpuReservation(gpuReservation: Number)

    /**
     * @param image The image that this container will run. 
     */
    public fun image(image: ContainerImage)

    /**
     * @param imagePullPolicy The image pull policy for this container.
     */
    public fun imagePullPolicy(imagePullPolicy: ImagePullPolicy)

    /**
     * @param memoryLimit The amount (in MiB) of memory to present to the container.
     * If your container attempts to exceed the allocated memory, it will be terminated.
     *
     * Must be larger that 4 MiB
     *
     * At least one of `memoryLimit` and `memoryReservation` is required
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible
     * for the specific instance type that you are using.
     */
    public fun memoryLimit(memoryLimit: Size)

    /**
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container.
     * Your container will be given at least this much memory, but may consume more.
     *
     * Must be larger that 4 MiB
     *
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of `memoryLimit` and `memoryReservation` is required.
     * If both are specified, then `memoryLimit` must be equal to `memoryReservation`
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible
     * for the specific instance type that you are using.
     */
    public fun memoryReservation(memoryReservation: Size)

    /**
     * @param name The name of this container.
     */
    public fun name(name: String)

    /**
     * @param privileged If specified, gives this container elevated permissions on the host
     * container instance.
     * The level of permissions are similar to the root user permissions.
     *
     * This parameter maps to `privileged` policy in the Privileged pod security policies in the
     * Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun privileged(privileged: Boolean)

    /**
     * @param readonlyRootFilesystem If specified, gives this container readonly access to its root
     * file system.
     * This parameter maps to `ReadOnlyRootFilesystem` policy in the Volumes and file systems pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    /**
     * @param runAsGroup If specified, the container is run as the specified group ID (`gid`).
     * If this parameter isn't specified, the default is the group that's specified in the image
     * metadata.
     * This parameter maps to `RunAsGroup` and `MustRunAs` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun runAsGroup(runAsGroup: Number)

    /**
     * @param runAsRoot If specified, the container is run as a user with a `uid` other than 0.
     * Otherwise, no such rule is enforced.
     * This parameter maps to `RunAsUser` and `MustRunAsNonRoot` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun runAsRoot(runAsRoot: Boolean)

    /**
     * @param runAsUser If specified, this container is run as the specified user ID (`uid`).
     * This parameter maps to `RunAsUser` and `MustRunAs` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    public fun runAsUser(runAsUser: Number)

    /**
     * @param volumes The Volumes to mount to this container.
     * Automatically added to the Pod.
     */
    public fun volumes(volumes: List<EksVolume>)

    /**
     * @param volumes The Volumes to mount to this container.
     * Automatically added to the Pod.
     */
    public fun volumes(vararg volumes: EksVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.EksContainerDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EksContainerDefinitionProps.builder()

    /**
     * @param args An array of arguments to the entrypoint.
     * If this isn't specified, the CMD of the container image is used.
     * This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't
     * exist,
     * the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string
     * isn't expanded.
     * or example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment
     * variable exists.
     */
    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

    /**
     * @param args An array of arguments to the entrypoint.
     * If this isn't specified, the CMD of the container image is used.
     * This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't
     * exist,
     * the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string
     * isn't expanded.
     * or example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment
     * variable exists.
     */
    override fun args(vararg args: String): Unit = args(args.toList())

    /**
     * @param command The entrypoint for the container.
     * This isn't run within a shell.
     * If this isn't specified, the `ENTRYPOINT` of the container image is used.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to `"$(NAME1)"` and the `NAME1` environment variable doesn't
     * exist,
     * the command string will remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting
     * string isn't expanded.
     * For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     * environment variable exists.
     *
     * The entrypoint can't be updated.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The entrypoint for the container.
     * This isn't run within a shell.
     * If this isn't specified, the `ENTRYPOINT` of the container image is used.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to `"$(NAME1)"` and the `NAME1` environment variable doesn't
     * exist,
     * the command string will remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting
     * string isn't expanded.
     * For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     * environment variable exists.
     *
     * The entrypoint can't be updated.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param cpuLimit The hard limit of CPUs to present to this container. Must be an even multiple
     * of 0.25.
     * If your container attempts to exceed this limit, it will be terminated.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required.
     * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
     */
    override fun cpuLimit(cpuLimit: Number) {
      cdkBuilder.cpuLimit(cpuLimit)
    }

    /**
     * @param cpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25.
     * The container will given at least this many CPUs, but may consume more.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required.
     * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
     */
    override fun cpuReservation(cpuReservation: Number) {
      cdkBuilder.cpuReservation(cpuReservation)
    }

    /**
     * @param env The environment variables to pass to this container.
     * *Note*: Environment variables cannot start with "AWS_BATCH".
     * This naming convention is reserved for variables that AWS Batch sets.
     */
    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    /**
     * @param gpuLimit The hard limit of GPUs to present to this container.
     * If your container attempts to exceed this limit, it will be terminated.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     */
    override fun gpuLimit(gpuLimit: Number) {
      cdkBuilder.gpuLimit(gpuLimit)
    }

    /**
     * @param gpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25.
     * The container will given at least this many CPUs, but may consume more.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     */
    override fun gpuReservation(gpuReservation: Number) {
      cdkBuilder.gpuReservation(gpuReservation)
    }

    /**
     * @param image The image that this container will run. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage.Companion::unwrap))
    }

    /**
     * @param imagePullPolicy The image pull policy for this container.
     */
    override fun imagePullPolicy(imagePullPolicy: ImagePullPolicy) {
      cdkBuilder.imagePullPolicy(imagePullPolicy.let(ImagePullPolicy.Companion::unwrap))
    }

    /**
     * @param memoryLimit The amount (in MiB) of memory to present to the container.
     * If your container attempts to exceed the allocated memory, it will be terminated.
     *
     * Must be larger that 4 MiB
     *
     * At least one of `memoryLimit` and `memoryReservation` is required
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible
     * for the specific instance type that you are using.
     */
    override fun memoryLimit(memoryLimit: Size) {
      cdkBuilder.memoryLimit(memoryLimit.let(Size.Companion::unwrap))
    }

    /**
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container.
     * Your container will be given at least this much memory, but may consume more.
     *
     * Must be larger that 4 MiB
     *
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of `memoryLimit` and `memoryReservation` is required.
     * If both are specified, then `memoryLimit` must be equal to `memoryReservation`
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible
     * for the specific instance type that you are using.
     */
    override fun memoryReservation(memoryReservation: Size) {
      cdkBuilder.memoryReservation(memoryReservation.let(Size.Companion::unwrap))
    }

    /**
     * @param name The name of this container.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param privileged If specified, gives this container elevated permissions on the host
     * container instance.
     * The level of permissions are similar to the root user permissions.
     *
     * This parameter maps to `privileged` policy in the Privileged pod security policies in the
     * Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    /**
     * @param readonlyRootFilesystem If specified, gives this container readonly access to its root
     * file system.
     * This parameter maps to `ReadOnlyRootFilesystem` policy in the Volumes and file systems pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * @param runAsGroup If specified, the container is run as the specified group ID (`gid`).
     * If this parameter isn't specified, the default is the group that's specified in the image
     * metadata.
     * This parameter maps to `RunAsGroup` and `MustRunAs` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    override fun runAsGroup(runAsGroup: Number) {
      cdkBuilder.runAsGroup(runAsGroup)
    }

    /**
     * @param runAsRoot If specified, the container is run as a user with a `uid` other than 0.
     * Otherwise, no such rule is enforced.
     * This parameter maps to `RunAsUser` and `MustRunAsNonRoot` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    override fun runAsRoot(runAsRoot: Boolean) {
      cdkBuilder.runAsRoot(runAsRoot)
    }

    /**
     * @param runAsUser If specified, this container is run as the specified user ID (`uid`).
     * This parameter maps to `RunAsUser` and `MustRunAs` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     */
    override fun runAsUser(runAsUser: Number) {
      cdkBuilder.runAsUser(runAsUser)
    }

    /**
     * @param volumes The Volumes to mount to this container.
     * Automatically added to the Pod.
     */
    override fun volumes(volumes: List<EksVolume>) {
      cdkBuilder.volumes(volumes.map(EksVolume.Companion::unwrap))
    }

    /**
     * @param volumes The Volumes to mount to this container.
     * Automatically added to the Pod.
     */
    override fun volumes(vararg volumes: EksVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EksContainerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinitionProps,
  ) : CdkObject(cdkObject), EksContainerDefinitionProps {
    /**
     * An array of arguments to the entrypoint.
     *
     * If this isn't specified, the CMD of the container image is used.
     * This corresponds to the args member in the Entrypoint portion of the Pod in Kubernetes.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to "$(NAME1)" and the NAME1 environment variable doesn't
     * exist,
     * the command string will remain "$(NAME1)." $$ is replaced with $, and the resulting string
     * isn't expanded.
     * or example, $$(VAR_NAME) is passed as $(VAR_NAME) whether or not the VAR_NAME environment
     * variable exists.
     *
     * Default: - no args
     *
     * [Documentation](https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/)
     */
    override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * The entrypoint for the container.
     *
     * This isn't run within a shell.
     * If this isn't specified, the `ENTRYPOINT` of the container image is used.
     * Environment variable references are expanded using the container's environment.
     * If the referenced environment variable doesn't exist, the reference in the command isn't
     * changed.
     * For example, if the reference is to `"$(NAME1)"` and the `NAME1` environment variable doesn't
     * exist,
     * the command string will remain `"$(NAME1)."` `$$` is replaced with `$` and the resulting
     * string isn't expanded.
     * For example, `$$(VAR_NAME)` will be passed as `$(VAR_NAME)` whether or not the `VAR_NAME`
     * environment variable exists.
     *
     * The entrypoint can't be updated.
     *
     * Default: - no command
     *
     * [Documentation](https://kubernetes.io/docs/reference/kubernetes-api/workload-resources/pod-v1/#entrypoint)
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The hard limit of CPUs to present to this container. Must be an even multiple of 0.25.
     *
     * If your container attempts to exceed this limit, it will be terminated.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required.
     * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
     *
     * Default: - No CPU limit
     *
     * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     */
    override fun cpuLimit(): Number? = unwrap(this).getCpuLimit()

    /**
     * The soft limit of CPUs to reserve for the container Must be an even multiple of 0.25.
     *
     * The container will given at least this many CPUs, but may consume more.
     *
     * At least one of `cpuReservation` and `cpuLimit` is required.
     * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
     *
     * Default: - No CPUs reserved
     *
     * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     */
    override fun cpuReservation(): Number? = unwrap(this).getCpuReservation()

    /**
     * The environment variables to pass to this container.
     *
     * *Note*: Environment variables cannot start with "AWS_BATCH".
     * This naming convention is reserved for variables that AWS Batch sets.
     *
     * Default: - no environment variables
     */
    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    /**
     * The hard limit of GPUs to present to this container.
     *
     * If your container attempts to exceed this limit, it will be terminated.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     *
     * Default: - No GPU limit
     *
     * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     */
    override fun gpuLimit(): Number? = unwrap(this).getGpuLimit()

    /**
     * The soft limit of CPUs to reserve for the container Must be an even multiple of 0.25.
     *
     * The container will given at least this many CPUs, but may consume more.
     *
     * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
     * `gpuReservation`.
     *
     * Default: - No GPUs reserved
     *
     * [Documentation](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/)
     */
    override fun gpuReservation(): Number? = unwrap(this).getGpuReservation()

    /**
     * The image that this container will run.
     */
    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    /**
     * The image pull policy for this container.
     *
     * Default: - `ALWAYS` if the `:latest` tag is specified, `IF_NOT_PRESENT` otherwise
     *
     * [Documentation](https://kubernetes.io/docs/concepts/containers/images/#updating-images)
     */
    override fun imagePullPolicy(): ImagePullPolicy? =
        unwrap(this).getImagePullPolicy()?.let(ImagePullPolicy::wrap)

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, it will be terminated.
     *
     * Must be larger that 4 MiB
     *
     * At least one of `memoryLimit` and `memoryReservation` is required
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible
     * for the specific instance type that you are using.
     *
     * Default: - No memory limit
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html)
     */
    override fun memoryLimit(): Size? = unwrap(this).getMemoryLimit()?.let(Size::wrap)

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * Your container will be given at least this much memory, but may consume more.
     *
     * Must be larger that 4 MiB
     *
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of `memoryLimit` and `memoryReservation` is required.
     * If both are specified, then `memoryLimit` must be equal to `memoryReservation`
     *
     * *Note*: To maximize your resource utilization, provide your jobs with as much memory as
     * possible
     * for the specific instance type that you are using.
     *
     * Default: - No memory reserved
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/memory-management.html)
     */
    override fun memoryReservation(): Size? = unwrap(this).getMemoryReservation()?.let(Size::wrap)

    /**
     * The name of this container.
     *
     * Default: : `'Default'`
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * If specified, gives this container elevated permissions on the host container instance.
     *
     * The level of permissions are similar to the root user permissions.
     *
     * This parameter maps to `privileged` policy in the Privileged pod security policies in the
     * Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     *
     * Default: false
     *
     * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems)
     */
    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    /**
     * If specified, gives this container readonly access to its root file system.
     *
     * This parameter maps to `ReadOnlyRootFilesystem` policy in the Volumes and file systems pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     *
     * Default: false
     *
     * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#volumes-and-file-systems)
     */
    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    /**
     * If specified, the container is run as the specified group ID (`gid`).
     *
     * If this parameter isn't specified, the default is the group that's specified in the image
     * metadata.
     * This parameter maps to `RunAsGroup` and `MustRunAs` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     *
     * Default: none
     *
     * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups)
     */
    override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

    /**
     * If specified, the container is run as a user with a `uid` other than 0.
     *
     * Otherwise, no such rule is enforced.
     * This parameter maps to `RunAsUser` and `MustRunAsNonRoot` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     *
     * Default: - the container is *not* required to run as a non-root user
     *
     * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups)
     */
    override fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

    /**
     * If specified, this container is run as the specified user ID (`uid`).
     *
     * This parameter maps to `RunAsUser` and `MustRunAs` policy in the Users and groups pod
     * security policies in the Kubernetes documentation.
     *
     * *Note*: this is only compatible with Kubernetes &lt; v1.25
     *
     * Default: - the user that is specified in the image metadata.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/security/pod-security-policy/#users-and-groups)
     */
    override fun runAsUser(): Number? = unwrap(this).getRunAsUser()

    /**
     * The Volumes to mount to this container.
     *
     * Automatically added to the Pod.
     *
     * Default: - no volumes
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
     */
    override fun volumes(): List<EksVolume> = unwrap(this).getVolumes()?.map(EksVolume::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EksContainerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinitionProps):
        EksContainerDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        EksContainerDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksContainerDefinitionProps):
        software.amazon.awscdk.services.batch.EksContainerDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.EksContainerDefinitionProps
  }
}
