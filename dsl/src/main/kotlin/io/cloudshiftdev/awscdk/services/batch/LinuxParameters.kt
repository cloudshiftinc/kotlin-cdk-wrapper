package io.cloudshiftdev.awscdk.services.batch

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
  private val cdkObject: software.amazon.awscdk.services.batch.LinuxParameters,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addDevices(device: Device) {
    unwrap(this).addDevices(device.let(Device::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fcb0edbe061a3f086a9a3dbb39e38dd967e2a1341158cf18de4d43ef8efeb9e5")
  public open fun addDevices(device: Device.Builder.() -> Unit): Unit = addDevices(Device(device))

  public open fun addTmpfs(tmpfs: Tmpfs) {
    unwrap(this).addTmpfs(tmpfs.let(Tmpfs::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88514009c903418d325e826d86a1052a1cae9121fc188fa828f94d40a842290f")
  public open fun addTmpfs(tmpfs: Tmpfs.Builder.() -> Unit): Unit = addTmpfs(Tmpfs(tmpfs))

  public open fun renderLinuxParameters(): CfnJobDefinition.LinuxParametersProperty =
      unwrap(this).renderLinuxParameters().let(CfnJobDefinition.LinuxParametersProperty::wrap)

  public interface Builder {
    public fun initProcessEnabled(initProcessEnabled: Boolean)

    public fun maxSwap(maxSwap: Size)

    public fun sharedMemorySize(sharedMemorySize: Size)

    public fun swappiness(swappiness: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.LinuxParameters.Builder =
        software.amazon.awscdk.services.batch.LinuxParameters.Builder.create(scope, id)

    override fun initProcessEnabled(initProcessEnabled: Boolean) {
      cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    override fun maxSwap(maxSwap: Size) {
      cdkBuilder.maxSwap(maxSwap.let(Size::unwrap))
    }

    override fun sharedMemorySize(sharedMemorySize: Size) {
      cdkBuilder.sharedMemorySize(sharedMemorySize.let(Size::unwrap))
    }

    override fun swappiness(swappiness: Number) {
      cdkBuilder.swappiness(swappiness)
    }

    public fun build(): software.amazon.awscdk.services.batch.LinuxParameters = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.LinuxParameters):
        LinuxParameters = LinuxParameters(cdkObject)

    internal fun unwrap(wrapped: LinuxParameters):
        software.amazon.awscdk.services.batch.LinuxParameters = wrapped.cdkObject
  }
}
