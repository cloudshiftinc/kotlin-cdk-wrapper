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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpcEndpointService
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps

/**
 * Properties to configure a VPC Endpoint Service domain name.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.route53.PublicHostedZone;
 * import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName;
 * PublicHostedZone zone;
 * VpcEndpointService vpces;
 * VpcEndpointServiceDomainName.Builder.create(this, "EndpointDomain")
 * .endpointService(vpces)
 * .domainName("my-stuff.aws-cdk.dev")
 * .publicHostedZone(zone)
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcEndpointServiceDomainNamePropsDsl {
    private val cdkBuilder: VpcEndpointServiceDomainNameProps.Builder =
        VpcEndpointServiceDomainNameProps.builder()

    /**
     * @param domainName The domain name to use. This domain name must be owned by this account
     *   (registered through Route53), or delegated to this account. Domain ownership will be
     *   verified by AWS before private DNS can be used.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param endpointService The VPC Endpoint Service to configure Private DNS for. */
    public fun endpointService(endpointService: IVpcEndpointService) {
        cdkBuilder.endpointService(endpointService)
    }

    /** @param publicHostedZone The public hosted zone to use for the domain. */
    public fun publicHostedZone(publicHostedZone: IPublicHostedZone) {
        cdkBuilder.publicHostedZone(publicHostedZone)
    }

    public fun build(): VpcEndpointServiceDomainNameProps = cdkBuilder.build()
}
