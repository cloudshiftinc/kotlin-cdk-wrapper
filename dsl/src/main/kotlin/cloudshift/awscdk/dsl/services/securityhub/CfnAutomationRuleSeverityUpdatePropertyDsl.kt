@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

@CdkDslMarker
public class CfnAutomationRuleSeverityUpdatePropertyDsl {
  private val cdkBuilder: CfnAutomationRule.SeverityUpdateProperty.Builder =
      CfnAutomationRule.SeverityUpdateProperty.builder()

  /**
   * @param label The severity value of the finding. The allowed values are the following.
   * * `INFORMATIONAL` - No issue was found.
   * * `LOW` - The issue does not require action on its own.
   * * `MEDIUM` - The issue must be addressed but not urgently.
   * * `HIGH` - The issue must be addressed as a priority.
   * * `CRITICAL` - The issue must be remediated immediately to avoid it escalating.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param normalized The normalized severity for the finding. This attribute is to be deprecated
   * in favor of `Label` .
   * If you provide `Normalized` and do not provide `Label` , `Label` is set automatically as
   * follows.
   *
   * * 0 - `INFORMATIONAL`
   * * 1–39 - `LOW`
   * * 40–69 - `MEDIUM`
   * * 70–89 - `HIGH`
   * * 90–100 - `CRITICAL`
   */
  public fun normalized(normalized: Number) {
    cdkBuilder.normalized(normalized)
  }

  /**
   * @param product The native severity as defined by the AWS service or integrated partner product
   * that generated the finding.
   */
  public fun product(product: Number) {
    cdkBuilder.product(product)
  }

  public fun build(): CfnAutomationRule.SeverityUpdateProperty = cdkBuilder.build()
}
