@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyDeprecateRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder =
      CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.builder()

  public fun interval(interval: Number) {
    cdkBuilder.interval(interval)
  }

  public fun intervalUnit(intervalUnit: String) {
    cdkBuilder.intervalUnit(intervalUnit)
  }

  public fun build(): CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty = cdkBuilder.build()
}
