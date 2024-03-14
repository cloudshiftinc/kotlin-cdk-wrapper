package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.acmpca.ICertificateAuthority
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PrivateCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.certificatemanager.PrivateCertificate,
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
    public fun certificateAuthority(certificateAuthority: ICertificateAuthority)

    public fun domainName(domainName: String)

    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate.Builder =
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate.Builder.create(scope,
        id)

    override fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
      cdkBuilder.certificateAuthority(certificateAuthority.let(ICertificateAuthority::unwrap))
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

    public fun build(): software.amazon.awscdk.services.certificatemanager.PrivateCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromCertificateArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      certificateArn: String,
    ): ICertificate =
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate.fromCertificateArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, certificateArn).let(ICertificate::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.PrivateCertificate):
        PrivateCertificate = PrivateCertificate(cdkObject)

    internal fun unwrap(wrapped: PrivateCertificate):
        software.amazon.awscdk.services.certificatemanager.PrivateCertificate = wrapped.cdkObject
  }
}
