@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.CertificateProps
import software.amazon.awscdk.services.certificatemanager.CertificateValidation

@CdkDslMarker
public class CertificatePropsDsl {
  private val cdkBuilder: CertificateProps.Builder = CertificateProps.builder()

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
    cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
  }

  public fun validation(validation: CertificateValidation) {
    cdkBuilder.validation(validation)
  }

  public fun build(): CertificateProps {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
