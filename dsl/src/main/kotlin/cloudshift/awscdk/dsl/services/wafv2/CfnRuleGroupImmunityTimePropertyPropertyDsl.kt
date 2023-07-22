@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupImmunityTimePropertyPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.ImmunityTimePropertyProperty.Builder =
      CfnRuleGroup.ImmunityTimePropertyProperty.builder()

  /**
   * @param immunityTime The amount of time, in seconds, that a `CAPTCHA` or challenge timestamp is
   * considered valid by AWS WAF . 
   * The default setting is 300.
   *
   * For the Challenge action, the minimum setting is 300.
   */
  public fun immunityTime(immunityTime: Number) {
    cdkBuilder.immunityTime(immunityTime)
  }

  public fun build(): CfnRuleGroup.ImmunityTimePropertyProperty = cdkBuilder.build()
}
