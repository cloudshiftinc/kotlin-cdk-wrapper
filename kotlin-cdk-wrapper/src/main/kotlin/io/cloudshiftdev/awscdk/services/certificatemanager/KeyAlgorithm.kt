@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Certificate Manager key algorithm.
 *
 * If you need to use an algorithm that doesn't exist as a static member, you
 * can instantiate a `KeyAlgorithm` object, e.g: `new KeyAlgorithm('RSA_2048')`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.acmpca.*;
 * PrivateCertificate.Builder.create(this, "PrivateCertificate")
 * .domainName("test.example.com")
 * .subjectAlternativeNames(List.of("cool.example.com", "test.example.net")) // optional
 * .certificateAuthority(CertificateAuthority.fromCertificateAuthorityArn(this, "CA",
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/023077d8-2bfa-4eb0-8f22-05c96deade77"))
 * .keyAlgorithm(KeyAlgorithm.RSA_2048)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-keyalgorithm)
 */
public open class KeyAlgorithm internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.certificatemanager.KeyAlgorithm,
) : CdkObject(cdkObject) {
  public constructor(name: String) :
      this(software.amazon.awscdk.services.certificatemanager.KeyAlgorithm(name))

  /**
   * The name of the algorithm.
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public val EC_PRIME256_V1: KeyAlgorithm =
        KeyAlgorithm.wrap(software.amazon.awscdk.services.certificatemanager.KeyAlgorithm.EC_PRIME256_V1)

    public val EC_SECP384_R1: KeyAlgorithm =
        KeyAlgorithm.wrap(software.amazon.awscdk.services.certificatemanager.KeyAlgorithm.EC_SECP384_R1)

    public val RSA_2048: KeyAlgorithm =
        KeyAlgorithm.wrap(software.amazon.awscdk.services.certificatemanager.KeyAlgorithm.RSA_2048)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.KeyAlgorithm):
        KeyAlgorithm = KeyAlgorithm(cdkObject)

    internal fun unwrap(wrapped: KeyAlgorithm):
        software.amazon.awscdk.services.certificatemanager.KeyAlgorithm = wrapped.cdkObject
  }
}
