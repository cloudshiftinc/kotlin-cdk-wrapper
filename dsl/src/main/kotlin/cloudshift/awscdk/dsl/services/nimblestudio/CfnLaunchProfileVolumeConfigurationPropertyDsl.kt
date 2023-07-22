@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

/**
 * Custom volume configuration for the root volumes that are attached to streaming            
 * sessions.</p>          This parameter is only allowed when `sessionPersistenceMode` is              
 *   `ACTIVATED`.</p>.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * VolumeConfigurationProperty volumeConfigurationProperty = VolumeConfigurationProperty.builder()
 * .iops(123)
 * .size(123)
 * .throughput(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html)
 */
@CdkDslMarker
public class CfnLaunchProfileVolumeConfigurationPropertyDsl {
  private val cdkBuilder: CfnLaunchProfile.VolumeConfigurationProperty.Builder =
      CfnLaunchProfile.VolumeConfigurationProperty.builder()

  /**
   * @param iops The number of I/O operations per second for the root volume that is attached to    
   *         streaming session.</p>.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param size The size of the root volume that is attached to the streaming session.
   * The root volume
   * size is measured in GiBs.</p>
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  /**
   * @param throughput The throughput to provision for the root volume that is attached to the
   * streaming             session.
   * The throughput is measured in MiB/s.</p>
   */
  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  public fun build(): CfnLaunchProfile.VolumeConfigurationProperty = cdkBuilder.build()
}
