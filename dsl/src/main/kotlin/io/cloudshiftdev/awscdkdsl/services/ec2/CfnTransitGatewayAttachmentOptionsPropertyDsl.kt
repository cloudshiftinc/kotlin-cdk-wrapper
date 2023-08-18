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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment

/**
 * Describes the VPC attachment options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * OptionsProperty optionsProperty = OptionsProperty.builder()
 * .applianceModeSupport("applianceModeSupport")
 * .dnsSupport("dnsSupport")
 * .ipv6Support("ipv6Support")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewayattachment-options.html)
 */
@CdkDslMarker
public class CfnTransitGatewayAttachmentOptionsPropertyDsl {
    private val cdkBuilder: CfnTransitGatewayAttachment.OptionsProperty.Builder =
        CfnTransitGatewayAttachment.OptionsProperty.builder()

    /**
     * @param applianceModeSupport Enable or disable appliance mode support. The default is
     *   `disable` .
     */
    public fun applianceModeSupport(applianceModeSupport: String) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
    }

    /** @param dnsSupport Enable or disable DNS support. The default is `disable` . */
    public fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
    }

    /** @param ipv6Support Enable or disable IPv6 support. The default is `disable` . */
    public fun ipv6Support(ipv6Support: String) {
        cdkBuilder.ipv6Support(ipv6Support)
    }

    public fun build(): CfnTransitGatewayAttachment.OptionsProperty = cdkBuilder.build()
}
