@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * Specifies how AWS WAF should handle `CAPTCHA` evaluations.
 *
 * This is available at the web ACL level and in each rule.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captchaconfig.html)
 */
@CdkDslMarker
public class CfnRuleGroupCaptchaConfigPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.CaptchaConfigProperty.Builder =
        CfnRuleGroup.CaptchaConfigProperty.builder()

    /**
     * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
     *   valid after the client successfully solves a `CAPTCHA` puzzle.
     */
    public fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty)
    }

    /**
     * @param immunityTimeProperty Determines how long a `CAPTCHA` timestamp in the token remains
     *   valid after the client successfully solves a `CAPTCHA` puzzle.
     */
    public fun immunityTimeProperty(
        immunityTimeProperty: CfnRuleGroup.ImmunityTimePropertyProperty
    ) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty)
    }

    public fun build(): CfnRuleGroup.CaptchaConfigProperty = cdkBuilder.build()
}
