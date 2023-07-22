@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder =
      CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.builder()

  /**
   * @param activeDirectory Information about the Active Directory to be used, if applicable.
   * You must provide this information if *Type* is `directory-service-authentication` .
   */
  public fun activeDirectory(activeDirectory: IResolvable) {
    cdkBuilder.activeDirectory(activeDirectory)
  }

  /**
   * @param activeDirectory Information about the Active Directory to be used, if applicable.
   * You must provide this information if *Type* is `directory-service-authentication` .
   */
  public
      fun activeDirectory(activeDirectory: CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty) {
    cdkBuilder.activeDirectory(activeDirectory)
  }

  /**
   * @param federatedAuthentication Information about the IAM SAML identity provider, if applicable.
   */
  public fun federatedAuthentication(federatedAuthentication: IResolvable) {
    cdkBuilder.federatedAuthentication(federatedAuthentication)
  }

  /**
   * @param federatedAuthentication Information about the IAM SAML identity provider, if applicable.
   */
  public
      fun federatedAuthentication(federatedAuthentication: CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty) {
    cdkBuilder.federatedAuthentication(federatedAuthentication)
  }

  /**
   * @param mutualAuthentication Information about the authentication certificates to be used, if
   * applicable.
   * You must provide this information if *Type* is `certificate-authentication` .
   */
  public fun mutualAuthentication(mutualAuthentication: IResolvable) {
    cdkBuilder.mutualAuthentication(mutualAuthentication)
  }

  /**
   * @param mutualAuthentication Information about the authentication certificates to be used, if
   * applicable.
   * You must provide this information if *Type* is `certificate-authentication` .
   */
  public
      fun mutualAuthentication(mutualAuthentication: CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty) {
    cdkBuilder.mutualAuthentication(mutualAuthentication)
  }

  /**
   * @param type The type of client authentication to be used. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnClientVpnEndpoint.ClientAuthenticationRequestProperty = cdkBuilder.build()
}
