@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupCaptchaConfigPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.CaptchaConfigProperty.Builder =
      CfnRuleGroup.CaptchaConfigProperty.builder()

  /**
   * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
   * valid after the client successfully solves a `CAPTCHA` puzzle.
   */
  public fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
    cdkBuilder.immunityTimeProperty(immunityTimeProperty)
  }

  /**
   * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
   * valid after the client successfully solves a `CAPTCHA` puzzle.
   */
  public fun immunityTimeProperty(immunityTimeProperty: CfnRuleGroup.ImmunityTimePropertyProperty) {
    cdkBuilder.immunityTimeProperty(immunityTimeProperty)
  }

  public fun build(): CfnRuleGroup.CaptchaConfigProperty = cdkBuilder.build()
}
