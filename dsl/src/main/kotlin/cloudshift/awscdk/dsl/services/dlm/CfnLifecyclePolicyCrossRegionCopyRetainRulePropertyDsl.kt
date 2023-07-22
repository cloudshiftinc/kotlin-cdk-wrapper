@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder =
      CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder()

  /**
   * @param interval The amount of time to retain a cross-Region snapshot or AMI copy. 
   * The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param intervalUnit The unit of time for time-based retention. 
   * For example, to retain a cross-Region copy for 3 months, specify `Interval=3` and
   * `IntervalUnit=MONTHS` .
   */
  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty = cdkBuilder.build()
}
