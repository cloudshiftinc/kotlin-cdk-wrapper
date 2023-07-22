@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRuleset

@CdkDslMarker
public class CfnRulesetThresholdPropertyDsl {
  private val cdkBuilder: CfnRuleset.ThresholdProperty.Builder =
      CfnRuleset.ThresholdProperty.builder()

  /**
   * @param type The type of a threshold.
   * Used for comparison of an actual count of rows that satisfy the rule to the threshold value.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param unit Unit of threshold value.
   * Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  /**
   * @param value The value of a threshold. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRuleset.ThresholdProperty = cdkBuilder.build()
}
