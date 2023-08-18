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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment

/**
 * The status of the transit gateway peering attachment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PeeringAttachmentStatusProperty peeringAttachmentStatusProperty =
 * PeeringAttachmentStatusProperty.builder()
 * .code("code")
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaypeeringattachment-peeringattachmentstatus.html)
 */
@CdkDslMarker
public class CfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusPropertyDsl {
    private val cdkBuilder:
        CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.Builder =
        CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.builder()

    /** @param code The status code. */
    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    /** @param message The status message, if applicable. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty =
        cdkBuilder.build()
}
