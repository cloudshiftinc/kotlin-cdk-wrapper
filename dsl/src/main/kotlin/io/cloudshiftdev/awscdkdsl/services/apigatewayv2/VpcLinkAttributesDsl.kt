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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes
import software.amazon.awscdk.services.ec2.IVpc

/**
 * Attributes when importing a new VpcLink.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ec2.*;
 * Vpc vpc;
 * IVpcLink awesomeLink = VpcLink.fromVpcLinkAttributes(this, "awesome-vpc-link",
 * VpcLinkAttributes.builder()
 * .vpcLinkId("us-east-1_oiuR12Abd")
 * .vpc(vpc)
 * .build());
 * ```
 */
@CdkDslMarker
public class VpcLinkAttributesDsl {
    private val cdkBuilder: VpcLinkAttributes.Builder = VpcLinkAttributes.builder()

    /** @param vpc The VPC to which this VPC link is associated with. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcLinkId The VPC Link id. */
    public fun vpcLinkId(vpcLinkId: String) {
        cdkBuilder.vpcLinkId(vpcLinkId)
    }

    public fun build(): VpcLinkAttributes = cdkBuilder.build()
}
