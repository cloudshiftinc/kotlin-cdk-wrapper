@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDomainProps {
  public fun appId(): String

  public fun autoSubDomainCreationPatterns(): List<String> =
      unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

  public fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

  public fun certificate(): Any? = unwrap(this).getCertificate()

  public fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

  public fun domainName(): String

  public fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

  public fun subDomainSettings(): Any

  public fun updateStatus(): String? = unwrap(this).getUpdateStatus()

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>)

    public fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String)

    public fun autoSubDomainIamRole(autoSubDomainIamRole: String)

    public fun certificate(certificate: IResolvable)

    public fun certificate(certificate: CfnDomain.CertificateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac8985efe65679454cdffeb0bff15feae171a1d263f5910e6a0e6baa42a60e9a")
    public fun certificate(certificate: CfnDomain.CertificateProperty.Builder.() -> Unit)

    public fun certificateSettings(certificateSettings: IResolvable)

    public fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e349f2ec27d3a6fc697ced7e01c95b182e14bc3646efc46ef9dcf118a330c2b2")
    public
        fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun enableAutoSubDomain(enableAutoSubDomain: Boolean)

    public fun enableAutoSubDomain(enableAutoSubDomain: IResolvable)

    public fun subDomainSettings(subDomainSettings: IResolvable)

    public fun subDomainSettings(subDomainSettings: List<Any>)

    public fun subDomainSettings(vararg subDomainSettings: Any)

    public fun updateStatus(updateStatus: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnDomainProps.Builder =
        software.amazon.awscdk.services.amplify.CfnDomainProps.builder()

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun autoSubDomainCreationPatterns(autoSubDomainCreationPatterns: List<String>) {
      cdkBuilder.autoSubDomainCreationPatterns(autoSubDomainCreationPatterns)
    }

    override fun autoSubDomainCreationPatterns(vararg autoSubDomainCreationPatterns: String): Unit =
        autoSubDomainCreationPatterns(autoSubDomainCreationPatterns.toList())

    override fun autoSubDomainIamRole(autoSubDomainIamRole: String) {
      cdkBuilder.autoSubDomainIamRole(autoSubDomainIamRole)
    }

    override fun certificate(certificate: IResolvable) {
      cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
    }

    override fun certificate(certificate: CfnDomain.CertificateProperty) {
      cdkBuilder.certificate(certificate.let(CfnDomain.CertificateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac8985efe65679454cdffeb0bff15feae171a1d263f5910e6a0e6baa42a60e9a")
    override fun certificate(certificate: CfnDomain.CertificateProperty.Builder.() -> Unit): Unit =
        certificate(CfnDomain.CertificateProperty(certificate))

    override fun certificateSettings(certificateSettings: IResolvable) {
      cdkBuilder.certificateSettings(certificateSettings.let(IResolvable::unwrap))
    }

    override fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty) {
      cdkBuilder.certificateSettings(certificateSettings.let(CfnDomain.CertificateSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e349f2ec27d3a6fc697ced7e01c95b182e14bc3646efc46ef9dcf118a330c2b2")
    override
        fun certificateSettings(certificateSettings: CfnDomain.CertificateSettingsProperty.Builder.() -> Unit):
        Unit = certificateSettings(CfnDomain.CertificateSettingsProperty(certificateSettings))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun enableAutoSubDomain(enableAutoSubDomain: Boolean) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain)
    }

    override fun enableAutoSubDomain(enableAutoSubDomain: IResolvable) {
      cdkBuilder.enableAutoSubDomain(enableAutoSubDomain.let(IResolvable::unwrap))
    }

    override fun subDomainSettings(subDomainSettings: IResolvable) {
      cdkBuilder.subDomainSettings(subDomainSettings.let(IResolvable::unwrap))
    }

    override fun subDomainSettings(subDomainSettings: List<Any>) {
      cdkBuilder.subDomainSettings(subDomainSettings)
    }

    override fun subDomainSettings(vararg subDomainSettings: Any): Unit =
        subDomainSettings(subDomainSettings.toList())

    override fun updateStatus(updateStatus: String) {
      cdkBuilder.updateStatus(updateStatus)
    }

    public fun build(): software.amazon.awscdk.services.amplify.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplify.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun appId(): String = unwrap(this).getAppId()

    override fun autoSubDomainCreationPatterns(): List<String> =
        unwrap(this).getAutoSubDomainCreationPatterns() ?: emptyList()

    override fun autoSubDomainIamRole(): String? = unwrap(this).getAutoSubDomainIamRole()

    override fun certificate(): Any? = unwrap(this).getCertificate()

    override fun certificateSettings(): Any? = unwrap(this).getCertificateSettings()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun enableAutoSubDomain(): Any? = unwrap(this).getEnableAutoSubDomain()

    override fun subDomainSettings(): Any = unwrap(this).getSubDomainSettings()

    override fun updateStatus(): String? = unwrap(this).getUpdateStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.amplify.CfnDomainProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.amplify.CfnDomainProps
  }
}
