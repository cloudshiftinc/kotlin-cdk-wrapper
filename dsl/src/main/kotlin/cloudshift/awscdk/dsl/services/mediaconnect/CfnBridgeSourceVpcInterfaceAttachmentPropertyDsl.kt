@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import kotlin.String

/**
 * The VPC interface that you want to send your output to.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-vpcinterfaceattachment.html)
 */
@CdkDslMarker
public class CfnBridgeSourceVpcInterfaceAttachmentPropertyDsl {
    private val cdkBuilder: CfnBridgeSource.VpcInterfaceAttachmentProperty.Builder =
        CfnBridgeSource.VpcInterfaceAttachmentProperty.builder()

    /**
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun build(): CfnBridgeSource.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
