@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceVolumePropertyDsl {
  private val cdkBuilder: CfnInstance.VolumeProperty.Builder = CfnInstance.VolumeProperty.builder()

  public fun device(device: String) {
    cdkBuilder.device(device)
  }

  public fun volumeId(volumeId: String) {
    cdkBuilder.volumeId(volumeId)
  }

  public fun build(): CfnInstance.VolumeProperty = cdkBuilder.build()
}
