@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleNumberFilterPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.NumberFilterProperty.Builder =
      CfnAutomationRule.NumberFilterProperty.builder()

  public fun eq(eq: Number) {
    cdkBuilder.eq(eq)
  }

  public fun gte(gte: Number) {
    cdkBuilder.gte(gte)
  }

  public fun lte(lte: Number) {
    cdkBuilder.lte(lte)
  }

  public fun build(): CfnAutomationRule.NumberFilterProperty = cdkBuilder.build()
}
