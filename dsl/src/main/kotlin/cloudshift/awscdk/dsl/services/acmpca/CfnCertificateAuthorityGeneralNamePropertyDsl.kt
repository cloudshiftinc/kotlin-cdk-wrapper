@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthorityGeneralNamePropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.GeneralNameProperty.Builder =
      CfnCertificateAuthority.GeneralNameProperty.builder()

  public fun directoryName(directoryName: IResolvable) {
    cdkBuilder.directoryName(directoryName)
  }

  public fun directoryName(directoryName: CfnCertificateAuthority.SubjectProperty) {
    cdkBuilder.directoryName(directoryName)
  }

  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  public fun ediPartyName(ediPartyName: IResolvable) {
    cdkBuilder.ediPartyName(ediPartyName)
  }

  public fun ediPartyName(ediPartyName: CfnCertificateAuthority.EdiPartyNameProperty) {
    cdkBuilder.ediPartyName(ediPartyName)
  }

  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun otherName(otherName: IResolvable) {
    cdkBuilder.otherName(otherName)
  }

  public fun otherName(otherName: CfnCertificateAuthority.OtherNameProperty) {
    cdkBuilder.otherName(otherName)
  }

  public fun registeredId(registeredId: String) {
    cdkBuilder.registeredId(registeredId)
  }

  public fun rfc822Name(rfc822Name: String) {
    cdkBuilder.rfc822Name(rfc822Name)
  }

  public fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
    cdkBuilder.uniformResourceIdentifier(uniformResourceIdentifier)
  }

  public fun build(): CfnCertificateAuthority.GeneralNameProperty = cdkBuilder.build()
}
