@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * The overrides that should be sent to a container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * InstanceType instanceType;
 * ContainerOverrides containerOverrides = ContainerOverrides.builder()
 * .command(List.of("command"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .gpuCount(123)
 * .instanceType(instanceType)
 * .memory(123)
 * .vcpus(123)
 * .build();
 * ```
 */
public interface ContainerOverrides {
  /**
   * The command to send to the container that overrides the default command from the Docker image
   * or the job definition.
   *
   * Default: - No command overrides
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The environment variables to send to the container.
   *
   * You can add new environment variables, which are added to the container
   * at launch, or you can override the existing environment variables from
   * the Docker image or the job definition.
   *
   * Default: - No environment overrides
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The number of physical GPUs to reserve for the container.
   *
   * The number of GPUs reserved for all containers in a job
   * should not exceed the number of available GPUs on the compute
   * resource that the job is launched on.
   *
   * Default: - No GPU reservation
   */
  public fun gpuCount(): Number? = unwrap(this).getGpuCount()

  /**
   * The instance type to use for a multi-node parallel job.
   *
   * This parameter is not valid for single-node container jobs.
   *
   * Default: - No instance type overrides
   */
  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  /**
   * The number of MiB of memory reserved for the job.
   *
   * This value overrides the value set in the job definition.
   *
   * Default: - No memory overrides
   */
  public fun memory(): Number? = unwrap(this).getMemory()

  /**
   * The number of vCPUs to reserve for the container.
   *
   * This value overrides the value set in the job definition.
   *
   * Default: - No vCPUs overrides
   */
  public fun vcpus(): Number? = unwrap(this).getVcpus()

  /**
   * A builder for [ContainerOverrides]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command The command to send to the container that overrides the default command from
     * the Docker image or the job definition.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command to send to the container that overrides the default command from
     * the Docker image or the job definition.
     */
    public fun command(vararg command: String)

    /**
     * @param environment The environment variables to send to the container.
     * You can add new environment variables, which are added to the container
     * at launch, or you can override the existing environment variables from
     * the Docker image or the job definition.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param gpuCount The number of physical GPUs to reserve for the container.
     * The number of GPUs reserved for all containers in a job
     * should not exceed the number of available GPUs on the compute
     * resource that the job is launched on.
     */
    public fun gpuCount(gpuCount: Number)

    /**
     * @param instanceType The instance type to use for a multi-node parallel job.
     * This parameter is not valid for single-node container jobs.
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param memory The number of MiB of memory reserved for the job.
     * This value overrides the value set in the job definition.
     */
    public fun memory(memory: Number)

    /**
     * @param vcpus The number of vCPUs to reserve for the container.
     * This value overrides the value set in the job definition.
     */
    public fun vcpus(vcpus: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides.builder()

    /**
     * @param command The command to send to the container that overrides the default command from
     * the Docker image or the job definition.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command to send to the container that overrides the default command from
     * the Docker image or the job definition.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param environment The environment variables to send to the container.
     * You can add new environment variables, which are added to the container
     * at launch, or you can override the existing environment variables from
     * the Docker image or the job definition.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param gpuCount The number of physical GPUs to reserve for the container.
     * The number of GPUs reserved for all containers in a job
     * should not exceed the number of available GPUs on the compute
     * resource that the job is launched on.
     */
    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    /**
     * @param instanceType The instance type to use for a multi-node parallel job.
     * This parameter is not valid for single-node container jobs.
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
    }

    /**
     * @param memory The number of MiB of memory reserved for the job.
     * This value overrides the value set in the job definition.
     */
    override fun memory(memory: Number) {
      cdkBuilder.memory(memory)
    }

    /**
     * @param vcpus The number of vCPUs to reserve for the container.
     * This value overrides the value set in the job definition.
     */
    override fun vcpus(vcpus: Number) {
      cdkBuilder.vcpus(vcpus)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides,
  ) : CdkObject(cdkObject),
      ContainerOverrides {
    /**
     * The command to send to the container that overrides the default command from the Docker image
     * or the job definition.
     *
     * Default: - No command overrides
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The environment variables to send to the container.
     *
     * You can add new environment variables, which are added to the container
     * at launch, or you can override the existing environment variables from
     * the Docker image or the job definition.
     *
     * Default: - No environment overrides
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The number of physical GPUs to reserve for the container.
     *
     * The number of GPUs reserved for all containers in a job
     * should not exceed the number of available GPUs on the compute
     * resource that the job is launched on.
     *
     * Default: - No GPU reservation
     */
    override fun gpuCount(): Number? = unwrap(this).getGpuCount()

    /**
     * The instance type to use for a multi-node parallel job.
     *
     * This parameter is not valid for single-node container jobs.
     *
     * Default: - No instance type overrides
     */
    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * The number of MiB of memory reserved for the job.
     *
     * This value overrides the value set in the job definition.
     *
     * Default: - No memory overrides
     */
    override fun memory(): Number? = unwrap(this).getMemory()

    /**
     * The number of vCPUs to reserve for the container.
     *
     * This value overrides the value set in the job definition.
     *
     * Default: - No vCPUs overrides
     */
    override fun vcpus(): Number? = unwrap(this).getVcpus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerOverrides {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides):
        ContainerOverrides = CdkObjectWrappers.wrap(cdkObject) as? ContainerOverrides ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerOverrides):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides
  }
}
