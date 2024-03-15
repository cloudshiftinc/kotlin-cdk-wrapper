@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCertificateProps {
  public fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

  public fun certificateTransparencyLoggingPreference(): String? =
      unwrap(this).getCertificateTransparencyLoggingPreference()

  public fun domainName(): String

  public fun domainValidationOptions(): Any? = unwrap(this).getDomainValidationOptions()

  public fun keyAlgorithm(): String? = unwrap(this).getKeyAlgorithm()

  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun validationMethod(): String? = unwrap(this).getValidationMethod()

  @CdkDslMarker
  public interface Builder {
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String)

    public fun domainName(domainName: String)

    public fun domainValidationOptions(domainValidationOptions: IResolvable)

    public fun domainValidationOptions(domainValidationOptions: List<Any>)

    public fun domainValidationOptions(vararg domainValidationOptions: Any)

    public fun keyAlgorithm(keyAlgorithm: String)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun validationMethod(validationMethod: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.builder()

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
      cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainValidationOptions(domainValidationOptions: IResolvable) {
      cdkBuilder.domainValidationOptions(domainValidationOptions.let(IResolvable::unwrap))
    }

    override fun domainValidationOptions(domainValidationOptions: List<Any>) {
      cdkBuilder.domainValidationOptions(domainValidationOptions)
    }

    override fun domainValidationOptions(vararg domainValidationOptions: Any): Unit =
        domainValidationOptions(domainValidationOptions.toList())

    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun validationMethod(validationMethod: String) {
      cdkBuilder.validationMethod(validationMethod)
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    override fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

    override fun certificateTransparencyLoggingPreference(): String? =
        unwrap(this).getCertificateTransparencyLoggingPreference()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun domainValidationOptions(): Any? = unwrap(this).getDomainValidationOptions()

    override fun keyAlgorithm(): String? = unwrap(this).getKeyAlgorithm()

    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun validationMethod(): String? = unwrap(this).getValidationMethod()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps
  }
}
