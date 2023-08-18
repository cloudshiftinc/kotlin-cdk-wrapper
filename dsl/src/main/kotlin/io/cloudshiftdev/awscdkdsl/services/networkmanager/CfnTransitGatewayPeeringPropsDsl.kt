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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps

/**
 * Properties for defining a `CfnTransitGatewayPeering`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnTransitGatewayPeeringProps cfnTransitGatewayPeeringProps =
 * CfnTransitGatewayPeeringProps.builder()
 * .coreNetworkId("coreNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewaypeering.html)
 */
@CdkDslMarker
public class CfnTransitGatewayPeeringPropsDsl {
    private val cdkBuilder: CfnTransitGatewayPeeringProps.Builder =
        CfnTransitGatewayPeeringProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param coreNetworkId The ID of the core network. */
    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /** @param tags The list of key-value tags associated with the peering. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The list of key-value tags associated with the peering. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param transitGatewayArn The ARN of the transit gateway. */
    public fun transitGatewayArn(transitGatewayArn: String) {
        cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): CfnTransitGatewayPeeringProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
