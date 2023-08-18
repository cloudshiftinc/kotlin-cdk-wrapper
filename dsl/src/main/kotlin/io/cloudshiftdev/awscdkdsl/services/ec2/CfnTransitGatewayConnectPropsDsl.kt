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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps

/**
 * Properties for defining a `CfnTransitGatewayConnect`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayConnectProps cfnTransitGatewayConnectProps =
 * CfnTransitGatewayConnectProps.builder()
 * .options(TransitGatewayConnectOptionsProperty.builder()
 * .protocol("protocol")
 * .build())
 * .transportTransitGatewayAttachmentId("transportTransitGatewayAttachmentId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayconnect.html)
 */
@CdkDslMarker
public class CfnTransitGatewayConnectPropsDsl {
    private val cdkBuilder: CfnTransitGatewayConnectProps.Builder =
        CfnTransitGatewayConnectProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param options The Connect attachment options.
     * * protocol (gre)
     */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    /**
     * @param options The Connect attachment options.
     * * protocol (gre)
     */
    public fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty) {
        cdkBuilder.options(options)
    }

    /** @param tags The tags for the attachment. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the attachment. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param transportTransitGatewayAttachmentId The ID of the attachment from which the Connect
     *   attachment was created.
     */
    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
        cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    public fun build(): CfnTransitGatewayConnectProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
