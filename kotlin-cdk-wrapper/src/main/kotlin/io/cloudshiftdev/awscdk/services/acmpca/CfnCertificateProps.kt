@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCertificateProps {
  public fun apiPassthrough(): Any? = unwrap(this).getApiPassthrough()

  public fun certificateAuthorityArn(): String

  public fun certificateSigningRequest(): String

  public fun signingAlgorithm(): String

  public fun templateArn(): String? = unwrap(this).getTemplateArn()

  public fun validity(): Any

  public fun validityNotBefore(): Any? = unwrap(this).getValidityNotBefore()

  @CdkDslMarker
  public interface Builder {
    public fun apiPassthrough(apiPassthrough: IResolvable)

    public fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23cbad4145f44d42136bfd94d12a001f9ef4a65596a9db24a7c200909ce700bf")
    public
        fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty.Builder.() -> Unit)

    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun certificateSigningRequest(certificateSigningRequest: String)

    public fun signingAlgorithm(signingAlgorithm: String)

    public fun templateArn(templateArn: String)

    public fun validity(validity: IResolvable)

    public fun validity(validity: CfnCertificate.ValidityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b418ede2b97862b13595cbedbaa26b624edbb9db6a055495919cf025ee48f8e")
    public fun validity(validity: CfnCertificate.ValidityProperty.Builder.() -> Unit)

    public fun validityNotBefore(validityNotBefore: IResolvable)

    public fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75a4d565321d16c81001aa9b08097db75f1d420a9a5b9a711d19a020c8856b17")
    public
        fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateProps.builder()

    override fun apiPassthrough(apiPassthrough: IResolvable) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(IResolvable::unwrap))
    }

    override fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(CfnCertificate.ApiPassthroughProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23cbad4145f44d42136bfd94d12a001f9ef4a65596a9db24a7c200909ce700bf")
    override
        fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty.Builder.() -> Unit):
        Unit = apiPassthrough(CfnCertificate.ApiPassthroughProperty(apiPassthrough))

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    override fun validity(validity: IResolvable) {
      cdkBuilder.validity(validity.let(IResolvable::unwrap))
    }

    override fun validity(validity: CfnCertificate.ValidityProperty) {
      cdkBuilder.validity(validity.let(CfnCertificate.ValidityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b418ede2b97862b13595cbedbaa26b624edbb9db6a055495919cf025ee48f8e")
    override fun validity(validity: CfnCertificate.ValidityProperty.Builder.() -> Unit): Unit =
        validity(CfnCertificate.ValidityProperty(validity))

    override fun validityNotBefore(validityNotBefore: IResolvable) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(IResolvable::unwrap))
    }

    override fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(CfnCertificate.ValidityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75a4d565321d16c81001aa9b08097db75f1d420a9a5b9a711d19a020c8856b17")
    override
        fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty.Builder.() -> Unit):
        Unit = validityNotBefore(CfnCertificate.ValidityProperty(validityNotBefore))

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    override fun apiPassthrough(): Any? = unwrap(this).getApiPassthrough()

    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    override fun certificateSigningRequest(): String = unwrap(this).getCertificateSigningRequest()

    override fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

    override fun templateArn(): String? = unwrap(this).getTemplateArn()

    override fun validity(): Any = unwrap(this).getValidity()

    override fun validityNotBefore(): Any? = unwrap(this).getValidityNotBefore()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.acmpca.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.acmpca.CfnCertificateProps
  }
}
