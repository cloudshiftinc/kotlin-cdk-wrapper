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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps

/**
 * Properties for defining a `CfnEnclaveCertificateIamRoleAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnEnclaveCertificateIamRoleAssociationProps cfnEnclaveCertificateIamRoleAssociationProps =
 * CfnEnclaveCertificateIamRoleAssociationProps.builder()
 * .certificateArn("certificateArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html)
 */
@CdkDslMarker
public class CfnEnclaveCertificateIamRoleAssociationPropsDsl {
    private val cdkBuilder: CfnEnclaveCertificateIamRoleAssociationProps.Builder =
        CfnEnclaveCertificateIamRoleAssociationProps.builder()

    /**
     * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param roleArn The ARN of the IAM role to associate with the ACM certificate. You can
     *   associate up to 16 IAM roles with an ACM certificate.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnEnclaveCertificateIamRoleAssociationProps = cdkBuilder.build()
}
