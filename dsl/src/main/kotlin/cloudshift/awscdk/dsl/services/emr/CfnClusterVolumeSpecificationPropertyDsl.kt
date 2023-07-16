@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterVolumeSpecificationPropertyDsl {
  private val cdkBuilder: CfnCluster.VolumeSpecificationProperty.Builder =
      CfnCluster.VolumeSpecificationProperty.builder()

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun sizeInGb(sizeInGb: Number) {
    cdkBuilder.sizeInGb(sizeInGb)
  }

  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnCluster.VolumeSpecificationProperty = cdkBuilder.build()
}
