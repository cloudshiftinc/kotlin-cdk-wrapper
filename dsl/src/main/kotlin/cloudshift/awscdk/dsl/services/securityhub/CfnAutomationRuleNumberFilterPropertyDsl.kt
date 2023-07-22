@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleNumberFilterPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.NumberFilterProperty.Builder =
      CfnAutomationRule.NumberFilterProperty.builder()

  /**
   * @param eq The equal-to condition to be applied to a single field when querying for findings.
   */
  public fun eq(eq: Number) {
    cdkBuilder.eq(eq)
  }

  /**
   * @param gte The greater-than-equal condition to be applied to a single field when querying for
   * findings.
   */
  public fun gte(gte: Number) {
    cdkBuilder.gte(gte)
  }

  /**
   * @param lte The less-than-equal condition to be applied to a single field when querying for
   * findings.
   */
  public fun lte(lte: Number) {
    cdkBuilder.lte(lte)
  }

  public fun build(): CfnAutomationRule.NumberFilterProperty = cdkBuilder.build()
}
