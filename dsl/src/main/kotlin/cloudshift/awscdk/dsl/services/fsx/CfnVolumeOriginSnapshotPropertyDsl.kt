@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

@CdkDslMarker
public class CfnVolumeOriginSnapshotPropertyDsl {
  private val cdkBuilder: CfnVolume.OriginSnapshotProperty.Builder =
      CfnVolume.OriginSnapshotProperty.builder()

  public fun copyStrategy(copyStrategy: String) {
    cdkBuilder.copyStrategy(copyStrategy)
  }

  public fun snapshotArn(snapshotArn: String) {
    cdkBuilder.snapshotArn(snapshotArn)
  }

  public fun build(): CfnVolume.OriginSnapshotProperty = cdkBuilder.build()
}
