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

package io.cloudshiftdev.awscdkdsl.services.sso

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sso.CfnPermissionSet

/**
 * Specifies the name and path of a customer managed policy.
 *
 * You must have an IAM policy that matches the name and path in each AWS account where you want to
 * deploy your permission set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * CustomerManagedPolicyReferenceProperty customerManagedPolicyReferenceProperty =
 * CustomerManagedPolicyReferenceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-permissionset-customermanagedpolicyreference.html)
 */
@CdkDslMarker
public class CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl {
    private val cdkBuilder: CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder =
        CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder()

    /**
     * @param name The name of the IAM policy that you have configured in each account where you
     *   want to deploy your permission set.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param path The path to the IAM policy that you have configured in each account where you
     *   want to deploy your permission set. The default is `/` . For more information, see
     *   [Friendly names and paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     *   in the *IAM User Guide* .
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnPermissionSet.CustomerManagedPolicyReferenceProperty = cdkBuilder.build()
}
