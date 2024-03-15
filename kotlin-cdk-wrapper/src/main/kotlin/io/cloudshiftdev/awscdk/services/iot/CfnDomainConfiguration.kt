@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomainConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainType(): String = unwrap(this).getAttrDomainType()

  public open fun attrServerCertificates(): IResolvable =
      unwrap(this).getAttrServerCertificates().let(IResolvable::wrap)

  public open fun authorizerConfig(): Any? = unwrap(this).getAuthorizerConfig()

  public open fun authorizerConfig(`value`: IResolvable) {
    unwrap(this).setAuthorizerConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun authorizerConfig(`value`: AuthorizerConfigProperty) {
    unwrap(this).setAuthorizerConfig(`value`.let(AuthorizerConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7068dcfe8a08dae5b2176eb90e7443672ed814ab8837b883ca3f48e4a9afd32e")
  public open fun authorizerConfig(`value`: AuthorizerConfigProperty.Builder.() -> Unit): Unit =
      authorizerConfig(AuthorizerConfigProperty(`value`))

  public open fun domainConfigurationName(): String? = unwrap(this).getDomainConfigurationName()

  public open fun domainConfigurationName(`value`: String) {
    unwrap(this).setDomainConfigurationName(`value`)
  }

  public open fun domainConfigurationStatus(): String? = unwrap(this).getDomainConfigurationStatus()

  public open fun domainConfigurationStatus(`value`: String) {
    unwrap(this).setDomainConfigurationStatus(`value`)
  }

  public open fun domainName(): String? = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serverCertificateArns(): List<String> = unwrap(this).getServerCertificateArns() ?:
      emptyList()

  public open fun serverCertificateArns(`value`: List<String>) {
    unwrap(this).setServerCertificateArns(`value`)
  }

  public open fun serverCertificateArns(vararg `value`: String): Unit =
      serverCertificateArns(`value`.toList())

  public open fun serverCertificateConfig(): Any? = unwrap(this).getServerCertificateConfig()

  public open fun serverCertificateConfig(`value`: IResolvable) {
    unwrap(this).setServerCertificateConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun serverCertificateConfig(`value`: ServerCertificateConfigProperty) {
    unwrap(this).setServerCertificateConfig(`value`.let(ServerCertificateConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("61b5c03c59bdca05b84baed94e338847989f1969a636792a06676085707e4803")
  public open
      fun serverCertificateConfig(`value`: ServerCertificateConfigProperty.Builder.() -> Unit): Unit
      = serverCertificateConfig(ServerCertificateConfigProperty(`value`))

  public open fun serviceType(): String? = unwrap(this).getServiceType()

  public open fun serviceType(`value`: String) {
    unwrap(this).setServiceType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  public open fun tlsConfig(`value`: IResolvable) {
    unwrap(this).setTlsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun tlsConfig(`value`: TlsConfigProperty) {
    unwrap(this).setTlsConfig(`value`.let(TlsConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6863b4544c897f9b0ea775c9df9b4a08c0ef9741195bed605074ff0fe5e73c81")
  public open fun tlsConfig(`value`: TlsConfigProperty.Builder.() -> Unit): Unit =
      tlsConfig(TlsConfigProperty(`value`))

  public open fun validationCertificateArn(): String? = unwrap(this).getValidationCertificateArn()

  public open fun validationCertificateArn(`value`: String) {
    unwrap(this).setValidationCertificateArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authorizerConfig(authorizerConfig: IResolvable)

    public fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4759ae749a4e31a1c4dd04b7986e8d3ab600f3d189c96aff7f6df92ee08972")
    public fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty.Builder.() -> Unit)

    public fun domainConfigurationName(domainConfigurationName: String)

    public fun domainConfigurationStatus(domainConfigurationStatus: String)

    public fun domainName(domainName: String)

    public fun serverCertificateArns(serverCertificateArns: List<String>)

    public fun serverCertificateArns(vararg serverCertificateArns: String)

    public fun serverCertificateConfig(serverCertificateConfig: IResolvable)

    public fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ae58e8262218ab639eeb7233475520481bad2558d197cb3703e0b35133e4ce6")
    public
        fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty.Builder.() -> Unit)

    public fun serviceType(serviceType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tlsConfig(tlsConfig: IResolvable)

    public fun tlsConfig(tlsConfig: TlsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4abac1239c8747cf17cc073364f15141980d897e685d7f16e484f886c1b66d5d")
    public fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit)

    public fun validationCertificateArn(validationCertificateArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnDomainConfiguration.Builder =
        software.amazon.awscdk.services.iot.CfnDomainConfiguration.Builder.create(scope, id)

    override fun authorizerConfig(authorizerConfig: IResolvable) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(IResolvable::unwrap))
    }

    override fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty) {
      cdkBuilder.authorizerConfig(authorizerConfig.let(AuthorizerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4759ae749a4e31a1c4dd04b7986e8d3ab600f3d189c96aff7f6df92ee08972")
    override fun authorizerConfig(authorizerConfig: AuthorizerConfigProperty.Builder.() -> Unit):
        Unit = authorizerConfig(AuthorizerConfigProperty(authorizerConfig))

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

    override fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty) {
      cdkBuilder.serverCertificateConfig(serverCertificateConfig.let(ServerCertificateConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ae58e8262218ab639eeb7233475520481bad2558d197cb3703e0b35133e4ce6")
    override
        fun serverCertificateConfig(serverCertificateConfig: ServerCertificateConfigProperty.Builder.() -> Unit):
        Unit = serverCertificateConfig(ServerCertificateConfigProperty(serverCertificateConfig))

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

    override fun tlsConfig(tlsConfig: TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(TlsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4abac1239c8747cf17cc073364f15141980d897e685d7f16e484f886c1b66d5d")
    override fun tlsConfig(tlsConfig: TlsConfigProperty.Builder.() -> Unit): Unit =
        tlsConfig(TlsConfigProperty(tlsConfig))

    override fun validationCertificateArn(validationCertificateArn: String) {
      cdkBuilder.validationCertificateArn(validationCertificateArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnDomainConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnDomainConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomainConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomainConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration):
        CfnDomainConfiguration = CfnDomainConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnDomainConfiguration):
        software.amazon.awscdk.services.iot.CfnDomainConfiguration = wrapped.cdkObject
  }

  public interface ServerCertificateConfigProperty {
    public fun enableOcspCheck(): Any? = unwrap(this).getEnableOcspCheck()

    @CdkDslMarker
    public interface Builder {
      public fun enableOcspCheck(enableOcspCheck: Boolean)

      public fun enableOcspCheck(enableOcspCheck: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty.builder()

      override fun enableOcspCheck(enableOcspCheck: Boolean) {
        cdkBuilder.enableOcspCheck(enableOcspCheck)
      }

      override fun enableOcspCheck(enableOcspCheck: IResolvable) {
        cdkBuilder.enableOcspCheck(enableOcspCheck.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty,
    ) : CdkObject(cdkObject), ServerCertificateConfigProperty {
      override fun enableOcspCheck(): Any? = unwrap(this).getEnableOcspCheck()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty):
          ServerCertificateConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateConfigProperty
    }
  }

  public interface AuthorizerConfigProperty {
    public fun allowAuthorizerOverride(): Any? = unwrap(this).getAllowAuthorizerOverride()

    public fun defaultAuthorizerName(): String? = unwrap(this).getDefaultAuthorizerName()

    @CdkDslMarker
    public interface Builder {
      public fun allowAuthorizerOverride(allowAuthorizerOverride: Boolean)

      public fun allowAuthorizerOverride(allowAuthorizerOverride: IResolvable)

      public fun defaultAuthorizerName(defaultAuthorizerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty.builder()

      override fun allowAuthorizerOverride(allowAuthorizerOverride: Boolean) {
        cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride)
      }

      override fun allowAuthorizerOverride(allowAuthorizerOverride: IResolvable) {
        cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride.let(IResolvable::unwrap))
      }

      override fun defaultAuthorizerName(defaultAuthorizerName: String) {
        cdkBuilder.defaultAuthorizerName(defaultAuthorizerName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty,
    ) : CdkObject(cdkObject), AuthorizerConfigProperty {
      override fun allowAuthorizerOverride(): Any? = unwrap(this).getAllowAuthorizerOverride()

      override fun defaultAuthorizerName(): String? = unwrap(this).getDefaultAuthorizerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty):
          AuthorizerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizerConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty
    }
  }

  public interface TlsConfigProperty {
    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    @CdkDslMarker
    public interface Builder {
      public fun securityPolicy(securityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty.Builder =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty.builder()

      override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty,
    ) : CdkObject(cdkObject), TlsConfigProperty {
      override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TlsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty):
          TlsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TlsConfigProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.TlsConfigProperty
    }
  }

  public interface ServerCertificateSummaryProperty {
    public fun serverCertificateArn(): String? = unwrap(this).getServerCertificateArn()

    public fun serverCertificateStatus(): String? = unwrap(this).getServerCertificateStatus()

    public fun serverCertificateStatusDetail(): String? =
        unwrap(this).getServerCertificateStatusDetail()

    @CdkDslMarker
    public interface Builder {
      public fun serverCertificateArn(serverCertificateArn: String)

      public fun serverCertificateStatus(serverCertificateStatus: String)

      public fun serverCertificateStatusDetail(serverCertificateStatusDetail: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty.builder()

      override fun serverCertificateArn(serverCertificateArn: String) {
        cdkBuilder.serverCertificateArn(serverCertificateArn)
      }

      override fun serverCertificateStatus(serverCertificateStatus: String) {
        cdkBuilder.serverCertificateStatus(serverCertificateStatus)
      }

      override fun serverCertificateStatusDetail(serverCertificateStatusDetail: String) {
        cdkBuilder.serverCertificateStatusDetail(serverCertificateStatusDetail)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty,
    ) : CdkObject(cdkObject), ServerCertificateSummaryProperty {
      override fun serverCertificateArn(): String? = unwrap(this).getServerCertificateArn()

      override fun serverCertificateStatus(): String? = unwrap(this).getServerCertificateStatus()

      override fun serverCertificateStatusDetail(): String? =
          unwrap(this).getServerCertificateStatusDetail()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty):
          ServerCertificateSummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateSummaryProperty):
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty
    }
  }
}
