@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCertificateAuthorityProps {
  public fun csrExtensions(): Any? = unwrap(this).getCsrExtensions()

  public fun keyAlgorithm(): String

  public fun keyStorageSecurityStandard(): String? = unwrap(this).getKeyStorageSecurityStandard()

  public fun revocationConfiguration(): Any? = unwrap(this).getRevocationConfiguration()

  public fun signingAlgorithm(): String

  public fun subject(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  public fun usageMode(): String? = unwrap(this).getUsageMode()

  @CdkDslMarker
  public interface Builder {
    public fun csrExtensions(csrExtensions: IResolvable)

    public fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6bebd295ea06d57572be0da693ba0d33881ffa0c57c6c2ef37ca0382d52c3a")
    public
        fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty.Builder.() -> Unit)

    public fun keyAlgorithm(keyAlgorithm: String)

    public fun keyStorageSecurityStandard(keyStorageSecurityStandard: String)

    public fun revocationConfiguration(revocationConfiguration: IResolvable)

    public
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2b01af94adf2e175ad0dd59a68765bc3e45738e6e3241377373ef3329455eb6")
    public
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty.Builder.() -> Unit)

    public fun signingAlgorithm(signingAlgorithm: String)

    public fun subject(subject: IResolvable)

    public fun subject(subject: CfnCertificateAuthority.SubjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8303ea251795b2f267cd4f552de639cfcb95af2349a7d94e9518c6277037d370")
    public fun subject(subject: CfnCertificateAuthority.SubjectProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun usageMode(usageMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps.builder()

    override fun csrExtensions(csrExtensions: IResolvable) {
      cdkBuilder.csrExtensions(csrExtensions.let(IResolvable::unwrap))
    }

    override fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty) {
      cdkBuilder.csrExtensions(csrExtensions.let(CfnCertificateAuthority.CsrExtensionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f6bebd295ea06d57572be0da693ba0d33881ffa0c57c6c2ef37ca0382d52c3a")
    override
        fun csrExtensions(csrExtensions: CfnCertificateAuthority.CsrExtensionsProperty.Builder.() -> Unit):
        Unit = csrExtensions(CfnCertificateAuthority.CsrExtensionsProperty(csrExtensions))

    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    override fun keyStorageSecurityStandard(keyStorageSecurityStandard: String) {
      cdkBuilder.keyStorageSecurityStandard(keyStorageSecurityStandard)
    }

    override fun revocationConfiguration(revocationConfiguration: IResolvable) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty) {
      cdkBuilder.revocationConfiguration(revocationConfiguration.let(CfnCertificateAuthority.RevocationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2b01af94adf2e175ad0dd59a68765bc3e45738e6e3241377373ef3329455eb6")
    override
        fun revocationConfiguration(revocationConfiguration: CfnCertificateAuthority.RevocationConfigurationProperty.Builder.() -> Unit):
        Unit =
        revocationConfiguration(CfnCertificateAuthority.RevocationConfigurationProperty(revocationConfiguration))

    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    override fun subject(subject: IResolvable) {
      cdkBuilder.subject(subject.let(IResolvable::unwrap))
    }

    override fun subject(subject: CfnCertificateAuthority.SubjectProperty) {
      cdkBuilder.subject(subject.let(CfnCertificateAuthority.SubjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8303ea251795b2f267cd4f552de639cfcb95af2349a7d94e9518c6277037d370")
    override fun subject(subject: CfnCertificateAuthority.SubjectProperty.Builder.() -> Unit): Unit
        = subject(CfnCertificateAuthority.SubjectProperty(subject))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun usageMode(usageMode: String) {
      cdkBuilder.usageMode(usageMode)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps,
  ) : CdkObject(cdkObject), CfnCertificateAuthorityProps {
    override fun csrExtensions(): Any? = unwrap(this).getCsrExtensions()

    override fun keyAlgorithm(): String = unwrap(this).getKeyAlgorithm()

    override fun keyStorageSecurityStandard(): String? =
        unwrap(this).getKeyStorageSecurityStandard()

    override fun revocationConfiguration(): Any? = unwrap(this).getRevocationConfiguration()

    override fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

    override fun subject(): Any = unwrap(this).getSubject()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()

    override fun usageMode(): String? = unwrap(this).getUsageMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateAuthorityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps):
        CfnCertificateAuthorityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthorityProps):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps
  }
}
