@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Block device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * BlockDeviceVolume blockDeviceVolume;
 * BlockDevice blockDevice = BlockDevice.builder()
 * .deviceName("deviceName")
 * .volume(blockDeviceVolume)
 * // the properties below are optional
 * .mappingEnabled(false)
 * .build();
 * ```
 */
public interface BlockDevice {
  /**
   * The device name exposed to the EC2 instance.
   *
   * For example, a value like `/dev/sdh`, `xvdh`.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html)
   */
  public fun deviceName(): String

  /**
   * If false, the device mapping will be suppressed.
   *
   * If set to false for the root device, the instance might fail the Amazon EC2 health check.
   * Amazon EC2 Auto Scaling launches a replacement instance if the instance fails the health check.
   *
   * Default: true - device mapping is left untouched
   */
  public fun mappingEnabled(): Boolean? = unwrap(this).getMappingEnabled()

  /**
   * Defines the block device volume, to be either an Amazon EBS volume or an ephemeral instance
   * store volume.
   *
   * For example, a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
   */
  public fun volume(): BlockDeviceVolume

  /**
   * A builder for [BlockDevice]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceName The device name exposed to the EC2 instance. 
     * For example, a value like `/dev/sdh`, `xvdh`.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param mappingEnabled If false, the device mapping will be suppressed.
     * If set to false for the root device, the instance might fail the Amazon EC2 health check.
     * Amazon EC2 Auto Scaling launches a replacement instance if the instance fails the health
     * check.
     */
    public fun mappingEnabled(mappingEnabled: Boolean)

    /**
     * @param volume Defines the block device volume, to be either an Amazon EBS volume or an
     * ephemeral instance store volume. 
     * For example, a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
     */
    public fun volume(volume: BlockDeviceVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.BlockDevice.Builder =
        software.amazon.awscdk.services.ec2.BlockDevice.builder()

    /**
     * @param deviceName The device name exposed to the EC2 instance. 
     * For example, a value like `/dev/sdh`, `xvdh`.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param mappingEnabled If false, the device mapping will be suppressed.
     * If set to false for the root device, the instance might fail the Amazon EC2 health check.
     * Amazon EC2 Auto Scaling launches a replacement instance if the instance fails the health
     * check.
     */
    override fun mappingEnabled(mappingEnabled: Boolean) {
      cdkBuilder.mappingEnabled(mappingEnabled)
    }

    /**
     * @param volume Defines the block device volume, to be either an Amazon EBS volume or an
     * ephemeral instance store volume. 
     * For example, a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
     */
    override fun volume(volume: BlockDeviceVolume) {
      cdkBuilder.volume(volume.let(BlockDeviceVolume.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.BlockDevice = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.BlockDevice,
  ) : CdkObject(cdkObject),
      BlockDevice {
    /**
     * The device name exposed to the EC2 instance.
     *
     * For example, a value like `/dev/sdh`, `xvdh`.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html)
     */
    override fun deviceName(): String = unwrap(this).getDeviceName()

    /**
     * If false, the device mapping will be suppressed.
     *
     * If set to false for the root device, the instance might fail the Amazon EC2 health check.
     * Amazon EC2 Auto Scaling launches a replacement instance if the instance fails the health
     * check.
     *
     * Default: true - device mapping is left untouched
     */
    override fun mappingEnabled(): Boolean? = unwrap(this).getMappingEnabled()

    /**
     * Defines the block device volume, to be either an Amazon EBS volume or an ephemeral instance
     * store volume.
     *
     * For example, a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
     */
    override fun volume(): BlockDeviceVolume = unwrap(this).getVolume().let(BlockDeviceVolume::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BlockDevice {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BlockDevice): BlockDevice =
        CdkObjectWrappers.wrap(cdkObject) as? BlockDevice ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BlockDevice): software.amazon.awscdk.services.ec2.BlockDevice =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.BlockDevice
  }
}
