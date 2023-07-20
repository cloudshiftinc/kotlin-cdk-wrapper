@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainDomainEndpointOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.DomainEndpointOptionsProperty.Builder =
      CfnDomain.DomainEndpointOptionsProperty.builder()

  public fun customEndpoint(customEndpoint: String) {
    cdkBuilder.customEndpoint(customEndpoint)
  }

  public fun customEndpointCertificateArn(customEndpointCertificateArn: String) {
    cdkBuilder.customEndpointCertificateArn(customEndpointCertificateArn)
  }

  public fun customEndpointEnabled(customEndpointEnabled: Boolean) {
    cdkBuilder.customEndpointEnabled(customEndpointEnabled)
  }

  public fun customEndpointEnabled(customEndpointEnabled: IResolvable) {
    cdkBuilder.customEndpointEnabled(customEndpointEnabled)
  }

  public fun enforceHttps(enforceHttps: Boolean) {
    cdkBuilder.enforceHttps(enforceHttps)
  }

  public fun enforceHttps(enforceHttps: IResolvable) {
    cdkBuilder.enforceHttps(enforceHttps)
  }

  public fun tlsSecurityPolicy(tlsSecurityPolicy: String) {
    cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
  }

  public fun build(): CfnDomain.DomainEndpointOptionsProperty = cdkBuilder.build()
}
