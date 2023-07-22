@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupPortRangePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.PortRangeProperty.Builder =
      CfnRuleGroup.PortRangeProperty.builder()

  /**
   * @param fromPort The lower limit of the port range. 
   * This must be less than or equal to the `ToPort` specification.
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param toPort The upper limit of the port range. 
   * This must be greater than or equal to the `FromPort` specification.
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnRuleGroup.PortRangeProperty = cdkBuilder.build()
}
