@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.cognito.CustomDomainOptions

@CdkDslMarker
public class CustomDomainOptionsDsl {
  private val cdkBuilder: CustomDomainOptions.Builder = CustomDomainOptions.builder()

  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun build(): CustomDomainOptions = cdkBuilder.build()
}
