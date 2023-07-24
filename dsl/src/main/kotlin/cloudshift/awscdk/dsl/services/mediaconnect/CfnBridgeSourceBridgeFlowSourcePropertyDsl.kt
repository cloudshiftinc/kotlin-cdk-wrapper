@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import kotlin.String

/**
 * The source of the bridge.
 *
 * A flow source originates in MediaConnect as an existing cloud flow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeFlowSourceProperty bridgeFlowSourceProperty = BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html)
 */
@CdkDslMarker
public class CfnBridgeSourceBridgeFlowSourcePropertyDsl {
    private val cdkBuilder: CfnBridgeSource.BridgeFlowSourceProperty.Builder =
        CfnBridgeSource.BridgeFlowSourceProperty.builder()

    /**
     * @param flowArn The ARN of the cloud flow used as a source of this bridge.
     */
    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * source.
     */
    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    /**
     * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
     * source.
     */
    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: CfnBridgeSource.VpcInterfaceAttachmentProperty) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    public fun build(): CfnBridgeSource.BridgeFlowSourceProperty = cdkBuilder.build()
}
