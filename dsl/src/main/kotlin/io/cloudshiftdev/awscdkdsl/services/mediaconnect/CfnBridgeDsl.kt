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

package io.cloudshiftdev.awscdkdsl.services.mediaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import software.constructs.Construct

/**
 * The AWS::MediaConnect::Bridge resource defines a connection between your data center’s gateway
 * instances and the cloud.
 *
 * For each bridge, you specify the type of bridge, transport protocol to use, and details for any
 * outputs and failover.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnBridge cfnBridge = CfnBridge.Builder.create(this, "MyCfnBridge")
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
public class CfnBridgeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBridge.Builder = CfnBridge.Builder.create(scope, id)

    private val _outputs: MutableList<Any> = mutableListOf()

    private val _sources: MutableList<Any> = mutableListOf()

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     *
     * @param egressGatewayBridge Create a bridge with the egress bridge type.
     */
    public fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
        cdkBuilder.egressGatewayBridge(egressGatewayBridge)
    }

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     *
     * @param egressGatewayBridge Create a bridge with the egress bridge type.
     */
    public fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty) {
        cdkBuilder.egressGatewayBridge(egressGatewayBridge)
    }

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     *
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type.
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
        cdkBuilder.ingressGatewayBridge(ingressGatewayBridge)
    }

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     *
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type.
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty) {
        cdkBuilder.ingressGatewayBridge(ingressGatewayBridge)
    }

    /**
     * The network output name.
     *
     * This name is used to reference the output and must be unique among outputs in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-name)
     *
     * @param name The network output name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     *
     * @param outputs The outputs that you want to add to this bridge.
     */
    public fun outputs(vararg outputs: Any) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     *
     * @param outputs The outputs that you want to add to this bridge.
     */
    public fun outputs(outputs: Collection<Any>) {
        _outputs.addAll(outputs)
    }

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     *
     * @param outputs The outputs that you want to add to this bridge.
     */
    public fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs)
    }

    /**
     * The bridge placement Amazon Resource Number (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-placementarn)
     *
     * @param placementArn The bridge placement Amazon Resource Number (ARN).
     */
    public fun placementArn(placementArn: String) {
        cdkBuilder.placementArn(placementArn)
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     *
     * @param sourceFailoverConfig The settings for source failover.
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
        cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     *
     * @param sourceFailoverConfig The settings for source failover.
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty) {
        cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
    }

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     *
     * @param sources The sources that you want to add to this bridge.
     */
    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     *
     * @param sources The sources that you want to add to this bridge.
     */
    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     *
     * @param sources The sources that you want to add to this bridge.
     */
    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    public fun build(): CfnBridge {
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
