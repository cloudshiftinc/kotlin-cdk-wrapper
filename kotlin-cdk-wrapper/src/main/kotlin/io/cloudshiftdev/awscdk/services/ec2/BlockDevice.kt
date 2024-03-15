@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BlockDevice {
  public fun deviceName(): String

  public fun mappingEnabled(): Boolean? = unwrap(this).getMappingEnabled()

  public fun volume(): BlockDeviceVolume

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.BlockDevice,
  ) : CdkObject(cdkObject), BlockDevice {
    override fun deviceName(): String = unwrap(this).getDeviceName()

    override fun mappingEnabled(): Boolean? = unwrap(this).getMappingEnabled()

    override fun volume(): BlockDeviceVolume = unwrap(this).getVolume().let(BlockDeviceVolume::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BlockDevice {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BlockDevice): BlockDevice =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BlockDevice): software.amazon.awscdk.services.ec2.BlockDevice =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.BlockDevice
  }
}
