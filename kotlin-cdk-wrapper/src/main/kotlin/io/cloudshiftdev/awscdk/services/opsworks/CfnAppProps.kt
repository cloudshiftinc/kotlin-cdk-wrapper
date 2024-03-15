@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnAppProps {
  public fun appSource(): Any? = unwrap(this).getAppSource()

  public fun attributes(): Any? = unwrap(this).getAttributes()

  public fun dataSources(): Any? = unwrap(this).getDataSources()

  public fun description(): String? = unwrap(this).getDescription()

  public fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  public fun enableSsl(): Any? = unwrap(this).getEnableSsl()

  public fun environment(): Any? = unwrap(this).getEnvironment()

  public fun name(): String

  public fun shortname(): String? = unwrap(this).getShortname()

  public fun sslConfiguration(): Any? = unwrap(this).getSslConfiguration()

  public fun stackId(): String

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun appSource(appSource: IResolvable)

    public fun appSource(appSource: CfnApp.SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad8655435b3d7e559e79a32992a8da593b4b6fccfe141a632618566c5f831827")
    public fun appSource(appSource: CfnApp.SourceProperty.Builder.() -> Unit)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun dataSources(dataSources: IResolvable)

    public fun dataSources(dataSources: List<Any>)

    public fun dataSources(vararg dataSources: Any)

    public fun description(description: String)

    public fun domains(domains: List<String>)

    public fun domains(vararg domains: String)

    public fun enableSsl(enableSsl: Boolean)

    public fun enableSsl(enableSsl: IResolvable)

    public fun environment(environment: IResolvable)

    public fun environment(environment: List<Any>)

    public fun environment(vararg environment: Any)

    public fun name(name: String)

    public fun shortname(shortname: String)

    public fun sslConfiguration(sslConfiguration: IResolvable)

    public fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b22074dcadb3937479a307653c81ec78dda4882c6ded8b2dfdca184fb831c04")
    public
        fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty.Builder.() -> Unit)

    public fun stackId(stackId: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnAppProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnAppProps.builder()

    override fun appSource(appSource: IResolvable) {
      cdkBuilder.appSource(appSource.let(IResolvable::unwrap))
    }

    override fun appSource(appSource: CfnApp.SourceProperty) {
      cdkBuilder.appSource(appSource.let(CfnApp.SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad8655435b3d7e559e79a32992a8da593b4b6fccfe141a632618566c5f831827")
    override fun appSource(appSource: CfnApp.SourceProperty.Builder.() -> Unit): Unit =
        appSource(CfnApp.SourceProperty(appSource))

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    override fun dataSources(dataSources: List<Any>) {
      cdkBuilder.dataSources(dataSources)
    }

    override fun dataSources(vararg dataSources: Any): Unit = dataSources(dataSources.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domains(domains: List<String>) {
      cdkBuilder.domains(domains)
    }

    override fun domains(vararg domains: String): Unit = domains(domains.toList())

    override fun enableSsl(enableSsl: Boolean) {
      cdkBuilder.enableSsl(enableSsl)
    }

    override fun enableSsl(enableSsl: IResolvable) {
      cdkBuilder.enableSsl(enableSsl.let(IResolvable::unwrap))
    }

    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    override fun environment(environment: List<Any>) {
      cdkBuilder.environment(environment)
    }

    override fun environment(vararg environment: Any): Unit = environment(environment.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun shortname(shortname: String) {
      cdkBuilder.shortname(shortname)
    }

    override fun sslConfiguration(sslConfiguration: IResolvable) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(IResolvable::unwrap))
    }

    override fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(CfnApp.SslConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b22074dcadb3937479a307653c81ec78dda4882c6ded8b2dfdca184fb831c04")
    override
        fun sslConfiguration(sslConfiguration: CfnApp.SslConfigurationProperty.Builder.() -> Unit):
        Unit = sslConfiguration(CfnApp.SslConfigurationProperty(sslConfiguration))

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
    override fun appSource(): Any? = unwrap(this).getAppSource()

    override fun attributes(): Any? = unwrap(this).getAttributes()

    override fun dataSources(): Any? = unwrap(this).getDataSources()

    override fun description(): String? = unwrap(this).getDescription()

    override fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

    override fun enableSsl(): Any? = unwrap(this).getEnableSsl()

    override fun environment(): Any? = unwrap(this).getEnvironment()

    override fun name(): String = unwrap(this).getName()

    override fun shortname(): String? = unwrap(this).getShortname()

    override fun sslConfiguration(): Any? = unwrap(this).getSslConfiguration()

    override fun stackId(): String = unwrap(this).getStackId()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnAppProps): CfnAppProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppProps): software.amazon.awscdk.services.opsworks.CfnAppProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnAppProps
  }
}
