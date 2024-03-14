package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class CertificateAuthority internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.acmpca.CertificateAuthority,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromCertificateAuthorityArn(
      scope: Construct,
      id: String,
      certificateAuthorityArn: String,
    ): ICertificateAuthority =
        software.amazon.awscdk.services.acmpca.CertificateAuthority.fromCertificateAuthorityArn(scope.let(Construct::unwrap),
        id, certificateAuthorityArn).let(ICertificateAuthority::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CertificateAuthority):
        CertificateAuthority = CertificateAuthority(cdkObject)

    internal fun unwrap(wrapped: CertificateAuthority):
        software.amazon.awscdk.services.acmpca.CertificateAuthority = wrapped.cdkObject
  }
}
