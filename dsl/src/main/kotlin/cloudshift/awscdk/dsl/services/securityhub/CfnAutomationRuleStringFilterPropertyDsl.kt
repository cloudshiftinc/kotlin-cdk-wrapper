@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleStringFilterPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.StringFilterProperty.Builder =
      CfnAutomationRule.StringFilterProperty.builder()

  public fun comparison(comparison: String) {
    cdkBuilder.comparison(comparison)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAutomationRule.StringFilterProperty = cdkBuilder.build()
}
