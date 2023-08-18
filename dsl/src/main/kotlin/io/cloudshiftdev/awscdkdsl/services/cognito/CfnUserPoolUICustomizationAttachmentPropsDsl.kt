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
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps

/**
 * Properties for defining a `CfnUserPoolUICustomizationAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolUICustomizationAttachmentProps cfnUserPoolUICustomizationAttachmentProps =
 * CfnUserPoolUICustomizationAttachmentProps.builder()
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
public class CfnUserPoolUICustomizationAttachmentPropsDsl {
    private val cdkBuilder: CfnUserPoolUICustomizationAttachmentProps.Builder =
        CfnUserPoolUICustomizationAttachmentProps.builder()

    /**
     * @param clientId The client ID for the client app. You can specify the UI customization
     *   settings for a single client (with a specific clientId) or for all clients (by setting the
     *   clientId to `ALL` ).
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /** @param css The CSS values in the UI customization. */
    public fun css(css: String) {
        cdkBuilder.css(css)
    }

    /** @param userPoolId The user pool ID for the user pool. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolUICustomizationAttachmentProps = cdkBuilder.build()
}
