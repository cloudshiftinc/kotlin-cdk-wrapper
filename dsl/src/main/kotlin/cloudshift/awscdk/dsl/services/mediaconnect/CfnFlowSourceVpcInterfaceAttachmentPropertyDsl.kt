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
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import kotlin.String

@CdkDslMarker
public class CfnFlowSourceVpcInterfaceAttachmentPropertyDsl {
    private val cdkBuilder: CfnFlowSource.VpcInterfaceAttachmentProperty.Builder =
        CfnFlowSource.VpcInterfaceAttachmentProperty.builder()

    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun build(): CfnFlowSource.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
