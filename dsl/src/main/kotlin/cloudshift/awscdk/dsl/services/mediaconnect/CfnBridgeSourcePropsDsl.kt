@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
import kotlin.String

/**
 * Properties for defining a `CfnBridgeSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnBridgeSourceProps cfnBridgeSourceProps = CfnBridgeSourceProps.builder()
 * .bridgeArn("bridgeArn")
 * .name("name")
 * // the properties below are optional
 * .flowSource(BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .networkSource(BridgeNetworkSourceProperty.builder()
 * .multicastIp("multicastIp")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html)
 */
@CdkDslMarker
public class CfnBridgeSourcePropsDsl {
    private val cdkBuilder: CfnBridgeSourceProps.Builder = CfnBridgeSourceProps.builder()

    /**
     * @param bridgeArn The ARN of the bridge that you want to describe.
     */
    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * @param flowSource Add a flow source to an existing bridge.
     */
    public fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource)
    }

    /**
     * @param flowSource Add a flow source to an existing bridge.
     */
    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource)
    }

    /**
     * @param name The name of the network source.
     * This name is used to reference the source and must be unique among sources in this bridge.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param networkSource Add a network source to an existing bridge.
     */
    public fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource)
    }

    /**
     * @param networkSource Add a network source to an existing bridge.
     */
    public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun build(): CfnBridgeSourceProps = cdkBuilder.build()
}
