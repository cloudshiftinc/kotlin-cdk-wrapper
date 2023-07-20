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
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowVpcInterfaceAttachmentPropertyDsl {
    private val cdkBuilder: CfnFlow.VpcInterfaceAttachmentProperty.Builder =
        CfnFlow.VpcInterfaceAttachmentProperty.builder()

    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun build(): CfnFlow.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
