package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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

public open class CfnCustomActionType internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun category(): String = unwrap(this).getCategory()

  public open fun category(`value`: String) {
    unwrap(this).setCategory(`value`)
  }

  public open fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

  public open fun configurationProperties(`value`: IResolvable) {
    unwrap(this).setConfigurationProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun configurationProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfigurationProperties(__idx_ac66f0)
  }

  public open fun inputArtifactDetails(): Any = unwrap(this).getInputArtifactDetails()

  public open fun inputArtifactDetails(`value`: IResolvable) {
    unwrap(this).setInputArtifactDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun inputArtifactDetails(`value`: ArtifactDetailsProperty) {
    unwrap(this).setInputArtifactDetails(`value`.let(ArtifactDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23442e12682a5195b8f487ed3e10faf18ccdc1138fb828b16b1bbaaea43e6099")
  public open fun inputArtifactDetails(`value`: ArtifactDetailsProperty.Builder.() -> Unit): Unit =
      inputArtifactDetails(ArtifactDetailsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun outputArtifactDetails(): Any = unwrap(this).getOutputArtifactDetails()

  public open fun outputArtifactDetails(`value`: IResolvable) {
    unwrap(this).setOutputArtifactDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun outputArtifactDetails(`value`: ArtifactDetailsProperty) {
    unwrap(this).setOutputArtifactDetails(`value`.let(ArtifactDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d44dba6ac497cc5e3e963ef3d4a5faa82594726bb413d1e5b179faf8e345f5f5")
  public open fun outputArtifactDetails(`value`: ArtifactDetailsProperty.Builder.() -> Unit): Unit =
      outputArtifactDetails(ArtifactDetailsProperty(`value`))

  public open fun provider(): String = unwrap(this).getProvider()

  public open fun provider(`value`: String) {
    unwrap(this).setProvider(`value`)
  }

  public open fun settings(): Any? = unwrap(this).getSettings()

  public open fun settings(`value`: IResolvable) {
    unwrap(this).setSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun settings(`value`: SettingsProperty) {
    unwrap(this).setSettings(`value`.let(SettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2e3a287a92244fb3614c3db474551401dc5c46fa1f5828085fde8fdb200021f4")
  public open fun settings(`value`: SettingsProperty.Builder.() -> Unit): Unit =
      settings(SettingsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun version(): String = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public interface Builder {
    public fun category(category: String) {
    }

    public fun configurationProperties(configurationProperties: IResolvable) {
    }

    public fun configurationProperties(configurationProperties: List<Any>) {
    }

    public fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
    }

    public fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c062bcef39dbf9342bf4841e882b91132ec40b94655336d24309de3bb0244")
    public
        fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit) {
    }

    public fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
    }

    public fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a90a14ad5054c55a647d31790af6d09a9b2f40e2aae4353f23e4217cbf79a3fe")
    public
        fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit) {
    }

    public fun provider(provider: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun tings(settings: IResolvable) {
    }

    public fun tings(settings: SettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66dba7e677bf870a75b236ff0b004c0bc110a4c4b2e371228cd57f32a20a1f6b")
    public fun tings(settings: SettingsProperty.Builder.() -> Unit) {
    }

    public fun version(version: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.Builder
        = software.amazon.awscdk.services.codepipeline.CfnCustomActionType.Builder.create(scope, id)

    public override fun category(category: String) {
      cdkBuilder.category(category)
    }

    public override fun configurationProperties(configurationProperties: IResolvable) {
      cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
    }

    public override fun configurationProperties(configurationProperties: List<Any>) {
      cdkBuilder.configurationProperties(configurationProperties)
    }

    public override fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(IResolvable::unwrap))
    }

    public override fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty) {
      cdkBuilder.inputArtifactDetails(inputArtifactDetails.let(ArtifactDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c062bcef39dbf9342bf4841e882b91132ec40b94655336d24309de3bb0244")
    public override
        fun inputArtifactDetails(inputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit):
        Unit = inputArtifactDetails(ArtifactDetailsProperty(inputArtifactDetails))

    public override fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(IResolvable::unwrap))
    }

    public override fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty) {
      cdkBuilder.outputArtifactDetails(outputArtifactDetails.let(ArtifactDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a90a14ad5054c55a647d31790af6d09a9b2f40e2aae4353f23e4217cbf79a3fe")
    public override
        fun outputArtifactDetails(outputArtifactDetails: ArtifactDetailsProperty.Builder.() -> Unit):
        Unit = outputArtifactDetails(ArtifactDetailsProperty(outputArtifactDetails))

    public override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    public override fun tings(settings: SettingsProperty) {
      cdkBuilder.settings(settings.let(SettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66dba7e677bf870a75b236ff0b004c0bc110a4c4b2e371228cd57f32a20a1f6b")
    public override fun tings(settings: SettingsProperty.Builder.() -> Unit): Unit =
        tings(SettingsProperty(settings))

    public override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnCustomActionType =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomActionType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomActionType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType):
        CfnCustomActionType = CfnCustomActionType(cdkObject)

    internal fun unwrap(wrapped: CfnCustomActionType):
        software.amazon.awscdk.services.codepipeline.CfnCustomActionType = wrapped.cdkObject
  }

  public interface ArtifactDetailsProperty {
    public fun maximumCount(): Number

    public fun minimumCount(): Number

    public interface Builder {
      public fun maximumCount(maximumCount: Number) {
      }

      public fun minimumCount(minimumCount: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.builder()

      public override fun maximumCount(maximumCount: Number) {
        cdkBuilder.maximumCount(maximumCount)
      }

      public override fun minimumCount(minimumCount: Number) {
        cdkBuilder.minimumCount(minimumCount)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty,
    ) : ArtifactDetailsProperty {
      public override fun maximumCount(): Number = unwrap(this).getMaximumCount()

      public override fun minimumCount(): Number = unwrap(this).getMinimumCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty):
          ArtifactDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactDetailsProperty):
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SettingsProperty {
    public fun entityUrlTemplate(): String? = unwrap(this).getEntityUrlTemplate()

    public fun executionUrlTemplate(): String? = unwrap(this).getExecutionUrlTemplate()

    public fun revisionUrlTemplate(): String? = unwrap(this).getRevisionUrlTemplate()

    public fun thirdPartyConfigurationUrl(): String? = unwrap(this).getThirdPartyConfigurationUrl()

    public interface Builder {
      public fun entityUrlTemplate(entityUrlTemplate: String) {
      }

      public fun executionUrlTemplate(executionUrlTemplate: String) {
      }

      public fun revisionUrlTemplate(revisionUrlTemplate: String) {
      }

      public fun thirdPartyConfigurationUrl(thirdPartyConfigurationUrl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.builder()

      public override fun entityUrlTemplate(entityUrlTemplate: String) {
        cdkBuilder.entityUrlTemplate(entityUrlTemplate)
      }

      public override fun executionUrlTemplate(executionUrlTemplate: String) {
        cdkBuilder.executionUrlTemplate(executionUrlTemplate)
      }

      public override fun revisionUrlTemplate(revisionUrlTemplate: String) {
        cdkBuilder.revisionUrlTemplate(revisionUrlTemplate)
      }

      public override fun thirdPartyConfigurationUrl(thirdPartyConfigurationUrl: String) {
        cdkBuilder.thirdPartyConfigurationUrl(thirdPartyConfigurationUrl)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty,
    ) : SettingsProperty {
      public override fun entityUrlTemplate(): String? = unwrap(this).getEntityUrlTemplate()

      public override fun executionUrlTemplate(): String? = unwrap(this).getExecutionUrlTemplate()

      public override fun revisionUrlTemplate(): String? = unwrap(this).getRevisionUrlTemplate()

      public override fun thirdPartyConfigurationUrl(): String? =
          unwrap(this).getThirdPartyConfigurationUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty):
          SettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SettingsProperty):
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationPropertiesProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun key(): Any

    public fun name(): String

    public fun queryable(): Any? = unwrap(this).getQueryable()

    public fun required(): Any

    public fun secret(): Any

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun description(description: String) {
      }

      public fun key(key: Boolean) {
      }

      public fun key(key: IResolvable) {
      }

      public fun name(name: String) {
      }

      public fun queryable(queryable: Boolean) {
      }

      public fun queryable(queryable: IResolvable) {
      }

      public fun required(required: Boolean) {
      }

      public fun required(required: IResolvable) {
      }

      public fun secret(secret: Boolean) {
      }

      public fun secret(secret: IResolvable) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun key(key: Boolean) {
        cdkBuilder.key(key)
      }

      public override fun key(key: IResolvable) {
        cdkBuilder.key(key.let(IResolvable::unwrap))
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun queryable(queryable: Boolean) {
        cdkBuilder.queryable(queryable)
      }

      public override fun queryable(queryable: IResolvable) {
        cdkBuilder.queryable(queryable.let(IResolvable::unwrap))
      }

      public override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      public override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public override fun secret(secret: Boolean) {
        cdkBuilder.secret(secret)
      }

      public override fun secret(secret: IResolvable) {
        cdkBuilder.secret(secret.let(IResolvable::unwrap))
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty,
    ) : ConfigurationPropertiesProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun key(): Any = unwrap(this).getKey()

      public override fun name(): String = unwrap(this).getName()

      public override fun queryable(): Any? = unwrap(this).getQueryable()

      public override fun required(): Any = unwrap(this).getRequired()

      public override fun secret(): Any = unwrap(this).getSecret()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty):
          ConfigurationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationPropertiesProperty):
          software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ConfigurationPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
