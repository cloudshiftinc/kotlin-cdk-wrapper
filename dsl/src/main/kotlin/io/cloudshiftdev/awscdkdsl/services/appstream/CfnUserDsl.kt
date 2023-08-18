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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnUser
import software.constructs.Construct

/**
 * The `AWS::AppStream::User` resource creates a new user in the AppStream 2.0 user pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .authenticationType("authenticationType")
 * .userName("userName")
 * // the properties below are optional
 * .firstName("firstName")
 * .lastName("lastName")
 * .messageAction("messageAction")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html)
 */
@CdkDslMarker
public class CfnUserDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

    /**
     * The authentication type for the user.
     *
     * You must specify USERPOOL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-authenticationtype)
     *
     * @param authenticationType The authentication type for the user.
     */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * The first name, or given name, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-firstname)
     *
     * @param firstName The first name, or given name, of the user.
     */
    public fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
    }

    /**
     * The last name, or surname, of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-lastname)
     *
     * @param lastName The last name, or surname, of the user.
     */
    public fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
    }

    /**
     * The action to take for the welcome email that is sent to a user after the user is created in
     * the user pool.
     *
     * If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first
     * name or last name of the user. If the value is null, the email is sent.
     *
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set
     * their passwords within 7 days, you must send them a new welcome email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-messageaction)
     *
     * @param messageAction The action to take for the welcome email that is sent to a user after
     *   the user is created in the user pool.
     */
    public fun messageAction(messageAction: String) {
        cdkBuilder.messageAction(messageAction)
    }

    /**
     * The email address of the user.
     *
     * Users' email addresses are case-sensitive. During login, if they specify an email address
     * that doesn't use the same capitalization as the email address specified when their user pool
     * account was created, a "user does not exist" error message displays.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-user.html#cfn-appstream-user-username)
     *
     * @param userName The email address of the user.
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnUser = cdkBuilder.build()
}
