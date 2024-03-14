package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
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
  public open fun addCapabilities(cap: Capability) {
    unwrap(this).addCapabilities(cap.let(Capability::unwrap))
  }

  public open fun addDevices(device: Device) {
    unwrap(this).addDevices(device.let(Device::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fc8e2d06b9d92115b6c91be281e324ebd7819ca851eee433258720fe52bc451")
  public open fun addDevices(device: Device.Builder.() -> Unit): Unit = addDevices(Device(device))

  public open fun addTmpfs(tmpfs: Tmpfs) {
    unwrap(this).addTmpfs(tmpfs.let(Tmpfs::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("260c3cf0b40a20e4f5c071e7106c40f122189e72b0f207f32ba4797656d9aefa")
  public open fun addTmpfs(tmpfs: Tmpfs.Builder.() -> Unit): Unit = addTmpfs(Tmpfs(tmpfs))

  public open fun dropCapabilities(cap: Capability) {
    unwrap(this).dropCapabilities(cap.let(Capability::unwrap))
  }

  public open fun renderLinuxParameters(): CfnTaskDefinition.LinuxParametersProperty =
      unwrap(this).renderLinuxParameters().let(CfnTaskDefinition.LinuxParametersProperty::wrap)

  public interface Builder {
    public fun initProcessEnabled(initProcessEnabled: Boolean)

    public fun maxSwap(maxSwap: Size)

    public fun sharedMemorySize(sharedMemorySize: Number)

    public fun swappiness(swappiness: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LinuxParameters.Builder =
        software.amazon.awscdk.services.ecs.LinuxParameters.Builder.create(scope, id)

    override fun initProcessEnabled(initProcessEnabled: Boolean) {
      cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    override fun maxSwap(maxSwap: Size) {
      cdkBuilder.maxSwap(maxSwap.let(Size::unwrap))
    }

    override fun sharedMemorySize(sharedMemorySize: Number) {
      cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

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
