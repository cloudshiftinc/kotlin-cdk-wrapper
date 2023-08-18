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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps

/**
 * Properties for defining a `CfnThingPrincipalAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnThingPrincipalAttachmentProps cfnThingPrincipalAttachmentProps =
 * CfnThingPrincipalAttachmentProps.builder()
 * .principal("principal")
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
 */
@CdkDslMarker
public class CfnThingPrincipalAttachmentPropsDsl {
    private val cdkBuilder: CfnThingPrincipalAttachmentProps.Builder =
        CfnThingPrincipalAttachmentProps.builder()

    /**
     * @param principal The principal, which can be a certificate ARN (as returned from the
     *   `CreateCertificate` operation) or an Amazon Cognito ID.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /** @param thingName The name of the AWS IoT thing. */
    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnThingPrincipalAttachmentProps = cdkBuilder.build()
}
