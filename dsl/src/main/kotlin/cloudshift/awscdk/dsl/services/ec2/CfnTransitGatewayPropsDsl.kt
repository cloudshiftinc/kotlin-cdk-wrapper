@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTransitGatewayPropsDsl {
    private val cdkBuilder: CfnTransitGatewayProps.Builder = CfnTransitGatewayProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _transitGatewayCidrBlocks: MutableList<String> = mutableListOf()

    public fun amazonSideAsn(amazonSideAsn: Number) {
        cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    public fun associationDefaultRouteTableId(associationDefaultRouteTableId: String) {
        cdkBuilder.associationDefaultRouteTableId(associationDefaultRouteTableId)
    }

    public fun autoAcceptSharedAttachments(autoAcceptSharedAttachments: String) {
        cdkBuilder.autoAcceptSharedAttachments(autoAcceptSharedAttachments)
    }

    public fun defaultRouteTableAssociation(defaultRouteTableAssociation: String) {
        cdkBuilder.defaultRouteTableAssociation(defaultRouteTableAssociation)
    }

    public fun defaultRouteTablePropagation(defaultRouteTablePropagation: String) {
        cdkBuilder.defaultRouteTablePropagation(defaultRouteTablePropagation)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
    }

    public fun multicastSupport(multicastSupport: String) {
        cdkBuilder.multicastSupport(multicastSupport)
    }

    public fun propagationDefaultRouteTableId(propagationDefaultRouteTableId: String) {
        cdkBuilder.propagationDefaultRouteTableId(propagationDefaultRouteTableId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun transitGatewayCidrBlocks(vararg transitGatewayCidrBlocks: String) {
        _transitGatewayCidrBlocks.addAll(listOf(*transitGatewayCidrBlocks))
    }

    public fun transitGatewayCidrBlocks(transitGatewayCidrBlocks: Collection<String>) {
        _transitGatewayCidrBlocks.addAll(transitGatewayCidrBlocks)
    }

    public fun vpnEcmpSupport(vpnEcmpSupport: String) {
        cdkBuilder.vpnEcmpSupport(vpnEcmpSupport)
    }

    public fun build(): CfnTransitGatewayProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_transitGatewayCidrBlocks.isNotEmpty()) {
            cdkBuilder.transitGatewayCidrBlocks(_transitGatewayCidrBlocks)
        }
        return cdkBuilder.build()
    }
}
