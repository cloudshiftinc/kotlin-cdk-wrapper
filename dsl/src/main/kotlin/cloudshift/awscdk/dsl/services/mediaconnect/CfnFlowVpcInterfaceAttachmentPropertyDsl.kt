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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlow

/**
 * The settings for attaching a VPC interface to an resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
 * VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterfaceattachment.html)
 */
@CdkDslMarker
public class CfnFlowVpcInterfaceAttachmentPropertyDsl {
    private val cdkBuilder: CfnFlow.VpcInterfaceAttachmentProperty.Builder =
        CfnFlow.VpcInterfaceAttachmentProperty.builder()

    /** @param vpcInterfaceName The name of the VPC interface to use for this resource. */
    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun build(): CfnFlow.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
