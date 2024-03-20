@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Linux-specific options that are applied to the container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * Size size;
 * LinuxParameters linuxParameters = LinuxParameters.Builder.create(this, "MyLinuxParameters")
 * .initProcessEnabled(false)
 * .maxSwap(size)
 * .sharedMemorySize(size)
 * .swappiness(123)
 * .build();
 * ```
 */
public open class LinuxParameters internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.LinuxParameters,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.batch.LinuxParameters(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LinuxParametersProps,
  ) :
      this(software.amazon.awscdk.services.batch.LinuxParameters(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(LinuxParametersProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LinuxParametersProps.Builder.() -> Unit,
  ) : this(scope, id, LinuxParametersProps(props)
  )

  /**
   * Adds one or more host devices to a container.
   *
   * @param device 
   */
  public open fun addDevices(vararg device: Device) {
    unwrap(this).addDevices(*device.map(Device::unwrap).toTypedArray())
  }

  /**
   * Adds one or more host devices to a container.
   *
   * @param device 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fcb0edbe061a3f086a9a3dbb39e38dd967e2a1341158cf18de4d43ef8efeb9e5")
  public open fun addDevices(device: Device.Builder.() -> Unit): Unit = addDevices(Device(device))

  /**
   * Specifies the container path, mount options, and size (in MiB) of the tmpfs mount for a
   * container.
   *
   * Only works with EC2 launch type.
   *
   * @param tmpfs 
   */
  public open fun addTmpfs(vararg tmpfs: Tmpfs) {
    unwrap(this).addTmpfs(*tmpfs.map(Tmpfs::unwrap).toTypedArray())
  }

  /**
   * Specifies the container path, mount options, and size (in MiB) of the tmpfs mount for a
   * container.
   *
   * Only works with EC2 launch type.
   *
   * @param tmpfs 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88514009c903418d325e826d86a1052a1cae9121fc188fa828f94d40a842290f")
  public open fun addTmpfs(tmpfs: Tmpfs.Builder.() -> Unit): Unit = addTmpfs(Tmpfs(tmpfs))

  /**
   * Renders the Linux parameters to the Batch version of this resource, which does not have
   * 'capabilities' and requires tmpfs.containerPath to be defined.
   */
  public open fun renderLinuxParameters(): CfnJobDefinition.LinuxParametersProperty =
      unwrap(this).renderLinuxParameters().let(CfnJobDefinition.LinuxParametersProperty::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.LinuxParameters].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to run an init process inside the container that forwards signals and reaps
     * processes.
     *
     * Default: false
     *
     * @param initProcessEnabled Specifies whether to run an init process inside the container that
     * forwards signals and reaps processes. 
     */
    public fun initProcessEnabled(initProcessEnabled: Boolean)

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
     *
     * @param maxSwap The total amount of swap memory a container can use. 
     */
    public fun maxSwap(maxSwap: Size)

    /**
     * The value for the size of the /dev/shm volume.
     *
     * Default: No shared memory.
     *
     * @param sharedMemorySize The value for the size of the /dev/shm volume. 
     */
    public fun sharedMemorySize(sharedMemorySize: Size)

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
     *
     * @param swappiness This allows you to tune a container's memory swappiness behavior. 
     */
    public fun swappiness(swappiness: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.LinuxParameters.Builder =
        software.amazon.awscdk.services.batch.LinuxParameters.Builder.create(scope, id)

    /**
     * Specifies whether to run an init process inside the container that forwards signals and reaps
     * processes.
     *
     * Default: false
     *
     * @param initProcessEnabled Specifies whether to run an init process inside the container that
     * forwards signals and reaps processes. 
     */
    override fun initProcessEnabled(initProcessEnabled: Boolean) {
      cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

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
     *
     * @param maxSwap The total amount of swap memory a container can use. 
     */
    override fun maxSwap(maxSwap: Size) {
      cdkBuilder.maxSwap(maxSwap.let(Size::unwrap))
    }

    /**
     * The value for the size of the /dev/shm volume.
     *
     * Default: No shared memory.
     *
     * @param sharedMemorySize The value for the size of the /dev/shm volume. 
     */
    override fun sharedMemorySize(sharedMemorySize: Size) {
      cdkBuilder.sharedMemorySize(sharedMemorySize.let(Size::unwrap))
    }

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
     *
     * @param swappiness This allows you to tune a container's memory swappiness behavior. 
     */
    override fun swappiness(swappiness: Number) {
      cdkBuilder.swappiness(swappiness)
    }

    public fun build(): software.amazon.awscdk.services.batch.LinuxParameters = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LinuxParameters {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LinuxParameters(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.LinuxParameters):
        LinuxParameters = LinuxParameters(cdkObject)

    internal fun unwrap(wrapped: LinuxParameters):
        software.amazon.awscdk.services.batch.LinuxParameters = wrapped.cdkObject
  }
}
