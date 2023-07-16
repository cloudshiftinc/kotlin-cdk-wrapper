@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.ICertificateAuthority
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.constructs.Construct

@CdkDslMarker
public class PrivateCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: PrivateCertificate.Builder = PrivateCertificate.Builder.create(scope, id)

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  public fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
    cdkBuilder.certificateAuthority(certificateAuthority)
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

  public fun build(): PrivateCertificate {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
