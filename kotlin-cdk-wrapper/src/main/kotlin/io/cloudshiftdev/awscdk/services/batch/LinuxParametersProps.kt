@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

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
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * Size size;
 * LinuxParametersProps linuxParametersProps = LinuxParametersProps.builder()
 * .initProcessEnabled(false)
 * .maxSwap(size)
 * .sharedMemorySize(size)
 * .swappiness(123)
 * .build();
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
  public fun sharedMemorySize(): Size? = unwrap(this).getSharedMemorySize()?.let(Size::wrap)

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
    public fun sharedMemorySize(sharedMemorySize: Size)

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.LinuxParametersProps.Builder =
        software.amazon.awscdk.services.batch.LinuxParametersProps.builder()

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
    override fun sharedMemorySize(sharedMemorySize: Size) {
      cdkBuilder.sharedMemorySize(sharedMemorySize.let(Size::unwrap))
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

    public fun build(): software.amazon.awscdk.services.batch.LinuxParametersProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.LinuxParametersProps,
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
    override fun sharedMemorySize(): Size? = unwrap(this).getSharedMemorySize()?.let(Size::wrap)

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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.LinuxParametersProps):
        LinuxParametersProps = CdkObjectWrappers.wrap(cdkObject) as? LinuxParametersProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinuxParametersProps):
        software.amazon.awscdk.services.batch.LinuxParametersProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.LinuxParametersProps
  }
}
