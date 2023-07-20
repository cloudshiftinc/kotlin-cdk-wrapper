@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDisk

@CdkDslMarker
public class CfnDiskAutoSnapshotAddOnPropertyDsl {
  private val cdkBuilder: CfnDisk.AutoSnapshotAddOnProperty.Builder =
      CfnDisk.AutoSnapshotAddOnProperty.builder()

  public fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
    cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
  }

  public fun build(): CfnDisk.AutoSnapshotAddOnProperty = cdkBuilder.build()
}
