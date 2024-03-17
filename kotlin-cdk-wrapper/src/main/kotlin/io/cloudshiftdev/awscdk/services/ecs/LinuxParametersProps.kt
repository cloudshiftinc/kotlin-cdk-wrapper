@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * The properties for defining Linux-specific options that are applied to the container.
 *
 * Example:
 *
 * ```
 * TaskDefinition taskDefinition;
 * taskDefinition.addContainer("container", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryLimitMiB(1024)
 * .linuxParameters(LinuxParameters.Builder.create(this, "LinuxParameters")
 * .initProcessEnabled(true)
 * .sharedMemorySize(1024)
 * .maxSwap(Size.mebibytes(5000))
 * .swappiness(90)
 * .build())
 * .build());
 * ```
 */
public interface LinuxParametersProps {
  /**
   * Specifies whether to run an init process inside the container that forwards signals and reaps
   * processes.
   *
   * Default: false
   */
  public fun initProcessEnabled(): Boolean? = unwrap(this).getInitProcessEnabled()

  /**
   * The total amount of swap memory a container can use.
   *
   * This parameter
   * will be translated to the --memory-swap option to docker run.
   *
   * This parameter is only supported when you are using the EC2 launch type.
   * Accepted values are positive integers.
   *
   * Default: No swap.
   */
  public fun maxSwap(): Size? = unwrap(this).getMaxSwap()?.let(Size::wrap)

  /**
   * The value for the size of the /dev/shm volume.
   *
   * Default: No shared memory.
   */
  public fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

  /**
   * This allows you to tune a container's memory swappiness behavior.
   *
   * This parameter
   * maps to the --memory-swappiness option to docker run. The swappiness relates
   * to the kernel's tendency to swap memory. A value of 0 will cause swapping to
   * not happen unless absolutely necessary. A value of 100 will cause pages to
   * be swapped very aggressively.
   *
   * This parameter is only supported when you are using the EC2 launch type.
   * Accepted values are whole numbers between 0 and 100. If a value is not
   * specified for maxSwap then this parameter is ignored.
   *
   * Default: 60
   */
  public fun swappiness(): Number? = unwrap(this).getSwappiness()

  /**
   * A builder for [LinuxParametersProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initProcessEnabled Specifies whether to run an init process inside the container that
     * forwards signals and reaps processes.
     */
    public fun initProcessEnabled(initProcessEnabled: Boolean)

    /**
     * @param maxSwap The total amount of swap memory a container can use.
     * This parameter
     * will be translated to the --memory-swap option to docker run.
     *
     * This parameter is only supported when you are using the EC2 launch type.
     * Accepted values are positive integers.
     */
    public fun maxSwap(maxSwap: Size)

    /**
     * @param sharedMemorySize The value for the size of the /dev/shm volume.
     */
    public fun sharedMemorySize(sharedMemorySize: Number)

    /**
     * @param swappiness This allows you to tune a container's memory swappiness behavior.
     * This parameter
     * maps to the --memory-swappiness option to docker run. The swappiness relates
     * to the kernel's tendency to swap memory. A value of 0 will cause swapping to
     * not happen unless absolutely necessary. A value of 100 will cause pages to
     * be swapped very aggressively.
     *
     * This parameter is only supported when you are using the EC2 launch type.
     * Accepted values are whole numbers between 0 and 100. If a value is not
     * specified for maxSwap then this parameter is ignored.
     */
    public fun swappiness(swappiness: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LinuxParametersProps.Builder =
        software.amazon.awscdk.services.ecs.LinuxParametersProps.builder()

    /**
     * @param initProcessEnabled Specifies whether to run an init process inside the container that
     * forwards signals and reaps processes.
     */
    override fun initProcessEnabled(initProcessEnabled: Boolean) {
      cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    /**
     * @param maxSwap The total amount of swap memory a container can use.
     * This parameter
     * will be translated to the --memory-swap option to docker run.
     *
     * This parameter is only supported when you are using the EC2 launch type.
     * Accepted values are positive integers.
     */
    override fun maxSwap(maxSwap: Size) {
      cdkBuilder.maxSwap(maxSwap.let(Size::unwrap))
    }

    /**
     * @param sharedMemorySize The value for the size of the /dev/shm volume.
     */
    override fun sharedMemorySize(sharedMemorySize: Number) {
      cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

    /**
     * @param swappiness This allows you to tune a container's memory swappiness behavior.
     * This parameter
     * maps to the --memory-swappiness option to docker run. The swappiness relates
     * to the kernel's tendency to swap memory. A value of 0 will cause swapping to
     * not happen unless absolutely necessary. A value of 100 will cause pages to
     * be swapped very aggressively.
     *
     * This parameter is only supported when you are using the EC2 launch type.
     * Accepted values are whole numbers between 0 and 100. If a value is not
     * specified for maxSwap then this parameter is ignored.
     */
    override fun swappiness(swappiness: Number) {
      cdkBuilder.swappiness(swappiness)
    }

    public fun build(): software.amazon.awscdk.services.ecs.LinuxParametersProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.LinuxParametersProps,
  ) : CdkObject(cdkObject), LinuxParametersProps {
    /**
     * Specifies whether to run an init process inside the container that forwards signals and reaps
     * processes.
     *
     * Default: false
     */
    override fun initProcessEnabled(): Boolean? = unwrap(this).getInitProcessEnabled()

    /**
     * The total amount of swap memory a container can use.
     *
     * This parameter
     * will be translated to the --memory-swap option to docker run.
     *
     * This parameter is only supported when you are using the EC2 launch type.
     * Accepted values are positive integers.
     *
     * Default: No swap.
     */
    override fun maxSwap(): Size? = unwrap(this).getMaxSwap()?.let(Size::wrap)

    /**
     * The value for the size of the /dev/shm volume.
     *
     * Default: No shared memory.
     */
    override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

    /**
     * This allows you to tune a container's memory swappiness behavior.
     *
     * This parameter
     * maps to the --memory-swappiness option to docker run. The swappiness relates
     * to the kernel's tendency to swap memory. A value of 0 will cause swapping to
     * not happen unless absolutely necessary. A value of 100 will cause pages to
     * be swapped very aggressively.
     *
     * This parameter is only supported when you are using the EC2 launch type.
     * Accepted values are whole numbers between 0 and 100. If a value is not
     * specified for maxSwap then this parameter is ignored.
     *
     * Default: 60
     */
    override fun swappiness(): Number? = unwrap(this).getSwappiness()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LinuxParametersProps):
        LinuxParametersProps = CdkObjectWrappers.wrap(cdkObject) as? LinuxParametersProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinuxParametersProps):
        software.amazon.awscdk.services.ecs.LinuxParametersProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.LinuxParametersProps
  }
}
