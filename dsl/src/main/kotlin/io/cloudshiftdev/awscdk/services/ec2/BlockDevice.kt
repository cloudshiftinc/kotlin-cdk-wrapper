package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BlockDevice {
  public fun deviceName(): String

  public fun mappingEnabled(): Boolean? = unwrap(this).getMappingEnabled()

  public fun volume(): BlockDeviceVolume

  public interface Builder {
    public fun deviceName(deviceName: String)

    public fun mappingEnabled(mappingEnabled: Boolean)

    public fun volume(volume: BlockDeviceVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.BlockDevice.Builder =
        software.amazon.awscdk.services.ec2.BlockDevice.builder()

    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    override fun mappingEnabled(mappingEnabled: Boolean) {
      cdkBuilder.mappingEnabled(mappingEnabled)
    }

    override fun volume(volume: BlockDeviceVolume) {
      cdkBuilder.volume(volume.let(BlockDeviceVolume::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.BlockDevice = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.BlockDevice,
  ) : BlockDevice {
    override fun deviceName(): String = unwrap(this).getDeviceName()

    override fun mappingEnabled(): Boolean? = unwrap(this).getMappingEnabled()

    override fun volume(): BlockDeviceVolume = unwrap(this).getVolume().let(BlockDeviceVolume::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BlockDevice {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BlockDevice): BlockDevice =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BlockDevice): software.amazon.awscdk.services.ec2.BlockDevice =
        (wrapped as Wrapper).cdkObject
  }
}
