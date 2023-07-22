@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateApiPassthroughPropertyDsl {
  private val cdkBuilder: CfnCertificate.ApiPassthroughProperty.Builder =
      CfnCertificate.ApiPassthroughProperty.builder()

  /**
   * @param extensions Specifies X.509 extension information for a certificate.
   */
  public fun extensions(extensions: IResolvable) {
    cdkBuilder.extensions(extensions)
  }

  /**
   * @param extensions Specifies X.509 extension information for a certificate.
   */
  public fun extensions(extensions: CfnCertificate.ExtensionsProperty) {
    cdkBuilder.extensions(extensions)
  }

  /**
   * @param subject Contains information about the certificate subject.
   * The Subject field in the certificate identifies the entity that owns or controls the public key
   * in the certificate. The entity can be a user, computer, device, or service. The Subject must
   * contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names
   * (RDNs). The RDNs are separated by commas in the certificate.
   */
  public fun subject(subject: IResolvable) {
    cdkBuilder.subject(subject)
  }

  /**
   * @param subject Contains information about the certificate subject.
   * The Subject field in the certificate identifies the entity that owns or controls the public key
   * in the certificate. The entity can be a user, computer, device, or service. The Subject must
   * contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names
   * (RDNs). The RDNs are separated by commas in the certificate.
   */
  public fun subject(subject: CfnCertificate.SubjectProperty) {
    cdkBuilder.subject(subject)
  }

  public fun build(): CfnCertificate.ApiPassthroughProperty = cdkBuilder.build()
}
