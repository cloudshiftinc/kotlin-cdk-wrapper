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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow

/**
 * The source configuration for cloud flows receiving a stream from a bridge.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * GatewayBridgeSourceProperty gatewayBridgeSourceProperty = GatewayBridgeSourceProperty.builder()
 * .bridgeArn("bridgeArn")
 * // the properties below are optional
 * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html)
 */
@CdkDslMarker
public class CfnFlowGatewayBridgeSourcePropertyDsl {
    private val cdkBuilder: CfnFlow.GatewayBridgeSourceProperty.Builder =
        CfnFlow.GatewayBridgeSourceProperty.builder()

    /** @param bridgeArn The ARN of the bridge feeding this flow. */
    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this bridge
     *   source.
     */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    /**
     * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this bridge
     *   source.
     */
    public fun vpcInterfaceAttachment(
        vpcInterfaceAttachment: CfnFlow.VpcInterfaceAttachmentProperty
    ) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    public fun build(): CfnFlow.GatewayBridgeSourceProperty = cdkBuilder.build()
}
