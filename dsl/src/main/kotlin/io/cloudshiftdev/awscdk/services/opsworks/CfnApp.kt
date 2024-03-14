package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opsworks.CfnApp,
) : CfnResource(cdkObject), IInspectable {
  public open fun appSource(): Any? = unwrap(this).getAppSource()

  public open fun appSource(`value`: IResolvable) {
    unwrap(this).setAppSource(`value`.let(IResolvable::unwrap))
  }

  public open fun appSource(`value`: SourceProperty) {
    unwrap(this).setAppSource(`value`.let(SourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6158ee188c7ca4827de8ef8445ac384a0e88d83642f7f7e15d96b0e6c6e90d3")
  public open fun appSource(`value`: SourceProperty.Builder.() -> Unit): Unit =
      appSource(SourceProperty(`value`))

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributes(): Any? = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  public open fun dataSources(): Any? = unwrap(this).getDataSources()

  public open fun dataSources(`value`: IResolvable) {
    unwrap(this).setDataSources(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSources(__idx_ac66f0: List<Any>) {
    unwrap(this).setDataSources(__idx_ac66f0)
  }

  public open fun dataSources(vararg __idx_ac66f0: Any): Unit = dataSources(__idx_ac66f0.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

  public open fun domains(`value`: List<String>) {
    unwrap(this).setDomains(`value`)
  }

  public open fun domains(vararg `value`: String): Unit = domains(`value`.toList())

  public open fun enableSsl(): Any? = unwrap(this).getEnableSsl()

  public open fun enableSsl(`value`: Boolean) {
    unwrap(this).setEnableSsl(`value`)
  }

  public open fun enableSsl(`value`: IResolvable) {
    unwrap(this).setEnableSsl(`value`.let(IResolvable::unwrap))
  }

  public open fun environment(): Any? = unwrap(this).getEnvironment()

  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  public open fun environment(__idx_ac66f0: List<Any>) {
    unwrap(this).setEnvironment(__idx_ac66f0)
  }

  public open fun environment(vararg __idx_ac66f0: Any): Unit = environment(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun shortname(): String? = unwrap(this).getShortname()

  public open fun shortname(`value`: String) {
    unwrap(this).setShortname(`value`)
  }

  public open fun sslConfiguration(): Any? = unwrap(this).getSslConfiguration()

  public open fun sslConfiguration(`value`: IResolvable) {
    unwrap(this).setSslConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun sslConfiguration(`value`: SslConfigurationProperty) {
    unwrap(this).setSslConfiguration(`value`.let(SslConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0bc37865226dfa36c7cf7db5774931e6da8fa5e757e99b6c828a9f03e7feb8e5")
  public open fun sslConfiguration(`value`: SslConfigurationProperty.Builder.() -> Unit): Unit =
      sslConfiguration(SslConfigurationProperty(`value`))

  public open fun stackId(): String = unwrap(this).getStackId()

  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun appSource(appSource: IResolvable)

    public fun appSource(appSource: SourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3aa2577ee769ad1a0f9c3388fd6b946bca74dfd69b01736579901e5eae2a99b")
    public fun appSource(appSource: SourceProperty.Builder.() -> Unit)

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

    public fun sslConfiguration(sslConfiguration: SslConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ffc0fd356cd925c8e7bd667c7d7ca5e03fe9f9a58800068d030efba3d77fa39")
    public fun sslConfiguration(sslConfiguration: SslConfigurationProperty.Builder.() -> Unit)

    public fun stackId(stackId: String)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnApp.Builder =
        software.amazon.awscdk.services.opsworks.CfnApp.Builder.create(scope, id)

    override fun appSource(appSource: IResolvable) {
      cdkBuilder.appSource(appSource.let(IResolvable::unwrap))
    }

    override fun appSource(appSource: SourceProperty) {
      cdkBuilder.appSource(appSource.let(SourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3aa2577ee769ad1a0f9c3388fd6b946bca74dfd69b01736579901e5eae2a99b")
    override fun appSource(appSource: SourceProperty.Builder.() -> Unit): Unit =
        appSource(SourceProperty(appSource))

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

    override fun sslConfiguration(sslConfiguration: SslConfigurationProperty) {
      cdkBuilder.sslConfiguration(sslConfiguration.let(SslConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ffc0fd356cd925c8e7bd667c7d7ca5e03fe9f9a58800068d030efba3d77fa39")
    override fun sslConfiguration(sslConfiguration: SslConfigurationProperty.Builder.() -> Unit):
        Unit = sslConfiguration(SslConfigurationProperty(sslConfiguration))

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnApp = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.opsworks.CfnApp =
        wrapped.cdkObject
  }

  public interface EnvironmentVariableProperty {
    public fun key(): String

    public fun secure(): Any? = unwrap(this).getSecure()

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun secure(secure: Boolean)

      public fun secure(secure: IResolvable)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun secure(secure: Boolean) {
        cdkBuilder.secure(secure)
      }

      override fun secure(secure: IResolvable) {
        cdkBuilder.secure(secure.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty,
    ) : EnvironmentVariableProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun secure(): Any? = unwrap(this).getSecure()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.EnvironmentVariableProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SslConfigurationProperty {
    public fun certificate(): String? = unwrap(this).getCertificate()

    public fun chain(): String? = unwrap(this).getChain()

    public fun privateKey(): String? = unwrap(this).getPrivateKey()

    public interface Builder {
      public fun certificate(certificate: String)

      public fun chain(chain: String)

      public fun privateKey(privateKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty.builder()

      override fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
      }

      override fun chain(chain: String) {
        cdkBuilder.chain(chain)
      }

      override fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty,
    ) : SslConfigurationProperty {
      override fun certificate(): String? = unwrap(this).getCertificate()

      override fun chain(): String? = unwrap(this).getChain()

      override fun privateKey(): String? = unwrap(this).getPrivateKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SslConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty):
          SslConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SslConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourceProperty {
    public fun password(): String? = unwrap(this).getPassword()

    public fun revision(): String? = unwrap(this).getRevision()

    public fun sshKey(): String? = unwrap(this).getSshKey()

    public fun type(): String? = unwrap(this).getType()

    public fun url(): String? = unwrap(this).getUrl()

    public fun username(): String? = unwrap(this).getUsername()

    public interface Builder {
      public fun password(password: String)

      public fun revision(revision: String)

      public fun sshKey(sshKey: String)

      public fun type(type: String)

      public fun url(url: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.Builder
          = software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun revision(revision: String) {
        cdkBuilder.revision(revision)
      }

      override fun sshKey(sshKey: String) {
        cdkBuilder.sshKey(sshKey)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty,
    ) : SourceProperty {
      override fun password(): String? = unwrap(this).getPassword()

      override fun revision(): String? = unwrap(this).getRevision()

      override fun sshKey(): String? = unwrap(this).getSshKey()

      override fun type(): String? = unwrap(this).getType()

      override fun url(): String? = unwrap(this).getUrl()

      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataSourceProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun arn(arn: String)

      public fun databaseName(databaseName: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty,
    ) : DataSourceProperty {
      override fun arn(): String? = unwrap(this).getArn()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty):
          DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
