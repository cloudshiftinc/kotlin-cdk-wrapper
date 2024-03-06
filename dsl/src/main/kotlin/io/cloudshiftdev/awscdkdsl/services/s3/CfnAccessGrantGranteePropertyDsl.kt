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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnAccessGrant

/**
 * The user, group, or role to which you are granting access.
 *
 * You can grant access to an IAM user or role. If you have added your corporate directory to AWS
 * IAM Identity Center and associated your Identity Center instance with your S3 Access Grants
 * instance, the grantee can also be a corporate directory user or group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * GranteeProperty granteeProperty = GranteeProperty.builder()
 * .granteeIdentifier("granteeIdentifier")
 * .granteeType("granteeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accessgrant-grantee.html)
 */
@CdkDslMarker
public class CfnAccessGrantGranteePropertyDsl {
    private val cdkBuilder: CfnAccessGrant.GranteeProperty.Builder =
        CfnAccessGrant.GranteeProperty.builder()

    /**
     * @param granteeIdentifier The unique identifier of the `Grantee` . If the grantee type is
     *   `IAM` , the identifier is the IAM Amazon Resource Name (ARN) of the user or role. If the
     *   grantee type is a directory user or group, the identifier is 128-bit universally unique
     *   identifier (UUID) in the format `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` . You can obtain
     *   this UUID from your AWS IAM Identity Center instance.
     */
    public fun granteeIdentifier(granteeIdentifier: String) {
        cdkBuilder.granteeIdentifier(granteeIdentifier)
    }

    /**
     * @param granteeType The type of the grantee to which access has been granted. It can be one of
     *   the following values:.
     * * `IAM` - An IAM user or role.
     * * `DIRECTORY_USER` - Your corporate directory user. You can use this option if you have added
     *   your corporate identity directory to IAM Identity Center and associated the IAM Identity
     *   Center instance with your S3 Access Grants instance.
     * * `DIRECTORY_GROUP` - Your corporate directory group. You can use this option if you have
     *   added your corporate identity directory to IAM Identity Center and associated the IAM
     *   Identity Center instance with your S3 Access Grants instance.
     */
    public fun granteeType(granteeType: String) {
        cdkBuilder.granteeType(granteeType)
    }

    public fun build(): CfnAccessGrant.GranteeProperty = cdkBuilder.build()
}
