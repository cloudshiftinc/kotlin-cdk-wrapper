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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.VpnGateway
import software.constructs.Construct

/**
 * The VPN Gateway that shall be added to the VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VpnGateway vpnGateway = VpnGateway.Builder.create(this, "MyVpnGateway")
 * .type("type")
 * // the properties below are optional
 * .amazonSideAsn(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class VpnGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VpnGateway.Builder = VpnGateway.Builder.create(scope, id)

    /**
     * Explicitly specify an Asn or let aws pick an Asn for you.
     *
     * Default: 65000
     *
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you.
     */
    public fun amazonSideAsn(amazonSideAsn: Number) {
        cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * Default type ipsec.1.
     *
     * @param type Default type ipsec.1.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): VpnGateway = cdkBuilder.build()
}
