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
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps

/**
 * Properties for defining a `CfnUserPoolUserToGroupAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolUserToGroupAttachmentProps cfnUserPoolUserToGroupAttachmentProps =
 * CfnUserPoolUserToGroupAttachmentProps.builder()
 * .groupName("groupName")
 * .username("username")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
 */
@CdkDslMarker
public class CfnUserPoolUserToGroupAttachmentPropsDsl {
    private val cdkBuilder: CfnUserPoolUserToGroupAttachmentProps.Builder =
        CfnUserPoolUserToGroupAttachmentProps.builder()

    /** @param groupName The group name. */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /** @param userPoolId The user pool ID for the user pool. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    /** @param username The username for the user. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnUserPoolUserToGroupAttachmentProps = cdkBuilder.build()
}
