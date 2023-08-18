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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment

/**
 * Describes a core network Connect attachment options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * ConnectAttachmentOptionsProperty connectAttachmentOptionsProperty =
 * ConnectAttachmentOptionsProperty.builder()
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectattachment-connectattachmentoptions.html)
 */
@CdkDslMarker
public class CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl {
    private val cdkBuilder: CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder =
        CfnConnectAttachment.ConnectAttachmentOptionsProperty.builder()

    /** @param protocol The protocol used for the attachment connection. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnConnectAttachment.ConnectAttachmentOptionsProperty = cdkBuilder.build()
}
