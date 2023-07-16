@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.MachineImageConfig
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class MachineImageConfigDsl {
  private val cdkBuilder: MachineImageConfig.Builder = MachineImageConfig.builder()

  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  public fun osType(osType: OperatingSystemType) {
    cdkBuilder.osType(osType)
  }

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): MachineImageConfig = cdkBuilder.build()
}
