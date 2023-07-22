@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.DomainOptions
import software.amazon.awscdk.services.certificatemanager.ICertificate

@CdkDslMarker
public class DomainOptionsDsl {
  private val cdkBuilder: DomainOptions.Builder = DomainOptions.builder()

  /**
   * @param certificate The certificate to use with the domain name. 
   */
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param domainName The actual domain name. 
   * For example, `api.example.com`.
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): DomainOptions = cdkBuilder.build()
}
