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
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.constructs.Construct

/**
 * The `AWS::Cognito::UserPoolUICustomizationAttachment` resource sets the UI customization
 * information for a user pool's built-in app UI.
 *
 * You can specify app UI customization settings for a single client (with a specific `clientId` )
 * or for all clients (by setting the `clientId` to `ALL` ). If you specify `ALL` , the default
 * configuration is used for every client that has had no UI customization set previously. If you
 * specify UI customization settings for a particular client, it no longer falls back to the `ALL`
 * configuration.
 *
 * Before you create this resource, your user pool must have a domain associated with it. You can
 * create an `AWS::Cognito::UserPoolDomain` resource first in this user pool.
 *
 * Setting a logo image isn't supported from AWS CloudFormation . Use the Amazon Cognito
 * [SetUICustomization](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUICustomization.html#API_SetUICustomization_RequestSyntax)
 * API operation to set the image.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolUICustomizationAttachment cfnUserPoolUICustomizationAttachment =
 * CfnUserPoolUICustomizationAttachment.Builder.create(this, "MyCfnUserPoolUICustomizationAttachment")
 * .clientId("clientId")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .css("css")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html)
 */
@CdkDslMarker
public class CfnUserPoolUICustomizationAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolUICustomizationAttachment.Builder =
        CfnUserPoolUICustomizationAttachment.Builder.create(scope, id)

    /**
     * The client ID for the client app.
     *
     * You can specify the UI customization settings for a single client (with a specific clientId)
     * or for all clients (by setting the clientId to `ALL` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-clientid)
     *
     * @param clientId The client ID for the client app.
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * The CSS values in the UI customization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-css)
     *
     * @param css The CSS values in the UI customization.
     */
    public fun css(css: String) {
        cdkBuilder.css(css)
    }

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html#cfn-cognito-userpooluicustomizationattachment-userpoolid)
     *
     * @param userPoolId The user pool ID for the user pool.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolUICustomizationAttachment = cdkBuilder.build()
}
