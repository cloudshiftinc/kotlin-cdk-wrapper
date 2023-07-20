@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleDateRangePropertyDsl {
  private val cdkBuilder: CfnAutomationRule.DateRangeProperty.Builder =
      CfnAutomationRule.DateRangeProperty.builder()

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAutomationRule.DateRangeProperty = cdkBuilder.build()
}
