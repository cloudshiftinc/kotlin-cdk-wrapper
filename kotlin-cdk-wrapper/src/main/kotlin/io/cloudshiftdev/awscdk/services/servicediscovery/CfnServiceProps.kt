@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun dnsConfig(): Any? = unwrap(this).getDnsConfig()

  public fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

  public fun healthCheckCustomConfig(): Any? = unwrap(this).getHealthCheckCustomConfig()

  public fun name(): String? = unwrap(this).getName()

  public fun namespaceId(): String? = unwrap(this).getNamespaceId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun dnsConfig(dnsConfig: IResolvable)

    public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ac04bbef3c87fd3b1b70e12d6abc89c0890a88370e1313f1f765223457287bd")
    public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty.Builder.() -> Unit)

    public fun healthCheckConfig(healthCheckConfig: IResolvable)

    public fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cc3e3fe8c1377e2423bc37d5c554fb0a99ef2be96a63d6d5b17ee755d7c047c")
    public
        fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty.Builder.() -> Unit)

    public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable)

    public
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c62fadfbefe8d556e5f1fea201921900a443ba7a8206acaf92766e4047b76213")
    public
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun namespaceId(namespaceId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CfnServiceProps.Builder
        = software.amazon.awscdk.services.servicediscovery.CfnServiceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dnsConfig(dnsConfig: IResolvable) {
      cdkBuilder.dnsConfig(dnsConfig.let(IResolvable::unwrap))
    }

    override fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty) {
      cdkBuilder.dnsConfig(dnsConfig.let(CfnService.DnsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ac04bbef3c87fd3b1b70e12d6abc89c0890a88370e1313f1f765223457287bd")
    override fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty.Builder.() -> Unit): Unit =
        dnsConfig(CfnService.DnsConfigProperty(dnsConfig))

    override fun healthCheckConfig(healthCheckConfig: IResolvable) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(IResolvable::unwrap))
    }

    override fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty) {
      cdkBuilder.healthCheckConfig(healthCheckConfig.let(CfnService.HealthCheckConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cc3e3fe8c1377e2423bc37d5c554fb0a99ef2be96a63d6d5b17ee755d7c047c")
    override
        fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty.Builder.() -> Unit):
        Unit = healthCheckConfig(CfnService.HealthCheckConfigProperty(healthCheckConfig))

    override fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(IResolvable::unwrap))
    }

    override
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty) {
      cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig.let(CfnService.HealthCheckCustomConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c62fadfbefe8d556e5f1fea201921900a443ba7a8206acaf92766e4047b76213")
    override
        fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty.Builder.() -> Unit):
        Unit =
        healthCheckCustomConfig(CfnService.HealthCheckCustomConfigProperty(healthCheckCustomConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun namespaceId(namespaceId: String) {
      cdkBuilder.namespaceId(namespaceId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun dnsConfig(): Any? = unwrap(this).getDnsConfig()

    override fun healthCheckConfig(): Any? = unwrap(this).getHealthCheckConfig()

    override fun healthCheckCustomConfig(): Any? = unwrap(this).getHealthCheckCustomConfig()

    override fun name(): String? = unwrap(this).getName()

    override fun namespaceId(): String? = unwrap(this).getNamespaceId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.servicediscovery.CfnServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.CfnServiceProps
  }
}
