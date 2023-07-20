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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import kotlin.String

@CdkDslMarker
public class CfnBridgeBridgeFlowSourcePropertyDsl {
    private val cdkBuilder: CfnBridge.BridgeFlowSourceProperty.Builder =
        CfnBridge.BridgeFlowSourceProperty.builder()

    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: CfnBridge.VpcInterfaceAttachmentProperty) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnBridge.BridgeFlowSourceProperty = cdkBuilder.build()
}
