@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyRetainRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.RetainRuleProperty.Builder =
      CfnLifecyclePolicy.RetainRuleProperty.builder()

  /**
   * @param count The number of snapshots to retain for each volume, up to a maximum of 1000.
   * For example if you want to retain a maximum of three snapshots, specify `3` . When the fourth
   * snapshot is created, the oldest retained snapshot is deleted, or it is moved to the archive tier
   * if you have specified an `ArchiveRule` .
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  /**
   * @param interval The amount of time to retain each snapshot.
   * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param intervalUnit The unit of time for time-based retention.
   * For example, to retain snapshots for 3 months, specify `Interval=3` and `IntervalUnit=MONTHS` .
   * Once the snapshot has been retained for 3 months, it is deleted, or it is moved to the archive
   * tier if you have specified an `ArchiveRule` .
   */
  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.RetainRuleProperty = cdkBuilder.build()
}
