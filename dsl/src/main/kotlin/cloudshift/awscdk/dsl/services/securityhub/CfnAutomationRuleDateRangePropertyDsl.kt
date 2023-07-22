@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * A date range for the date filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * DateRangeProperty dateRangeProperty = DateRangeProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html)
 */
@CdkDslMarker
public class CfnAutomationRuleDateRangePropertyDsl {
  private val cdkBuilder: CfnAutomationRule.DateRangeProperty.Builder =
      CfnAutomationRule.DateRangeProperty.builder()

  /**
   * @param unit A date range unit for the date filter. 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  /**
   * @param value A date range value for the date filter. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAutomationRule.DateRangeProperty = cdkBuilder.build()
}
