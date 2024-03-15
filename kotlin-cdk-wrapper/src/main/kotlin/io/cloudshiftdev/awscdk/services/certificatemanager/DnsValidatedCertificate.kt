@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DnsValidatedCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate,
) : Resource(cdkObject), ICertificate, ITaggable {
  @Deprecated(message = "deprecated in CDK")
  public override fun applyRemovalPolicy(policy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public override fun certificateArn(): String = unwrap(this).getCertificateArn()

  @Deprecated(message = "deprecated in CDK")
  public override fun metricDaysToExpiry(): Metric =
      unwrap(this).metricDaysToExpiry().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricDaysToExpiry(props: MetricOptions): Metric =
      unwrap(this).metricDaysToExpiry(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public override fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDaysToExpiry(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    public fun certificateName(certificateName: String)

    public fun cleanupRoute53Records(cleanupRoute53Records: Boolean)

    public fun customResourceRole(customResourceRole: IRole)

    public fun domainName(domainName: String)

    public fun hostedZone(hostedZone: IHostedZone)

    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    public fun region(region: String)

    public fun route53Endpoint(route53Endpoint: String)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean)

    public fun validation(validation: CertificateValidation)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate.Builder =
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate.Builder.create(scope,
        id)

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    override fun cleanupRoute53Records(cleanupRoute53Records: Boolean) {
      cdkBuilder.cleanupRoute53Records(cleanupRoute53Records)
    }

    override fun customResourceRole(customResourceRole: IRole) {
      cdkBuilder.customResourceRole(customResourceRole.let(IRole::unwrap))
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun hostedZone(hostedZone: IHostedZone) {
      cdkBuilder.hostedZone(hostedZone.let(IHostedZone::unwrap))
    }

    override fun keyAlgorithm(keyAlgorithm: KeyAlgorithm) {
      cdkBuilder.keyAlgorithm(keyAlgorithm.let(KeyAlgorithm::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun route53Endpoint(route53Endpoint: String) {
      cdkBuilder.route53Endpoint(route53Endpoint)
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

    public fun build(): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DnsValidatedCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DnsValidatedCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate):
        DnsValidatedCertificate = DnsValidatedCertificate(cdkObject)

    internal fun unwrap(wrapped: DnsValidatedCertificate):
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate =
        wrapped.cdkObject
  }
}
