@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyDeprecateRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.DeprecateRuleProperty.Builder =
      CfnLifecyclePolicy.DeprecateRuleProperty.builder()

  /**
   * @param count the value to be set.
   */
  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  /**
   * @param interval the value to be set.
   */
  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param intervalUnit the value to be set.
   */
  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.DeprecateRuleProperty = cdkBuilder.build()
}
