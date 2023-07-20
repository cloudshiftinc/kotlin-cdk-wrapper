@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions
import software.amazon.awscdk.services.route53.IHostedZone

@CdkDslMarker
public class CustomEndpointOptionsDsl {
  private val cdkBuilder: CustomEndpointOptions.Builder = CustomEndpointOptions.builder()

  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun hostedZone(hostedZone: IHostedZone) {
    cdkBuilder.hostedZone(hostedZone)
  }

  public fun build(): CustomEndpointOptions = cdkBuilder.build()
}
