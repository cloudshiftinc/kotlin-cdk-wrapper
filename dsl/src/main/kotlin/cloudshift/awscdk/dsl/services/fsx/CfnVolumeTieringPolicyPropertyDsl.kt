@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnVolume

@CdkDslMarker
public class CfnVolumeTieringPolicyPropertyDsl {
  private val cdkBuilder: CfnVolume.TieringPolicyProperty.Builder =
      CfnVolume.TieringPolicyProperty.builder()

  /**
   * @param coolingPeriod Specifies the number of days that user data in a volume must remain
   * inactive before it is considered "cold" and moved to the capacity pool.
   * Used with the `AUTO` and `SNAPSHOT_ONLY` tiering policies. Enter a whole number between 2 and
   * 183. Default values are 31 days for `AUTO` and 2 days for `SNAPSHOT_ONLY` .
   */
  public fun coolingPeriod(coolingPeriod: Number) {
    cdkBuilder.coolingPeriod(coolingPeriod)
  }

  /**
   * @param name Specifies the tiering policy used to transition data. Default value is
   * `SNAPSHOT_ONLY` .
   * * `SNAPSHOT_ONLY` - moves cold snapshots to the capacity pool storage tier.
   * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
   * access patterns.
   * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to the
   * storage pool tier.
   * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved to
   * the capacity pool tier.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnVolume.TieringPolicyProperty = cdkBuilder.build()
}
