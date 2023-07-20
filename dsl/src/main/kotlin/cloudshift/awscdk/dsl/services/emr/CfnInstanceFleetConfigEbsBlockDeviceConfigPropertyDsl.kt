@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

@CdkDslMarker
public class CfnInstanceFleetConfigEbsBlockDeviceConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder =
      CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.builder()

  public fun volumeSpecification(volumeSpecification: IResolvable) {
    cdkBuilder.volumeSpecification(volumeSpecification)
  }

  public
      fun volumeSpecification(volumeSpecification: CfnInstanceFleetConfig.VolumeSpecificationProperty) {
    cdkBuilder.volumeSpecification(volumeSpecification)
  }

  public fun volumesPerInstance(volumesPerInstance: Number) {
    cdkBuilder.volumesPerInstance(volumesPerInstance)
  }

  public fun build(): CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
