@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A container that can be run with EKS orchestration on EC2 resources.
 */
public interface IEksContainerDefinition : IConstruct {
  /**
   * Mount a Volume to this container.
   *
   * Automatically added to the Pod.
   *
   * @param volume 
   */
  public fun addVolume(volume: EksVolume)

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
   * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
   */
  public fun volumes(): List<EksVolume>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IEksContainerDefinition,
  ) : CdkObject(cdkObject), IEksContainerDefinition {
    /**
     * Mount a Volume to this container.
     *
     * Automatically added to the Pod.
     *
     * @param volume 
     */
    override fun addVolume(volume: EksVolume) {
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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

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
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/)
     */
    override fun volumes(): List<EksVolume> = unwrap(this).getVolumes().map(EksVolume::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEksContainerDefinition):
        IEksContainerDefinition = CdkObjectWrappers.wrap(cdkObject) as? IEksContainerDefinition ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEksContainerDefinition):
        software.amazon.awscdk.services.batch.IEksContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEksContainerDefinition
  }
}
