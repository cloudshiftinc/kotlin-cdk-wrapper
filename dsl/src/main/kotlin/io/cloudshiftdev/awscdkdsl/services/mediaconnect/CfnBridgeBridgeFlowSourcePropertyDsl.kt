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
import software.amazon.awscdk.services.mediaconnect.CfnBridge

/**
 * The source of the bridge.
 *
 * A flow source originates in MediaConnect as an existing cloud flow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeFlowSourceProperty bridgeFlowSourceProperty = BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * .name("name")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html)
 */
@CdkDslMarker
public class CfnBridgeBridgeFlowSourcePropertyDsl {
    private val cdkBuilder: CfnBridge.BridgeFlowSourceProperty.Builder =
        CfnBridge.BridgeFlowSourceProperty.builder()

    /** @param flowArn The ARN of the cloud flow used as a source of this bridge. */
    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
     *   source.
     */
    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    /**
     * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
     *   source.
     */
    public fun flowVpcInterfaceAttachment(
        flowVpcInterfaceAttachment: CfnBridge.VpcInterfaceAttachmentProperty
    ) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    /** @param name The name of the flow source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnBridge.BridgeFlowSourceProperty = cdkBuilder.build()
}
