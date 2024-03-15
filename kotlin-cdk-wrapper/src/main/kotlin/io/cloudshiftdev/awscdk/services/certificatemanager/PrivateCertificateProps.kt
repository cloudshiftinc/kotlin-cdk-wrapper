@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.acmpca.ICertificateAuthority
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PrivateCertificateProps {
  public fun certificateAuthority(): ICertificateAuthority

  public fun domainName(): String

  public fun keyAlgorithm(): KeyAlgorithm? = unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun certificateAuthority(certificateAuthority: ICertificateAuthority)

    public fun domainName(domainName: String)

    public fun keyAlgorithm(keyAlgorithm: KeyAlgorithm)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps.builder()

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

    public fun build(): software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps,
  ) : CdkObject(cdkObject), PrivateCertificateProps {
    override fun certificateAuthority(): ICertificateAuthority =
        unwrap(this).getCertificateAuthority().let(ICertificateAuthority::wrap)

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun keyAlgorithm(): KeyAlgorithm? =
        unwrap(this).getKeyAlgorithm()?.let(KeyAlgorithm::wrap)

    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps):
        PrivateCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateCertificateProps):
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps
  }
}
