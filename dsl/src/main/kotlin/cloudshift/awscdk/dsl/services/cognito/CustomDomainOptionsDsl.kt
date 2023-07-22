@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.cognito.CustomDomainOptions

@CdkDslMarker
public class CustomDomainOptionsDsl {
  private val cdkBuilder: CustomDomainOptions.Builder = CustomDomainOptions.builder()

  /**
   * @param certificate The certificate to associate with this domain. 
   */
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param domainName The custom domain name that you would like to associate with this User Pool. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CustomDomainOptions = cdkBuilder.build()
}
