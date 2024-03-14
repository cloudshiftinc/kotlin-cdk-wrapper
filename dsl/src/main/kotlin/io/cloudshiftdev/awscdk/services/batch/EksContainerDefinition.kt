package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EksContainerDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject), IEksContainerDefinition {
  /**
   * Mount a Volume to this container.
   *
   * Automatically added to the Pod.
   *
   * @param volume 
   */
  public override fun addVolume(volume: EksVolume) {
    unwrap(this).addVolume(volume.let(EksVolume::unwrap))
  }

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
   */
  public override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

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
   */
  public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The hard limit of CPUs to present to this container. Must be an even multiple of 0.25.
   *
   * If your container attempts to exceed this limit, it will be terminated.
   *
   * At least one of `cpuReservation` and `cpuLimit` is required.
   * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
   */
  public override fun cpuLimit(): Number? = unwrap(this).getCpuLimit()

  /**
   * The soft limit of CPUs to reserve for the container Must be an even multiple of 0.25.
   *
   * The container will given at least this many CPUs, but may consume more.
   *
   * At least one of `cpuReservation` and `cpuLimit` is required.
   * If both are specified, then `cpuLimit` must be at least as large as `cpuReservation`.
   */
  public override fun cpuReservation(): Number? = unwrap(this).getCpuReservation()

  /**
   * The environment variables to pass to this container.
   *
   * *Note*: Environment variables cannot start with "AWS_BATCH".
   * This naming convention is reserved for variables that AWS Batch sets.
   */
  public override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  /**
   * The hard limit of GPUs to present to this container.
   *
   * If your container attempts to exceed this limit, it will be terminated.
   *
   * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
   * `gpuReservation`.
   */
  public override fun gpuLimit(): Number? = unwrap(this).getGpuLimit()

  /**
   * The soft limit of CPUs to reserve for the container Must be an even multiple of 0.25.
   *
   * The container will given at least this many CPUs, but may consume more.
   *
   * If both `gpuReservation` and `gpuLimit` are specified, then `gpuLimit` must be equal to
   * `gpuReservation`.
   */
  public override fun gpuReservation(): Number? = unwrap(this).getGpuReservation()

  /**
   * The image that this container will run.
   */
  public override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

  /**
   * The image pull policy for this container.
   */
  public override fun imagePullPolicy(): ImagePullPolicy? =
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
   */
  public override fun memoryLimit(): Size? = unwrap(this).getMemoryLimit()?.let(Size::wrap)

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
   */
  public override fun memoryReservation(): Size? =
      unwrap(this).getMemoryReservation()?.let(Size::wrap)

  /**
   * The name of this container.
   */
  public override fun name(): String? = unwrap(this).getName()

  /**
   * If specified, gives this container elevated permissions on the host container instance.
   *
   * The level of permissions are similar to the root user permissions.
   *
   * This parameter maps to `privileged` policy in the Privileged pod security policies in the
   * Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   */
  public override fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * If specified, gives this container readonly access to its root file system.
   *
   * This parameter maps to `ReadOnlyRootFilesystem` policy in the Volumes and file systems pod
   * security policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   */
  public override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  /**
   * If specified, the container is run as the specified group ID (`gid`).
   *
   * If this parameter isn't specified, the default is the group that's specified in the image
   * metadata.
   * This parameter maps to `RunAsGroup` and `MustRunAs` policy in the Users and groups pod security
   * policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   */
  public override fun runAsGroup(): Number? = unwrap(this).getRunAsGroup()

  /**
   * If specified, the container is run as a user with a `uid` other than 0.
   *
   * Otherwise, no such rule is enforced.
   * This parameter maps to `RunAsUser` and `MustRunAsNonRoot` policy in the Users and groups pod
   * security policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   */
  public override fun runAsRoot(): Boolean? = unwrap(this).getRunAsRoot()

  /**
   * If specified, this container is run as the specified user ID (`uid`).
   *
   * This parameter maps to `RunAsUser` and `MustRunAs` policy in the Users and groups pod security
   * policies in the Kubernetes documentation.
   *
   * *Note*: this is only compatible with Kubernetes &lt; v1.25
   */
  public override fun runAsUser(): Number? = unwrap(this).getRunAsUser()

  /**
   * The Volumes to mount to this container.
   *
   * Automatically added to the Pod.
   */
  public override fun volumes(): List<EksVolume> = unwrap(this).getVolumes().map(EksVolume::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EksContainerDefinition].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param args An array of arguments to the entrypoint. 
     */
    public fun args(args: List<String>)

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
     * @param args An array of arguments to the entrypoint. 
     */
    public fun args(vararg args: String)

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
     * @param command The entrypoint for the container. 
     */
    public fun command(command: List<String>)

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
     * @param command The entrypoint for the container. 
     */
    public fun command(vararg command: String)

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
     * @param cpuLimit The hard limit of CPUs to present to this container. Must be an even multiple
     * of 0.25. 
     */
    public fun cpuLimit(cpuLimit: Number)

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
     * @param cpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25. 
     */
    public fun cpuReservation(cpuReservation: Number)

    /**
     * The environment variables to pass to this container.
     *
     * *Note*: Environment variables cannot start with "AWS_BATCH".
     * This naming convention is reserved for variables that AWS Batch sets.
     *
     * Default: - no environment variables
     *
     * @param env The environment variables to pass to this container. 
     */
    public fun env(env: Map<String, String>)

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
     * @param gpuLimit The hard limit of GPUs to present to this container. 
     */
    public fun gpuLimit(gpuLimit: Number)

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
     * @param gpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25. 
     */
    public fun gpuReservation(gpuReservation: Number)

    /**
     * The image that this container will run.
     *
     * @param image The image that this container will run. 
     */
    public fun image(image: ContainerImage)

    /**
     * The image pull policy for this container.
     *
     * Default: - `ALWAYS` if the `:latest` tag is specified, `IF_NOT_PRESENT` otherwise
     *
     * [Documentation](https://kubernetes.io/docs/concepts/containers/images/#updating-images)
     * @param imagePullPolicy The image pull policy for this container. 
     */
    public fun imagePullPolicy(imagePullPolicy: ImagePullPolicy)

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
     * @param memoryLimit The amount (in MiB) of memory to present to the container. 
     */
    public fun memoryLimit(memoryLimit: Size)

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
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container. 
     */
    public fun memoryReservation(memoryReservation: Size)

    /**
     * The name of this container.
     *
     * Default: : `'Default'`
     *
     * @param name The name of this container. 
     */
    public fun name(name: String)

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
     * @param privileged If specified, gives this container elevated permissions on the host
     * container instance. 
     */
    public fun privileged(privileged: Boolean)

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
     * @param readonlyRootFilesystem If specified, gives this container readonly access to its root
     * file system. 
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

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
     * @param runAsGroup If specified, the container is run as the specified group ID (`gid`). 
     */
    public fun runAsGroup(runAsGroup: Number)

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
     * @param runAsRoot If specified, the container is run as a user with a `uid` other than 0. 
     */
    public fun runAsRoot(runAsRoot: Boolean)

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
     * @param runAsUser If specified, this container is run as the specified user ID (`uid`). 
     */
    public fun runAsUser(runAsUser: Number)

    /**
     * The Volumes to mount to this container.
     *
     * Automatically added to the Pod.
     *
     * Default: - no volumes
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
     * @param volumes The Volumes to mount to this container. 
     */
    public fun volumes(volumes: List<EksVolume>)

    /**
     * The Volumes to mount to this container.
     *
     * Automatically added to the Pod.
     *
     * Default: - no volumes
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
     * @param volumes The Volumes to mount to this container. 
     */
    public fun volumes(vararg volumes: EksVolume)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksContainerDefinition.Builder =
        software.amazon.awscdk.services.batch.EksContainerDefinition.Builder.create(scope, id)

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
     * @param args An array of arguments to the entrypoint. 
     */
    override fun args(args: List<String>) {
      cdkBuilder.args(args)
    }

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
     * @param args An array of arguments to the entrypoint. 
     */
    override fun args(vararg args: String): Unit = args(args.toList())

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
     * @param command The entrypoint for the container. 
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

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
     * @param command The entrypoint for the container. 
     */
    override fun command(vararg command: String): Unit = command(command.toList())

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
     * @param cpuLimit The hard limit of CPUs to present to this container. Must be an even multiple
     * of 0.25. 
     */
    override fun cpuLimit(cpuLimit: Number) {
      cdkBuilder.cpuLimit(cpuLimit)
    }

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
     * @param cpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25. 
     */
    override fun cpuReservation(cpuReservation: Number) {
      cdkBuilder.cpuReservation(cpuReservation)
    }

    /**
     * The environment variables to pass to this container.
     *
     * *Note*: Environment variables cannot start with "AWS_BATCH".
     * This naming convention is reserved for variables that AWS Batch sets.
     *
     * Default: - no environment variables
     *
     * @param env The environment variables to pass to this container. 
     */
    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

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
     * @param gpuLimit The hard limit of GPUs to present to this container. 
     */
    override fun gpuLimit(gpuLimit: Number) {
      cdkBuilder.gpuLimit(gpuLimit)
    }

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
     * @param gpuReservation The soft limit of CPUs to reserve for the container Must be an even
     * multiple of 0.25. 
     */
    override fun gpuReservation(gpuReservation: Number) {
      cdkBuilder.gpuReservation(gpuReservation)
    }

    /**
     * The image that this container will run.
     *
     * @param image The image that this container will run. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * The image pull policy for this container.
     *
     * Default: - `ALWAYS` if the `:latest` tag is specified, `IF_NOT_PRESENT` otherwise
     *
     * [Documentation](https://kubernetes.io/docs/concepts/containers/images/#updating-images)
     * @param imagePullPolicy The image pull policy for this container. 
     */
    override fun imagePullPolicy(imagePullPolicy: ImagePullPolicy) {
      cdkBuilder.imagePullPolicy(imagePullPolicy.let(ImagePullPolicy::unwrap))
    }

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
     * @param memoryLimit The amount (in MiB) of memory to present to the container. 
     */
    override fun memoryLimit(memoryLimit: Size) {
      cdkBuilder.memoryLimit(memoryLimit.let(Size::unwrap))
    }

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
     * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container. 
     */
    override fun memoryReservation(memoryReservation: Size) {
      cdkBuilder.memoryReservation(memoryReservation.let(Size::unwrap))
    }

    /**
     * The name of this container.
     *
     * Default: : `'Default'`
     *
     * @param name The name of this container. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param privileged If specified, gives this container elevated permissions on the host
     * container instance. 
     */
    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

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
     * @param readonlyRootFilesystem If specified, gives this container readonly access to its root
     * file system. 
     */
    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

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
     * @param runAsGroup If specified, the container is run as the specified group ID (`gid`). 
     */
    override fun runAsGroup(runAsGroup: Number) {
      cdkBuilder.runAsGroup(runAsGroup)
    }

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
     * @param runAsRoot If specified, the container is run as a user with a `uid` other than 0. 
     */
    override fun runAsRoot(runAsRoot: Boolean) {
      cdkBuilder.runAsRoot(runAsRoot)
    }

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
     * @param runAsUser If specified, this container is run as the specified user ID (`uid`). 
     */
    override fun runAsUser(runAsUser: Number) {
      cdkBuilder.runAsUser(runAsUser)
    }

    /**
     * The Volumes to mount to this container.
     *
     * Automatically added to the Pod.
     *
     * Default: - no volumes
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
     * @param volumes The Volumes to mount to this container. 
     */
    override fun volumes(volumes: List<EksVolume>) {
      cdkBuilder.volumes(volumes.map(EksVolume::unwrap))
    }

    /**
     * The Volumes to mount to this container.
     *
     * Automatically added to the Pod.
     *
     * Default: - no volumes
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
     * @param volumes The Volumes to mount to this container. 
     */
    override fun volumes(vararg volumes: EksVolume): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.batch.EksContainerDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EksContainerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EksContainerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksContainerDefinition):
        EksContainerDefinition = EksContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: EksContainerDefinition):
        software.amazon.awscdk.services.batch.EksContainerDefinition = wrapped.cdkObject
  }
}
