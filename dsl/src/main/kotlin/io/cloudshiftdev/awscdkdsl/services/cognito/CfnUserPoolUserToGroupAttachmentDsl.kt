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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.constructs.Construct

/**
 * Adds the specified user to the specified group.
 *
 * Amazon Cognito evaluates AWS Identity and Access Management (IAM) policies in requests for this
 * API operation. For this operation, you must use IAM credentials to authorize requests, and you
 * must grant yourself the corresponding IAM permission in a policy.
 *
 * **Learn
 * more** - [Signing AWS API Requests](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html)
 * * [Using the Amazon Cognito user pools API and user pool
 *   endpoints](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolUserToGroupAttachment cfnUserPoolUserToGroupAttachment =
 * CfnUserPoolUserToGroupAttachment.Builder.create(this, "MyCfnUserPoolUserToGroupAttachment")
 * .groupName("groupName")
 * .username("username")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
 */
@CdkDslMarker
public class CfnUserPoolUserToGroupAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolUserToGroupAttachment.Builder =
        CfnUserPoolUserToGroupAttachment.Builder.create(scope, id)

    /**
     * The group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-groupname)
     *
     * @param groupName The group name.
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-userpoolid)
     *
     * @param userPoolId The user pool ID for the user pool.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    /**
     * The username for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html#cfn-cognito-userpoolusertogroupattachment-username)
     *
     * @param username The username for the user.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnUserPoolUserToGroupAttachment = cdkBuilder.build()
}
