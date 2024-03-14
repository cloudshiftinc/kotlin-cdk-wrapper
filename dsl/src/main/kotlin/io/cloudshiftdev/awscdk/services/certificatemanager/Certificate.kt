package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Certificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.certificatemanager.Certificate,
) : Resource(cdkObject), ICertificate {
  public override fun certificateArn(): String = unwrap(this).getCertificateArn()

  public override fun metricDaysToExpiry(): Metric =
      unwrap(this).metricDaysToExpiry().let(Metric::wrap)

  public override fun metricDaysToExpiry(props: MetricOptions): Metric =
      unwrap(this).metricDaysToExpiry(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public override fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDaysToExpiry(MetricOptions(props))

  public interface Builder {
    public fun certificateName(certificateName: String)

    public fun domainName(domainName: String)

    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean)

    public fun validation(validation: CertificateValidation)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.certificatemanager.Certificate.Builder =
        software.amazon.awscdk.services.certificatemanager.Certificate.Builder.create(scope, id)

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
    }

    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    override fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
      cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
    }

    override fun validation(validation: CertificateValidation) {
      cdkBuilder.validation(validation.let(CertificateValidation::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.Certificate =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromCertificateArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      certificateArn: String,
    ): ICertificate =
        software.amazon.awscdk.services.certificatemanager.Certificate.fromCertificateArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, certificateArn).let(ICertificate::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Certificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Certificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.Certificate):
        Certificate = Certificate(cdkObject)

    internal fun unwrap(wrapped: Certificate):
        software.amazon.awscdk.services.certificatemanager.Certificate = wrapped.cdkObject
  }
}
