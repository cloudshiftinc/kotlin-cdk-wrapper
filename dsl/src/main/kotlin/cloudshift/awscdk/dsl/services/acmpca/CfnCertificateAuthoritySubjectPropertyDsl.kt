@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthoritySubjectPropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.SubjectProperty.Builder =
      CfnCertificateAuthority.SubjectProperty.builder()

  private val _customAttributes: MutableList<Any> = mutableListOf()

  public fun commonName(commonName: String) {
    cdkBuilder.commonName(commonName)
  }

  public fun country(country: String) {
    cdkBuilder.country(country)
  }

  public fun customAttributes(vararg customAttributes: Any) {
    _customAttributes.addAll(listOf(*customAttributes))
  }

  public fun customAttributes(customAttributes: Collection<Any>) {
    _customAttributes.addAll(customAttributes)
  }

  public fun customAttributes(customAttributes: IResolvable) {
    cdkBuilder.customAttributes(customAttributes)
  }

  public fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
    cdkBuilder.distinguishedNameQualifier(distinguishedNameQualifier)
  }

  public fun generationQualifier(generationQualifier: String) {
    cdkBuilder.generationQualifier(generationQualifier)
  }

  public fun givenName(givenName: String) {
    cdkBuilder.givenName(givenName)
  }

  public fun initials(initials: String) {
    cdkBuilder.initials(initials)
  }

  public fun locality(locality: String) {
    cdkBuilder.locality(locality)
  }

  public fun organization(organization: String) {
    cdkBuilder.organization(organization)
  }

  public fun organizationalUnit(organizationalUnit: String) {
    cdkBuilder.organizationalUnit(organizationalUnit)
  }

  public fun pseudonym(pseudonym: String) {
    cdkBuilder.pseudonym(pseudonym)
  }

  public fun serialNumber(serialNumber: String) {
    cdkBuilder.serialNumber(serialNumber)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun surname(surname: String) {
    cdkBuilder.surname(surname)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnCertificateAuthority.SubjectProperty {
    if(_customAttributes.isNotEmpty()) cdkBuilder.customAttributes(_customAttributes)
    return cdkBuilder.build()
  }
}
