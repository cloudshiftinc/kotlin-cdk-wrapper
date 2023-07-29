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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

/**
 * The `User` property type specifies the AWS IoT SiteWise Monitor user for an
 * [AWS::IoTSiteWise::AccessPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * UserProperty userProperty = UserProperty.builder()
 * .id("id")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-user.html)
 */
@CdkDslMarker
public class CfnAccessPolicyUserPropertyDsl {
    private val cdkBuilder: CfnAccessPolicy.UserProperty.Builder =
        CfnAccessPolicy.UserProperty.builder()

    /** @param id The ID of the user. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnAccessPolicy.UserProperty = cdkBuilder.build()
}
