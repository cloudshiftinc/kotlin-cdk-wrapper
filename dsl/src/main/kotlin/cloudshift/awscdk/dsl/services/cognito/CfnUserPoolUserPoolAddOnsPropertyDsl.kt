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
 * The user pool add-ons type.
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

    /** @param advancedSecurityMode The advanced security mode. */
    public fun advancedSecurityMode(advancedSecurityMode: String) {
        cdkBuilder.advancedSecurityMode(advancedSecurityMode)
    }

    public fun build(): CfnUserPool.UserPoolAddOnsProperty = cdkBuilder.build()
}
