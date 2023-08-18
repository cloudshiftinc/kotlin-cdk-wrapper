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

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy

/**
 * Contains information about an AWS Identity and Access Management user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * IamUserProperty iamUserProperty = IamUserProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamuser.html)
 */
@CdkDslMarker
public class CfnAccessPolicyIamUserPropertyDsl {
    private val cdkBuilder: CfnAccessPolicy.IamUserProperty.Builder =
        CfnAccessPolicy.IamUserProperty.builder()

    /**
     * @param arn The ARN of the IAM user. For more information, see
     *   [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html) in
     *   the *IAM User Guide* .
     *
     * If you delete the IAM user, access policies that contain this identity include an empty `arn`
     * . You can delete the access policy for the IAM user that no longer exists.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnAccessPolicy.IamUserProperty = cdkBuilder.build()
}
