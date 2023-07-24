@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource
import kotlin.String

/**
 * The settings for attaching a VPC interface to an resource.
 *
 * Example:
 *
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-vpcinterfaceattachment.html)
 */
@CdkDslMarker
public class CfnFlowSourceVpcInterfaceAttachmentPropertyDsl {
    private val cdkBuilder: CfnFlowSource.VpcInterfaceAttachmentProperty.Builder =
        CfnFlowSource.VpcInterfaceAttachmentProperty.builder()

    /**
     * @param vpcInterfaceName The name of the VPC interface to use for this resource.
     */
    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun build(): CfnFlowSource.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
