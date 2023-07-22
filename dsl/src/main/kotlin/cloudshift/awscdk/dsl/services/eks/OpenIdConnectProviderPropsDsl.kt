@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps

@CdkDslMarker
public class OpenIdConnectProviderPropsDsl {
  private val cdkBuilder: OpenIdConnectProviderProps.Builder = OpenIdConnectProviderProps.builder()

  /**
   * @param url The URL of the identity provider. 
   * The URL must begin with https:// and
   * should correspond to the iss claim in the provider's OpenID Connect ID
   * tokens. Per the OIDC standard, path components are allowed but query
   * parameters are not. Typically the URL consists of only a hostname, like
   * https://server.example.org or https://example.com.
   *
   * You can find your OIDC Issuer URL by:
   * aws eks describe-cluster --name %cluster_name% --query "cluster.identity.oidc.issuer" --output
   * text
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): OpenIdConnectProviderProps = cdkBuilder.build()
}
