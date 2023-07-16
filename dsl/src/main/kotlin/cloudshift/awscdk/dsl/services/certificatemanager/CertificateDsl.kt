@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.Certificate
import software.amazon.awscdk.services.certificatemanager.CertificateValidation
import software.constructs.Construct

@CdkDslMarker
public class CertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Certificate.Builder = Certificate.Builder.create(scope, id)

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

  public fun build(): Certificate {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
