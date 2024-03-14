package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrDataProviderArn(): String = unwrap(this).getAttrDataProviderArn()

  public open fun attrDataProviderCreationTime(): String =
      unwrap(this).getAttrDataProviderCreationTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

  public open fun dataProviderIdentifier(`value`: String) {
    unwrap(this).setDataProviderIdentifier(`value`)
  }

  public open fun dataProviderName(): String? = unwrap(this).getDataProviderName()

  public open fun dataProviderName(`value`: String) {
    unwrap(this).setDataProviderName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engine(): String = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun exactSettings(): Any? = unwrap(this).getExactSettings()

  public open fun exactSettings(`value`: Boolean) {
    unwrap(this).setExactSettings(`value`)
  }

  public open fun exactSettings(`value`: IResolvable) {
    unwrap(this).setExactSettings(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun settings(): Any? = unwrap(this).getSettings()

  public open fun settings(`value`: IResolvable) {
    unwrap(this).setSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun settings(`value`: SettingsProperty) {
    unwrap(this).setSettings(`value`.let(SettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3edd7636f3be1f86b901cad6e1fc715014e3dbc80786d14014f149bb2e7271b6")
  public open fun settings(`value`: SettingsProperty.Builder.() -> Unit): Unit =
      settings(SettingsProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun dataProviderIdentifier(dataProviderIdentifier: String)

    public fun dataProviderName(dataProviderName: String)

    public fun description(description: String)

    public fun engine(engine: String)

    public fun exactSettings(exactSettings: Boolean)

    public fun exactSettings(exactSettings: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tings(settings: IResolvable)

    public fun tings(settings: SettingsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c39604e34fcba258422b1df3816092070b4c839ccb0f3d3f90ea77f4a50919e")
    public fun tings(settings: SettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnDataProvider.Builder =
        software.amazon.awscdk.services.dms.CfnDataProvider.Builder.create(scope, id)

    override fun dataProviderIdentifier(dataProviderIdentifier: String) {
      cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
    }

    override fun dataProviderName(dataProviderName: String) {
      cdkBuilder.dataProviderName(dataProviderName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun exactSettings(exactSettings: Boolean) {
      cdkBuilder.exactSettings(exactSettings)
    }

    override fun exactSettings(exactSettings: IResolvable) {
      cdkBuilder.exactSettings(exactSettings.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    override fun tings(settings: SettingsProperty) {
      cdkBuilder.settings(settings.let(SettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c39604e34fcba258422b1df3816092070b4c839ccb0f3d3f90ea77f4a50919e")
    override fun tings(settings: SettingsProperty.Builder.() -> Unit): Unit =
        tings(SettingsProperty(settings))

    public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider):
        CfnDataProvider = CfnDataProvider(cdkObject)

    internal fun unwrap(wrapped: CfnDataProvider):
        software.amazon.awscdk.services.dms.CfnDataProvider = wrapped.cdkObject
  }

  public interface SettingsProperty {
    public fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()

    public interface Builder {
      public fun postgreSqlSettings(postgreSqlSettings: IResolvable)

      public fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe648e536f99226c51402e8eee8ad1e33005dfd09b98a1cb53237bb9ad30d3f")
      public
          fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty.builder()

      override fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(IResolvable::unwrap))
      }

      override fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings.let(PostgreSqlSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbe648e536f99226c51402e8eee8ad1e33005dfd09b98a1cb53237bb9ad30d3f")
      override
          fun postgreSqlSettings(postgreSqlSettings: PostgreSqlSettingsProperty.Builder.() -> Unit):
          Unit = postgreSqlSettings(PostgreSqlSettingsProperty(postgreSqlSettings))

      public fun build(): software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty,
    ) : SettingsProperty {
      override fun postgreSqlSettings(): Any? = unwrap(this).getPostgreSqlSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty):
          SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.SettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PostgreSqlSettingsProperty {
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun port(): Number? = unwrap(this).getPort()

    public fun serverName(): String? = unwrap(this).getServerName()

    public fun sslMode(): String? = unwrap(this).getSslMode()

    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun databaseName(databaseName: String)

      public fun port(port: Number)

      public fun serverName(serverName: String)

      public fun sslMode(sslMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty.Builder =
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
      }

      override fun sslMode(sslMode: String) {
        cdkBuilder.sslMode(sslMode)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty,
    ) : PostgreSqlSettingsProperty {
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun port(): Number? = unwrap(this).getPort()

      override fun serverName(): String? = unwrap(this).getServerName()

      override fun sslMode(): String? = unwrap(this).getSslMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty):
          PostgreSqlSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostgreSqlSettingsProperty):
          software.amazon.awscdk.services.dms.CfnDataProvider.PostgreSqlSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
