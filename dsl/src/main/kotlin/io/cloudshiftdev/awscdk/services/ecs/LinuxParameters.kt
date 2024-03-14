package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LinuxParameters internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.LinuxParameters,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * Adds one or more Linux capabilities to the Docker configuration of a container.
   *
   * Tasks launched on Fargate only support adding the 'SYS_PTRACE' kernel capability.
   *
   * @param cap 
   */
  public open fun addCapabilities(cap: Capability) {
    unwrap(this).addCapabilities(cap.let(Capability::unwrap))
  }

  /**
   * Adds one or more host devices to a container.
   *
   * @param device 
   */
  public open fun addDevices(device: Device) {
    unwrap(this).addDevices(device.let(Device::unwrap))
  }

  /**
   * Adds one or more host devices to a container.
   *
   * @param device 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fc8e2d06b9d92115b6c91be281e324ebd7819ca851eee433258720fe52bc451")
  public open fun addDevices(device: Device.Builder.() -> Unit): Unit = addDevices(Device(device))

  /**
   * Specifies the container path, mount options, and size (in MiB) of the tmpfs mount for a
   * container.
   *
   * Only works with EC2 launch type.
   *
   * @param tmpfs 
   */
  public open fun addTmpfs(tmpfs: Tmpfs) {
    unwrap(this).addTmpfs(tmpfs.let(Tmpfs::unwrap))
  }

  /**
   * Specifies the container path, mount options, and size (in MiB) of the tmpfs mount for a
   * container.
   *
   * Only works with EC2 launch type.
   *
   * @param tmpfs 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("260c3cf0b40a20e4f5c071e7106c40f122189e72b0f207f32ba4797656d9aefa")
  public open fun addTmpfs(tmpfs: Tmpfs.Builder.() -> Unit): Unit = addTmpfs(Tmpfs(tmpfs))

  /**
   * Removes one or more Linux capabilities to the Docker configuration of a container.
   *
   * @param cap 
   */
  public open fun dropCapabilities(cap: Capability) {
    unwrap(this).dropCapabilities(cap.let(Capability::unwrap))
  }

  /**
   * Renders the Linux parameters to a CloudFormation object.
   */
  public open fun renderLinuxParameters(): CfnTaskDefinition.LinuxParametersProperty =
      unwrap(this).renderLinuxParameters().let(CfnTaskDefinition.LinuxParametersProperty::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.LinuxParameters].
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
    public fun sharedMemorySize(sharedMemorySize: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LinuxParameters.Builder =
        software.amazon.awscdk.services.ecs.LinuxParameters.Builder.create(scope, id)

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
    override fun sharedMemorySize(sharedMemorySize: Number) {
      cdkBuilder.sharedMemorySize(sharedMemorySize)
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

    public fun build(): software.amazon.awscdk.services.ecs.LinuxParameters = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LinuxParameters {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LinuxParameters(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LinuxParameters):
        LinuxParameters = LinuxParameters(cdkObject)

    internal fun unwrap(wrapped: LinuxParameters):
        software.amazon.awscdk.services.ecs.LinuxParameters = wrapped.cdkObject
  }
}
