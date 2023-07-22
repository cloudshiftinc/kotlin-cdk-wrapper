@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpcEndpointService
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainName
import software.constructs.Construct

@CdkDslMarker
public class VpcEndpointServiceDomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VpcEndpointServiceDomainName.Builder =
      VpcEndpointServiceDomainName.Builder.create(scope, id)

  /**
   * The domain name to use.
   *
   * This domain name must be owned by this account (registered through Route53),
   * or delegated to this account. Domain ownership will be verified by AWS before
   * private DNS can be used.
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html)
   * @param domainName The domain name to use. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The VPC Endpoint Service to configure Private DNS for.
   *
   * @param endpointService The VPC Endpoint Service to configure Private DNS for. 
   */
  public fun endpointService(endpointService: IVpcEndpointService) {
    cdkBuilder.endpointService(endpointService)
  }

  /**
   * The public hosted zone to use for the domain.
   *
   * @param publicHostedZone The public hosted zone to use for the domain. 
   */
  public fun publicHostedZone(publicHostedZone: IPublicHostedZone) {
    cdkBuilder.publicHostedZone(publicHostedZone)
  }

  public fun build(): VpcEndpointServiceDomainName = cdkBuilder.build()
}
