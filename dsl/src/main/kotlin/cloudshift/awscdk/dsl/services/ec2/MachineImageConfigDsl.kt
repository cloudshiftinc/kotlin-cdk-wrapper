@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.MachineImageConfig
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.UserData

/**
 * Configuration for a machine image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * UserData userData;
 * MachineImageConfig machineImageConfig = MachineImageConfig.builder()
 * .imageId("imageId")
 * .osType(OperatingSystemType.LINUX)
 * .userData(userData)
 * .build();
 * ```
 */
@CdkDslMarker
public class MachineImageConfigDsl {
  private val cdkBuilder: MachineImageConfig.Builder = MachineImageConfig.builder()

  /**
   * @param imageId The AMI ID of the image to use. 
   */
  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  /**
   * @param osType Operating system type for this image. 
   */
  public fun osType(osType: OperatingSystemType) {
    cdkBuilder.osType(osType)
  }

  /**
   * @param userData Initial UserData for this image. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): MachineImageConfig = cdkBuilder.build()
}
