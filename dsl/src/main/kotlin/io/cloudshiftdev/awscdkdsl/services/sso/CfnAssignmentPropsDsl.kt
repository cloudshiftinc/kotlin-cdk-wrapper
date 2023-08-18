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
import software.amazon.awscdk.services.sso.CfnAssignmentProps

/**
 * Properties for defining a `CfnAssignment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * CfnAssignmentProps cfnAssignmentProps = CfnAssignmentProps.builder()
 * .instanceArn("instanceArn")
 * .permissionSetArn("permissionSetArn")
 * .principalId("principalId")
 * .principalType("principalType")
 * .targetId("targetId")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html)
 */
@CdkDslMarker
public class CfnAssignmentPropsDsl {
    private val cdkBuilder: CfnAssignmentProps.Builder = CfnAssignmentProps.builder()

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     *   be executed. For more information about ARNs, see
     *   [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     *   in the *AWS General Reference* .
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param permissionSetArn The ARN of the permission set. */
    public fun permissionSetArn(permissionSetArn: String) {
        cdkBuilder.permissionSetArn(permissionSetArn)
    }

    /**
     * @param principalId An identifier for an object in IAM Identity Center, such as a user or
     *   group.
     *
     * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
     * information about PrincipalIds in IAM Identity Center, see the
     * [IAM Identity Center Identity Store API Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
     * .
     */
    public fun principalId(principalId: String) {
        cdkBuilder.principalId(principalId)
    }

    /** @param principalType The entity type for which the assignment will be created. */
    public fun principalType(principalType: String) {
        cdkBuilder.principalType(principalType)
    }

    /** @param targetId TargetID is an AWS account identifier, (For example, 123456789012). */
    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    /** @param targetType The entity type for which the assignment will be created. */
    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnAssignmentProps = cdkBuilder.build()
}
