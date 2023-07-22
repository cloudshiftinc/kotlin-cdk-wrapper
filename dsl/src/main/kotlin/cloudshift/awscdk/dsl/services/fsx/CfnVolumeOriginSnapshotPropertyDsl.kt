@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

@CdkDslMarker
public class CfnVolumeOriginSnapshotPropertyDsl {
  private val cdkBuilder: CfnVolume.OriginSnapshotProperty.Builder =
      CfnVolume.OriginSnapshotProperty.builder()

  /**
   * @param copyStrategy The strategy used when copying data from the snapshot to the new volume. 
   * * `CLONE` - The new volume references the data in the origin snapshot. Cloning a snapshot is
   * faster than copying data from the snapshot to a new volume and doesn't consume disk throughput.
   * However, the origin snapshot can't be deleted if there is a volume using its copied data.
   * * `FULL_COPY` - Copies all data from the snapshot to the new volume.
   */
  public fun copyStrategy(copyStrategy: String) {
    cdkBuilder.copyStrategy(copyStrategy)
  }

  /**
   * @param snapshotArn Specifies the snapshot to use when creating an OpenZFS volume from a
   * snapshot. 
   */
  public fun snapshotArn(snapshotArn: String) {
    cdkBuilder.snapshotArn(snapshotArn)
  }

  public fun build(): CfnVolume.OriginSnapshotProperty = cdkBuilder.build()
}
