@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
 * `CaptchaConfig` settings.
 *
 * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CaptchaConfigProperty captchaConfigProperty = CaptchaConfigProperty.builder()
 * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
 * .immunityTime(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaconfig.html)
 */
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
