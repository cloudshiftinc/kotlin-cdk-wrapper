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
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-gatewaybridgesource.html)
 */
@CdkDslMarker
public class CfnFlowSourceGatewayBridgeSourcePropertyDsl {
    private val cdkBuilder: CfnFlowSource.GatewayBridgeSourceProperty.Builder =
        CfnFlowSource.GatewayBridgeSourceProperty.builder()

    /** @param bridgeArn The ARN of the bridge feeding this flow. */
    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    /** @param vpcInterfaceAttachment The settings for attaching a VPC interface to an resource. */
    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    /** @param vpcInterfaceAttachment The settings for attaching a VPC interface to an resource. */
    public fun vpcInterfaceAttachment(
        vpcInterfaceAttachment: CfnFlowSource.VpcInterfaceAttachmentProperty
    ) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    public fun build(): CfnFlowSource.GatewayBridgeSourceProperty = cdkBuilder.build()
}
