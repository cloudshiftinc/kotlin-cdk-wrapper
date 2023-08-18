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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

/**
 * Describes the VPC options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * VpcOptionsProperty vpcOptionsProperty = VpcOptionsProperty.builder()
 * .applianceModeSupport(false)
 * .ipv6Support(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html)
 */
@CdkDslMarker
public class CfnVpcAttachmentVpcOptionsPropertyDsl {
    private val cdkBuilder: CfnVpcAttachment.VpcOptionsProperty.Builder =
        CfnVpcAttachment.VpcOptionsProperty.builder()

    /**
     * @param applianceModeSupport Indicates whether appliance mode is supported. If enabled,
     *   traffic flow between a source and destination use the same Availability Zone for the VPC
     *   attachment for the lifetime of that flow. The default value is `false` .
     */
    public fun applianceModeSupport(applianceModeSupport: Boolean) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
    }

    /**
     * @param applianceModeSupport Indicates whether appliance mode is supported. If enabled,
     *   traffic flow between a source and destination use the same Availability Zone for the VPC
     *   attachment for the lifetime of that flow. The default value is `false` .
     */
    public fun applianceModeSupport(applianceModeSupport: IResolvable) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
    }

    /** @param ipv6Support Indicates whether IPv6 is supported. */
    public fun ipv6Support(ipv6Support: Boolean) {
        cdkBuilder.ipv6Support(ipv6Support)
    }

    /** @param ipv6Support Indicates whether IPv6 is supported. */
    public fun ipv6Support(ipv6Support: IResolvable) {
        cdkBuilder.ipv6Support(ipv6Support)
    }

    public fun build(): CfnVpcAttachment.VpcOptionsProperty = cdkBuilder.build()
}
