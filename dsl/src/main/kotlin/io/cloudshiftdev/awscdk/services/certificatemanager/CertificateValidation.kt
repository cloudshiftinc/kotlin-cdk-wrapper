package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.String
import kotlin.collections.Map

public open class CertificateValidation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.certificatemanager.CertificateValidation,
) {
  /**
   * The validation method.
   */
  public open fun method(): ValidationMethod = unwrap(this).getMethod().let(ValidationMethod::wrap)

  /**
   * Certification validation properties.
   */
  public open fun props(): CertificationValidationProps =
      unwrap(this).getProps().let(CertificationValidationProps::wrap)

  public companion object {
    public fun fromDns(): CertificateValidation =
        software.amazon.awscdk.services.certificatemanager.CertificateValidation.fromDns().let(CertificateValidation::wrap)

    public fun fromDns(hostedZone: IHostedZone): CertificateValidation =
        software.amazon.awscdk.services.certificatemanager.CertificateValidation.fromDns(hostedZone.let(IHostedZone::unwrap)).let(CertificateValidation::wrap)

    public fun fromDnsMultiZone(hostedZones: Map<String, IHostedZone>): CertificateValidation =
        software.amazon.awscdk.services.certificatemanager.CertificateValidation.fromDnsMultiZone(hostedZones.mapValues{IHostedZone.unwrap(it.value)}).let(CertificateValidation::wrap)

    public fun fromEmail(): CertificateValidation =
        software.amazon.awscdk.services.certificatemanager.CertificateValidation.fromEmail().let(CertificateValidation::wrap)

    public fun fromEmail(validationDomains: Map<String, String>): CertificateValidation =
        software.amazon.awscdk.services.certificatemanager.CertificateValidation.fromEmail(validationDomains).let(CertificateValidation::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CertificateValidation):
        CertificateValidation = CertificateValidation(cdkObject)

    internal fun unwrap(wrapped: CertificateValidation):
        software.amazon.awscdk.services.certificatemanager.CertificateValidation = wrapped.cdkObject
  }
}
