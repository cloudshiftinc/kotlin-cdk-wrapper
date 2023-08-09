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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * User pool add-ons.
 *
 * Contains settings for activation of advanced security features. To log user security information
 * but take no action, set to `AUDIT` . To configure automatic security responses to risky traffic
 * to your user pool, set to `ENFORCED` .
 *
 * For more information, see
 * [Adding advanced security to a user pool](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-advanced-security.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * UserPoolAddOnsProperty userPoolAddOnsProperty = UserPoolAddOnsProperty.builder()
 * .advancedSecurityMode("advancedSecurityMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
 */
@CdkDslMarker
public class CfnUserPoolUserPoolAddOnsPropertyDsl {
    private val cdkBuilder: CfnUserPool.UserPoolAddOnsProperty.Builder =
        CfnUserPool.UserPoolAddOnsProperty.builder()

    /**
     * @param advancedSecurityMode The operating mode of advanced security features in your user
     *   pool.
     */
    public fun advancedSecurityMode(advancedSecurityMode: String) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
    }

    public fun build(): CfnUserPool.UserPoolAddOnsProperty = cdkBuilder.build()
}
