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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import software.amazon.awscdk.services.mediaconnect.CfnBridgeProps

/**
 * Properties for defining a `CfnBridge`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnBridgeProps cfnBridgeProps = CfnBridgeProps.builder()
 * .name("name")
 * .placementArn("placementArn")
 * .sources(List.of(BridgeSourceProperty.builder()
 * .flowSource(BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * .name("name")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .networkSource(BridgeNetworkSourceProperty.builder()
 * .multicastIp("multicastIp")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build()))
 * // the properties below are optional
 * .egressGatewayBridge(EgressGatewayBridgeProperty.builder()
 * .maxBitrate(123)
 * .build())
 * .ingressGatewayBridge(IngressGatewayBridgeProperty.builder()
 * .maxBitrate(123)
 * .maxOutputs(123)
 * .build())
 * .outputs(List.of(BridgeOutputProperty.builder()
 * .networkOutput(BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build())
 * .build()))
 * .sourceFailoverConfig(FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * // the properties below are optional
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html)
 */
@CdkDslMarker
public class CfnBridgePropsDsl {
    private val cdkBuilder: CfnBridgeProps.Builder = CfnBridgeProps.builder()

    private val _outputs: MutableList<Any> = mutableListOf()

    private val _sources: MutableList<Any> = mutableListOf()

    /**
     * @param egressGatewayBridge Create a bridge with the egress bridge type. An egress bridge is a
     *   cloud-to-ground bridge. The content comes from an existing MediaConnect flow and is
     *   delivered to your premises.
     */
    public fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
        cdkBuilder.egressGatewayBridge(egressGatewayBridge)
    }

    /**
     * @param egressGatewayBridge Create a bridge with the egress bridge type. An egress bridge is a
     *   cloud-to-ground bridge. The content comes from an existing MediaConnect flow and is
     *   delivered to your premises.
     */
    public fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty) {
        cdkBuilder.egressGatewayBridge(egressGatewayBridge)
    }

    /**
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. An ingress bridge
     *   is a ground-to-cloud bridge. The content originates at your premises and is delivered to
     *   the cloud.
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
        cdkBuilder.ingressGatewayBridge(ingressGatewayBridge)
    }

    /**
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. An ingress bridge
     *   is a ground-to-cloud bridge. The content originates at your premises and is delivered to
     *   the cloud.
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty) {
        cdkBuilder.ingressGatewayBridge(ingressGatewayBridge)
    }

    /**
     * @param name The network output name. This name is used to reference the output and must be
     *   unique among outputs in this bridge.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param outputs The outputs that you want to add to this bridge. */
    public fun outputs(vararg outputs: Any) {
        _outputs.addAll(listOf(*outputs))
    }

    /** @param outputs The outputs that you want to add to this bridge. */
    public fun outputs(outputs: Collection<Any>) {
        _outputs.addAll(outputs)
    }

    /** @param outputs The outputs that you want to add to this bridge. */
    public fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs)
    }

    /** @param placementArn The bridge placement Amazon Resource Number (ARN). */
    public fun placementArn(placementArn: String) {
        cdkBuilder.placementArn(placementArn)
    }

    /** @param sourceFailoverConfig The settings for source failover. */
    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
        cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
    }

    /** @param sourceFailoverConfig The settings for source failover. */
    public fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty) {
        cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
    }

    /** @param sources The sources that you want to add to this bridge. */
    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    /** @param sources The sources that you want to add to this bridge. */
    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    /** @param sources The sources that you want to add to this bridge. */
    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    public fun build(): CfnBridgeProps {
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
