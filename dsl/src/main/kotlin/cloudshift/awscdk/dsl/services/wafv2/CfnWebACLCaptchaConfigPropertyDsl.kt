@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCaptchaConfigPropertyDsl {
  private val cdkBuilder: CfnWebACL.CaptchaConfigProperty.Builder =
      CfnWebACL.CaptchaConfigProperty.builder()

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
  public fun immunityTimeProperty(immunityTimeProperty: CfnWebACL.ImmunityTimePropertyProperty) {
    cdkBuilder.immunityTimeProperty(immunityTimeProperty)
  }

  public fun build(): CfnWebACL.CaptchaConfigProperty = cdkBuilder.build()
}
