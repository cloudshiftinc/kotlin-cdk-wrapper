@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.refactorspaces.CfnService

@CdkDslMarker
public class CfnServiceUrlEndpointInputPropertyDsl {
  private val cdkBuilder: CfnService.UrlEndpointInputProperty.Builder =
      CfnService.UrlEndpointInputProperty.builder()

  /**
   * @param healthUrl The health check URL of the URL endpoint type.
   * If the URL is a public endpoint, the `HealthUrl` must also be a public endpoint. If the URL is
   * a private endpoint inside a virtual private cloud (VPC), the health URL must also be a private
   * endpoint, and the host must be the same as the URL.
   */
  public fun healthUrl(healthUrl: String) {
    cdkBuilder.healthUrl(healthUrl)
  }

  /**
   * @param url The URL to route traffic to. 
   * The URL must be an [rfc3986-formatted
   * URL](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc3986) . If the host is a
   * domain name, the name must be resolvable over the public internet. If the scheme is `https` , the
   * top level domain of the host must be listed in the [IANA root zone
   * database](https://docs.aws.amazon.com/https://www.iana.org/domains/root/db) .
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnService.UrlEndpointInputProperty = cdkBuilder.build()
}
