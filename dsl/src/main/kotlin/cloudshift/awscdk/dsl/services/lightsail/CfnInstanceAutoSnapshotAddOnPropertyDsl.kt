@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnInstance

@CdkDslMarker
public class CfnInstanceAutoSnapshotAddOnPropertyDsl {
  private val cdkBuilder: CfnInstance.AutoSnapshotAddOnProperty.Builder =
      CfnInstance.AutoSnapshotAddOnProperty.builder()

  /**
   * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
   * Constraints:
   *
   * * Must be in `HH:00` format, and in an hourly increment.
   * * Specified in Coordinated Universal Time (UTC).
   * * The snapshot will be automatically created between the time specified and up to 45 minutes
   * after.
   */
  public fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
    cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
  }

  public fun build(): CfnInstance.AutoSnapshotAddOnProperty = cdkBuilder.build()
}
