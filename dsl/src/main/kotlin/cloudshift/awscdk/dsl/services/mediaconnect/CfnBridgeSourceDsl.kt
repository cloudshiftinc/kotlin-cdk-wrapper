@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.constructs.Construct
import kotlin.String

/**
 * Adds sources to an existing bridge.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnBridgeSource cfnBridgeSource = CfnBridgeSource.Builder.create(this, "MyCfnBridgeSource")
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
public class CfnBridgeSourceDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnBridgeSource.Builder = CfnBridgeSource.Builder.create(scope, id)

    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
     * @param bridgeArn The ARN of the bridge that you want to describe.
     */
    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge.
     */
    public fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource)
    }

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge.
     */
    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource)
    }

    /**
     * The name of the network source.
     *
     * This name is used to reference the source and must be unique among sources in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-name)
     * @param name The name of the network source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge.
     */
    public fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource)
    }

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge.
     */
    public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource)
    }

    public fun build(): CfnBridgeSource = cdkBuilder.build()
}
