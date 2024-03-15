@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DnsValidatedCertificateProps : CertificateProps {
  public fun cleanupRoute53Records(): Boolean? = unwrap(this).getCleanupRoute53Records()

  public fun customResourceRole(): IRole? = unwrap(this).getCustomResourceRole()?.let(IRole::wrap)

  public fun hostedZone(): IHostedZone

  public fun region(): String? = unwrap(this).getRegion()

  public fun route53Endpoint(): String? = unwrap(this).getRoute53Endpoint()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps,
  ) : CdkObject(cdkObject), DnsValidatedCertificateProps {
    override fun certificateName(): String? = unwrap(this).getCertificateName()

    override fun cleanupRoute53Records(): Boolean? = unwrap(this).getCleanupRoute53Records()

    override fun customResourceRole(): IRole? =
        unwrap(this).getCustomResourceRole()?.let(IRole::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun hostedZone(): IHostedZone = unwrap(this).getHostedZone().let(IHostedZone::wrap)

    override fun keyAlgorithm(): KeyAlgorithm? =
        unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun route53Endpoint(): String? = unwrap(this).getRoute53Endpoint()

    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()

    override fun transparencyLoggingEnabled(): Boolean? =
        unwrap(this).getTransparencyLoggingEnabled()

    override fun validation(): CertificateValidation? =
        unwrap(this).getValidation()?.let(CertificateValidation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DnsValidatedCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps):
        DnsValidatedCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DnsValidatedCertificateProps):
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
  }
}
