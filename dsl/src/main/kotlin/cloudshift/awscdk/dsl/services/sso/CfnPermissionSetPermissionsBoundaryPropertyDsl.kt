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

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnPermissionSet

/**
 * Specifies the configuration of the AWS managed or customer managed policy that you want to set as
 * a permissions boundary.
 *
 * Specify either `CustomerManagedPolicyReference` to use the name and path of a customer managed
 * policy, or `ManagedPolicyArn` to use the ARN of an AWS managed policy. A permissions boundary
 * represents the maximum permissions that any policy can grant your role. For more information, see
 * [Permissions boundaries for IAM entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
 * in the *IAM User Guide* .
 *
 * Policies used as permissions boundaries don't provide permissions. You must also attach an IAM
 * policy to the role. To learn how the effective permissions for a role are evaluated, see
 * [IAM JSON policy evaluation logic](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html)
 * in the *IAM User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * PermissionsBoundaryProperty permissionsBoundaryProperty = PermissionsBoundaryProperty.builder()
 * .customerManagedPolicyReference(CustomerManagedPolicyReferenceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .path("path")
 * .build())
 * .managedPolicyArn("managedPolicyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-permissionsboundary.html)
 */
@CdkDslMarker
public class CfnPermissionSetPermissionsBoundaryPropertyDsl {
    private val cdkBuilder: CfnPermissionSet.PermissionsBoundaryProperty.Builder =
        CfnPermissionSet.PermissionsBoundaryProperty.builder()

    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed
     *   policy. You must have an IAM policy that matches the name and path in each AWS account
     *   where you want to deploy your permission set.
     */
    public fun customerManagedPolicyReference(customerManagedPolicyReference: IResolvable) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference)
    }

    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed
     *   policy. You must have an IAM policy that matches the name and path in each AWS account
     *   where you want to deploy your permission set.
     */
    public fun customerManagedPolicyReference(
        customerManagedPolicyReference: CfnPermissionSet.CustomerManagedPolicyReferenceProperty
    ) {
        cdkBuilder.customerManagedPolicyReference(customerManagedPolicyReference)
    }

    /**
     * @param managedPolicyArn The AWS managed policy ARN that you want to attach to a permission
     *   set as a permissions boundary.
     */
    public fun managedPolicyArn(managedPolicyArn: String) {
        cdkBuilder.managedPolicyArn(managedPolicyArn)
    }

    public fun build(): CfnPermissionSet.PermissionsBoundaryProperty = cdkBuilder.build()
}
