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

  /**
   * @param directoryName Contains information about the certificate subject.
   * The certificate can be one issued by your private certificate authority (CA) or it can be your
   * private CA certificate. The Subject field in the certificate identifies the entity that owns or
   * controls the public key in the certificate. The entity can be a user, computer, device, or
   * service. The Subject must contain an X.500 distinguished name (DN). A DN is a sequence of relative
   * distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be
   * unique for each entity, but your private CA can issue more than one certificate with the same DN
   * to the same entity.
   */
  public fun directoryName(directoryName: IResolvable) {
    cdkBuilder.directoryName(directoryName)
  }

  /**
   * @param directoryName Contains information about the certificate subject.
   * The certificate can be one issued by your private certificate authority (CA) or it can be your
   * private CA certificate. The Subject field in the certificate identifies the entity that owns or
   * controls the public key in the certificate. The entity can be a user, computer, device, or
   * service. The Subject must contain an X.500 distinguished name (DN). A DN is a sequence of relative
   * distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be
   * unique for each entity, but your private CA can issue more than one certificate with the same DN
   * to the same entity.
   */
  public fun directoryName(directoryName: CfnCertificateAuthority.SubjectProperty) {
    cdkBuilder.directoryName(directoryName)
  }

  /**
   * @param dnsName Represents `GeneralName` as a DNS name.
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
   */
  public fun ediPartyName(ediPartyName: IResolvable) {
    cdkBuilder.ediPartyName(ediPartyName)
  }

  /**
   * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
   */
  public fun ediPartyName(ediPartyName: CfnCertificateAuthority.EdiPartyNameProperty) {
    cdkBuilder.ediPartyName(ediPartyName)
  }

  /**
   * @param ipAddress Represents `GeneralName` as an IPv4 or IPv6 address.
   */
  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  /**
   * @param otherName Represents `GeneralName` using an `OtherName` object.
   */
  public fun otherName(otherName: IResolvable) {
    cdkBuilder.otherName(otherName)
  }

  /**
   * @param otherName Represents `GeneralName` using an `OtherName` object.
   */
  public fun otherName(otherName: CfnCertificateAuthority.OtherNameProperty) {
    cdkBuilder.otherName(otherName)
  }

  /**
   * @param registeredId Represents `GeneralName` as an object identifier (OID).
   */
  public fun registeredId(registeredId: String) {
    cdkBuilder.registeredId(registeredId)
  }

  /**
   * @param rfc822Name Represents `GeneralName` as an [RFC
   * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
   */
  public fun rfc822Name(rfc822Name: String) {
    cdkBuilder.rfc822Name(rfc822Name)
  }

  /**
   * @param uniformResourceIdentifier Represents `GeneralName` as a URI.
   */
  public fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
    cdkBuilder.uniformResourceIdentifier(uniformResourceIdentifier)
  }

  public fun build(): CfnCertificateAuthority.GeneralNameProperty = cdkBuilder.build()
}
