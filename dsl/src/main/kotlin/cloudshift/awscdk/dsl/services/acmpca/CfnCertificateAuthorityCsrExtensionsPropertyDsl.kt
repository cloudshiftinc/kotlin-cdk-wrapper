@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthorityCsrExtensionsPropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.CsrExtensionsProperty.Builder =
      CfnCertificateAuthority.CsrExtensionsProperty.builder()

  private val _subjectInformationAccess: MutableList<Any> = mutableListOf()

  public fun keyUsage(keyUsage: IResolvable) {
    cdkBuilder.keyUsage(keyUsage)
  }

  public fun keyUsage(keyUsage: CfnCertificateAuthority.KeyUsageProperty) {
    cdkBuilder.keyUsage(keyUsage)
  }

  public fun subjectInformationAccess(vararg subjectInformationAccess: Any) {
    _subjectInformationAccess.addAll(listOf(*subjectInformationAccess))
  }

  public fun subjectInformationAccess(subjectInformationAccess: Collection<Any>) {
    _subjectInformationAccess.addAll(subjectInformationAccess)
  }

  public fun subjectInformationAccess(subjectInformationAccess: IResolvable) {
    cdkBuilder.subjectInformationAccess(subjectInformationAccess)
  }

  public fun build(): CfnCertificateAuthority.CsrExtensionsProperty {
    if(_subjectInformationAccess.isNotEmpty())
        cdkBuilder.subjectInformationAccess(_subjectInformationAccess)
    return cdkBuilder.build()
  }
}
