@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateGeneralNamePropertyDsl {
  private val cdkBuilder: CfnCertificate.GeneralNameProperty.Builder =
      CfnCertificate.GeneralNameProperty.builder()

  public fun directoryName(directoryName: IResolvable) {
    cdkBuilder.directoryName(directoryName)
  }

  public fun directoryName(directoryName: CfnCertificate.SubjectProperty) {
    cdkBuilder.directoryName(directoryName)
  }

  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  public fun ediPartyName(ediPartyName: IResolvable) {
    cdkBuilder.ediPartyName(ediPartyName)
  }

  public fun ediPartyName(ediPartyName: CfnCertificate.EdiPartyNameProperty) {
    cdkBuilder.ediPartyName(ediPartyName)
  }

  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun otherName(otherName: IResolvable) {
    cdkBuilder.otherName(otherName)
  }

  public fun otherName(otherName: CfnCertificate.OtherNameProperty) {
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

  public fun build(): CfnCertificate.GeneralNameProperty = cdkBuilder.build()
}
