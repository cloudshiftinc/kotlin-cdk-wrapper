@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateExtensionsPropertyDsl {
  private val cdkBuilder: CfnCertificate.ExtensionsProperty.Builder =
      CfnCertificate.ExtensionsProperty.builder()

  private val _certificatePolicies: MutableList<Any> = mutableListOf()

  private val _customExtensions: MutableList<Any> = mutableListOf()

  private val _extendedKeyUsage: MutableList<Any> = mutableListOf()

  private val _subjectAlternativeNames: MutableList<Any> = mutableListOf()

  public fun certificatePolicies(vararg certificatePolicies: Any) {
    _certificatePolicies.addAll(listOf(*certificatePolicies))
  }

  public fun certificatePolicies(certificatePolicies: Collection<Any>) {
    _certificatePolicies.addAll(certificatePolicies)
  }

  public fun certificatePolicies(certificatePolicies: IResolvable) {
    cdkBuilder.certificatePolicies(certificatePolicies)
  }

  public fun customExtensions(vararg customExtensions: Any) {
    _customExtensions.addAll(listOf(*customExtensions))
  }

  public fun customExtensions(customExtensions: Collection<Any>) {
    _customExtensions.addAll(customExtensions)
  }

  public fun customExtensions(customExtensions: IResolvable) {
    cdkBuilder.customExtensions(customExtensions)
  }

  public fun extendedKeyUsage(vararg extendedKeyUsage: Any) {
    _extendedKeyUsage.addAll(listOf(*extendedKeyUsage))
  }

  public fun extendedKeyUsage(extendedKeyUsage: Collection<Any>) {
    _extendedKeyUsage.addAll(extendedKeyUsage)
  }

  public fun extendedKeyUsage(extendedKeyUsage: IResolvable) {
    cdkBuilder.extendedKeyUsage(extendedKeyUsage)
  }

  public fun keyUsage(keyUsage: IResolvable) {
    cdkBuilder.keyUsage(keyUsage)
  }

  public fun keyUsage(keyUsage: CfnCertificate.KeyUsageProperty) {
    cdkBuilder.keyUsage(keyUsage)
  }

  public fun subjectAlternativeNames(vararg subjectAlternativeNames: Any) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<Any>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  public fun build(): CfnCertificate.ExtensionsProperty {
    if(_certificatePolicies.isNotEmpty()) cdkBuilder.certificatePolicies(_certificatePolicies)
    if(_customExtensions.isNotEmpty()) cdkBuilder.customExtensions(_customExtensions)
    if(_extendedKeyUsage.isNotEmpty()) cdkBuilder.extendedKeyUsage(_extendedKeyUsage)
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
