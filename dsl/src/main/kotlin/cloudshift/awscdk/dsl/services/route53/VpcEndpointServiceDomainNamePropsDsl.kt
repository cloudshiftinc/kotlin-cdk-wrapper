@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpcEndpointService
import software.amazon.awscdk.services.route53.IPublicHostedZone
import software.amazon.awscdk.services.route53.VpcEndpointServiceDomainNameProps

@CdkDslMarker
public class VpcEndpointServiceDomainNamePropsDsl {
  private val cdkBuilder: VpcEndpointServiceDomainNameProps.Builder =
      VpcEndpointServiceDomainNameProps.builder()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun endpointService(endpointService: IVpcEndpointService) {
    cdkBuilder.endpointService(endpointService)
  }

  public fun publicHostedZone(publicHostedZone: IPublicHostedZone) {
    cdkBuilder.publicHostedZone(publicHostedZone)
  }

  public fun build(): VpcEndpointServiceDomainNameProps = cdkBuilder.build()
}
