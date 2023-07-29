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
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies how AWS WAF should handle `Challenge` evaluations.
 *
 * This is available at the web ACL level and in each rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ChallengeConfigProperty challengeConfigProperty = ChallengeConfigProperty.builder()
 * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
 * .immunityTime(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeconfig.html)
 */
@CdkDslMarker
public class CfnWebACLChallengeConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.ChallengeConfigProperty.Builder =
        CfnWebACL.ChallengeConfigProperty.builder()

    /**
     * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
     *   valid after the client successfully responds to a challenge.
     */
    public fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty)
    }

    /**
     * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
     *   valid after the client successfully responds to a challenge.
     */
    public fun immunityTimeProperty(immunityTimeProperty: CfnWebACL.ImmunityTimePropertyProperty) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty)
    }

    public fun build(): CfnWebACL.ChallengeConfigProperty = cdkBuilder.build()
}
