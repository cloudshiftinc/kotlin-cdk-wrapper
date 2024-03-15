@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDomainConfigurationProps {
  public fun authorizerConfig(): Any? = unwrap(this).getAuthorizerConfig()

  public fun domainConfigurationName(): String? = unwrap(this).getDomainConfigurationName()

  public fun domainConfigurationStatus(): String? = unwrap(this).getDomainConfigurationStatus()

  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun serverCertificateArns(): List<String> = unwrap(this).getServerCertificateArns() ?:
      emptyList()

  public fun serverCertificateConfig(): Any? = unwrap(this).getServerCertificateConfig()

  public fun serviceType(): String? = unwrap(this).getServiceType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  public fun validationCertificateArn(): String? = unwrap(this).getValidationCertificateArn()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerConfig(authorizerConfig: IResolvable)

    public fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c534d29ff5dc33136681907b856953018e4e40f45c330621cb24ef797829430d")
    public
        fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty.Builder.() -> Unit)

    public fun domainConfigurationName(domainConfigurationName: String)

    public fun domainConfigurationStatus(domainConfigurationStatus: String)

    public fun domainName(domainName: String)

    public fun serverCertificateArns(serverCertificateArns: List<String>)

    public fun serverCertificateArns(vararg serverCertificateArns: String)

    public fun serverCertificateConfig(serverCertificateConfig: IResolvable)

    public
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f305696a7354135afa38e4844e995638a5e79f521033a1e76085d1736afd8b")
    public
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty.Builder.() -> Unit)

    public fun serviceType(serviceType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tlsConfig(tlsConfig: IResolvable)

    public fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898295011ba43b15190f874bc064ac8958ec184e22441ef926778c41dd084dea")
    public fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty.Builder.() -> Unit)

    public fun validationCertificateArn(validationCertificateArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDomainConfigurationProps.Builder
        = software.amazon.awscdk.services.iot.CfnDomainConfigurationProps.builder()

    override fun authorizerConfig(authorizerConfig: IResolvable) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(IResolvable::unwrap))
    }

    override
        fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(CfnDomainConfiguration.AuthorizerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c534d29ff5dc33136681907b856953018e4e40f45c330621cb24ef797829430d")
    override
        fun authorizerConfig(authorizerConfig: CfnDomainConfiguration.AuthorizerConfigProperty.Builder.() -> Unit):
        Unit = authorizerConfig(CfnDomainConfiguration.AuthorizerConfigProperty(authorizerConfig))

    override fun domainConfigurationName(domainConfigurationName: String) {
      cdkBuilder.domainConfigurationName(domainConfigurationName)
    }

    override fun domainConfigurationStatus(domainConfigurationStatus: String) {
      cdkBuilder.domainConfigurationStatus(domainConfigurationStatus)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun serverCertificateArns(serverCertificateArns: List<String>) {
      cdkBuilder.serverCertificateArns(serverCertificateArns)
    }

    override fun serverCertificateArns(vararg serverCertificateArns: String): Unit =
        serverCertificateArns(serverCertificateArns.toList())

    override fun serverCertificateConfig(serverCertificateConfig: IResolvable) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(IResolvable::unwrap))
    }

    override
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(CfnDomainConfiguration.ServerCertificateConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44f305696a7354135afa38e4844e995638a5e79f521033a1e76085d1736afd8b")
    override
        fun serverCertificateConfig(serverCertificateConfig: CfnDomainConfiguration.ServerCertificateConfigProperty.Builder.() -> Unit):
        Unit =
        serverCertificateConfig(CfnDomainConfiguration.ServerCertificateConfigProperty(serverCertificateConfig))

    override fun serviceType(serviceType: String) {
      cdkBuilder.serviceType(serviceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable::unwrap))
    }

    override fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(CfnDomainConfiguration.TlsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("898295011ba43b15190f874bc064ac8958ec184e22441ef926778c41dd084dea")
    override fun tlsConfig(tlsConfig: CfnDomainConfiguration.TlsConfigProperty.Builder.() -> Unit):
        Unit = tlsConfig(CfnDomainConfiguration.TlsConfigProperty(tlsConfig))

    override fun validationCertificateArn(validationCertificateArn: String) {
      cdkBuilder.validationCertificateArn(validationCertificateArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDomainConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfigurationProps,
  ) : CdkObject(cdkObject), CfnDomainConfigurationProps {
    override fun authorizerConfig(): Any? = unwrap(this).getAuthorizerConfig()

    override fun domainConfigurationName(): String? = unwrap(this).getDomainConfigurationName()

    override fun domainConfigurationStatus(): String? = unwrap(this).getDomainConfigurationStatus()

    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun serverCertificateArns(): List<String> = unwrap(this).getServerCertificateArns() ?:
        emptyList()

    override fun serverCertificateConfig(): Any? = unwrap(this).getServerCertificateConfig()

    override fun serviceType(): String? = unwrap(this).getServiceType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

    override fun validationCertificateArn(): String? = unwrap(this).getValidationCertificateArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfigurationProps):
        CfnDomainConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainConfigurationProps):
        software.amazon.awscdk.services.iot.CfnDomainConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnDomainConfigurationProps
  }
}
