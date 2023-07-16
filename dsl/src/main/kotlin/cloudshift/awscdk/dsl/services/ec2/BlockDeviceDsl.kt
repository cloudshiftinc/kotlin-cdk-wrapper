@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.BlockDeviceVolume

@CdkDslMarker
public class BlockDeviceDsl {
  private val cdkBuilder: BlockDevice.Builder = BlockDevice.builder()

  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  public fun mappingEnabled(mappingEnabled: Boolean) {
    cdkBuilder.mappingEnabled(mappingEnabled)
  }

  public fun volume(volume: BlockDeviceVolume) {
    cdkBuilder.volume(volume)
  }

  public fun build(): BlockDevice = cdkBuilder.build()
}
