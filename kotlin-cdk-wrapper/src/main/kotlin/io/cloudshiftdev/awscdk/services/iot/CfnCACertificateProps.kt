@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCACertificateProps {
  public fun autoRegistrationStatus(): String? = unwrap(this).getAutoRegistrationStatus()

  public fun caCertificatePem(): String

  public fun certificateMode(): String? = unwrap(this).getCertificateMode()

  public fun registrationConfig(): Any? = unwrap(this).getRegistrationConfig()

  public fun removeAutoRegistration(): Any? = unwrap(this).getRemoveAutoRegistration()

  public fun status(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun verificationCertificatePem(): String? = unwrap(this).getVerificationCertificatePem()

  @CdkDslMarker
  public interface Builder {
    public fun autoRegistrationStatus(autoRegistrationStatus: String)

    public fun caCertificatePem(caCertificatePem: String)

    public fun certificateMode(certificateMode: String)

    public fun registrationConfig(registrationConfig: IResolvable)

    public fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("180eaaad60858f2f8f680468fe0709d6021e3e87a631cd540a25f25fd6505bfb")
    public
        fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty.Builder.() -> Unit)

    public fun removeAutoRegistration(removeAutoRegistration: Boolean)

    public fun removeAutoRegistration(removeAutoRegistration: IResolvable)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verificationCertificatePem(verificationCertificatePem: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCACertificateProps.Builder =
        software.amazon.awscdk.services.iot.CfnCACertificateProps.builder()

    override fun autoRegistrationStatus(autoRegistrationStatus: String) {
      cdkBuilder.autoRegistrationStatus(autoRegistrationStatus)
    }

    override fun caCertificatePem(caCertificatePem: String) {
      cdkBuilder.caCertificatePem(caCertificatePem)
    }

    override fun certificateMode(certificateMode: String) {
      cdkBuilder.certificateMode(certificateMode)
    }

    override fun registrationConfig(registrationConfig: IResolvable) {
      cdkBuilder.registrationConfig(registrationConfig.let(IResolvable::unwrap))
    }

    override
        fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty) {
      cdkBuilder.registrationConfig(registrationConfig.let(CfnCACertificate.RegistrationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("180eaaad60858f2f8f680468fe0709d6021e3e87a631cd540a25f25fd6505bfb")
    override
        fun registrationConfig(registrationConfig: CfnCACertificate.RegistrationConfigProperty.Builder.() -> Unit):
        Unit = registrationConfig(CfnCACertificate.RegistrationConfigProperty(registrationConfig))

    override fun removeAutoRegistration(removeAutoRegistration: Boolean) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration)
    }

    override fun removeAutoRegistration(removeAutoRegistration: IResolvable) {
      cdkBuilder.removeAutoRegistration(removeAutoRegistration.let(IResolvable::unwrap))
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verificationCertificatePem(verificationCertificatePem: String) {
      cdkBuilder.verificationCertificatePem(verificationCertificatePem)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCACertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnCACertificateProps,
  ) : CdkObject(cdkObject), CfnCACertificateProps {
    override fun autoRegistrationStatus(): String? = unwrap(this).getAutoRegistrationStatus()

    override fun caCertificatePem(): String = unwrap(this).getCaCertificatePem()

    override fun certificateMode(): String? = unwrap(this).getCertificateMode()

    override fun registrationConfig(): Any? = unwrap(this).getRegistrationConfig()

    override fun removeAutoRegistration(): Any? = unwrap(this).getRemoveAutoRegistration()

    override fun status(): String = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun verificationCertificatePem(): String? =
        unwrap(this).getVerificationCertificatePem()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCACertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCACertificateProps):
        CfnCACertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCACertificateProps):
        software.amazon.awscdk.services.iot.CfnCACertificateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnCACertificateProps
  }
}
