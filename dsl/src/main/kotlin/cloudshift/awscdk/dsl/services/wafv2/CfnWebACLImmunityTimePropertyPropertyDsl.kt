@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Used for CAPTCHA and challenge token settings.
 *
 * Determines how long a `CAPTCHA` or challenge timestamp remains valid after AWS WAF updates it for
 * a successful `CAPTCHA` or challenge response.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ImmunityTimePropertyProperty immunityTimePropertyProperty =
 * ImmunityTimePropertyProperty.builder()
 * .immunityTime(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-immunitytimeproperty.html)
 */
@CdkDslMarker
public class CfnWebACLImmunityTimePropertyPropertyDsl {
  private val cdkBuilder: CfnWebACL.ImmunityTimePropertyProperty.Builder =
      CfnWebACL.ImmunityTimePropertyProperty.builder()

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

  public fun build(): CfnWebACL.ImmunityTimePropertyProperty = cdkBuilder.build()
}
