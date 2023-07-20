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
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import kotlin.String

@CdkDslMarker
public class CfnBridgeSourceBridgeFlowSourcePropertyDsl {
    private val cdkBuilder: CfnBridgeSource.BridgeFlowSourceProperty.Builder =
        CfnBridgeSource.BridgeFlowSourceProperty.builder()

    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: CfnBridgeSource.VpcInterfaceAttachmentProperty) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
    }

    public fun build(): CfnBridgeSource.BridgeFlowSourceProperty = cdkBuilder.build()
}
