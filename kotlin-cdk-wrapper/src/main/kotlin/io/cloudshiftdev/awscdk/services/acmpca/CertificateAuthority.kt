@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Defines a Certificate for ACMPCA.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.acmpca.*;
 * Vpc vpc;
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .clusterName("myCluster")
 * .kafkaVersion(KafkaVersion.V2_8_1)
 * .vpc(vpc)
 * .encryptionInTransit(EncryptionInTransitConfig.builder()
 * .clientBroker(ClientBrokerEncryption.TLS)
 * .build())
 * .clientAuthentication(ClientAuthentication.tls(TlsAuthProps.builder()
 * .certificateAuthorities(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "CertificateAuthority",
 * "arn:aws:acm-pca:us-west-2:1234567890:certificate-authority/11111111-1111-1111-1111-111111111111")))
 * .build()))
 * .build();
 * ```
 */
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
