@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CertificateProps {
  public fun certificateName(): String? = unwrap(this).getCertificateName()

  public fun domainName(): String

  public fun keyAlgorithm(): KeyAlgorithm? = unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  public fun transparencyLoggingEnabled(): Boolean? = unwrap(this).getTransparencyLoggingEnabled()

  public fun validation(): CertificateValidation? =
      unwrap(this).getValidation()?.let(CertificateValidation::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun certificateName(certificateName: String)

    public fun domainName(domainName: String)

    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean)

    public fun validation(validation: CertificateValidation)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CertificateProps.builder()

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

    public fun build(): software.amazon.awscdk.services.certificatemanager.CertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.certificatemanager.CertificateProps,
  ) : CdkObject(cdkObject), CertificateProps {
    override fun certificateName(): String? = unwrap(this).getCertificateName()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun keyAlgorithm(): KeyAlgorithm? =
        unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()

    override fun transparencyLoggingEnabled(): Boolean? =
        unwrap(this).getTransparencyLoggingEnabled()

    override fun validation(): CertificateValidation? =
        unwrap(this).getValidation()?.let(CertificateValidation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CertificateProps):
        CertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CertificateProps):
        software.amazon.awscdk.services.certificatemanager.CertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.certificatemanager.CertificateProps
  }
}
